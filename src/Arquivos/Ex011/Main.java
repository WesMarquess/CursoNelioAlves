package Arquivos.Ex011;

import Arquivos.Ex011.entities.Pessoa;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static List<Pessoa> pessoas = new ArrayList<>();

    public static void main(String[] args) {

        String path = "C:\\Users\\wesma\\OneDrive\\Área de Trabalho\\cadastro.txt";
        File file = new File(path);

        Scanner input = new Scanner(System.in);

        String nome = "";

        while (true) {
            System.out.print("Digite seu nome: ");
            nome = input.nextLine();

            String nomeLimpo = nome.trim();
            if (nomeLimpo.isEmpty()) {
                System.out.println("Nome inválido!");
                continue;
            }
            if (nomeLimpo.length() < 3) {
                System.out.println("Nome precisa ter no mínimo 3 caracteres!");
                continue;
            }
            if (!nomeLimpo.matches("[a-zA-Z]+(\\s[a-zA-Z]+)*")) {
                System.out.println("Nome inválido! Use apenas letras e um espaço entre nomes.");
                continue;
            }
            break;
        }

        int idade;

        while (true) {
            System.out.print("Digite sua idade: ");
            String entrada = input.nextLine().trim();
            if (entrada.isEmpty()) {
                System.out.println("Idade não pode ser vazia!");
                continue;
            }

            if (!entrada.matches("\\d+")) {
                System.out.println("Digite apenas números!");
                continue;
            }

            idade = Integer.parseInt(entrada);

            if (idade <= 0) {
                System.out.println("Idade deve ser maior que 0!");
                continue;
            }

            if (idade > 100) {
                System.out.println("Idade inválida!");
                continue;
            }

            break;
        }
        pessoas.add(new Pessoa(nome, idade));

        try (FileWriter fileWriter = new FileWriter(file, true)) {
            fileWriter.write("Nome: " + nome + " | Idade: " + idade + "\n");
            System.out.println("Salvo com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        input.close();
    }
}
