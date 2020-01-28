
public class Main {
	public static void main(String[] args) {

		Figura[] figuras = new Figura[4];
		figuras[0] = new Rectangulo(2, 4);
		figuras[1] = new Cuadrado(4);
		figuras[2] = new Triangulo(3, 10);
		figuras[3] = new Circulo(5);

		Figura mayor = areaMayor(figuras);

		System.out.println("El mayor area es " + mayor.area() + " del " + mayor.getClass().getSimpleName());
	}

	private static Figura areaMayor(Figura[] figuras) {
		Figura ret = figuras[0];
		for (Figura figura : figuras) {
			if (figura.area() > ret.area()) {
				ret = figura;
			}
		}

		return ret;
	}
}
