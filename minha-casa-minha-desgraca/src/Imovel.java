public abstract class Imovel {

    private Endereco endereco;
    private double valor;

    public Imovel(Endereco endereco, double valor) {
        this.endereco = endereco;
        this.valor = valor;
    }

    public abstract String apresentacao();

    public Endereco getEndereco() {
        return this.endereco;
    }

    public Double getValor() {
        return this.valor;
    }



    /*public String apresentacao(){
        return "O endereço é "+this.endereco.getLogradouro()+", "+this.endereco.getNumero()+" - "
                +this.endereco.getCidade()+" / "+this.endereco.getEstado()+" e o valor é R$ "+this.valor+".";
    }*/
}
