package compose;

public class Main {
	public static void main(String[] args) {
		Botao botao1 = new Botao();
		CheckBox checkb1 = new CheckBox();
		ComboBox combo1 = new ComboBox();
		
		LinearContainer linear = new LinearContainer();
		
		linear.add(botao1);
		linear.add(checkb1);
		linear.add(combo1);
		linear.desenhar();
	}
}
