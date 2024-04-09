public class AutEstabelecimento {
    
    private string id;
    private string cpf;
    private string nome;
    private string rg;
    private string orgaoExpeditor;
    private string dependenciaAdministrativa;
    private string situacaoAutonomo;




    public AutEstabelecimento() {
   
}

    public AutEstabelecimento(string id, string cpf, string nome, string rg, string orgaoExpeditor, string dependenciaAdministrativa, string situacaoAutonomo) {
        this.id = id;
        this.cpf = cpf;
        this.nome = nome;
        this.rg = rg;
        this.orgaoExpeditor = orgaoExpeditor;
        this.dependenciaAdministrativa = dependenciaAdministrativa;
        this.situacaoAutonomo = situacaoAutonomo;        
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

    public void setNome (string nome) {
        this.nome = nome;
    }
    public string getNome() {
        return nome;
    }

    public void setRg (string rg) {
        this.rg = rg;
    }
    public string getRg() {
        return rg;
    }

    public void setOrgaoExpeditor (string orgaoExpeditor) {
        this.orgaoExpeditor = orgaoExpeditor;
    }
    public string getOrgaoExpeditor() {
        return orgaoExpeditor;
    }

    public void setDependenciaAdministrativa (string dependenciaAdministrativa) {
        this.dependenciaAdministrativa = dependenciaAdministrativa;
    }
    public string getDependenciaAdministrativa() {
        return dependenciaAdministrativa;
    }

    public void setSituacaoAutonomo (string situacaoAutonomo) {
        this.situacaoAutonomo = situacaoAutonomo;
    }
    public string getSituacaoAutonomo() {
        return situacaoAutonomo;
    }
    
//inclusão
//alteração
//consulta
//exclusão
//resumo



}