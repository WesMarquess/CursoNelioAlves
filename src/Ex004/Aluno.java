package Ex004;

public class Aluno {

    public String nome;
    public double primeiraNota;
    public double segundaNota;
    public double terceiraNota;

    public double somaNota() {
        return primeiraNota + segundaNota + terceiraNota;
    }

    public double situacao() {
        if (somaNota() < 60.0) {
            return 60.0 - somaNota();
        } else {
            return 0.0;
        }
    }
}