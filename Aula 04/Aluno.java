public class Aluno {
    private Prova prova1;
    private Prova prova2;
    private double media;

    public Aluno(Prova prova1, Prova prova2) {
        this.prova1 = prova1;
        this.prova2 = prova2;
    }

    public Aluno() {
    }

    public double getMedia() {
        return this.media;
    }

    public Prova getProva1() {
        return this.prova1;
    }

    public void setProva1(Prova prova1) {
        this.prova1 = prova1;
    }

    public Prova getProva2() {
        return this.prova2;
    }

    public void setProva2(Prova prova2) {
        this.prova2 = prova2;
    }

    public double calcularMedia(){
        this.media = (prova1.calcularNotaTotal() + prova2.calcularNotaTotal())/2;
        return this.media;
    }

}
