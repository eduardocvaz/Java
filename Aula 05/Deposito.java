import java.util.ArrayList;

public class Deposito {
    private ArrayList<Produto> produtos;
    private Produto maior;

    public Deposito() {
        produtos = new ArrayList<Produto>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void removeProduto(Produto produto) {
        for (Produto item : produtos) {
            if (item == produto) {
                produtos.remove(produto);
                System.out.println("Produto removido");
            }
        }
        System.out.println("Produto não se encontra na lista, tente novamente");
    }

    public int quantidadeProdutos() {
        System.out.println("Quantidade:"+this.produtos.size());
        return this.produtos.size();
    }

    public boolean depositoVazio() {
        if (this.produtos.size() == 0) {
            System.out.println("Deposito esta vazio");
            return true;
        }
        return false;
    }

    public Produto maiorPreco() {
        if (!depositoVazio()) {
            this.maior = produtos.get(0);
            for (Produto produto : produtos) {
                if (produto.getPreco() > maior.getPreco()) {
                    maior = produto;
                }
            }
            return maior;
        }
        return new Produto();
    }


}
