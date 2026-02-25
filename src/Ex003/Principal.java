package Ex003;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Empregado empregado = new Empregado();
        Scanner input = new Scanner(System.in);

        System.out.println("Nome");
        empregado.nome = input.nextLine();
        System.out.println("Salario bruto");
        empregado.salarioBruto = input.nextDouble();
        System.out.println("Imposto");
        empregado.imposto = input.nextDouble();

        System.out.println("Quantos % ira aumentar o salario?");
        empregado.aumentoSalario(input.nextDouble());
        System.out.println("Atualizado " + empregado.toString());

    }
}
