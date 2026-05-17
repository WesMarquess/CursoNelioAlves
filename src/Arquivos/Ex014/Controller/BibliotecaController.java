package Arquivos.Ex014.Controller;

import Arquivos.Ex014.Entities.Livro;
import Arquivos.Ex014.Entities.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BibliotecaController {

    private List<Livro> listaLivros = new ArrayList<>();
    private List<Usuario> listaUsuarios = new ArrayList<>();

    public List<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public List<Livro> getListaLivros() {
        return listaLivros;
    }

    public static int validaId(Scanner input) {
        while (true) {
            System.out.println("Id do livro:");
            String idLivroStr = input.nextLine();

            if (idLivroStr.trim().isEmpty()) {
                System.out.println("Id está vazio. Preencha um novo");
            }

            int id = Integer.parseInt(idLivroStr);

            if (idLivroStr.trim().length() <= 0) {
                System.out.println("Id precisa ser maior do que zero.");
            }
            return id;
        }
    }

    public static String validaTitulo(Scanner input) {
        while (true) {
            System.out.println("Título: ");
            String titulo = input.nextLine();

            if (titulo.trim().isEmpty()) {
                System.out.println("Título vazio");
                continue;
            }

            if (titulo.trim().length() < 3) {
                System.out.println("O título precisa conter mais do que três caracteres");
                continue;
            }
            return titulo;
        }
    }

    public static String validaAutor(Scanner input) {
        while (true) {
            System.out.println("Autor: ");
            String titulo = input.nextLine();

            if (titulo.trim().isEmpty()) {
                System.out.println("Autor vazio: É necessário preencher");
                continue;
            }

            if (titulo.trim().length() < 3) {
                System.out.println("O nome do autor precisa conter mais do que três caracteres");
                continue;
            }
            return titulo;
        }
    }

    public static Livro cadastrarLivro(Livro livro, Scanner input) {

        int id = validaId(input);
        String titulo = validaTitulo(input);
        String autor = validaAutor(input);
        return livro = new Livro(id, titulo, autor, true);
    }

    public void emprestarLivro(int id, Usuario usuario) {
        for (Livro livro : listaLivros) {
            if (livro.getId() == id) {
                if (!livro.getDisponivel()) {
                    System.out.println("Livro já emprestado.");
                    return;
                }
                livro.setDisponivel(false);
                livro.setUsuario(usuario);
                System.out.println("Livro emprestado para: " + usuario.getNome());
                return;
            }
        }
        System.out.println("Livro não encontrado.");
    }

    public void devolverLivro(int idLivro, Usuario usuario) {
        for (Livro livro : listaLivros) {
            if (livro.getId().equals(idLivro)) {

                if (livro.getDisponivel()) {
                    System.out.println("Livro já está disponível.");
                    return;
                }

                livro.setDisponivel(true);
                livro.setUsuario(null);

                System.out.println("Livro devolvido com sucesso.");
                return;
            }
        }
    }

    public Usuario buscarUsuarioPorId(int id) {
        for (Usuario usuario : listaUsuarios) {

            if (usuario.getId() == id) {
                return usuario;
            }
        }

        return null;
    }

    public boolean idValido(int id) {
        if (id <= 0) return false;
        for (Livro l : listaLivros) {
            if (l.getId() == id) return false;
        }
        return true;
    }
}