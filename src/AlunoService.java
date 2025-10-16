public class AlunoService {
    private AlunoRepository repo;

    public AlunoService(AlunoRepository repo) {
        this.repo = repo;
    }

    public void cadastrarAluno(String nome, String cpf, int idade){
        if (repo.buscarPorCpf(cpf).isPresent()) {
            throw new RuntimeException("Aluno já cadastrado");
        }

        Aluno aluno = new Aluno(nome, cpf, idade);
        repo.adicionar(aluno);
    }

    public Aluno buscarPorCpf(String cpf) {
        return repo.buscarPorCpf(cpf)
                .orElseThrow(() -> new RuntimeException("Aluno não encontrado"));
    }
}
