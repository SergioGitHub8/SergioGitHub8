
public class Raton extends Animal {

	boolean roer;

	public Raton() {
		super();
		
	}

	public Raton(String nombre, int peso, int altura) {
		super(nombre, peso, altura);
		
	}

	public void roer() {

		if (roer == true) {
			System.out.println("ñiñiñiñiñ cago en dios");
		}
	}

	@Override
	public String toString() {
		return "Raton [nombre: " + nombre + ", peso: " + peso + ", altura: " + altura + "]";
	}
	
}
