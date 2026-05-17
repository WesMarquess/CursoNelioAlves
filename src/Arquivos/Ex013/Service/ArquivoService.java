package Arquivos.Ex013.Service;

import Arquivos.Ex013.entities.Aluno;

import java.io.FileWriter;
import java.io.IOException;

public class ArquivoService {

    private String path = "C:\\Users\\wesma\\OneDrive\\Área de Trabalho\\cadastro.txt";

    public ArquivoService(String path) {
        this.path = path;
    }

    public void salvar(Aluno aluno) {
        try (FileWriter fw = new FileWriter(path, true)) {
            fw.write(aluno.toString() + "\n");
        } catch (IOException e) {
            System.out.println("Erro ao salvar: " + e.getMessage());
        }
    }
}
