public class Pessoa {
    // Atributos
    private double peso;
    private double altura;
    private double IMC;
    private String resultadoIMC;

    // Metodos set
    public void setPeso(double valor) {
        peso = valor;
    }

    public void setAltura(double valor) {
        altura = valor;
    }

    // Metodos get
    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    // Metodo construtor
    public Pessoa(double valor1, double valor2) { // tudo é feito ao construir a classe com os valores
        peso = valor1;
        altura = valor2;
        informarIMC(calcularIMC());
        imprimirResultado();
    }

    public double calcularIMC() {
        this.IMC = this.peso / (this.altura * this.altura);
        return this.IMC;
    }

    public String informarIMC(double IMC) {
        if (this.IMC > 0 && this.IMC <= 18.5) {
            this.resultadoIMC = "Pessoa Abaixo do peso";
        } else if (this.IMC > 18.5 && this.IMC <= 24.9) {
            this.resultadoIMC = "Pessoa com Peso normal";
        } else if (this.IMC > 24.9 && this.IMC <= 29.9) {
            this.resultadoIMC = "Pessoa com Pré-obesidade";
        } else if (this.IMC > 29.9 && this.IMC <= 34.9) {
            this.resultadoIMC = "Pessoa com Obesidade Grau 1";
        } else if (this.IMC > 34.9 && this.IMC <= 39.9) {
            this.resultadoIMC = "Pessoa com Obesidade Grau 2";
        } else if (this.IMC > 39.9) {
            this.resultadoIMC = "Pessoa com Obesidade Grau 3";
        } else {
            System.out.println("IMC invalido");
        }
        return resultadoIMC;
    }

    public void imprimirResultado(){
        System.out.println("Peso  =>" + this.peso);
        System.out.println("Altura  =>" + this.altura);
        System.out.println("IMC  =>" + this.IMC);
        System.out.println(this.resultadoIMC);
    }

}
