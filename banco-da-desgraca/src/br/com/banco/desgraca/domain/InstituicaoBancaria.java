package br.com.banco.desgraca.domain;

public enum InstituicaoBancaria {

    BANCO_DO_BRASIL("Banco do Brasil"),
    BRADESCO("Banco Bradesco"),
    CAIXA("Caixa Econômica Federal"),
    ITAU("Banco Itau"),
    NUBANK("Banco NuBank");

    private String descricao;

    InstituicaoBancaria(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
