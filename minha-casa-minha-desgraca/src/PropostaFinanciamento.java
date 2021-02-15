public class PropostaFinanciamento {

    private Beneficiario beneficiario;
    private Imovel imovel;
    private Integer prazoPagamento;

    public PropostaFinanciamento(Beneficiario beneficiario, Imovel imovel, Integer prazoPagamento) {
        this.beneficiario = beneficiario;
        this.imovel = imovel;
        this.prazoPagamento = prazoPagamento;
    }


    private void imprimirPropostaAprovada(){
        System.out.println("Parabéns "+this.beneficiario.getNome()+"!! O seu financiamento de "+this.prazoPagamento+
                " mes(s) do imóvel em "+this.imovel.getEndereco().getCidade()+" foi aprovado!!! Aproveite esta dívida abusiva :D");
    }

    private void imprimirPropostaNegada(){
        System.out.println("Se lascou "+this.beneficiario.getNome()+", seu arrombado!! O seu financiamento de "+this.prazoPagamento+
                " mes(s) do imóvel em "+this.imovel.getEndereco().getCidade()+" foi NEGADO!!! Parece que tu está quebrado, otário! :D");
    }
    /**
     * Valida a proposta de financiamento e apresenta o resultado para o cliente.
     *
     * A proposta de financiamento é aceita somente se o salário do beneficiário multiplicado pelo prazo de pagamento
     *   for equivalente a pelo menos 50% do valor do imóvel.
     *
     *   Esta regra possui duas exceções: se o imóvel se localiza no estado SP ou RJ,
     *      o salário multiplicado pelo prazo deve ser equivalente a 65% e 60% do valor imóvel (respectivamente).
     */
    public void validarProposta() {
        if (imovel.getEndereco().getEstado() == UnidadeFederativa.SP) {
            if ((beneficiario.getSalario() * this.prazoPagamento) >= (imovel.getValor() * 0.65)) {
                imprimirPropostaAprovada();
            } else {
                imprimirPropostaNegada();
            }
        } else if (imovel.getEndereco().getEstado() == UnidadeFederativa.RJ) {
            if ((beneficiario.getSalario() * this.prazoPagamento) >= (imovel.getValor() * 0.6)) {
                imprimirPropostaAprovada();
            } else {
                imprimirPropostaNegada();
            }
        } else{
                if ((beneficiario.getSalario() * this.prazoPagamento) >= (imovel.getValor() * 0.5)) {
                    imprimirPropostaAprovada();
                } else {
                    imprimirPropostaNegada();
                }
            }
        }

}
