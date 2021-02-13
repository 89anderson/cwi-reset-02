package exercicio.um;

public class Diretor extends Pessoa {

    private int quantidadeFilmesDirigidos;

    public Diretor(String nome, int idade, Genero genero, int quantidadeFilmesDirigidos) {
        super (nome, idade, genero);
        this.quantidadeFilmesDirigidos = quantidadeFilmesDirigidos;
        }

    }

