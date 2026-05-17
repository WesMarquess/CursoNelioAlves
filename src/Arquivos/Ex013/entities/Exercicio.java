package Arquivos.Ex013.entities;

public class Exercicio {
    private String nome;
    private Integer qtdRepeticoes;
    private Integer qtdSeries;

    public Exercicio(String nomeExericio, Integer qtdRepeticoes, Integer qtdSeries) {
        this.nome = nomeExericio;
        this.qtdRepeticoes = qtdRepeticoes;
        this.qtdSeries = qtdSeries;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQtdRepeticoes() {
        return qtdRepeticoes;
    }

    public void setQtdRepeticoes(Integer qtdRepeticoes) {
        this.qtdRepeticoes = qtdRepeticoes;
    }

    public Integer getQtdSeries() {
        return qtdSeries;
    }

    public void setQtdSeries(Integer qtdSeries) {
        this.qtdSeries = qtdSeries;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Nome: " + this.nome);
        stringBuilder.append(" - ");
        stringBuilder.append("Quantidade de repetições: " + this.qtdRepeticoes);
        stringBuilder.append(" - ");
        stringBuilder.append("Quantidade de séries:" + this.qtdSeries);

        return stringBuilder.toString();
    }
}
