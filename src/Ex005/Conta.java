package Ex005;

public class Conta {

    private int numero;
    private String nome;
    private double saldo;

    public Conta(int numero, String nome, double depositoInicial) {
        this.numero = numero;
        this.nome = nome;
        deposito(depositoInicial);
    }

    public Conta(int numero, String nome) {
        this.numero = numero;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void deposito(double valor) {
        saldo += valor;
    }

    public void saque(double valor) {
        saldo -= valor + 5.00;
    }

    public String toString() {
        return "\nNome da conta: " + nome
                + "\nNumero da conta: " + numero
                + "\nSaldo da conta R$: "
                + String.format("%.2f ", saldo);
    }
}
