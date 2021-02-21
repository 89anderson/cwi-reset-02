package exercicio.um;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Pessoa {
    private String nome;
    private LocalDate dataNascimento;
    private Genero genero;

    public Pessoa(String nome,
                  int idade,
                  Genero genero) {
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
    }


    public void imprimirInformacoes(){

        System.out.println("Nome: "+this.nome);
        System.out.println("Idade: "+Period.between(this.dataNascimento, LocalDate.now()).getYears()+"anos");
        System.out.println("Gênero: "+this.genero.getDescricao());
    }

    public String getNome() {
        return nome;
    }


}
