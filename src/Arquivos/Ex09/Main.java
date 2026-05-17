package Arquivos.Ex09;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String path = "C:\\Users\\wesma\\OneDrive\\Área de Trabalho\\cadastro.txt";
        File file = new File(path);
        Scanner input = new Scanner(System.in);

        try (FileWriter fileWriter = new FileWriter(file, true)) {
            System.out.println("Digite seu nome: ");
            fileWriter.write("Nome: " + input.nextLine());
            fileWriter.write(" | ");
            System.out.println("Digite sua idade: ");
            fileWriter.write("Idade : " + input.nextLine());
            fileWriter.write("\n");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
