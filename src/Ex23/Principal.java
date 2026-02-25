package Ex23;

public class Principal {
    public static void main(String[] args) {

        Conta conta = new Conta(1, "Wes", 1000.00);

        conta.saque(200.0);

        System.out.println(conta.getSaldo());

        Conta poupanca = new Poupanca(2, "Wes", 1000.0, 0.1);

        poupanca.saque(200.0);
        System.out.println(poupanca.getSaldo());

        Conta empresarial = new ContaEmpresarial(3,"Wes", 1000.0,500.0);

        empresarial.saque(200.0);

        System.out.println(empresarial.getSaldo());
    }
}
