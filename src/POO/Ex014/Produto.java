package POO.Ex014;

public class Produto {

    private int contador = 0;
    private int id;
    private String nome;
    private double valor;
    private int quantidade;

    public Produto(String nome, double valor, int quantidade) {
        this.id = ++contador;
        this.nome = nome;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void exibir() {
        System.out.printf("ID: %d | Nome: %s | Valor: R$ %.2f | Quantidade: %d%n",
                id, nome, valor, quantidade);
    }
}
