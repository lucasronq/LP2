
package exHeranca;


public class Aluno extends Pessoa {
    private String ra;
    private int numDisciplinas;

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public int getNumDisciplinas() {
        return numDisciplinas;
    }

    public void setNumDisciplinas(int numDisciplinas) {
        this.numDisciplinas = numDisciplinas;
    }

    public Aluno(String nome, String ra, int numDisciplinas) {
        super(nome);
        this.ra = ra;
        this.numDisciplinas = numDisciplinas;
    }

    public Aluno(String nome) {
        super(nome);
    }
    
    @Override
    public String toString() {
        return "Aluno{" + "ra=" + ra + ", numDisciplinas=" + numDisciplinas + '}';
    }
    
}
