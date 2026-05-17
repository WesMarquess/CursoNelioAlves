package Arquivos.Ex013.Service;

import Arquivos.Ex013.entities.Exercicio;

import java.util.Scanner;

public class ExercicioService {

    private Exercicio exercicio;

    public static String lerNomeExercicio(Scanner input) {
        while (true) {
            System.out.println("Nome do exercicio");
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

    public static int lerRepeticoes(Scanner input) {
        System.out.println("Quantidade de repetições: ");
        String qtdRepeticoesStr = input.nextLine();

        if (!qtdRepeticoesStr.matches("\\d+")) {
            throw new IllegalArgumentException("Digite apenas numeros");
        }

        if (qtdRepeticoesStr.trim().isEmpty()) {
            throw new IllegalArgumentException("Campo não pode ser vazio");
        }

        int qtdRepeticoes = Integer.parseInt(qtdRepeticoesStr);

        if (qtdRepeticoes <= 0) {
            throw new IllegalArgumentException("Quantidade precisa ser maior do que zero");
        }
        return qtdRepeticoes;
    }

    public static int lerSeries(Scanner input) {
        System.out.println("Quantidade de repetições: ");
        String qtdSeriesStr = input.nextLine();

        if (!qtdSeriesStr.matches("\\d+")) {
            throw new IllegalArgumentException("Digite apenas numeros");
        }

        if (qtdSeriesStr.trim().isEmpty()) {
            throw new IllegalArgumentException("Campo não pode ser vazio");
        }

        int qtdSeries = Integer.parseInt(qtdSeriesStr);

        if (qtdSeries <= 0) {
            throw new IllegalArgumentException("Quantidade precisa ser maior do que zero");
        }
        return qtdSeries;
    }
}