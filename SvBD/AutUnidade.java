public class AutUnidade {
    
    private string id;
    private string cpf;   
    private string razaoSocial;
    private string nomeUnidade;
    private string naturezaJuridica;


    public AutUnidade() {
   
}

    public AutUnidade(string id, string cpf, string razaoSocial, string nomeUnidade, string naturezaJuridica) {
        this.id = id;
        this.cpf = cpf;
        this.razaoSocial = razaoSocial;
        this.nomeUnidade = nomeUnidade;
        this.natureza = naturezaJuridica;      
}


    public void setId (string id) {
        this.id = id;
    }
    public string getId() {
        return Id;
    }

    public void setCpf (string cpf) {
        this.cpf = cpf;
    }
    public string getCpf() {
        return cpf;
    }

    public void setRazaoSocial (string razaoSocial) {
        this.razaoSocial = razaoSocial;
    }
    public string getRazaoSocial() {
        return razaoSocial;
    }
    
    public void setNomeUnidade (string nomeUnidade) {
        this.nomeUnidade = nomeUnidade;
    }
    public string getNomeUnidade() {
        return nomeUnidade;
    }

    public void setNaturezaJuridica (string naturezaJuridica) {
        this.naturezaJuridica = naturezaJuridica;
    }
    public string getNaturezaJuridica() {
        return naturezaJuridica;
    }


    
//inclusão
//alteração
//consulta
//exclusão




}