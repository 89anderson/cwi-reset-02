package br.com.banco.desgraca.domain.conta;

import br.com.banco.desgraca.domain.InstituicaoBancaria;

public class ContaCorrente extends TiposDeConta{


    public ContaCorrente(Integer contaBancaria, InstituicaoBancaria banco, Double saldo) {
        super(contaBancaria, banco, saldo);
    }

    @Override
    public String contaApresentacao() {
        return "Conta Corrente: "+getInstituicaoBancaria().getDescricao()+", "+getContaBancaria();
    }


}
