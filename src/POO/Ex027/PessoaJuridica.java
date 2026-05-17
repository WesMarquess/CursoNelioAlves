package POO.Ex027;

public class PessoaJuridica extends Pessoa {

    private Integer numeroFuncionarios;

    public PessoaJuridica() {
    }

    public PessoaJuridica(String nome, Double rendaAnual, Integer numeroFuncionarios) {
        super(nome, rendaAnual);
        this.numeroFuncionarios = numeroFuncionarios;
    }

    public Integer getNumeroFuncionarios() {
        return numeroFuncionarios;
    }

    public void setNumeroFuncionarios(Integer numeroFuncionarios) {
        this.numeroFuncionarios = numeroFuncionarios;
    }

    @Override
    public double calculaImposto() {
        double imposto;

        if (getNumeroFuncionarios() < 10) {
            imposto = getRendaAnual() * 0.14;
        } else {
            imposto = getRendaAnual() * 0.16;
        }
        return imposto;
    }
}
