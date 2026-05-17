package POO.Ex008;

public class Ventilador {

    private boolean ligado;
    private int velocidade;

    public boolean isLigado() {
        return ligado;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void ligar() {
        ligado = true;
    }

    public void desligar() {
        ligado = false;
        velocidade = 0;
    }

    public void aumentarVelocidade() {

        if (!ligado) {
            System.out.println("Não é possível aumentar a velocidade. Ligue o ventilador");
            return;
        }

        if (velocidade < 3) {
            velocidade++;
        } else {
            System.out.println("Não é possível aumentar. Velocidade máxima: 3");
        }
    }

    public void diminuirVelocidade() {

        if (!ligado) {
            System.out.println("Não é possível diminuir a velocidade. Ligue o ventilador");
            return;
        }

        if (velocidade > 0) {
            velocidade--;
        } else {
            System.out.println("Não é possível diminuir a velocidade");
        }
    }

    @Override
    public String toString() {
        return "Ventilador{" +
                "ligado=" + ligado +
                ", velocidade=" + velocidade +
                '}';
    }
}
