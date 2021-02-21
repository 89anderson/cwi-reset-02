package com.company.domain;

import com.company.exceptions.ExceptionNome;

public class Editora {
    private String nome;
    private String localizacao;

    public Editora(String nome, String localizacao) {
        this.nome = nome;
        this.localizacao = localizacao;
        validaNome(nome);

    }

    private void validaNome(String nome){
        if (nome.equals("DC Comics")){
            throw new ExceptionNome("Marvel > DC vlwflw");
        }
    }

    public String getNome() {
        return nome;
    }

    public String getLocalizacao() {
        return localizacao;
    }
}
