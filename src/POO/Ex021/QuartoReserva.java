package POO.Ex021;

public class QuartoReserva {

    private Integer noites;
    private Double precoPorNoite;

    private Quarto quarto;

    public QuartoReserva() {

    }

    public QuartoReserva(Integer noites, Double precoPorNoite, Quarto quarto) {
        this.noites = noites;
        this.precoPorNoite = precoPorNoite;
        this.quarto = quarto;
    }

    public Integer getNoites() {
        return noites;
    }

    public void setNoites(Integer noites) {
        this.noites = noites;
    }

    public Double getPrecoPorNoite() {
        return precoPorNoite;
    }

    public void setPrecoPorNoite(Double precoPorNoite) {
        this.precoPorNoite = precoPorNoite;
    }

    public Quarto getQuarto() {
        return quarto;
    }

    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }

    public double subTotal() {
        return precoPorNoite * noites;
    }
}
