package Arquivos.Ex012.Service;

import Arquivos.Ex011.entities.Pessoa;

import java.util.Scanner;

public class PessoaService {

    private Pessoa pessoa;

    public static String lerNome(Scanner input) {

        while (true) {
            System.out.println("Digite seu nome: ");
            String nome = input.nextLine();

            if (nome.trim().isEmpty()) {
                System.out.println("Nome invalido.");
                continue;
            }

            if (nome.trim().length() < 3) {
                System.out.println("O nome deverá conter mais do que 3 letras");
                continue;
            }

            if (!nome.matches("[a-zA-Z]+(\\s[a-zA-Z]+)*")) {
                System.out.println("Use apenas letras!");
                continue;
            }

            return nome;
        }
    }

    public static int lerIdade(Scanner input) {
        while (true) {
            System.out.println("Digite sua idade: ");
            String idadeStr = input.nextLine().trim();

            if (!idadeStr.matches("\\d+")) {
                System.out.println("Digite apenas números!");
                continue;
            }

            int idade = Integer.parseInt(idadeStr);

            if (idade <= 0 || idade > 120) {
                System.out.println("Idade inválida!");
                continue;
            }
            return idade;
        }
    }
}