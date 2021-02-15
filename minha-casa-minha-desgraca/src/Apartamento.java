public class Apartamento extends Imovel{

    private Integer andar;

    public Apartamento(Endereco endereco, double valor, Integer andar) {
        super(endereco, valor);
        this.andar = andar;
    }

    @Override
    public String apresentacao(){
        return "Este apartamento fica no andar: "+this.andar+", localizado na "+this.getEndereco().getLogradouro()+", "
                +this.getEndereco().getNumero()+" - "+this.getEndereco().getCidade()+" / "
                +this.getEndereco().getEstado()+" e o valor é R$ "+this.getValor()+".";
    }
}
