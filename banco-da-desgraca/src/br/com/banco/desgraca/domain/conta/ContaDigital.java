package br.com.banco.desgraca.domain.conta;

import br.com.banco.desgraca.domain.InstituicaoBancaria;

public class ContaDigital extends TiposDeContaBancaria {


    public ContaDigital(Integer contaBancaria, InstituicaoBancaria banco, Double saldo) {
        super(contaBancaria, banco, saldo);
    }

    private void verificaConta(){
    }

    @Override
    public String contaApresentacao() {
        return "Conta Digital: "+getInstituicaoBancaria().getDescricao()+", "+getContaBancaria();
    }
}

