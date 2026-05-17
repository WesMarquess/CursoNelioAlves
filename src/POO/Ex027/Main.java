package POO.Ex027;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Pessoa fisica ou juridica?(F/J)");
        char resposta = input.next().charAt(0);

        if (resposta == 'F') {
            Pessoa pessoa = new PessoaFisica("Wes", 20000.0, 5000.0);
        } else {
            Pessoa pessoa = new PessoaJuridica("Wes2", 20000.0, 10);
        }
    }
}
