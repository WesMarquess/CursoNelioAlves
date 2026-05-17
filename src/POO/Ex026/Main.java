package POO.Ex026;

import POO.Ex026.enums.Cor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static List<Forma> formaList = new ArrayList<>();

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("numero para add");
        int qtd = input.nextInt();
        input.nextLine();

        for (int i = 1; i <= qtd; i++) {
            System.out.println("Forma" + i);
            System.out.println("Retangulo ou circulo?(r/c)");
            char resp = input.next().charAt(0);
            System.out.println("Cor:PRETA/VERMELHA/BRANCA");
            Cor cor = Cor.valueOf(input.next());

            if (resp == 'c') {
                System.out.println("Raio");
                double raio = input.nextDouble();
                formaList.add(new Circulo(cor, raio));
            } else {
                System.out.println("Retangulo");
                double altura = input.nextDouble();
                double largura = input.nextDouble();
                formaList.add(new Retangulo(cor, altura, largura));
            }
            input.close();

            for (Forma formas : formaList) {
                System.out.printf(String.format("%.2f\n", formas.area()));
            }
        }
    }
}
