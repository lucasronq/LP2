package Composite;

public class Text extends GraphicComponent {
	
	public Text(String graphic) {
		this.graphic = graphic;
	}
	
	public void draw() {
		System.out.println(this.graphic);
	}
}
