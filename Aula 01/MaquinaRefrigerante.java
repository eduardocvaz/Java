public class MaquinaRefrigerante {
    //Atributos
    private int preco;
    private int balanco;
    private int total;
    private boolean darTroco;

    //Metodo construtor para inicialiar os atributos
    public MaquinaRefrigerante(int valor) {
        preco = valor;
        balanco = 0;
        total = 0;
        darTroco=false;
    }

    //Setar dar Troco
    public void setdarTroco(){
        
    }

    // Retornar preço

    public int getPreco(){
        return preco;
    }

    // Retorna o balanço corrent
    public int getBalanco() {
        return balanco;
    }

    // Recebe valor em dinheiro
    public void inserirDinheiro(int valor) {
        if (valor > 0) {
            balanco += valor;
            System.out.println("Valor inserido com sucesso!!!");
        }else {
            System.out.println("Use um valor positivo!!!");
            System.out.println("Tente outro vez!!");
        }
    }

    //Imprimir o preço 
    public void imprimirPreco() {
        System.out.println("##################");
        System.out.println("## Preço #########");
        System.out.println("# Refrigerante ###");
        System.out.println("# R$" + preco + ",00 #########");
        System.out.println("##################");
    }


}   