package Ex15;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        List<Empregado> lista = new ArrayList<Empregado>();

        System.out.println("Digite a quantidade de empregados que vai contratar");
        int quantidade = input.nextInt();

        for (int i = 0; i < quantidade; i++) {

            System.out.println("Empregado # " + (i + 1));

            System.out.println("Digite o id");
            Integer id = input.nextInt();
            System.out.println("Digite o nome:");
            input.nextLine();
            String nome = input.nextLine();
            System.out.println("Digite o salario");
            Double salario = input.nextDouble();

            Empregado empregado = new Empregado(id, nome, salario);
            lista.add(empregado);
        }

        System.out.println("Digite o id do funcionario para acrescimo de salário:");
        int id = input.nextInt();
        Integer pos = temID(lista, id);
        if (pos == null) {
            System.out.println("Esse id não existe.");
        } else {
            System.out.println("Digite a porcentagem do acrescimo:");
            double acrescimoDeSalario = input.nextDouble();
            lista.get(pos).aumentoSalario(acrescimoDeSalario);
        }

        System.out.println("Lista de funcionários");
        for (Empregado empregado : lista) {
            System.out.println(empregado);
        }
    }

    public static Integer temID(List<Empregado> lista, int id) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getId() == id) {
                return i;
            }
        }
        return null;
    }
}