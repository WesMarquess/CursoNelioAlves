package Arquivos.Ex012.program;

import Arquivos.Ex012.Entities.Pessoa;
import Arquivos.Ex012.Service.ArquivoService;
import Arquivos.Ex012.Service.PessoaService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String path = "cadastro.txt";

        ArquivoService arquivoService = new ArquivoService(path);

        while (true) {

            System.out.println("\n===== MENU =====");
            System.out.println("1 - Cadastrar pessoa");
            System.out.println("2 - Listar pessoas");
            System.out.println("3 - Buscar pessoa");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");

            String opcao = input.nextLine();

            switch (opcao) {

                case "1":
                    String nome = PessoaService.lerNome(input);
                    int idade = PessoaService.lerIdade(input);

                    Pessoa pessoa = new Pessoa(nome, idade);
                    arquivoService.salvar(pessoa);

                    System.out.println("Pessoa cadastrada!");
                    break;

                case "2":
                    System.out.println("\n--- Lista de Pessoas ---");
                    arquivoService.listar();
                    break;

                case "3":
                    System.out.print("Digite o nome para buscar: ");
                    String busca = input.nextLine();

                    boolean encontrou = arquivoService.buscar(busca);

                    if (!encontrou) {
                        System.out.println("Nenhum resultado encontrado.");
                    }
                    break;

                case "4":
                    System.out.println("Saindo...");
                    input.close();
                    return;

                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}