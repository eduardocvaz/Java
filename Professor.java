import java.util.ArrayList;

public class Professor extends Funcionarios{
    private String tipo;

    private ArrayList<Aluno> alunos;

    public Professor() {
        alunos = new ArrayList<Aluno>();
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void adicionarAluno(Aluno aluno){
        alunos.add(aluno);
    }

    public int idadeAluno(Aluno aluno1){
        return (2021 - aluno1.getAnoNascimento());
    }

    public void printarAluno() {
        for (Aluno aluno : alunos) {
            System.out.println("Aluno >>" + aluno.getNome() + aluno.getListaTreino());
        }
    }
    
    public void printarAlunoCompleta() {
        for (Aluno aluno : alunos) {
            System.out.println("Aluno >>" + aluno.getNome() + "CPF:" + aluno.getCpf() + "Idade:"+ idadeAluno(aluno));
        }     
    }

}
