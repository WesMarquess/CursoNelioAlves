package Ex19;

public class ItemPedido {

    private Integer quantidade;
    private Double preco;

    private Pedido pedido;

    public ItemPedido(int quantidadeProduto, double precoProduto, Produto produto) {

    }

    public ItemPedido(Integer quantidade, Double preco, Pedido pedido) {
        this.quantidade = quantidade;
        this.preco = preco;
        this.pedido = pedido;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public double subTotal() {
        return preco * quantidade;
    }

}
