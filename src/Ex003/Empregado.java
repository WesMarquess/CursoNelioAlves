package Ex003;

public class Empregado {

    public String nome;
    public double salarioBruto;
    public double imposto;

    public double calculoImposto() {
        return salarioBruto - imposto;
    }

    public void aumentoSalario(double porcentagem) {
        salarioBruto += salarioBruto * porcentagem / 100;
    }

    public String toString() {
        return nome + ", R$ " + String.format("%.2f ", calculoImposto());
    }
}
