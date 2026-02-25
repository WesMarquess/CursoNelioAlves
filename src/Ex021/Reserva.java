package Ex021;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Reserva {

    private Date momento;

    private StatusReserva status;

    private List<QuartoReserva> quartos = new ArrayList<>();

    public Reserva(Date date, StatusReserva confirmada) {

    }

    public Date getMomento() {
        return momento;
    }

    public void setMomento(Date momento) {
        this.momento = momento;
    }

    public StatusReserva getStatus() {
        return status;
    }

    public void setStatus(StatusReserva status) {
        this.status = status;
    }

    public void adicionarQuarto(QuartoReserva quarto) {
        quartos.add(quarto);
    }

    public void removerQuarto(QuartoReserva quarto) {
        quartos.remove(quarto);
    }

    public double total() {

        double soma = 0.0;

        for (QuartoReserva quarto : quartos) {
            soma += quarto.subTotal();
        }
        return soma;
    }
}
