package fatura;

import java.util.Date;

public class Fatura {
    private Date date;
    private double valorTotal;
    private String nomeCliente;

    public Fatura() {
    }

    public Fatura(Date date, double valorTotal, String nomeCliente) {
        this.date = date;
        this.valorTotal = valorTotal;
        this.nomeCliente = nomeCliente;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }


}
