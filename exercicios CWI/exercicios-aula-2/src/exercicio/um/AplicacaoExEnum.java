package exercicio.um;

public class AplicacaoExEnum {

    public static void main(String[] args) {
        Ator travolta = new Ator ("John Travolta", 55, Genero.MASCULINO,12);
        Ator fulaninha = new Ator ("Fulana de tal", 25, Genero.FEMININO,0);

        Diretor tarantino = new Diretor("Tarantino", 85, Genero.MASCULINO,12);
        Diretor tolkien = new Diretor("Tolkien", 133, Genero.MASCULINO,5);


        fulaninha.imprimirInformacoes();
        System.out.println("");
        travolta.imprimirInformacoes();
        System.out.println("");
        tarantino.imprimirInformacoes();
        System.out.println("");
        tolkien.imprimirInformacoes();
    }
}
