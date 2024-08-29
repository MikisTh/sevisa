
    [ApiController]
    [Route("[controller]")]
    public class UploadDownloadController : Controller
    {
        // Faz upload de vários arquivos
        [HttpPost("UploadVarios")]
        public ActionResult PostManyFiles()
        {
            if (Request.HasFormContentType)
            {
                var form = Request.Form;
                foreach (var formFile in form.Files)
                {
                    using (var fileStream = new FileStream(formFile.FileName, FileMode.Create))
                    {
                        formFile.CopyTo(fileStream);
                    }
                }
                return StatusCode(201, new { Status = "Arquivo(s) gravados com sucesso." });
            }

            return StatusCode(500, new { Erro = "Erro" });
        }
        
        //Upload de um arquivo
        [HttpPost("arquivo")]
        public IActionResult Upload(IFormFile file)
        {
            var fileName = System.IO.Path.GetFileName(file.FileName);

            if (System.IO.File.Exists(fileName))
            {
                System.IO.File.Delete(fileName);
            }

            using (var localFile = System.IO.File.OpenWrite(fileName))
            using (var uploadedFile = file.OpenReadStream())
            {
                uploadedFile.CopyTo(localFile);
            }

            return Ok();
        }
        
        //Upload de um arquivo enviando com o model
        [HttpPost("std")]
        public IActionResult Upload2([FromForm]Student std)
        {

            var file = std.Image;
            var fileName = System.IO.Path.GetFileName(file.FileName);

            if (System.IO.File.Exists(fileName))
            {
                System.IO.File.Delete(fileName);
            }

            using (var localFile = System.IO.File.OpenWrite(fileName))
            using (var uploadedFile = file.OpenReadStream())
            {
                uploadedFile.CopyTo(localFile);
            }

            return Ok();
        }


        // Faz Download de um arquivo
        [HttpGet("download/{filename}")]
        public async Task<IActionResult> Download(string filename)
        {
            if (filename == null)
                return Content("filepart not present");

            var path = Path.Combine(Directory.GetCurrentDirectory(), filename);

            var memory = new MemoryStream();
            using var stream = new FileStream(path, FileMode.Open);
            await stream.CopyToAsync(memory);

            memory.Position = 0;
            return File(memory, GetContentType(path), Path.GetFileName(path));
        }


        // FAZENDO DOWNLOAD DE MULTIPLOS, zipando.
        // LISTA NO BODY: 	["nota-0.pdf","nota-1.pdf","nota-2.pdf"]
        [HttpGet("multiplos")]
        public ActionResult Download(List<string> files)
        //public ActionResult Download()
        {

            //var files = new List<string> { "nota-0.pdf", "nota-1.pdf", "nota-2.pdf" };
            var archive = Path.Combine(Directory.GetCurrentDirectory(), "archive.zip");
            var temp = Path.Combine(Directory.GetCurrentDirectory(), @"C:\temp");

            // clear any existing archive
            if (System.IO.File.Exists(archive))
            {
                System.IO.File.Delete(archive);
            }
            // empty the temp folder
            Directory.EnumerateFiles(temp).ToList().ForEach(f => System.IO.File.Delete(f));

            
            files.ForEach(f => System.IO.File.Copy(f, Path.Combine(temp, Path.GetFileName(f))));

            // cria arquivos.zip
            ZipFile.CreateFromDirectory(temp, archive);


            const string contentType = "application/zip";
            HttpContext.Response.ContentType = contentType;
            var result = new FileContentResult(System.IO.File.ReadAllBytes(archive), contentType)
            {
                FileDownloadName = $"arquivos.zip"
            };

            return result;
        }

        private string GetContentType(string fileName)
        {
            string strcontentType = "application/octetstream";
            string ext = System.IO.Path.GetExtension(fileName).ToLower();
            Microsoft.Win32.RegistryKey registryKey = Microsoft.Win32.Registry.ClassesRoot.OpenSubKey(ext);
            if (registryKey != null && registryKey.GetValue("Content Type") != null)
                strcontentType = registryKey.GetValue("Content Type").ToString();
            return strcontentType;
        }
        
         // Repassar as imagens para outra API
        [HttpPost]
        public async Task<IActionResult> Post([FromForm] Student std)
        {

            using var httpClient = new HttpClient();
            httpClient.BaseAddress = new Uri("http://localhost:5000/");

            var file = std.Image;

            byte[] data;
            using (var br = new BinaryReader(file.OpenReadStream()))
                data = br.ReadBytes((int)file.OpenReadStream().Length);
            ByteArrayContent bytes = new ByteArrayContent(data);
            MultipartFormDataContent multiContent = new MultipartFormDataContent
            {
                { bytes, "file", file.FileName }
            };

            var result = await httpClient.PostAsync("uploadDownloadFile", multiContent);


            return StatusCode((int)result.StatusCode);
        }
