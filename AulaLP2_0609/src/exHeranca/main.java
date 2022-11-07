
package exHeranca;


public class main {
    public static void main(String[] args){
        Pessoa pessoa = new Pessoa("Ella");
        Pessoa p2 = new Pessoa("Frank");
        System.out.println(pessoa.getNome());
        System.out.println("-------------");
        System.out.println(p2.getNome());
        System.out.println("-------------");
        
        System.out.println(pessoa.getNome().equals(p2.getNome()));
        
        System.out.println(pessoa.getNome().hashCode());
        System.out.println(p2.getNome().hashCode());
        
        Funcionario funcionario = new Funcionario("Dan",145, 2000.00);
        System.out.println(funcionario.getNome());
        System.out.println(funcionario.getNumMatricula());
        System.out.println(funcionario.getSalario());
        System.out.println("--------------------");
        
        Professor professor = new Professor("Dan", 145, 2000.00, "Mestre");
        System.out.println(professor.getNome());
        System.out.println(professor.numMatricula);
        System.out.println(professor.salario);
        System.out.println(professor.titulo);
        System.out.println("----------------");
        
        Aluno aluno = new Aluno("Anne", "rt4", 12);
        System.out.println(aluno.getNome());
        System.out.println(aluno.getRa());
        System.out.println(aluno.getNumDisciplinas());
    }
}
