package exercicio.um;

public class Aplicacao {
    public static void main(String[] args) {

        Diretor tarantino = new Diretor("Tarantino", 85, 12);
        Diretor tolkien = new Diretor("Tolkien", 133, 5);

        Filme filme1 = new Filme("The Lord of theRings","Melhor saga épica do mundo",
                180,2010, 5, tolkien);
        Filme filme2 = new Filme("Pulp Fiction","Segundo melhor filme do mundo",150,
                1995, 4, tarantino);

        filme1.reproduzirFilme();
        filme2.reproduzirFilme();
    }
}
