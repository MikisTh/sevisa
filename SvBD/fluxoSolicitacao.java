public class FluxoSolicitacao {
    
    private string numProtocolo;
    private string dataProtocolo;
    private string cpf;
    private string cnpj;
    private string razaoSocial;
    



    public AutEstabelecimento() {
   
}

    public AutEstabelecimento(string numProtocolo, string dataProtocolo, string cpf, string cnpj, string razaoSocial) {
        this.numProtocolo = numProtocolo;
        this.dataProtocolo = dataProtocolo;
        this.cpf = cpf;
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;       
}


    public void setNumProtocolo (string id) {
        this.numProtocolo = numProtocolo;
    }
    public string getNumProtocolo() {
        return numProtocolo;
    }

    public void setDataProtocolo (string id) {
        this.dataProtocolo = dataProtocolo;
    }
    public string getDataProtocolo() {
        return dataProtocolo;
    }

    public void setCpf (string cpf) {
        this.cpf = cpf;
    }
    public string getCpf() {
        return cpf;
    }     

    public void setCnpj (string cnpj) {
        this.cnpj = cnpj;
    }
    public string getCnpj() {
        return cnpj;
    }
    
    public void setRazaoSocial (string razaoSocial) {
        this.razaoSocial = razaoSocial;
    }
    public string getRazaoSocial() {
        return razaoSocial;
    }


    public class void filtrarEtapa (string[]args) {


    }
  
}