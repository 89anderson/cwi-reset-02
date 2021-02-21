package br.com.banco.desgraca.domain.conta;

import br.com.banco.desgraca.domain.InstituicaoBancaria;

import java.time.LocalDate;

public class ContaPoupanca extends TiposDeConta{


    public ContaPoupanca(Integer contaBancaria, InstituicaoBancaria banco, Double saldo) {
        super(contaBancaria, banco, saldo);
    }

    public void avaliaSaqueDigital(){
        //TODO implementar funcao
    }

    @Override
    public String toString() {
        return "Conta Poupança: "+getInstituicaoBancaria().getDescricao()+", "+getContaBancaria();
    }

}
