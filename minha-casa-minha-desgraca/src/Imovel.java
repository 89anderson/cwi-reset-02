public class Imovel {

    private Endereco endereco;
    private Double valor;

    public Imovel(Endereco endereco, Double valor) {
        this.endereco = endereco;
        this.valor = valor;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public Double getValor() {
        return valor;
    }

    public String apresentacao(){
        return "O endereço é "+this.endereco+" e o valor é R$ "+this.valor+".";
    }
}
