package br.com.biometric.model;

public class Biometria {
	protected float peso = 0;
	protected float altura = 0;
	
	public Biometria(float peso, float altura) {
		//super();
		this.peso = peso;
		this.altura = altura;
	}

	public Biometria() {
		//super();
	}

	public float getPeso() {
		return peso;
	}
	
	public void setPeso(float peso) {
		this.peso = peso;
	}

	public float getAltura() {
		return altura;
	}
}

