package br.com.banco.desgraca.domain.conta;

import br.com.banco.desgraca.Data;
import br.com.banco.desgraca.domain.InstituicaoBancaria;
import br.com.banco.desgraca.domain.TipoTransacao;
import br.com.banco.desgraca.domain.Transacao;
import br.com.banco.desgraca.exception.SaldoInsuficienteException;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class TiposDeConta implements ContaBancaria {

    private Integer contaBancaria;
    private InstituicaoBancaria banco;
    private Double saldo;
    private List<Transacao> transacoes;

    public TiposDeConta(Integer contaBancaria, InstituicaoBancaria banco, Double saldo) {
        this.contaBancaria = contaBancaria;
        this.banco = banco;
        this.saldo = saldo;
        transacoes = new ArrayList<>();


    }

    public abstract String contaApresentacao();

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
        this.saldo += valor;
        transacoes.add(new Transacao(Data.getDataTransacao(), TipoTransacao.depositar,valor));
        //System.out.printf("Depositando %s na %s", DecimalFormat.getCurrencyInstance().format(valor),this.contaApresentacao());


    }

    @Override
    public void sacar(Double valor) {
        if(this.saldo >= valor){
            this.saldo -= valor;
            transacoes.add(new Transacao(Data.getDataTransacao(), TipoTransacao.sacar,valor));
            System.out.printf("Sacando %s na %s", DecimalFormat.getCurrencyInstance().format(valor),this.contaApresentacao());
        } else{
            throw new RuntimeException("\n Ih... ta pobrinho pai?\nO seu saldo é insuficiente para realizar essa operação!");
        }

    }

    @Override
    public void transferir(Double valor, ContaBancaria contaDestino) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            transacoes.add(new Transacao(Data.getDataTransacao(), TipoTransacao.transferir, valor));
            contaDestino.depositar(valor);
            System.out.printf("Sacando %s na %s", DecimalFormat.getCurrencyInstance().format(valor),this.contaApresentacao());
        } else{
            throw new RuntimeException("\n Moiô padrinho...\n" +
                    "O seu saldo é insuficiente para realizar essa operação!");
        }

    }

    @Override
    public void exibirExtrato(LocalDate inicio, LocalDate fim) {

        for (int i = 0; i <= transacoes.size(); i++) {
            System.out.printf("%s\n", transacoes.getClass());
            //Thread.sleep(250);

            /*int index = 0;
            for (Imovel imovel : opcoesViaveis) {
                System.out.printf(" [%d] %s\n", ++index, imovel.apresentacao());
                Thread.sleep(250);*/
        }
    }
}
