package POO.Ex027;

public class PessoaFisica extends Pessoa {

    private Double gastosComSaude;

    public PessoaFisica() {
    }

    public PessoaFisica(String nome, Double rendaAnual, Double gastosComSaude) {
        super(nome, rendaAnual);
        this.gastosComSaude = gastosComSaude;
    }

    public Double getGastosComSaude() {
        return gastosComSaude;
    }

    public void setGastosComSaude(Double gastosComSaude) {
        this.gastosComSaude = gastosComSaude;
    }

    @Override
    public double calculaImposto() {
        double imposto;

        if (getRendaAnual() < 20000) {
            imposto = getRendaAnual() * 0.15;
        } else {
            imposto = getRendaAnual() * 0.25;
        }

        imposto -= gastosComSaude * 0.5;

        return imposto;
    }
}
