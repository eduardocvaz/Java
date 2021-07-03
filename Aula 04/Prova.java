public class Prova {
    private double notaParte1;
    private double notaParte2;
    private double total;

    public Prova(double notaParte1, double notaParte2) {
        this.notaParte1 = notaParte1;
        this.notaParte2 = notaParte2;

    }

    public double getNotaParte1() {
        return this.notaParte1;
    }

    public void setNotaParte1(double notaParte1) {
        this.notaParte1 = notaParte1;
    }

    public double getNotaParte2() {
        return this.notaParte2;
    }

    public void setNotaParte2(double notaParte2) {
        this.notaParte2 = notaParte2;
    }

    public double calcularNotaTotal() {
        total = notaParte1+notaParte2;
        if(total <= 10 && total >0) {   
            return total;
        }else {
            System.out.println("Valores invalidos");
            return 0;
        }
    }
    
}
