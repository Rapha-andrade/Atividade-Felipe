public class Aluno {
    private String nome;
    private String cpf;
    private int idade;

    public Aluno(String nome, String cpf, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }

    public String getNome() {return nome;}
    public String getCpf(){return cpf;}
    public int getIdade() {return idade;}

}
