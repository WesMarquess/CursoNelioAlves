package Ex019;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

        Scanner input = new Scanner(System.in);

        System.out.println("Dados do cliente:");
        System.out.println("Nome:");
        String nome = input.nextLine();
        System.out.println("Email:");
        String email = input.nextLine();
        System.out.println("Data de aniversário:");
        Date data = simpleDateFormat.parse(input.nextLine());

        Cliente cliente = new Cliente(nome, email, data);

        System.out.println("Status do pedido:");
        StatusPedido status = StatusPedido.valueOf(input.next());

        Pedido pedido = new Pedido(new Date(), status, cliente);

        System.out.println("Quantidade de pedidos: ");
        int quantidade = input.nextInt();

        for (int i = 1; i <= quantidade; i++) {
            input.next();
            System.out.println("Nome do produto:");
            String nomeProduto = input.nextLine();
            System.out.println("Preço do produto");
            double precoProduto = input.nextDouble();
            System.out.println("Quantidade: ");
            int quantidadeProduto = input.nextInt();

            Produto produto = new Produto(nomeProduto, precoProduto);

            ItemPedido itemPedido = new ItemPedido(quantidadeProduto, precoProduto, produto);

            pedido.adicionarItem(itemPedido);
        }
    }
}
