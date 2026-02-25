package Ex6;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Conta conta;

        System.out.println("Crie sua conta");
        System.out.println("Digite o numero da sua conta: ");
        int numeroConta = input.nextInt();
        input.nextLine();

        System.out.println("Digite seu nome:");
        String nome = input.nextLine();

        System.out.println("Deposito inicial?(y/n)");
        char resposta = input.next().charAt(0);

        if (resposta == 'y') {
            System.out.println("Digite o valor para deposito:");
            double depositoInicial = input.nextDouble();
            conta = new Conta(nome, numeroConta, depositoInicial);
        } else {
            conta = new Conta(nome, numeroConta);
        }

        System.out.println("Dados atuais: " + conta.toString());

        System.out.println("Deseja alterar o nome?(y/n)");
        resposta = input.next().charAt(0);
        input.nextLine();
        if (resposta == 'y') {
            System.out.println("Digite o novo nome:");
            String novoNome = input.nextLine();
            conta.setNome(novoNome);
        }

        System.out.println("Dados atuais: " + conta.toString());

        System.out.println("Valor de deposito: ");
        double valorDeposito = input.nextDouble();
        conta.deposito(valorDeposito);

        System.out.println("Dados atuais: " + conta.toString());

        System.out.println("Valor do saque: ");
        double valorSaque = input.nextDouble();

        if (valorSaque > conta.getSaldo()) {
            System.out.println("Saque não autorizado. Saldo insuficiente.");
        } else {
            conta.sacar(valorSaque);
        }
        System.out.println("Dados atuais: " + conta.toString());
    }
}