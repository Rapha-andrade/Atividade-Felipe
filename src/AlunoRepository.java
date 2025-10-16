import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class AlunoRepository {
    private List<Aluno> alunos = new ArrayList<>();

    public void adicionar(Aluno aluno) {
        alunos.add(aluno);
    }

    public Optional<Aluno> buscarPorCpf(String cpf) {
        return alunos.stream()
                .filter(a -> a.getCpf().equals(cpf))
                .findFirst();
    }

    public List<Aluno> listarTodos() {
        return alunos;
    }
}
