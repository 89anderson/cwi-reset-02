package br.com.banco.desgraca.domain;

public enum TipoTransacao {
    CONSULTAR_SALDO("Consulta de saldo"),
    DEPOSITAR("Depósito"),
    SACAR("Saque"),
    TRANSFERIR("Transferência"),
    EXIBIR_EXTRATO("Extrato da conta");

    private String descricao;

    TipoTransacao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;


    }
