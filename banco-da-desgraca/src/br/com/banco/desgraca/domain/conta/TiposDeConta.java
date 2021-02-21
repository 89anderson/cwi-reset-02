package br.com.banco.desgraca.domain.conta;

import br.com.banco.desgraca.domain.InstituicaoBancaria;

import java.text.DecimalFormat;
import java.time.LocalDate;

public abstract class TiposDeConta implements ContaBancaria {

    private Integer contaBancaria;
    private InstituicaoBancaria banco;
    private Double saldo;

    public TiposDeConta(Integer contaBancaria, InstituicaoBancaria banco, Double saldo) {
        this.contaBancaria = contaBancaria;
        this.banco = banco;
        this.saldo = saldo;
    }

    public abstract String toString();

    public Integer getContaBancaria() {
        return contaBancaria;
    }

    @Override
    public InstituicaoBancaria getInstituicaoBancaria() {
        return this.banco;
    }

    @Override
    public Double consultarSaldo() {
        return this.saldo;
    }

    @Override
    public void depositar(Double valor) {
        this.saldo = this.saldo + valor;
        System.out.printf("Depositando %s na ", DecimalFormat.getCurrencyInstance().format(valor),this.toString());

    }

    @Override
    public void sacar(Double valor) {

    }

    @Override
    public void transferir(Double valor, ContaBancaria contaDestino) {

    }

    @Override
    public void exibirExtrato(LocalDate inicio, LocalDate fim) {

    }
}
