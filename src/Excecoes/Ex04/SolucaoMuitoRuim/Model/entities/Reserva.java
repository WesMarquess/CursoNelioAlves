package Excecoes.Ex04.SolucaoMuitoRuim.Model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reserva {
    private Integer quarto;
    private Date checkin;
    private Date checkout;

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Reserva() {

    }

    public Reserva(Integer quarto, Date checkin, Date checkout) {
        this.quarto = quarto;
        this.checkin = checkin;
        this.checkout = checkout;
    }

    public Integer getQuarto() {
        return quarto;
    }

    public void setQuarto(Integer quarto) {
        this.quarto = quarto;
    }

    public Reserva(Date checkin, Date checkout) {
        this.checkin = checkin;
        this.checkout = checkout;
    }

    public Date getCheckin() {
        return checkin;
    }

    public Date getCheckout() {
        return checkout;
    }

    public long duracao() {
        long diff = checkout.getTime() - checkin.getTime();
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }

    public String atualizaDatas(Date checkin, Date checkout) {
        this.checkin = checkin;
        this.checkout = checkout;
        return null;
    }

    @Override
    public String toString() {
        return "Quarto: " +
                quarto +
                " checkin" +
                sdf.format(checkin) +
                " checkout" +
                sdf.format(checkout) +
                " , " +
                duracao() +
                " noites";
    }
}
