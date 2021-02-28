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

import static br.com.banco.desgraca.Data.getDataTransacao;

public abstract class TiposDeContaBancaria implements ContaBancaria {

    private Integer contaBancaria;
    private InstituicaoBancaria banco;
    private Double saldo;
    private List<Transacao> transacoes = new ArrayList<>();

    public TiposDeContaBancaria(Integer contaBancaria, InstituicaoBancaria banco) {
        this.contaBancaria = contaBancaria;
        this.banco = banco;


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
        transacoes.add(new Transacao(getDataTransacao(), TipoTransacao.DEPOSITAR,valor));
        //System.out.printf("Depositando %s na %s", DecimalFormat.getCurrencyInstance().format(valor),this.contaApresentacao());


    }

    @Override
    public void sacar(Double valor) {
        if(this.saldo >= valor){
            this.saldo -= valor;
            transacoes.add(new Transacao(getDataTransacao(), TipoTransacao.SACAR,valor));
            System.out.printf("Sacando %s na %s", DecimalFormat.getCurrencyInstance().format(valor),this.contaApresentacao());
        } else{
            throw new RuntimeException("\n Ih... ta pobrinho pai?\nO seu saldo é insuficiente para realizar essa operação!");
        }

    }

    @Override
    public void transferir(Double valor, ContaBancaria contaDestino) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            transacoes.add(new Transacao(getDataTransacao(), TipoTransacao.TRANSFERIR, valor));
            contaDestino.depositar(valor);
            System.out.printf("Sacando %s na %s", DecimalFormat.getCurrencyInstance().format(valor),this.contaApresentacao());
        } else{
            throw new RuntimeException("\n Moiô padrinho...\nO seu saldo é insuficiente para realizar essa operação!");
        }

    }

    @Override
    public void exibirExtrato(LocalDate inicio, LocalDate fim) {

        System.out.println("\n-------------------------------------------");
        System.out.println("Extrato da conta " + toString());
        System.out.println("-------------------------------------------");

        if ((inicio != null) && (fim != null)) {
            if (fim.isBefore(inicio)) {
                throw new DatasInvalidasException("A data de início deve ser anterior à data de fim");
            } else {
                for (Transacao transacao : transacoes) {
                    if ((transacao.getDataTransacao().isAfter(inicio)) && (transacao.getDataTransacao().isBefore(fim))) {
                        transacao.exibirTransacoes();
                    }
                }
            }

        } else if (fim != null) {
            for (Transacao transacao : transacoes) {
                if (transacao.getData().isBefore(fim)) {
                    transacao.exibirTransacoes();
                }
            }
        } else if (inicio != null) {
            for (Transacao transacao : transacoes) {
                if (transacao.getData().isAfter(inicio)) {
                    transacao.exibirTransacoes();
                }
            }
        } else {
            for (Transacao transacao : transacoes) {
                transacao.exibirTransacoes();
            }
        }

        System.out.println("Saldo atual: " + DecimalFormat.getCurrencyInstance().format(saldo));
        System.out.println("-------------------------------------------\n");
    }
        }
    }
}
