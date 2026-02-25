package Ex22.entities;

import Ex22.Enums.StatusPedido;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {

    private Date momento;

    private StatusPedido status;

    private Cliente cliente;

    private List<ItemPedido> itens = new ArrayList<>();

    private Pagamento pagamento;

    public Pedido() {
    }

    public Pedido(Date momento, StatusPedido status, Cliente cliente, Pagamento pagamento) {
        this.momento = momento;
        this.status = status;
        this.cliente = cliente;
        this.pagamento = pagamento;
    }

    public Date getMomento() {
        return momento;
    }

    public void setMomento(Date momento) {
        this.momento = momento;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public void adicionarItem(ItemPedido itemPedido) {
        itens.add(itemPedido);
    }

    public void removerItem(ItemPedido itemPedido) {
        itens.remove(itemPedido);
    }

    public double total() {

        double soma = 0.0;

        for (ItemPedido item : itens) {
            soma += item.subTotal();
        }
        return soma;
    }
}
