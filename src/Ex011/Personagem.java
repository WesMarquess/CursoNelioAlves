package Ex011;

public class Personagem {

    private int vida;
    private boolean vivo;

    public Personagem() {
        vida = 100;
        vivo = true;
    }

    public int getVida() {
        return vida;
    }

    public boolean isVivo() {
        return vivo;
    }

    public void receberDano(int dano) {

        if (!vivo) {
            System.out.println("O personagem já está morto.");
            return;
        }

        vida -= dano;

        if (vida <= 0) {
            vida = 0;
            vivo = false;
            System.out.println("O personagem morreu.");
        } else {
            System.out.println("Vida atual: " + vida);
        }
    }


    public void curar(int cura) {

        if (!vivo) {
            System.out.println("Não é possível curar um personagem morto.");
            return;
        }

        if (vida == 100) {
            System.out.println("Não é possível curar. Vida já está no máximo.");
            return;
        }

        vida += cura;

        if (vida > 100) {
            vida = 100;
        }
        System.out.println("Vida atual: " + vida);
    }
}
