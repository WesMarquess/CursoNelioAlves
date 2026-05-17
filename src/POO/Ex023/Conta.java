package POO.Ex023;

public class Conta {

    private Integer numero;
    private String portador;
    protected Double saldo;

    public Conta() {

    }

    public Conta(Integer nuumero, String portador, Double saldo) {
        this.numero = nuumero;
        this.portador = portador;
        this.saldo = saldo;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer nuumero) {
        this.numero = nuumero;
    }

    public String getPortador() {
        return portador;
    }

    public void setPortador(String portador) {
        this.portador = portador;
    }

    public void saque(Double valor) {
        saldo -= valor + 5.0;
    }

    public void deposito(Double valor) {
        saldo += valor;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "numero=" + numero +
                ", portador='" + portador + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
