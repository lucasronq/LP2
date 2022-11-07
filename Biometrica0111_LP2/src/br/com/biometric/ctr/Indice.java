package br.com.biometric.ctr;

import br.com.biometric.model.Biometria;

public class Indice  extends Biometria {
	float indice = 0;

	public Indice(float peso, float altura, float indice) {
		super(peso, altura);
		this.indice = indice;
	}

	public float getIndice() {
		return indice;
	}

	public void setIndice(float indice) {
		this.indice = indice;
	}
	
	public float calculaIMC() {
		indice = peso / (altura * altura);
		
		return indice;
	}

	@Override
	public String toString() {
		return "Indice [indice=" + indice + "]";
	}

}
