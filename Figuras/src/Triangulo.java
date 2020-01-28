public class Triangulo extends Figura {
	private int base, altura;

	public Triangulo(int base, int altura) {
		this.base = base;
		this.altura = altura;
	}

	@Override
	public double area() {
		return base * altura / (double) 2;
	}
}
