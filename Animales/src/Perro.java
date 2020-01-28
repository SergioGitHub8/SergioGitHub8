
public class Perro extends Animal {

	boolean ladrar;

	public Perro() {
		super();

	}

	public Perro(String nombre, int peso, int altura) {
		super(nombre, peso, altura);
	}

	public void ladrar() {
		if (ladrar == true) {
			System.out.println("Woof-Woof");
		}
	}

	@Override
	public String toString() {
		return "Perro [nombre: " + nombre + ", peso: " + peso + ", altura: " + altura + "]";
	}

}