public class Imovel {

    private Endereco endereco;
    private Double valor;

    public Imovel(Endereco endereco, Double valor) {
        this.endereco = endereco;
        this.valor = valor;
    }

    public Endereco getEndereco() {
        return this.endereco;
    }

    public Double getValor() {
        return this.valor;
    }

    public String apresentacao(){
        return "O endereço é "+this.endereco.getLogradouro()+", "+this.endereco.getNumero()+" - "
                +this.endereco.getCidade()+" / "+this.endereco.getEstado()+" e o valor é R$ "+this.valor+".";
    }
}
