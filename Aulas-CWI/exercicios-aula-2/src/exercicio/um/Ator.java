package exercicio.um;

public class Ator extends Pessoa{
    private Integer quantidadeDeOscar;

    public Ator(String nome, int idade, Genero genero, Integer quantidadeDeOscar) {
        super(nome, idade, genero);
        this.quantidadeDeOscar = quantidadeDeOscar;
    }

    public void imprimirInformacoes(){
        super.imprimirInformacoes();
        System.out.println("Quantidade de oscars vencidos: "+this.quantidadeDeOscar);
    }

}
