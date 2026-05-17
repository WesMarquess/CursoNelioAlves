package Arquivos.Ex002;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        String path = "C:\\Users\\wesma\\OneDrive\\Área de Trabalho\\novotxt.txt";
        File pathFile = new File(path);

        try (FileWriter fileWriter = new FileWriter(pathFile)) {

            fileWriter.write("Esse é meu primeiro arquivo em java.");
        } catch (IOException e) {
            System.out.println("Erro. " + e.getMessage());
        }
    }
}
