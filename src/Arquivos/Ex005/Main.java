package Arquivos.Ex005;

import java.io.File;

public class Main {
    public static void main(String[] args) {

        String path = "C:\\Users\\wesma\\OneDrive\\Área de Trabalho\\meus arquivos";

        File file = new File(path);

        if (file.exists()) {
            System.out.println("Pasta já existe.");
        } else {
            boolean sucesso = file.mkdir();
            System.out.println("Pasta criada com sucesso. " + sucesso);
        }
    }
}
