import java.text.DecimalFormat;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class MinhaCasaMinhaDesgraca {

    public static void main(String[] args) throws Exception {

        System.out.println("\n ### Olá, seja bem vindo ao magnífico programa Minha Casa - Minha Desgraça ###\n");

        ImoveisParaFinanciamento opcoesParaFinanciamento = new ImoveisParaFinanciamento();



        /**
         * INÍCIO
         *
         * NÃO MODIFICAR ESTA CLASSE ANTES DESTA LINHA.
         */
            Endereco endereco1 = new Endereco("Rua Torta", 10, "registro 1", "bairro1","Gramado",UnidadeFederativa.RS);
            Endereco endereco2 = new Endereco("Rua Beira Mar", 200, "registro 2", "bairro2","Maresias",UnidadeFederativa.SP);
            Endereco endereco3 = new Endereco("Rua Reta?", 30, "registro 3", "bairro3","Colatina",UnidadeFederativa.ES);
            Endereco endereco4 = new Endereco("Rua da Republica", 40, "registro 4", "bairro4","Rio de Janeiro",UnidadeFederativa.RJ);
            Endereco endereco5 = new Endereco("Rua Dentadura", 550, "registro 5", "bairro5","Tubarao",UnidadeFederativa.SC);

            Apartamento imovelrs = new Apartamento(endereco1,51000.0,1);
            Casa imovelsp = new Casa(endereco2,60000.0,true);
            Apartamento imoveles = new Apartamento(endereco3,30000.0,5);
            Casa imovelrj = new Casa(endereco4,990000.0,false);
            Casa imovelsc = new Casa(endereco5,2000001.0,true);

            opcoesParaFinanciamento.registrarImovel(imovelrs);
            opcoesParaFinanciamento.registrarImovel(imoveles);
            opcoesParaFinanciamento.registrarImovel(imovelrj);
            opcoesParaFinanciamento.registrarImovel(imovelsc);
            opcoesParaFinanciamento.registrarImovel(imovelsp);




        /**
         * FIM
         *
         * NÃO MODIFICAR ESTA CLASSE APÓS ESTA LINHA.
         */



        List<Imovel> todasAsOpcoes = opcoesParaFinanciamento.buscarOpcoes(Double.MAX_VALUE);
        if (todasAsOpcoes == null || todasAsOpcoes.isEmpty()) {
            throw new RuntimeException("\n\nAtenção! Você precisa registrar opções de financiamento antes de começar a usar o programa.\n"
                + "Use o método 'registrarImovel', do objeto 'opcoesParaFinanciamento', para incluir algumas opções.\n");
        }

        System.out.println("\nVamos lá, preciso de algumas respostas...\n");
        Thread.sleep(1000);

        System.out.println(" Qual é o teu nome?");
        String nomeBeneficiario = new Scanner(System.in).next();
        Thread.sleep(500);

        System.out.println(" Agora eu preciso saber sobre a mascada, "+ nomeBeneficiario +". Qual é o teu salário?");
        double salarioBeneficiario = new Scanner(System.in).nextDouble();
        Thread.sleep(500);

        Beneficiario beneficiario = new Beneficiario(nomeBeneficiario, salarioBeneficiario);

        System.out.println(" Hummmm, tá grandão hein. E qual é o limite do valor de imóveis que você procura?");
        double valorParaPesquisa = new Scanner(System.in).nextDouble();
        Thread.sleep(500);

        System.out.println("\nTá, deixa eu ver aqui o que eu tenho de opções até "+
                DecimalFormat.getCurrencyInstance().format(valorParaPesquisa) +"...");
        Thread.sleep(new Random().nextInt(4000) + 1000);

        List<Imovel> opcoesViaveis = opcoesParaFinanciamento.buscarOpcoes(valorParaPesquisa);
        if (opcoesViaveis == null || opcoesViaveis.isEmpty()) {
            throw new RuntimeException("\n\nPQP! Essa desgraça de programa não tem casas neste valor! Comece uma nova simulação.");
        }

        System.out.println("\nCerto! Encontrei "+ opcoesViaveis.size() + " opções aqui. Dá uma olhada:");
        int index = 0;
        for (Imovel imovel : opcoesViaveis) {
            System.out.printf(" [%d] %s\n", ++index, imovel.apresentacao());
            Thread.sleep(250);
        }

        Imovel imovelEscolhido = null;
        while (imovelEscolhido == null) {

            Thread.sleep(250);

            System.out.println("\nQual a opção que mais te agrada? (Me diz apenas o número.)");
            int opcaoEscolhida = new Scanner(System.in).nextInt();

            Thread.sleep(250);

            if (opcaoEscolhida < 1 || opcaoEscolhida > opcoesViaveis.size()) {
                System.out.println(" > Opção inválida!");
            } else {
                imovelEscolhido = opcoesViaveis.get(opcaoEscolhida - 1);
            }
        }

        System.out.println("\nShow de bola! Agora me diz em quantos meses você quer pagar essa tranqueira:");
        int mesesParaPagamento = new Scanner(System.in).nextInt();

        System.out.printf("\nHumm, certo %s. Você ganha %s e quer financiar um imóvel de %s, " +
                        "no estado %s, pagando em %d meses. Deixa eu ver se é possível...\n\n",
                beneficiario.getNome(),
                DecimalFormat.getCurrencyInstance().format(beneficiario.getSalario()),
                DecimalFormat.getCurrencyInstance().format(imovelEscolhido.getValor()),
                imovelEscolhido.getEndereco().getEstado(),
                mesesParaPagamento);
        Thread.sleep(new Random().nextInt(4000) + 1000);

        PropostaFinanciamento financiamento = new PropostaFinanciamento(beneficiario, imovelEscolhido, mesesParaPagamento);
        financiamento.validarProposta();
    }
}
