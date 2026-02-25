package Ex005;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Conta conta;

        System.out.println("Entre com o numero da conta");
        int numeroConta = input.nextInt();
        System.out.println("Entre com o nome da conta");
        input.nextLine();
        String nome = input.nextLine();

        System.out.println("Deposito inicial?(y/n)");
        char resposta = input.next().charAt(0);

        if (resposta == 'y') {
            System.out.println("Valor que deseja depositar:");
            double depositoInicial = input.nextDouble();
            conta = new Conta(numeroConta, nome, depositoInicial);
        } else {
            conta = new Conta(numeroConta, nome);
        }

        System.out.println();
        System.out.println("Dados da conta: " + conta);

        System.out.println("Digite o valor para deposito");
        double valorDeposito = input.nextDouble();
        conta.deposito(valorDeposito);

        System.out.println("Dados da conta: " + conta);

        System.out.println("Digite o valor para saque");
        double valorSaque = input.nextDouble();
        conta.saque(valorSaque);

        System.out.println("Dados da conta: " + conta);
    }
}