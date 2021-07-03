import java.text.ParseException;

public class NatalFitness {
    public static void main(String[] args) throws ParseException {
        Funcionarios professor1 = new Professor();
        Funcionarios professor2 = new Professor();
        Funcionarios recepcionista1 = new Recepcionistas();
        Funcionarios recepcionista2 = new Recepcionistas();

        professor1.setNome("Madona");
        professor1.setMatricula("001");
        professor2.setNome("Lady Gaga");
        professor2.setMatricula("002");
        recepcionista1.setNome("Popeye");
        ((Recepcionistas)recepcionista1).setDiaTrabalho("Terça");
        ((Recepcionistas)recepcionista1).setHorarioTrabalho("10:00");
        recepcionista1.setMatricula("003");
        ((Recepcionistas)recepcionista2).setDiaTrabalho("Quinta");
        ((Recepcionistas)recepcionista2).setHorarioTrabalho("7:00");
        recepcionista2.setNome("Phelps");
        recepcionista2.setMatricula("004");

        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();

        aluno1.setNome("Neyma");
        aluno1.setCpf("44545462135646");;
        aluno1.setAnoNascimento(1997);;
        aluno2.setNome("Phelps");
        aluno2.setAnoNascimento(2000);;
        aluno2.setCpf("445454621351");;
        aluno1.setListaTreino("10:00=Hipertrofia, 11:00=Ergometria");
        aluno2.setListaTreino("08:00=Nado de Costa, 07:00=Nado Livre, 09:00=Nado Borboleta");

        ((Professor)professor1).adicionarAluno(aluno1);
        ((Professor)professor2).adicionarAluno(aluno2);

        BancoDeDados bancoDedados = new BancoDeDados();
        bancoDedados.adicionarProfessor(((Professor)professor1));
        bancoDedados.adicionarProfessor(((Professor)professor2));
        bancoDedados.adicionarRecepcionista(((Recepcionistas)recepcionista1));
        bancoDedados.adicionarRecepcionista(((Recepcionistas)recepcionista2));

        bancoDedados.printarFuncionarios();
        bancoDedados.printarProfessores();
        bancoDedados.PrintarRecepcionistas();
        bancoDedados.printarAlunos();




    }
}
