package Arquivos.Ex014.Entities;

public class Livro {
    private Integer id;
    private String titulo;
    private String autor;
    private Boolean disponivel;
    private Usuario usuario;


    public Livro(Integer id, String titulo, String autor, Boolean disponivel) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = disponivel;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Boolean getDisponivel() {
        return disponivel;
    }

    public void setDisponivel(Boolean disponivel) {
        this.disponivel = disponivel;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        String atribuiUsuario = (usuario != null)
                ? usuario.getNome()
                : "Nenhum";

        return "ID: " + id +
                " | Título: " + titulo +
                " | Autor: " + autor +
                " | Status: " + (disponivel ? "Disponível" : "Emprestado") +
                " | Usuário: " + usuario;
    }
}