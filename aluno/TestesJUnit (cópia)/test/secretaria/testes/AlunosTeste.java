
package secretaria.testes;

import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import secretaria.Aluno;
import org.junit.Ignore;


public class AlunosTeste {
    
    public AlunosTeste() {
    }

    @Test
    void test01(){
        System.out.println("Teste 1:");
        ArrayList<Aluno> alunos = new ArrayList<>();
        Aluno aluno = new Aluno();
        aluno.setNome("Alguém");
        aluno.setN1(7.7);
        aluno.setN2(7.7);
        aluno.setNf(7.7);
        aluno.setConceito("B");
        alunos.add(aluno);
    }
    
    @Test
    void test02(){
        System.out.println("Teste 2:");
        ArrayList<Aluno> alunos = new ArrayList<>();
        Aluno aluno = new Aluno();
        aluno.setNome("Alguém");
        aluno.setN1(7.7);
        aluno.setN2(7.7);
        aluno.setNf(7.7);
        aluno.setConceito("B");
        alunos.add(aluno);
        Aluno s = alunos.get(0);
        System.out.println(s);
    }
    
    @Test
    void test03(){
        System.out.println("Teste 3:");
        ArrayList<Aluno> alunos = new ArrayList<>();
        Aluno aluno = new Aluno();
        aluno.setNome("Alguém");
        aluno.setN1(7.7);
        aluno.setN2(7.7);
        aluno.setNf(7.7);
        aluno.setConceito("B");
        alunos.add(aluno);
        alunos.remove(0);
    }
    
    @Test
    void test04(){
        System.out.println("Teste 4:");
        ArrayList<Aluno> alunos = new ArrayList<>();
        Aluno aluno = new Aluno();
        aluno.setNome("Alguém");
        aluno.setN1(7.7);
        aluno.setN2(7.7);
        aluno.setNf(7.7);
        aluno.setConceito("B");
        alunos.add(aluno);
        int s = alunos.indexOf(aluno);
        System.out.println(s);
    }
    
    @Test
    void test05(){
        System.out.println("Teste 5:");
        ArrayList<Aluno> alunos = new ArrayList<>();
        Aluno aluno = new Aluno();
        aluno.setNome("Alguém");
        aluno.setN1(7.7);
        aluno.setN2(7.7);
        aluno.setNf(7.7);
        aluno.setConceito("B");
        alunos.add(aluno);
        
        boolean s = aluno.getNome().contains("Alguém");
        if (s){
            System.out.println("Existe um aluno cadastrado");
        } else{
            System.out.println("Não existe o aluno na lista");
        }
    }
    
    @Ignore
    void test06(){
        fail("Teste ainda não implementado!");
    }
    
    @Ignore
    void test07(){
        System.out.println("Não executa, teste 7 em construção!!!");
    }
}
