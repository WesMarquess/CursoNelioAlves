package Arquivos.Ex014.Controller;

import Arquivos.Ex014.Entities.Livro;
import Arquivos.Ex014.Entities.Usuario;

import java.io.*;

public class ArquivoController {

    private Usuario aluno;
    private Livro livro;

    private String path = "C:\\Users\\wesma\\OneDrive\\Área de Trabalho\\biblioteca.txt";

    public ArquivoController(String path) {
        this.path = path;
    }

    public void salvar(Usuario usuario, Livro livro) {

        try (FileWriter fileWriter = new FileWriter(path, true)) {
            fileWriter.write(livro.getId() + ";" +
                    livro.getTitulo() + ";" +
                    livro.getAutor() + ";" +
                    livro.getDisponivel() + "\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void carregar() {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String linha;
            while ((linha = br.readLine()) != null) {

                String[] partes = linha.split(";");
                Livro livro = new Livro(
                        Integer.parseInt(partes[0]),
                        partes[1],
                        partes[2],
                        Boolean.parseBoolean(partes[3])
                );
            }
        } catch (IOException e) {
            System.out.println("Erro" + e.getMessage());
        }
    }
}