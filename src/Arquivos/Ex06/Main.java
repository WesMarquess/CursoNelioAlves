package Arquivos.Ex06;

import java.io.File;

public class Main {
    public static void main(String[] args) {

        String path = "C:\\Users\\wesma\\OneDrive\\Área de Trabalho\\meus arquivos";
        File file = new File(path);
        File[] arquivos = file.listFiles();

        if (arquivos != null) {
            for (File arquivo : arquivos) {
                if (arquivo.isFile()) {
                    System.out.println(arquivo.getName());
                }
            }
        }
        else {
            System.out.println("Nenhum arquivo encontrado");
        }
    }
}
