package POO.Ex016;

import java.util.Date;

public class Principal {
    public static void main(String[] args) {

        Pedido pedido = new Pedido(1080, new Date(), StatusPedido.PAGAMENTO_PENDENTE);

        System.out.println(pedido);

        Pedido pedido2 = new Pedido(1081, new Date(), StatusPedido.valueOf("ENTREGUE"));

        System.out.println(pedido2);


    }
}
