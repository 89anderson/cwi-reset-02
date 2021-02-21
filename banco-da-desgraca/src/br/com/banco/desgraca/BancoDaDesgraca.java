package br.com.banco.desgraca;

import br.com.banco.desgraca.domain.InstituicaoBancaria;
import br.com.banco.desgraca.domain.TipoTransacao;
import br.com.banco.desgraca.domain.Transacao;
import br.com.banco.desgraca.domain.conta.ContaCorrente;

import java.text.DecimalFormat;

public class BancoDaDesgraca {

    public static void main(String[] args) throws Exception {

        ContaCorrente corrente1 = new ContaCorrente(111, InstituicaoBancaria.BANCO_DO_BRASIL,100.00);
        ContaCorrente corrente2 = new ContaCorrente(222, InstituicaoBancaria.CAIXA,1000.00);


        //Transacao transacao1 = new Transacao(Data.getDataTransacao(), TipoTransacao.depositar,100.00);

        System.out.printf("O saldo da conta %s é %s",
                corrente1.toString(),DecimalFormat.getCurrencyInstance().format(corrente1.consultarSaldo()));
        System.out.printf("\nO saldo da conta %s é %s",
                corrente2.toString(),DecimalFormat.getCurrencyInstance().format(corrente2.consultarSaldo()));


    }
}
