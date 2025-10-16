public class InscricaoService {

    public Inscricao criarInscricao(Aluno aluno, PlanoTreino plano) {
        return new Inscricao(aluno, plano);
    }

    public void cancelarInscricao(Inscricao inscricao) {
        inscricao.cancelar();
    }

    public void exibirResumoInscricao(Inscricao inscricao) {
        System.out.println("Aluno: " + inscricao.getAluno().getNome());
        System.out.println("Plano: " + inscricao.getPlano().getNome());
        System.out.println("Preço: R$" + inscricao.getPlano().getPreco());
        System.out.println("Status: " + (inscricao.isAtiva() ? "Ativa" : "Cancelada"));
    }
}
