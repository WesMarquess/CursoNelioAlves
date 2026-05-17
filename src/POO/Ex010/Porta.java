package POO.Ex010;

public class Porta {

    private boolean aberta;
    private boolean trancada;

    public boolean isAberta() {
        return aberta;
    }

    public boolean isTrancada() {
        return trancada;
    }

    public void abrir() {

        if (trancada) {
            System.out.println("Não é possível abrir. Porta trancada.");
            return;
        }

        if (!aberta) {
            aberta = true;
            System.out.println("Porta aberta.");
        } else {
            System.out.println("Porta já está aberta.");
        }
    }

    public void fechar() {

        if (!aberta) {
            System.out.println("Porta já está fechada.");
            return;
        }

        aberta = false;
        System.out.println("Porta fechada.");
    }

    public void trancar() {

        if (aberta) {
            System.out.println("Não é possível trancar. Porta aberta.");
            return;
        }

        if (!trancada) {
            trancada = true;
            System.out.println("Porta trancada.");
        } else {
            System.out.println("Porta já está trancada.");
        }
    }

    public void destrancar() {

        if (trancada) {
            trancada = false;
            System.out.println("Porta destrancada.");
        } else {
            System.out.println("Porta já está destrancada.");
        }
    }

    @Override
    public String toString() {
        return "Porta{" +
                "aberta=" + aberta +
                ", trancada=" + trancada +
                '}';
    }
}
