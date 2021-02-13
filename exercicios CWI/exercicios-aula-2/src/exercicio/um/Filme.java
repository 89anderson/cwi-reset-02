package exercicio.um;

public class Filme {

    private String nomeFilme;
    private String descricao;
    private int tempoDuracao;
    private int anoLancamento;
    private int avaliacao;
    private Diretor diretor;

    public Filme(String nomeFilme, String descricao, int tempoDuracao, int anoLancamento, int avaliacao, Diretor diretor) {
        this.nomeFilme = nomeFilme;
        this.descricao = descricao;
        this.tempoDuracao = tempoDuracao;
        this.anoLancamento = anoLancamento;
        this.avaliacao = avaliacao;
        this.diretor = diretor;
    }

    public void reproduzirFilme(){
        System.out.println("Nome do Filme: "+ this.nomeFilme);
        System.out.println("Descrição: "+ this.descricao);
        System.out.println("Duração: "+ this.tempoDuracao);
        System.out.println("Diretor: "+ this.diretor.getNomeDiretor());

    }
}
