package POO.Ex023;

public class Poupanca extends Conta {

    private Double taxaJuros;

    public Poupanca() {
        super();
    }

    public Poupanca(Integer nuumero, String portador, Double saldo, Double taxaJuros) {
        super(nuumero, portador, saldo);
        this.taxaJuros = taxaJuros;
    }

    public Double getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(Double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }

    public void atualizarSaldo() {
        saldo += saldo * taxaJuros;
    }

    @Override
    public void saque(Double valor) {
        saldo -= valor;
    }
}
