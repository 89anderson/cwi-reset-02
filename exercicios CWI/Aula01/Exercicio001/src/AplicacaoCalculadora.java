public class AplicacaoCalculadora {

    public static void main(String[]args){

        Calculadora calculadora = new Calculadora();

        float resultadoSoma = calculadora.soma(3,5);
        float resultadoSubracao = calculadora.subtracao(10, 5);
        float resultadoMultiplicacao = calculadora.multiplicacao(5, 2);
        float resultadoDivisao = calculadora.divisao(10, 2);

        System.out.println(resultadoSoma);
        System.out.println(resultadoSubracao);
        System.out.println(resultadoMultiplicacao);
        System.out.println(resultadoDivisao);

    }
}
