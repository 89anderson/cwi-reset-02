package br.com.banco.desgraca.domain;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Transacao {

    private LocalDate dataTransacao;
    private TipoTransacao transacao;
    private Double valor;

    public Transacao(LocalDate dataTransacao, TipoTransacao transacao, Double valor) {

        this.dataTransacao = dataTransacao;
        this.transacao = transacao;
        this.valor = valor;
    }

    public LocalDate getDataTransacao() {
        return dataTransacao;
    }

    public TipoTransacao getTransacao() {
        return transacao;
    }

    public Double getValor() {
        return valor;
    }

    public void exibirTransacoes() {
        String valorFormatado = DecimalFormat.getCurrencyInstance().format(valor);
        char simboloEntradaSaida = '+';
        if (transacao.equals(TipoTransacao.TRANSFERIR) || transacao.equals(TipoTransacao.SACAR)) {
            simboloEntradaSaida = '-';
        }
        System.out.println(simboloEntradaSaida + " " + valorFormatado + " " + dataTransacao.format(DateTimeFormatter.ofPattern("dd-MM-yy")));
    }
}
