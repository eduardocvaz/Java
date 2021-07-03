import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Loja {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
        Deposito deposito = new Deposito();

        ProdutoDuravel carro = new ProdutoDuravel();
        carro.setNome("Fiat Uno");
        carro.setPreco(12000.20);
        carro.setMarca("Fiat");
        carro.setDescricao("É um carro");
        carro.setDurabilidade(50);
        carro.setDataFabricacao(formato.parse("21/02/2013"));
        
        ProdutoDuravel livro = new ProdutoDuravel();
        livro.setNome("Pequeno Principe");
        livro.setPreco(25.20);
        livro.setMarca("livro");
        livro.setDescricao("É um livro");
        livro.setDurabilidade(20);
        livro.setDataFabricacao(formato.parse("21/02/2012"));
        ProdutoDuravel celular = new ProdutoDuravel();
        celular.setNome("g4 plus");
        celular.setPreco(2000.20);
        celular.setDurabilidade(7);
        celular.setDataFabricacao(formato.parse("21/02/2012"));
        
        ProdutoNaoDuravel chocolate = new ProdutoNaoDuravel();
        chocolate.setNome("Barra de Chocolate");
        chocolate.setPreco(2.0);
        chocolate.setMarca("Garoto");
        chocolate.setDescricao("É um Chocolate");
        chocolate.setDataValidade(formato.parse("23/11/2015"));
        chocolate.setGenero("Comida");
        chocolate.setDataFabricacao(formato.parse("23/02/2015"));
        ProdutoNaoDuravel toalha = new ProdutoNaoDuravel();
        toalha.setNome("toalha");
        toalha.setPreco(29.0);
        toalha.setMarca("marca de toalhas");
        toalha.setDescricao("É um toalha");
        toalha.setDataValidade(formato.parse("23/11/2015"));
        toalha.setGenero("Comida");
        toalha.setDataFabricacao(formato.parse("23/02/2015"));
        ProdutoNaoDuravel sabonete = new ProdutoNaoDuravel();
        sabonete.setNome("Sabonete");
        sabonete.setPreco(1.0);
        sabonete.setMarca("Garoto");
        sabonete.setDescricao("É uma Toalha");
        sabonete.setDataValidade(formato.parse("23/11/2015"));
        sabonete.setGenero("Comida");
        sabonete.setDataFabricacao(formato.parse("23/02/2015"));
        
        deposito.depositoVazio();
        deposito.quantidadeProdutos();
        
        deposito.adicionarProduto(carro);
        deposito.adicionarProduto(livro);
        deposito.adicionarProduto(celular);
        
        deposito.adicionarProduto(chocolate);
        deposito.adicionarProduto(toalha);
        deposito.adicionarProduto(sabonete);
        
        deposito.quantidadeProdutos();

        System.out.println("Nome:" + deposito.maiorPreco().getNome());
        System.out.println("Preco:" + deposito.maiorPreco().getPreco());



    }
}
