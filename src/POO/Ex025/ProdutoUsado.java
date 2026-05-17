package POO.Ex025;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ProdutoUsado extends Produto {

    private LocalDate dataFabricacao;

    public ProdutoUsado(String nome, Double preco, LocalDate dataFabricacao) {
        super(nome, preco);
        this.dataFabricacao = dataFabricacao;
    }

    public LocalDate getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(LocalDate dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    @Override
    public String etiqueta() {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        return super.etiqueta()
                + " (Usado)"
                + " Data de fabricação: "
                + dataFabricacao.format(formatter);
    }
}