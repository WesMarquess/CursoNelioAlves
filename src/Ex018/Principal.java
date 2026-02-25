package Ex018;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Principal {
    public static void main(String[] args) throws ParseException {


        Comentario comentario1 = new Comentario("Boa viagem!");
        Comentario comentario2 = new Comentario("Que foda!");

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Post post1 = new Post(simpleDateFormat.parse
                ("21/06/2018 13:05:44"),
                "Viajando para a Bahia",
                "Viajando para a Bahia hoje!", 12);

        post1.adicionarComentarios(comentario1);
        post1.adicionarComentarios(comentario2);

        System.out.println(post1);


    }
}
