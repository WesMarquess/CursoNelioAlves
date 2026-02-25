package Ex011;

public class Principal {
    public static void main(String[] args) {

        Personagem personagem = new Personagem();

        System.out.println(personagem.getVida());
        personagem.receberDano(30);
        personagem.curar(20);
        System.out.println(personagem.getVida());
        personagem.receberDano(200);
        System.out.println(personagem.getVida());
    }
}
