package Ex013;

public class Aluno {

    private int id;
    private String nome;
    private double p1;
    private double p2;
    private double notaTrabalho;

    public Aluno(int id, String nome, double p1, double p2, double notaTrabalho) {
        this.id = id;
        this.nome = nome;
        this.p1 = p1;
        this.p2 = p2;
        this.notaTrabalho = notaTrabalho;
    }

    public double media() {
        double pesoProva = 2.5;
        double pesoTrabalho = 2.0;
        double calculoMedia = (this.p1 * pesoProva) + (this.p2 * pesoProva) + (this.notaTrabalho * pesoTrabalho) / 3;
        System.out.printf("Media final: %.2f\n", calculoMedia);
        return calculoMedia;
    }

    public double mediaFinal(double media) {

        if (media < 20.0) {
            System.out.println("Reprovado");
        } else {
            System.out.println("Aprovado");
        }
        return media;
    }
}
