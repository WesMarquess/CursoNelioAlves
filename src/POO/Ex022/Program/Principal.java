package POO.Ex022.Program;

import POO.Ex022.Enums.StatusPedido;
import POO.Ex022.entities.*;

import java.util.Date;

public class Principal {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("Maria Silva", "maria@email.com");

        Categoria cat1 = new Categoria("Bebidas");
        Categoria cat2 = new Categoria("Comidas");

        Produto p1 = new Produto("Refrigerante", 16.0, cat1);

        Pedido pedido = new Pedido(new Date(), StatusPedido.ABERTO, cliente, null);

        ItemPedido itemPedido = new ItemPedido(2, p1);

        pedido.adicionarItem(itemPedido);

        System.out.println("Total do pedido: R$ " + pedido.total());

    }
}
