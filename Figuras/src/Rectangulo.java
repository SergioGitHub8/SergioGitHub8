public class Rectangulo extends Figura {
	private int base, altura;

	public Rectangulo(int base, int altura) {
		this.base = base;
		this.altura = altura;
	}

	@Override
	public double area() {
		return base * altura;
	}
}
