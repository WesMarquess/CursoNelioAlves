package Ex13;

public class Principal {
    public static void main(String[] args) {


        Aluno aluno = new Aluno(1, "Wes", 8.2, 2.3, 5.2);
        double media = aluno.media();
        aluno.mediaFinal(media);
    }
}
