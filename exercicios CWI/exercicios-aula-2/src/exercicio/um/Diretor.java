package exercicio.um;

public class Diretor {
    private String nomeDiretor;
    private int idadeDiretor;
    private int quantidadeFilmesDirigidos;

    public Diretor(String nomeDiretor, int idadeDiretor, int quantidadeFilmesDirigidos) {
        this.nomeDiretor = nomeDiretor;
        this.idadeDiretor = idadeDiretor;
        this.quantidadeFilmesDirigidos = quantidadeFilmesDirigidos;
    }

    public String getNomeDiretor() {
        return this.nomeDiretor;
    }
}
