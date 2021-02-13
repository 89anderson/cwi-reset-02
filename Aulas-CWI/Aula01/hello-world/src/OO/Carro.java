package OO;

public class Carro {

    private String marca;

    private String modelo;

    private int ano;

    private int portas;

    private float quantidadeCombustivel;

    private boolean estacionado;

    provate int velocidadeAtual;

    public Carro(String marca, String modelo, int ano, int portas) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.portas = portas;
    }

    void abastecer(float quandidadeCombutivel){
        this.quantidadeCombustivel = quandidadeCombutivel
    }
}
