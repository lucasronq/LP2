package secretaria;

import java.util.ArrayList;
public class Aluno {
	private String nome, conceito;
	private double n1, n2, n3, media;
	private ArrayList<Aluno> alunos;
	
	public Aluno() {
		super();
	}

	public Aluno(String nome, String conceito, double n1, double n2, double n3, double media, ArrayList<Aluno> alunos) {
		super();
		this.nome = nome;
		this.conceito = conceito;
		this.n1 = n1;
		this.n2 = n2;
		this.n3 = n3;
		this.media = media;
		this.alunos = alunos;
	}
	
	public void adicionarAluno(Aluno aluno){
        alunos.add(aluno);
    }
    
    public void removerAluno(Aluno aluno){
        alunos.remove(aluno);
    }
    
    public void removerAluno(int posicao){
        alunos.remove(posicao);
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getConceito() {
		return conceito;
	}

	public void setConceito(String conceito) {
		this.conceito = conceito;
	}

	public double getN1() {
		return n1;
	}

	public void setN1(double n1) {
		this.n1 = n1;
	}

	public double getN2() {
		return n2;
	}

	public void setN2(double n2) {
		this.n2 = n2;
	}

	public double getN3() {
		return n3;
	}

	public void setN3(double n3) {
		this.n3 = n3;
	}

	public double getMedia() {
		return media;
	}

	public void setMedia(double media) {
		this.media = media;
	}
	
	public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", conceito=" + conceito + ", n1=" + n1 + ", n2=" + n2 + ", n3=" + n3
				+ ", media=" + media + "]";
	}
	
	
}
