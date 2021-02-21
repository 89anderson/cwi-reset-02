package br.com.banco.desgraca.domain.conta;

import br.com.banco.desgraca.domain.InstituicaoBancaria;

import java.time.LocalDate;

public class ContaCorrente extends TiposDeConta{


    public ContaCorrente(Integer contaBancaria, InstituicaoBancaria banco, Double saldo) {
        super(contaBancaria, banco, saldo);
    }

    @Override
    public String toString() {
        return "Conta Corrente: "+getInstituicaoBancaria().getDescricao()+", "+getContaBancaria();
    }


}
