public class PjUnidade {
    
    private string id;
    private string cnpj;
    private string razaoSocial;
    private string nomeUnidade;
    private string naturezaJuridica;
    private string area;
    private string atividade;
    private string subAtividade;



    public unidade() {
   
}

    public unidade(string id, string cnpj, string razaoSocial, string nomeUnidade, string naturezaJuridica, string area, string atividade, string subAtividade) {
        this.id = id;
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.nomeUnidade = nomeUnidade;
        this.natureza = naturezaJuridica;
        this.area = area;
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

    public void setArea (string area) {
        this.area = area;
    }
    public string getArea() {
        return area;
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




}