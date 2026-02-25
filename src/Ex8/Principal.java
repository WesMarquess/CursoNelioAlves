package Ex8;

public class Principal {
    public static void main(String[] args) {

        Ventilador ventilador = new Ventilador();

        ventilador.ligar();
        System.out.println(ventilador.toString());

        ventilador.desligar();
        System.out.println(ventilador.toString());

        ventilador.aumentarVelocidade();
        ventilador.aumentarVelocidade();
        System.out.println(ventilador.toString());

        ventilador.diminuirVelocidade();
        System.out.println(ventilador.toString());


    }
}
