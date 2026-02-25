package Ex1;

import java.util.Scanner;

public class Produto {
    Scanner input = new Scanner(System.in);

    public String nome;
    public double preco;
    public int qtd;

    public void adicionar() {

        System.out.println("Adicionar item:");
        System.out.println("Digite o nome do produto: ");
        this.nome = input.nextLine();
        System.out.println("Digie o preço do item:");
        this.preco = input.nextDouble();
        System.out.println("Digite a quantidade do item:");
        this.qtd = input.nextInt();
        Produto produto = new Produto();
    }

    public double calculaEstoque() {

        double totalEstoque = 0;
        totalEstoque = qtd * preco;
        System.out.println("Total no estoque: " + totalEstoque);
        return totalEstoque;
    }

    public void apagar() {
        System.out.println("Apagar");
        System.out.println("Digite a quantidade a apagar:");
        int apagado = input.nextInt();

        if (qtd <= 0) {
            System.out.println("Não pode ser apagado");
        } else {
            this.qtd = qtd - apagado;
            System.out.println("Apagado do estoque total de: " + apagado);
            System.out.println("Saldo atual: " + this.qtd);
        }
    }
}
