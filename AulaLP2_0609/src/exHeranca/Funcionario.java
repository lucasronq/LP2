
package exHeranca;


public class Funcionario extends Pessoa {
     int numMatricula;
     double salario;

    public int getNumMatricula() {
        return numMatricula;
    }

    public void setNumMatricula(int numMatricula) {
        this.numMatricula = numMatricula;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Funcionario(String nome) {
        super(nome);
    }
    
    public Funcionario(String nome, int numMatricula, double salario) {
        super(nome);
        this.numMatricula = numMatricula;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "numMatricula=" + numMatricula + ", salario=" + salario + '}';
    }
    
}
