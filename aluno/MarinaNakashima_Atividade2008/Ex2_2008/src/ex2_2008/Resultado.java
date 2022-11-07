
package ex2_2008;
import java.util.Scanner;
import java.util.ArrayList;

public class Resultado {
    //private string conceito;
	public static void main (String args[]) {
		ArrayList <Aluno> alunos = new ArrayList<>();
		System.out.print("Digite o número de alunos: ");
		Scanner sc = new Scanner(System.in);
		int numAlunos = sc.nextInt();
		for(int i=1; i<=numAlunos; i++) {
		Scanner entrada = new Scanner (System.in);
		System.out.print("Digite seu nome: ");
		String nome = entrada.nextLine();
		System.out.print("Digite sua primeira nota: ");
		double n1 = Double.parseDouble(entrada.nextLine());
		System.out.print("Digite sua segunda nota: ");
		double n2 = Double.parseDouble(entrada.nextLine());
		System.out.print("Digite sua terceira nota: ");
		double n3 = Double.parseDouble(entrada.nextLine());
		double media = (n1+n2+n3)/3;
		System.out.println(nome);
		System.out.println("Sua nota final é: " + media);
			
		if(media > 8) {
			
			System.out.println("Seu conceito é A");
		}
		else if ((media <= 8) && (media >= 7)) {
			System.out.println("Seu conceito é B");
		}
		else if ((media < 7) && (media >= 6)) {
			System.out.println("Seu conceito é C");
		}
		else if ((media < 6) && (media >= 5)) {
			System.out.println("Seu conceito é D");
		}
		else {
			System.out.println("Seu conceito é E");
		}
		Aluno aluno = new Aluno();
		aluno.setNome(nome);
		aluno.setN1(n1);
		aluno.setN2(n2);
		aluno.setN3(n3);
		aluno.setMedia(media);
		aluno.adicionarAluno(aluno);
		}
		sc.close();
		
		for (int i=0; i<alunos.size(); i++) {
			System.out.println(alunos.get(i).getNome());
			System.out.println(alunos.get(i).getMedia());
			System.out.println(alunos.get(i).getConceito());
		}
		
		
	}
}
