public class Aplicacao {

    public static void main(String[] args) {

        Comparador comparador = new Comparador();

        boolean resultado1 = comparador.menorQue(5,3);
        boolean resultado2 = comparador.menorQue(3, 5);

        System.out.println(resultado1);
        System.out.println(resultado2);
    }
}
