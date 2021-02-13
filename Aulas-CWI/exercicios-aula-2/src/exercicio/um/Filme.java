package exercicio.um;

public class Filme {

    private String nomeFilme;
    private String descricao;
    private int tempoDuracao;
    private int anoLancamento;
    private int avaliacao;
    private Diretor diretor;
    private Ator ator;

    public Filme(String nomeFilme, String descricao, int tempoDuracao, int anoLancamento, int avaliacao, Diretor diretor) {

        this.nomeFilme = nomeFilme;
        this.descricao = descricao;
        this.tempoDuracao = tempoDuracao;
        this.anoLancamento = anoLancamento;
        this.diretor = diretor;
        this.ator = ator;
        defineAvaliacao(avaliacao);
        validaNomeEDefineAvaliacao(nomeFilme);
    }

    public void reproduzirFilme(){
        System.out.println("Nome do Filme: "+ this.nomeFilme);
        System.out.println("Descrição: "+ this.descricao);
        System.out.println("Duração: "+ this.tempoDuracao + " minutos");
        System.out.println("Diretor: "+ this.diretor.getNome());

    }

    private void defineAvaliacao(Integer avaliacao) {
        if (avaliacao < 1 || avaliacao > 5) {
            this.avaliacao = 3;
        } else {
            this.avaliacao = avaliacao;
        }
    }

    private void validaNomeEDefineAvaliacao(String nome) {
        if ("Batman vs Superman".equals(nome)) {
            this.avaliacao = 1;
        } else if ("Interestelar".equals(nome)) {
            this.avaliacao = 5;
        }
    }
}
