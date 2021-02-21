package com.company;

import com.company.domain.Editora;
import com.company.domain.Filme;
import com.company.enumeracao.Genero;
import com.company.heranca.Diretor;

public class AplicacaoTeste {

    public static void main(String[] args) {
        //Editora editora1 = new Editora("DC Comics","Pra que?");
        Editora editora2 = new Editora("Marvel;","Coração dos fãs");

        System.out.println("Nome da Editora: "+ editora2.getNome());
        //System.out.println("Nome da Editora: "+editora1.getNome());

        Diretor diretor1 = new Diretor("Diretor 1", 999,10, Genero.MASCULINO);

        //Filme filme1 = new Filme("Filme 1","desc do filme",99,2021,9,diretor1);
        Filme filme2 = new Filme("Filme 2","desc do filme",99,2021,3,diretor1);

        filme2.reproduzir();
    }

}
