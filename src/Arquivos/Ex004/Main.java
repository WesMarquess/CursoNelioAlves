package Arquivos.Ex004;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        String path = "C:\\Users\\wesma\\OneDrive\\Área de Trabalho\\dados.txt";

        File file = new File(path);

        try {
            if (file.exists()) {
                System.out.println("Arquivo já existe.");
            } else {
                boolean sucess = file.createNewFile();
                System.out.println("Arquivo criado com sucesso! " + sucess);
            }
        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
