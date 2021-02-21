public class TiposPrimitivos {

    /*formas de declarar variaveis:

    int idade = 3; aqui o int quer dizer que a variavel idade é do tipo inteiro.
    int idade = (int) 5; aqui o (int) logo antes do valor, indica que o valor deve ser considerado como inteiro. typecast
    Integer idade = new Integer(3); cria-se uma classe Integer que recebe 3. Wrapper Class
    */


    public static void main(String[] args) {

        float nota = 10.5f;

        System.out.print("a nota é "+nota);

        System.out.println("a nota é "+nota);

        System.out.printf("a sua nota é %.2f \n", nota); // %f joga a variavel tipo float ali, .2 formata para 2 casas decimais
        // \n coloca uma quebra de linha

        System.out.format("a sua nota é %.2f \n", nota); //faz a mesma coisa que a linha acima.






    }

}
