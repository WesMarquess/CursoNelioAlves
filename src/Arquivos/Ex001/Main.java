package Arquivos.Ex001;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        List<Produto> produtosList = new ArrayList<>();


        System.out.println("Digite o caminho do arquivo: ");
        String caminhoArquivo = input.nextLine();
        File sourceFile = new File(caminhoArquivo);

        String sourceFileStr = sourceFile.getParent();
        boolean sucesso = new File(sourceFile + "\\out").mkdir();

        String targetFileStr = sourceFileStr + "\\out\\summary.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))) {

            String itemCsv = br.readLine();

            while (itemCsv != null) {
                String[] campos = itemCsv.split(",");
                String nome = campos[0];
                double valor = Double.parseDouble(campos[1]);
                int quantidade = Integer.parseInt(campos[2]);

                produtosList.add(new Produto(nome, valor, quantidade));

                itemCsv = br.readLine();
            }
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))) {

                for (Produto produto : produtosList) {
                    bw.write(produto.getNome() + ", " + String.format("%.2f", produto.valorTotal()));
                    bw.newLine();
                }
                System.out.println("criado com sucesso." + targetFileStr);
            } catch (IOException e) {
                {
                    System.out.println("Erro ao ler arquivo: " + e.getMessage());
                }

            }
        } catch (IOException e) {
            System.out.println("Erro + " + e.getMessage());
        }
        System.out.println("Pasta criada com sucesso." + sucesso);
    }
}
