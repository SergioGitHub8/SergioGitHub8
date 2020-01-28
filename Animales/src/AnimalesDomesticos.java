import java.util.Scanner;

public class AnimalesDomesticos {

	public static void main(String[] args) {

		int contador;
		Perro[] perros = new Perro[5];
		Gato[] gatos = new Gato[5];
		Raton[] ratones = new Raton[5];
		Scanner sc = new Scanner(System.in);

		for (contador = 0; contador < 5; contador++) {

			perros[contador] = new Perro();
			System.out.println("Introduce el nombre ");
			perros[contador].setNombre(sc.nextLine());
			System.out.println("Introduce el peso ");
			perros[contador].setPeso(sc.nextInt());
			System.out.println("Introduce la altura ");
			perros[contador].setAltura(sc.nextDouble());

			if (sc.hasNextLine()) {
				sc.nextLine();
			}
			System.out.println("Resumen de datos perros");
			System.out.println(perros[contador].toString());


		}

		for (contador = 0; contador < 5; contador++) {

			gatos[contador] = new Gato();

			System.out.println("Introduce el nombre ");
			gatos[contador].setNombre(sc.nextLine());
			System.out.println("Introduce el peso ");
			gatos[contador].setPeso(sc.nextInt());
			System.out.println("Introduce la altura ");
			gatos[contador].setAltura(sc.nextDouble());

			if (sc.hasNextLine()) {
				sc.nextLine();
			}
			System.out.println("Resumen de datos gatos");
			System.out.println(gatos[contador].toString());


		}

		for (contador = 0; contador < 5; contador++) {

			ratones[contador] = new Raton();

			System.out.println("Introduce el nombre ");
			ratones[contador].setNombre(sc.nextLine());
			System.out.println("Introduce el peso ");
			ratones[contador].setPeso(sc.nextInt());
			System.out.println("Introduce la altura ");
			ratones[contador].setAltura(sc.nextDouble());

			if (sc.hasNextLine()) {
				sc.nextLine();
			}
			System.out.println("Resumen de datos ratones");
			System.out.println(ratones[contador].toString());

		}
		sc.close();
	}

}