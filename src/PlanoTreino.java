public class PlanoTreino {

    private String nome;
    private int duracaoSemanas;
    private double preco;

    public PlanoTreino(String nome, int duracaoSemanas, double preco){
        this.nome = nome;
        this.duracaoSemanas = duracaoSemanas;
        this.preco = preco;
    }

    public String getNome() {return nome; }
    public int getDuracaoSemanas() {return duracaoSemanas;}
    public double getPreco() {return preco;}
    }
