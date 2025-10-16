public class Inscricao {
    private Aluno aluno;
    private PlanoTreino plano;
    private boolean ativa;

    public Inscricao(Aluno aluno, PlanoTreino plano){
        this.aluno = aluno;
        this.plano = plano;
        this.ativa = true;
    }

    public void cancelar(){
        this.ativa = false;
    }

    public boolean isAtiva() {return ativa; }
    public Aluno getAluno() {return aluno; }
    public PlanoTreino getPlano() {return plano;}
}
