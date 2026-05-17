package Arquivos.Ex003;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String path = "C:\\Users\\wesma\\OneDrive\\Área de Trabalho\\ex01.txt";

        System.out.println("Digite seu nome:");
        String nome = input.nextLine();

        try (FileWriter fileWriter = new FileWriter(path, true)) {

            fileWriter.write("Seu nome é: " + nome + "\n");
            System.out.println("Arquivo escrito com sucesso!");

        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        input.close();
    }
}