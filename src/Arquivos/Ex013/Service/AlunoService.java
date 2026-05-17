package Arquivos.Ex013.Service;

import Arquivos.Ex013.entities.Aluno;

import java.util.Scanner;

public class AlunoService {

    private Aluno aluno;

    public static String lerNome(Scanner input) {
        while (true) {
            System.out.println("Digite seu nome: ");
            String nome = input.nextLine();

            if (nome.trim().isEmpty()) {
                throw new IllegalArgumentException("Nome invalido");
            }

            if (nome.trim().length() < 3) {
                throw new IllegalArgumentException("Nome precisa ter mais do que tres caracteres");
            }

            return nome;
        }
    }

    public static int lerIdade(Scanner input) {
        while (true) {

            System.out.println("Digite a idade:");
            String idadeStr = input.nextLine().trim();

            if (!idadeStr.matches("\\d+")) {
                System.out.println("Digite apenas números!");
                continue;
            }

            int idade = Integer.parseInt(idadeStr);

            if (idade <= 14 || idade >= 100) {
                throw new IllegalArgumentException("Idade invalida." +
                        "Precisa ter no minimo 14 anos.");
            }
            return idade;
        }
    }
}
