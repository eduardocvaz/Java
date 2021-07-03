public class ExercutaTurma {
    public static void main(String[] args) {
        Prova prova1aluno1 = new Prova(3.0, 3.5);
        Prova prova2aluno1 = new Prova(4.0, 4.0);

        Prova prova1aluno2 = new Prova(5.0, 4.5);
        Prova prova2aluno2 = new Prova(1.0, 2.0);

        Prova prova1aluno3 = new Prova(5.0, 2.5);
        Prova prova2aluno3 = new Prova(5.0, 4.0);

        Aluno aluno1 = new Aluno(prova1aluno1, prova2aluno1);
        Aluno aluno2 = new Aluno(prova1aluno2, prova2aluno2);
        Aluno aluno3 = new Aluno(prova1aluno3, prova2aluno3);

        Turma turma = new Turma();

        turma.setAluno(aluno1);
        turma.setAluno(aluno2);
        turma.setAluno(aluno3);

        turma.setNomeDaTurma("Turma A");

        System.out.println(turma.getNomeDaTurma());

        for (int i = 0; i < turma.tamanhoDaTurma(); i++) {
            System.out.println("---------------------------------------");
            System.out.println("Aluno " + (i + 1) + ":\n");
            System.out.println("Prova 1:" + turma.getAluno(i).getProva1().calcularNotaTotal());
            System.out.println("Prova 2:" + turma.getAluno(i).getProva2().calcularNotaTotal());
            System.out.println("Media:" + turma.getAluno(i).calcularMedia() + "\n");
        }

        System.out.println("---------------------------------------" + "\n");
        System.out.println("Media da Turma:" + turma.calcularMedia());

    }

}
