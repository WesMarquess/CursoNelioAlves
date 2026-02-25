package Ex004;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.println("Nome");
        aluno.nome = input.nextLine();

        System.out.println("notas");
        aluno.primeiraNota = input.nextDouble();
        aluno.segundaNota = input.nextDouble();
        aluno.terceiraNota = input.nextDouble();

        System.out.println("Nota final: " + aluno.somaNota());

        if (aluno.somaNota() < 60.0) {
            System.out.println("Reprovado");
            System.out.printf("Reprovado %.2f%n", aluno.situacao());
        } else {
            System.out.println("Aprovado");
        }
        input.close();
    }
}
