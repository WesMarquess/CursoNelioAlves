package Arquivos.Ex012.Service;

import Arquivos.Ex012.Entities.Pessoa;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ArquivoService {

    private String path = "C:\\Users\\wesma\\OneDrive\\Área de Trabalho\\cadastro.txt";

    public ArquivoService(String path) {
        this.path = path;
    }

    public void salvar(Pessoa pessoa) {
        try (FileWriter fw = new FileWriter(path, true)) {
            fw.write(pessoa.toString() + "\n");
        } catch (IOException e) {
            System.out.println("Erro ao salvar: " + e.getMessage());
        }
    }

    public void listar() {
        int contadorLinhas = 0;
        File file = new File(path);

        try (Scanner input = new Scanner(file)) {

            while (input.hasNext()) {
                ++contadorLinhas;
                String linha = input.nextLine();
                System.out.println("Linha: " + " - " + contadorLinhas + linha);
            }
        } catch (IOException e) {
            System.out.println("Erro ao listar: " + e.getMessage());
        }
    }

    public boolean buscar(String buscado) {

        File file = new File(path);
        boolean encontrou = false;

        try (Scanner input = new Scanner(file)) {

            while (input.hasNextLine()) {
                String linha = input.nextLine();

                if (linha.toLowerCase().contains(buscado.toLowerCase())) {
                    System.out.println("Encontrado! " + linha);
                    encontrou = true;
                }
            }
        } catch (IOException e) {
            System.out.println("Erro ao tentar buscar " + e.getMessage());
        }
        return encontrou;
    }


}
