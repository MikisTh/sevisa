public class Contato {
    
    private string DDD;
    private string fone;
    private string telefoneFixo;
    private string email;
   
    public Contato() {
   
}

    public Contato(string DDD, string fone, string telefoneFixo, string email) {
        this.ddd = ddd;
        this.fone = fone;
        this.telefoneFixo = telefoneFixo;
        this.email = email;
      
}

    public void setDDD (string DDD ) {
        this.DDD = DDD;
    }
    public string getDDD() {
        return DDD;
    }

    public void setFone (string fone) {
        this.fone = fone;
    }
    public string getFone() {
        return fone;
    }

    public void setTelefoneFixo (string telefoneFixo) {
        this.telefoneFixo = telefoneFixo;
    }
    public string getTelefoneFixo() {
        return telefoneFixo;
    }

    public void setEmail (string email) {
        this.email = email;
    }
    public string getEmail() {
        return email;
    }

}