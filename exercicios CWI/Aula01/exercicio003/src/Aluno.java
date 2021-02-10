public class Aluno {

    private String nomeAluno;

    private double notaFinal;

    //construtor
    public Aluno(String nomeAluno, double notaFinal) {
        this.nomeAluno = nomeAluno;
        this.notaFinal = notaFinal;
        System.out.println("o aluno " + nomeAluno + " foi instanciado");
    }

    //metodos
    public String getNomeAluno() {
        return this.nomeAluno;
    }

    public double getNotaFinal() {
        return this.notaFinal;
    }

    public boolean getSituacaoFinal() {
        return this.notaFinal >= 7;
    }
}
