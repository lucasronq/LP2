
package exHeranca;


public class Professor extends Funcionario {
    String titulo;

    public Professor(String nome) {
        super(nome);
    }

    public Professor(String nome, int numMatricula, double salario, String titulo) {
        super(nome, numMatricula, salario);
    }
    
    

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Professor{" + "titulo=" + titulo + '}';
    }
    
    
}
