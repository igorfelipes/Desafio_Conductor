public class CadastroDeUsuarios {

    int id;
    String cpf;
    String nome;
    String dataNascimento;
    String renda;
    int numeroDeDependentes;


    public int getId(){
        return id;
    }
    public void setId(int id ){
        this.id = id;
    }

    public String getCpf(){
        return cpf;
    }
    public void setCpf(String cpf ){
        this.cpf = cpf;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome ){
        this.nome = nome;
    }

    public String getDataNascimento(){
        return dataNascimento;
    }
    public void setDataNascimento(String dataNascimento){
        this.dataNascimento = dataNascimento;
    }

    public String getRenda(){
        return renda;
    }
    public void setRenda(String renda ){
        this.renda = renda;
    }

    public int getNumeroDeDependentes(){
        return numeroDeDependentes;
    }
    public void setNumeroDeDependentes(int numeroDeDependentes ){
        this.numeroDeDependentes = numeroDeDependentes;
    }


}