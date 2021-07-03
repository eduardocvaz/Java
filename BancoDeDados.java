import java.util.ArrayList;

public class BancoDeDados {
    private ArrayList<Recepcionistas> recepcionistas;
    private ArrayList<Professor> professores;

    public BancoDeDados() {
        recepcionistas= new ArrayList<Recepcionistas>();
        professores = new ArrayList<Professor>();
    }



    public void adicionarRecepcionista(Recepcionistas funcionario) {
        recepcionistas.add(funcionario);
    }
    public void adicionarProfessor(Professor funcionario) {
        professores.add(funcionario);
    }

    public void printarFuncionarios(){
        System.out.println("########################FUNCIONARIOS################");
        for (Professor professor : professores) {
            System.out.println("Matricula: "+ professor.getMatricula() + "Nome" + professor.getNome() + "Tipo: Professor" );
        }
        for (Recepcionistas recepcionista : recepcionistas) {
            System.out.println("Matricula: "+ recepcionista.getMatricula() + "Nome" + recepcionista.getNome() + "Tipo: recepcionista" );
        }

        System.out.println("#####################################################");
    }

    public void printarProfessores(){
        for (Professor professor : professores) {
            System.out.println(professor.getNome());
            professor.printarAluno();
        }
    }

    public void PrintarRecepcionistas(){
        for (Recepcionistas recepcionista : recepcionistas) {
            System.out.println("nome; " + recepcionista.getNome() + "   "+ recepcionista.getDiaTrabalho() + "   "+ recepcionista.getHorarioTrabalho());

        }
    }
    public void printarAlunos(){
        for (Professor professor : professores) {
            professor.printarAlunoCompleta();
        }
    }
}
