package Arquivos.Ex010;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String path = "C:\\Users\\wesma\\OneDrive\\Área de Trabalho\\cadastro.txt";
        File file = new File(path);

        int contadorLinha = 0;
        String buscado = "Zezinho";
        boolean encontrou = false;

        try (Scanner input = new Scanner(file)) {

            while (input.hasNextLine()) {
                String linha = input.nextLine();
                ++contadorLinha;

                if (buscarNome(linha, buscado)) {
                    System.out.println("Encontrado na linha: " + contadorLinha);
                    encontrou = true;
                }
            }

            if (!encontrou){
                System.out.println("Não encontrou");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static boolean buscarNome(String linha, String buscado) {
        return linha.toLowerCase().contains(buscado.toLowerCase());
    }
}