package Arquivos.Ex015.Controller;

import Arquivos.Ex015.Entities.Usuario;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ArquivoController {

    private String path = "C:\\Users\\wesma\\OneDrive\\Área de Trabalho\\formulario";
    private List<String> perguntas = new ArrayList<>();

    public ArquivoController(String path) {
        this.path = path;
    }

    public void ler() {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            String linha;
            while ((linha = bufferedReader.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public void salvar(Usuario usuario) {

        String pathPasta = "C:\\Users\\wesma\\OneDrive\\Área de Trabalho\\usuarios\\";
        File pasta = new File(pathPasta);

        if (!pasta.exists()) {
            pasta.mkdir();
        }

        String nomeArquivo = pathPasta + usuario.getName() + ".txt";

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(nomeArquivo))) {

            bufferedWriter.write("Nome: " + usuario.getName() + " | ");
            bufferedWriter.write("Email: " + usuario.getEmail() + " | ");
            bufferedWriter.write("Idade " + usuario.getIdade() + " | ");
            bufferedWriter.write("Altura " + usuario.getAltura());

        } catch (IOException e) {
            System.out.println("Erro:" + e.getMessage());
        }
    }

    public void listar() {

        String path = "C:\\Users\\wesma\\OneDrive\\Área de Trabalho\\usuarios\\";
        File pasta = new File(path);

        File[] arquivos = pasta.listFiles();
        int i = 1;

        for (File arquivo : arquivos) {

            try (BufferedReader reader = new BufferedReader(new FileReader(arquivo))) {

                String linha = reader.readLine();

                if (linha != null) {
                    String[] partes = linha.split("\\|");
                    String nomeParte = partes[0];
                    String nome = nomeParte.split(":")[1].trim();

                    System.out.println(i + " - " + nome);
                    i++;
                }
            } catch (IOException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
    }

    public void adicionarPergunta(String pergunta) {

        int i = 1;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            while (bufferedReader.readLine() != null) {
                i++;
            }
        } catch (IOException e) {
            System.out.println("Erro 1: " + e.getMessage());
        }
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path, true))) {
            bufferedWriter.newLine();
            bufferedWriter.write(i + " - " + pergunta);
        } catch (IOException e) {
            System.out.println("Erro 2: " + e.getMessage());
        }
    }

    public void removerPerguntas(int index) {

        if (index < 3) {
            System.out.println("Não é possível deletar essa pergunta");
        } else {
            try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path))) {
            } catch (IOException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
    }
}