package Ex12;

public class Copo {

    private int capacidade;
    private int quantidade;

    public Copo(int capacidade) {
        this.capacidade = capacidade;
    }

    public void encher(int quantidade) {
        this.capacidade = quantidade;
        System.out.println("Copo com capacidade de: " + this.capacidade);
    }

    public void beber(int quantidadePorGole) {

        if (this.capacidade <= 0) {
            System.out.println("Copo vazio.Encha.");
        } else {
            capacidade -= quantidadePorGole;
            System.out.println("Tomou um gole: Capacidade de: " + this.capacidade);
        }
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return "Copo{" +
                "capacidade=" + capacidade +
                ", quantidade=" + quantidade +
                '}';
    }
}
