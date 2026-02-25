package Ex23;

public class ContaEmpresarial extends Conta {

    private Double limiteEmprestimo;

    public ContaEmpresarial() {
        super();
    }

    public ContaEmpresarial(Integer nuumero, String portador, Double saldo, Double limiteEmprestimo) {
        super(nuumero, portador, saldo);
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public Double getLimiteEmprestimo() {
        return limiteEmprestimo;
    }

    public void emprestimo(Double valor) {
        if (valor <= limiteEmprestimo) {
            saldo += valor - 10.0;
        }
    }

    @Override
    public void saque(Double valor) {
        super.saque(valor);
        saldo -= 2.0;
    }
}
