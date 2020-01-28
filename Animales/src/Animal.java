
public class Animal {

	//Atributos
	String nombre;
	int peso;
	double altura;

	public Animal() {

	}

	public Animal(String nombre, int peso, int altura) {
		super();
		this.nombre = nombre;
		this.peso = peso;
		this.altura = altura;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	// override es para validar en la compilacion de que se llama igual que el padre
	@Override
	public String toString() {
		return "Animal [nombre: " + nombre + ", peso: " + peso + ", altura: " + altura + "]";
	}
}