package Factory;

public class FactoryCarro {
	public Carro getCarro(String modeloCarro) {
		if (modeloCarro == "Fiesta" || modeloCarro == "Ka") {
			return new Ford();
		} else if (modeloCarro == "Palio" || modeloCarro == "Uno") {
			return new Fiat();
		}
		return new Carro();
	}
}
