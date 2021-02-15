public class Casa extends Imovel{

    private boolean patio;

    public Casa(Endereco endereco, double valor, boolean patio) {
        super(endereco, valor);
        this.patio = patio;
    }

    @Override
    public String apresentacao() {
        return "Esta casa possui pátio? " + this.patio + ". O endereço dela é " + this.getEndereco().getLogradouro() + ", " + this.getEndereco().getNumero() + " - "
                + this.getEndereco().getCidade() + " / " + this.getEndereco().getEstado() + " e o valor é R$ " + this.getValor() + ".";
    }
}
