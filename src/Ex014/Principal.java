package Ex014;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        ArrayList<Produto> produtos = new ArrayList<>();

        int opcao;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Criar produto");
            System.out.println("2 - Atualizar produto");
            System.out.println("3 - Listar produtos");
            System.out.println("4 - Apagar produto");
            System.out.println("5 - Sair");

            opcao = input.nextInt();

            switch (opcao) {

                case 1:
                    input.nextLine();
                    System.out.print("Nome: ");
                    String nome = input.nextLine();

                    System.out.print("Valor: ");
                    double valor = input.nextDouble();

                    System.out.print("Quantidade: ");
                    int quantidade = input.nextInt();

                    Produto p = new Produto(nome, valor, quantidade);
                    produtos.add(p);

                    System.out.println("Produto criado com sucesso!");
                    break;
                case 2:
                    if (produtos.isEmpty()) {
                        System.out.println("Nenhum produto para atualizar.");
                        break;
                    }
                    System.out.println("Selecione o produto pelo ID:");
                    for (Produto prod : produtos) {
                        prod.exibir();
                    }

                    int idAtualizar;
                    System.out.print("ID do produto: ");
                    idAtualizar = input.nextInt();

                    Produto pAtualizar = null;
                    for (Produto prod : produtos) {
                        if (prod.getId() == idAtualizar) {
                            pAtualizar = prod;
                            break;
                        }
                    }

                    if (pAtualizar == null) {
                        System.out.println("ID não encontrado.");
                        break;
                    }

                    input.nextLine();
                    System.out.print("Novo nome: ");
                    pAtualizar.setNome(input.nextLine());

                    System.out.print("Novo valor: ");
                    pAtualizar.setValor(input.nextDouble());

                    System.out.print("Nova quantidade: ");
                    pAtualizar.setQuantidade(input.nextInt());

                    System.out.println("Produto atualizado com sucesso!");
                    break;

                case 3:
                    if (produtos.isEmpty()) {
                        System.out.println("Nenhum produto cadastrado.");
                        break;
                    }
                    System.out.println("=== LISTA DE PRODUTOS ===");
                    for (Produto prod : produtos) {
                        prod.exibir();
                    }
                    break;

                case 4:
                    if (produtos.isEmpty()) {
                        System.out.println("Nenhum produto para apagar.");
                        break;
                    }
                    System.out.println("Selecione o produto pelo ID para apagar:");
                    for (Produto prod : produtos) {
                        prod.exibir();
                    }

                    System.out.print("ID do produto: ");
                    int idRemover = input.nextInt();

                    Produto pRemover = null;
                    for (Produto prod : produtos) {
                        if (prod.getId() == idRemover) {
                            pRemover = prod;
                            break;
                        }
                    }

                    if (pRemover == null) {
                        System.out.println("ID não encontrado.");
                        break;
                    }

                    produtos.remove(pRemover);
                    System.out.println("Produto removido com sucesso!");
                    break;

                case 5:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 5);
    }
}