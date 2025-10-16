public class Main {
    public static void main(String[] args) {
        AlunoRepository alunoRepo = new AlunoRepository();
        AlunoService alunoService = new AlunoService(alunoRepo);
        InscricaoService inscricaoService = new InscricaoService();

        // Cadastro de aluno
        alunoService.cadastrarAluno("Lucas Pereira", "98765432100", 25);

        // Criação de plano de treino
        PlanoTreino plano = new PlanoTreino("Emagrecimento", 8, 149.90);

        // Buscar aluno
        Aluno aluno = alunoService.buscarPorCpf("98765432100");

        // Criar inscrição
        Inscricao inscricao = inscricaoService.criarInscricao(aluno, plano);

        // Exibir resumo
        System.out.println("== RESUMO DA INSCRIÇÃO ==");
        inscricaoService.exibirResumoInscricao(inscricao);

        // Cancelar inscrição
        inscricaoService.cancelarInscricao(inscricao);

        // Exibir novamente
        System.out.println("\n== INSCRIÇÃO APÓS CANCELAMENTO ==");
        inscricaoService.exibirResumoInscricao(inscricao);
    }
}
