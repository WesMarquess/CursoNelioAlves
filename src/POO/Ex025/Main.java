package POO.Ex025;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        List<Produto> produtos = new ArrayList<>();


        System.out.println("Digite o numero de produtos:");
        int qtdProdutos = input.nextInt();
        input.nextLine();

        for (int i = 1; i <= qtdProdutos; i++) {
            System.out.println("Produto: " + i);
            System.out.println("comum, usado ou importado? (c/u/i)");
            char escolha = input.next().charAt(0);
            input.nextLine();
            System.out.println("Nome:");
            String nome = input.nextLine();
            System.out.println("Preco:");
            double preco = input.nextDouble();
            input.nextLine();


            if (escolha == 'c') {
                produtos.add(new Produto(nome, preco));
            } else if (escolha == 'u') {
                System.out.println("Data de fabricação (dd/MM/yyyy):");
                String data = input.nextLine();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                LocalDate date = LocalDate.parse(data, formatter);
                produtos.add(new ProdutoUsado(nome, preco, date));
            } else {
                System.out.println("Taxa de importação:");
                double precoImportacao = input.nextDouble();
                produtos.add(new ProdutoImportado(nome, preco, precoImportacao));
            }
        }

        for (Produto p : produtos) {
            System.out.println(p.etiqueta());
        }
    }
}
