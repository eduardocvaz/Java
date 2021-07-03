import java.util.ArrayList;

public class Turma {
    private ArrayList<Aluno> alunos;
    private double mediaTurma;
    private String nomeDaTurma;


    public Turma() {
        alunos = new ArrayList<Aluno>();
        this.mediaTurma = 0;
    }

    public String getNomeDaTurma() {
        return this.nomeDaTurma;
    }

    public void setNomeDaTurma(String nomeDaTurma) {
        this.nomeDaTurma = nomeDaTurma;
    }

    public double getMediaTurma() {
        return this.mediaTurma;
    }

    public Aluno getAluno(int index) {
        return this.alunos.get(index);

    }

    public void setAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }


    public double calcularMedia() {
        for (Aluno aluno : alunos) {
            this.mediaTurma += aluno.calcularMedia();
        }
        this.mediaTurma = this.mediaTurma/alunos.size();
        return this.mediaTurma;
    }
    public int tamanhoDaTurma(){
        return this.alunos.size();
    }

}
