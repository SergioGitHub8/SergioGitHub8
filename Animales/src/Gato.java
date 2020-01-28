
public class Gato extends Animal {

	boolean maullar;

	public Gato() {
		super();
		
	}

	public Gato(String nombre, int peso, int altura) {
		super(nombre, peso, altura);
		
	}
	
	public void maullar() {

		if (maullar == true) {
			System.out.println("Miaau, bien dicho");
		}
	}
	@Override
	public String toString() {
		return "Gato [nombre:" + nombre + ", peso:" + peso + ", altura: " + altura + "]";
	}

}