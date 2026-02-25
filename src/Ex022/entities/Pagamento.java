package Ex022.entities;

import Ex022.Enums.FormaPagamento;

import java.util.Date;

public class Pagamento {

    private Date momento;
    private double valor;

    private FormaPagamento formaPagamento;

    public Pagamento() {

    }

    public Pagamento(Date momento, double valor, FormaPagamento formaPagamento) {
        this.momento = momento;
        this.valor = valor;
        this.formaPagamento = formaPagamento;
    }

    public Date getMomento() {
        return momento;
    }

    public void setMomento(Date momento) {
        this.momento = momento;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public FormaPagamento getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }
}
