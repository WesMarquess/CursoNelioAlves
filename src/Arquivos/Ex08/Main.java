package Arquivos.Ex08;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int contador = 0;
        String path = "C:\\Users\\wesma\\OneDrive\\Área de Trabalho\\texto.txt";
        File file = new File(path);

        try (Scanner scanner = new Scanner(file)) {

            while (scanner.hasNextLine()) {
                String linha = scanner.nextLine();
                System.out.println(linha);
                contador++;
            }
            System.out.println(contador);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
