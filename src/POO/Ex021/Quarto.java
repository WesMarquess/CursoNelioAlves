package POO.Ex021;

public class Quarto {

    private Integer numero;
    private String tipo;
    private Double precobase;

    public Quarto() {

    }

    public Quarto(Integer numero, String tipo, Double precobase) {
        this.numero = numero;
        this.tipo = tipo;
        this.precobase = precobase;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getPrecobase() {
        return precobase;
    }

    public void setPrecobase(Double precobase) {
        this.precobase = precobase;
    }
}
