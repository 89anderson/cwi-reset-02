public class Aplicacao {

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Anderson", 7);
        Aluno aluno2 = new Aluno("Rachel", 9.5);
        Aluno aluno3 = new Aluno("João", 5);

        System.out.println("Estudante " + aluno1.getNomeAluno() + " teve nota "
                + aluno1.getNotaFinal() + ". Estudante foi aprovado? " + aluno1.getSituacaoFinal());
        System.out.println("Estudante " + aluno2.getNomeAluno() + " teve nota "
                + aluno2.getNotaFinal() + ". Estudante foi aprovado? " + aluno2.getSituacaoFinal());
        System.out.println("Estudante " + aluno3.getNomeAluno() + " teve nota "
                + aluno3.getNotaFinal() + ". Estudante foi aprovado? " + aluno3.getSituacaoFinal());

    }
}
