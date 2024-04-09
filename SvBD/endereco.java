

public class Endereco {
    
    private string endereco;
    private int numero;
    private string complemento;
    private int cep;
    private string municipio;
    private string bairro;




    public Endereco() {
   
}

    public Endereco(string endereco, int numero, string complemento, int cep, string municipio, string bairro) {
        this.endereco = endereco;
        this.numero = numero;
        this.complemento = complemento;
        this.cep = cep;
        this.municipio = municipio;
        this.bairro = bairro;        
}

//encapsulamento

    public void setEndereco (string endereco) { // grava um dado ao atributo
        this.endereco = endereco;
    }
    public string getEndereco() { // acesso a um dado do atributo
        return endereco;
    }

    public void setNumero (int numero) {
        this.numero = numero;
    }
    public int getNumero() {
        return numero;
    }

    public void setComplemento (string complemento) {
        this.complemento = complemento;
    }
    public string getComplemento() {
        return complemento;
    }

    public void setCep (string cep) {
        this.cep = cep;
    }
    public string getCep() {
        return cep;
    }

    public void setMunicipio (string municipio) {
        this.municipio = municipio;
    }
    public string getMunicipio() {
        return municipio;
    }

    public void setBairro (string bairro) {
        this.bairro = bairro;
    }
    public string getBairro() {
        return bairro;
    }
}