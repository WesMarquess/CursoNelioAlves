package Ex17;

import Ex17.enums.Senioridade;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws ParseException {

        Scanner input = new Scanner(System.in);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Digite o nome do seu departamento");
        String nomeDepartamento = input.nextLine();
        Departamento departamento = new Departamento(nomeDepartamento);

        System.out.println("Nome:");
        String nomeFuncionario = input.nextLine();
        System.out.println("Senioridade:");
        String senioridade = input.nextLine();
        System.out.println("Salario Base:");
        double salarioBase = input.nextDouble();

        Empregado empregado = new Empregado(nomeFuncionario, salarioBase, Senioridade.valueOf(senioridade), departamento);

        System.out.println("Quantos contratos esse funcionario tem?");
        Integer numeroContratos = input.nextInt();
        input.nextLine();

        for (int i = 1; i < numeroContratos; i++) {
            System.out.println("Contrato número: " + i);
            System.out.println("Data do contrato: (Dia/Mês/Ano)");
            Date dataContrato = simpleDateFormat.parse(input.next());
            System.out.println("Valor por hora:");
            double valorPorHora = input.nextDouble();
            System.out.println("Quantidade de horas:");
            int horas = input.nextInt();
            ContratoPorHora contrato = new ContratoPorHora(dataContrato, valorPorHora, horas);
            empregado.adicionarContrato(contrato);
        }

        System.out.println();
        System.out.println("Entre com mês e ano para calcular o salário:");
        String mesAno = input.next();
        int mes = Integer.parseInt(mesAno.substring(0, 2));
        int ano = Integer.parseInt(mesAno.substring(3));

        System.out.println("Nome:" + empregado.getNome());
        System.out.println("Departamento" + empregado.getDepartamento().getNome());
        System.out.println("Salario total para o mes: " + mesAno + " :" + String.format("%.2f", empregado.salarioAReceber(ano, mes)));

    }
}
