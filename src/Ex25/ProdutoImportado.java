package Ex25;

public class ProdutoImportado extends Produto {

    private Double taxaPersonalizada;

    public ProdutoImportado(String nome, Double preco, Double taxaPersonalizada) {
        super(nome, preco);
        this.taxaPersonalizada = taxaPersonalizada;
    }

    public Double getTaxaPersonalizada() {
        return taxaPersonalizada;
    }

    public void setTaxaPersonalizada(Double taxaPersonalizada) {
        this.taxaPersonalizada = taxaPersonalizada;
    }

    public Double precoTotal() {
        return getPreco() + taxaPersonalizada;
    }

    @Override
    public String etiqueta() {
        return getNome()
                + " $ "
                + String.format("%.2f", precoTotal())
                + " (taxa personalizada : $ "
                + String.format("%.2f", taxaPersonalizada)
                + ")";
    }
}
