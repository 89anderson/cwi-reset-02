package br.com.banco.desgraca.domain.conta;

import br.com.banco.desgraca.domain.InstituicaoBancaria;

public class ContaPoupanca extends TiposDeContaBancaria {


    public ContaPoupanca(Integer contaBancaria, InstituicaoBancaria banco, Double saldo) {
        super(contaBancaria, banco, saldo);
    }

    public void avaliaSaqueDigital(){
        //TODO implementar funcao
    }

    @Override
    public String contaApresentacao() {
        return "Conta Poupança: "+getInstituicaoBancaria().getDescricao()+", "+getContaBancaria();
    }

}
