package Arquivos.Ex015.Program;

import Arquivos.Ex015.Entities.Usuario;
import Arquivos.Ex015.Controller.ArquivoController;
import Arquivos.Ex015.Controller.UsuarioController;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    static String path = "C:\\Users\\wesma\\OneDrive\\Área de Trabalho\\formulario.txt";
    static ArquivoController arquivoController = new ArquivoController(path);
    static UsuarioController usuarioController = new UsuarioController();
    static List<Usuario> listarUsuarios = new ArrayList<>();

    public static void main(String[] args) {

        menu();
    }

    public static void menu() {
        String menu = "1 - Cadastrar o usuário\n" +
                "2 - Listar todos usuários cadastrados\n" +
                "3 - Cadastrar nova pergunta no formulário\n" +
                "4 - Deletar pergunta do formulário\n" +
                "5 - Pesquisar usuário por nome ou idade ou email\n";

        while (true) {
            System.out.println(menu);
            int opcao = input.nextInt();
            input.nextLine();

            switch (opcao) {
                case 1:
                    arquivoController.ler();
                    System.out.println("Digite seu nome");
                    String nome = input.nextLine();
                    System.out.println("Digite seu email");
                    String email = input.nextLine();
                    System.out.println("Digite sua idade");
                    int idade = input.nextInt();
                    input.nextLine();
                    System.out.println("Digite sua altura");
                    double altura = input.nextDouble();

                    Usuario usuario = new Usuario(nome, email, idade, altura);
                    listarUsuarios.add(usuario);
                    arquivoController.salvar(usuario);
                    break;
                case 2:
                    arquivoController.listar();
                    break;
                case 3:
                    System.out.println("Adicione a sua pergunta");
                    String pergunta = input.nextLine();
                    arquivoController.adicionarPergunta(pergunta);
                    break;
                case 4:
                    System.out.println("Digite a pargunta para deletar: ");
                    arquivoController.ler();
                    int index = input.nextInt();
                    input.nextLine();
                    arquivoController.removerPerguntas(index);
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Selecione uma opção valida!");
            }
        }
    }
}

