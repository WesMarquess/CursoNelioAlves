package Ex20;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {

    private Date momento;
    private Status status;
    private List<ItemPedido> itens = new ArrayList<>();

    public Pedido() {

    }

    public Pedido(Date momento, Status status) {
        this.momento = momento;
        this.status = status;
    }

    public Date getMomento() {
        return momento;
    }

    public void setMomento(Date momento) {
        this.momento = momento;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void adicionarItem(ItemPedido itemPedido) {
        itens.add(itemPedido);
    }

    public void removerItem(ItemPedido itemPedido) {
        itens.remove(itemPedido);
    }

    public double total() {

        double soma = 0.0;

        for (ItemPedido itens : itens) {
            soma += itens.subTotal();
        }
        return soma;
    }
}
