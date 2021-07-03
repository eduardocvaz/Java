import java.util.Date;

public class ProdutoNaoDuravel extends Produto {
    private Date dataValidade;
    private String genero;

    public ProdutoNaoDuravel() {
    }

    public Date getDataValidade() {
        return this.dataValidade;
    }

    public void setDataValidade(Date dataValidade) {
        this.dataValidade = dataValidade;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

}
