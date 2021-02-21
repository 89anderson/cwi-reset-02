package br.com.banco.desgraca.domain;

import br.com.banco.desgraca.Data;

import java.time.LocalDate;

public class Transacao {

     private LocalDate dataTransacao;
    private TipoTransacao transacao;
    private Double valor;

    public Transacao(LocalDate dataTransacao, TipoTransacao transacao, Double valor) {

        this.dataTransacao = dataTransacao;
        this.transacao = transacao;
        this.valor = valor;
    }

}
