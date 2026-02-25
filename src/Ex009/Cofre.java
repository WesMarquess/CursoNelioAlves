package Ex009;

public class Cofre {

    private boolean aberto;
    private int senha;

    public Cofre(int senha) {
        this.senha = senha;
        this.aberto = false;
    }

    public boolean isAberto() {
        return aberto;
    }

    public boolean abrir(int senhaInformada) {

        if (aberto) {
            System.out.println("Cofre já está aberto.");
            return true;
        }

        if (senhaInformada == senha) {
            aberto = true;
            System.out.println("Cofre aberto com sucesso.");
            return true;
        }

        System.out.println("Senha incorreta.");
        return false;
    }

    public void fechar() {
        if (!aberto) {
            System.out.println("Cofre já está fechado.");
            return;
        }

        aberto = false;
        System.out.println("Cofre fechado.");
    }

    @Override
    public String toString() {
        return "Cofre{" +
                "aberto=" + aberto +
                '}';
    }
}
