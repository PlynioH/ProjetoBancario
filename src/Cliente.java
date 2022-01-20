public class Cliente {
    private String nome;
    private String vinculo;
    private int idade;
    private String endereco;
    private String cpf;

    //Nome
    public String getNome(){
        return nome;
    }
    public void setNome(String nome) {

        this.nome = nome;
    }

    //Vinculo bancario
    public String getVinculo(){
        return vinculo;
    }
    public void setVinculo(String vinculo){
        this.vinculo = vinculo;
    }

    //Idade
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    //Endereço
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    //CPF
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
