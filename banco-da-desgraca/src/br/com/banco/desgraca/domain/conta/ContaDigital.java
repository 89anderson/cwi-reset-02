package br.com.banco.desgraca.domain.conta;

import br.com.banco.desgraca.domain.InstituicaoBancaria;

import java.time.LocalDate;

public class ContaDigital extends TiposDeConta{


    public ContaDigital(Integer contaBancaria, InstituicaoBancaria banco, Double saldo) {
        super(contaBancaria, banco, saldo);
    }


    @Override
    public String toString() {
        return "Conta Digital: "+getInstituicaoBancaria().getDescricao()+", "+getContaBancaria();
    }
}

