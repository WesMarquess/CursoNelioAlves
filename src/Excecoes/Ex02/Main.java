package Excecoes.Ex02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        method();
    }

    public static void method() {

        try {
            String[] vetor = input.next().split(" ");
            int posicao = input.nextInt();
            input.next();
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Posicao invalida");

        } catch (InputMismatchException e) {
            System.out.println("Input invalido.");
        }
        input.close();
    }
}
