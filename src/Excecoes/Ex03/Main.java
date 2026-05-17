package Excecoes.Ex03;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        File file = new File("c:\\temp\\in.txt");
        Scanner input = null;

        try {
            input = new Scanner(file);
            while (input.hasNextLine()) {
                System.out.println(input.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Erro ao acessar." + e.getMessage());
        } finally {
            if (input != null) {
                input.close();
            }
        }

    }
}
