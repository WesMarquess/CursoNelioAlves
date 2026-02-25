package Ex018;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {

    private static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private Date momento;
    private String titulo;
    private String conteudo;
    private Integer likes;

    private List<Comentario> comentarios = new ArrayList<>();

    public Post() {

    }

    public Post(Date momento, String titulo, String conteudo, Integer likes) {
        this.momento = momento;
        this.titulo = titulo;
        this.conteudo = conteudo;
        this.likes = likes;
    }

    public Date getMomento() {
        return momento;
    }

    public void setMomento(Date momento) {
        this.momento = momento;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public List<Comentario> getComentarios() {
        return comentarios;
    }

    public void adicionarComentarios(Comentario comentario) {
        comentarios.add(comentario);
    }

    public void removerComentarios(Comentario comentario) {
        comentarios.remove(comentario);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(titulo + "\n");
        stringBuilder.append("Likes: " + likes + " - ");
        stringBuilder.append(simpleDateFormat.format(momento) + "\n");
        stringBuilder.append(conteudo + "\n");
        stringBuilder.append("Comentarios:\n");

        for (Comentario comentario : comentarios) {
            stringBuilder.append(comentario.getTexto() + "\n");
        }

        return stringBuilder.toString();
    }

}
