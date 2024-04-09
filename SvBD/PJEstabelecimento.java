public class PjEstabelecimento {
    
    private string id;
    private string cnpj;
    private string razaoSocial;
    private string nomeFantasia;
    private string naturezaJuridica;
    private string atividade;
    private string subAtividade;



    public estabelecimento() {
   
}

    public estabelecimento(string id, string cnpj, string razaoSocial, string nomeFantasia, string naturezaJuridica, string atividade, string subAtividade) {
        this.id = id;
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.nomeFantasia = nomeFantasia;
        this.natureza = naturezaJuridica;
        this.atividade = atividade;
        this.subAtividade = subAtividade;
}


    public void setId (string id) {
        this.id = id;
    }
    public string getId() {
        return Id;
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

    public void setNomeFantasia (string nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }
    public string getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNaturezaJuridica (string naturezaJuridica) {
        this.naturezaJuridica = naturezaJuridica;
    }
    public string getNaturezaJuridica() {
        return naturezaJuridica;
    }

    public void setAtividade (string atividade) {
        this.atividade = atividade;
    }
    public string getAtividade() {
        return atividade;
    }

    public void setSubAtividade (string subAtividade) {
        this.subAtividade = subAtividade;
    }
    public string getSubAtividade() {
        return subAtividade;
    }
    
//inclusão
//alteração
//consulta
//exclusão
//resumo



}