package br.com.banco.desgraca;

import br.com.banco.desgraca.domain.InstituicaoBancaria;
import br.com.banco.desgraca.domain.conta.ContaCorrente;

import java.text.DecimalFormat;

public class BancoDaDesgraca {

    public static void main(String[] args) throws Exception {

        ContaCorrente corrente1 = new ContaCorrente(111, InstituicaoBancaria.BANCO_DO_BRASIL,100.00);
        ContaCorrente corrente2 = new ContaCorrente(222, InstituicaoBancaria.CAIXA,1000.00);

        corrente1.depositar(100.00);
        corrente1.sacar(50.00);
        corrente1.transferir(100.00,corrente2);

        //corrente1.exibirExtrato(01/07/2020,16/07/2020);

    }
}
