public class Aplicacao {

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Anderson", 7);
        String nomeAluno = aluno1.getNomeAluno();
        float notaFinal = aluno1.getNotaFinal();
        boolean situacaoFinal = aluno1.isSituacaoFinal();

        System.out.println("O aluno " + nomeAluno + " teve nota " + notaFinal + ". Foi aprovado? " + situacaoFinal);

    }
}
