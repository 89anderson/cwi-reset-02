public class AplicacaoCalculadora {

    public static void main(String[]args){

        Calculadora calculadora = new Calculadora();

        double resultadoSoma = calculadora.soma(3,5);
        double resultadoSubracao = calculadora.subtracao(10, 5);
        double resultadoMultiplicacao = calculadora.multiplicacao(5, 2);
        double resultadoDivisao = calculadora.divisao(10, 2);

        System.out.println(resultadoSoma);
        System.out.println(resultadoSubracao);
        System.out.println(resultadoMultiplicacao);
        System.out.println(resultadoDivisao);

    }
}
