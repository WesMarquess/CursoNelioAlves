package POO.Ex009;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Cofre cofre = new Cofre(1234);

        int tentativas = 3;

        while (tentativas > 0 && !cofre.isAberto()) {

            System.out.println("Digite a senha:");
            int senha = input.nextInt();

            boolean abriu = cofre.abrir(senha);

            if (!abriu) {
                tentativas--;
                System.out.println("Tentativas restantes: " + tentativas);
            }
        }
    }
}
