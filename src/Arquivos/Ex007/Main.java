package Arquivos.Ex007;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String path = "C:\\Users\\wesma\\OneDrive\\Área de Trabalho\\texto.txt";
        File file = new File(path);

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String linha = scanner.nextLine();
                System.out.println(linha);
            }
        } catch (IOException e) {
            System.out.println("Erro ao tentar ler." + e.getMessage());
        }
    }
}
