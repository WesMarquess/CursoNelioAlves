package Arquivos.Ex014.Program;

import Arquivos.Ex014.Controller.ArquivoController;
import Arquivos.Ex014.Controller.BibliotecaController;
import Arquivos.Ex014.Entities.Livro;
import Arquivos.Ex014.Entities.Usuario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String path = "C:\\Users\\wesma\\OneDrive\\Área de Trabalho\\biblioteca.txt";

        Scanner input = new Scanner(System.in);
        BibliotecaController controller = new BibliotecaController();
        ArquivoController arquivo = new ArquivoController(path);

        int opcao;

        do {
            System.out.println("\n1 - Cadastrar livro");
            System.out.println("2 - Listar livros");
            System.out.println("3 - Cadastrar usuario");
            System.out.println("4 - Emprestar livro");
            System.out.println("5 - Salvar livros no arquivo");
            System.out.println("0 - Sair");
            System.out.print("Opcao: ");

            opcao = Integer.parseInt(input.nextLine());

            if (opcao == 1) {
                Livro livro = BibliotecaController.cadastrarLivro(null, input);
                controller.getListaLivros().add(livro);
            } else if (opcao == 2) {
                for (Livro l : controller.getListaLivros()) {
                    System.out.println(l);
                }
            } else if (opcao == 3) {
                System.out.print("ID: ");
                int id = Integer.parseInt(input.nextLine());

                System.out.print("Nome: ");
                String nome = input.nextLine();

                Usuario u = new Usuario((int) id, nome);
                controller.getListaUsuarios().add(u);
            } else if (opcao == 4) {
                System.out.print("ID livro: ");
                int idLivro = Integer.parseInt(input.nextLine());

                System.out.print("ID usuario: ");
                int idUsuario = Integer.parseInt(input.nextLine());

                Usuario u = controller.buscarUsuarioPorId(idUsuario);

                if (u != null) {
                    controller.emprestarLivro(idLivro, u);
                } else {
                    System.out.println("Usuario nao encontrado");
                }
            } else if (opcao == 5) {
                for (Livro l : controller.getListaLivros()) {
                    arquivo.salvar(null, l);
                }
                System.out.println("Livros salvos com sucesso.");
            }

        } while (opcao != 0);

        input.close();
    }
}