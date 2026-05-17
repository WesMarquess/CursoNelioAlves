package POO.Ex002;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Retangulo retangulo = new Retangulo();

        System.out.println("Enter rectangle width and height:");
        retangulo.altura = sc.nextDouble();
        retangulo.largura = sc.nextDouble();
        System.out.printf("AREA = %.2f%n", retangulo.area());
        System.out.printf("PERIMETER = %.2f%n", retangulo.perimetro());
        System.out.printf("DIAGONAL = %.2f%n", retangulo.diagonal());
        sc.close();
    }
}
