public class Aluno {

    private String nomeAluno;

    private float notaFinal;


    private boolean situacaoFinal;

    public Aluno(String nomeAluno, float notaFinal) {
        this.nomeAluno = nomeAluno;
        this.notaFinal = notaFinal;
        System.out.println("o aluno " + nomeAluno + " foi instanciado");
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public float getNotaFinal() {
        return notaFinal;
    }

    public boolean isSituacaoFinal() {
        if(notaFinal >= 7){
            situacaoFinal = true;
        }else{situacaoFinal = false;}
        return situacaoFinal;
    }
}
