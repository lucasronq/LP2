package Factory;

public class Carro {

}

class Fiat extends Carro {
	public Fiat() {
		System.out.println("Carro da marca Fiat");
	}
}

class Ford extends Carro {
	public Ford() {
		System.out.println("Carro da marca Ford");
	}
}