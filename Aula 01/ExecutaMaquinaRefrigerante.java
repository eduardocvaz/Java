public class ExecutaMaquinaRefrigerante {
    //Criando o metodo executavel da classe
    public static void main(String[] args) {
        // vamos instancia a classe
        MaquinaRefrigerante maquina = new MaquinaRefrigerante(5);

        // Chamando um método
        maquina.imprimirPreco();

        //Inserir dinheiro na maquina
        System.out.println("");
        maquina.inserirDinheiro(20);
        
        //Retornando o balanço corrent
        System.out.println("");
        System.out.println("Balanço atual =>" + maquina.getBalanco());
        
    }
}
