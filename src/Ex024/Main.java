package Ex024;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.println("Quantidade de funcionarios");
        int qtdFuncionarios = input.nextInt();
        input.nextLine();

        for (int i = 1; i <= qtdFuncionarios; i++) {
            System.out.println("Dados do funcionario # " + i);
            System.out.println("é terceirizado?(S/N)");
            char resposta = input.nextLine().charAt(0);
            System.out.println("Nome:");
            String nome = input.nextLine();
            System.out.println("Horas:");
            int horas = input.nextInt();
            System.out.println("Valor por hora:");
            double valorPorHora = input.nextDouble();

            if (resposta == 'y') {
                System.out.println("Valor da despesa adicional:");
                double taxaAdicional = input.nextDouble();
                list.add(new OutSourcedEmployee(nome, horas, valorPorHora, taxaAdicional));
            } else {
                list.add(new Employee(nome, horas, valorPorHora));
            }
        }

        System.out.println("Pagamentos:");

        for (Employee emp : list) {
            System.out.println(emp.getName() + " - R$ " + String.format("%.2f", emp.payment()));
        }
    }
}
