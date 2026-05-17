package POO.Ex007;

public class Principal {
    public static void main(String[] args) {

        Lampada lampada = new Lampada();

        lampada.ligar();
        System.out.println(lampada.isLigada());

        lampada.desligar();
        System.out.println(lampada.isLigada());
    }
}
