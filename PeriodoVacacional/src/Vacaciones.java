import java.util.Scanner;

public class Vacaciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		String nombre = "";
		int clave = 0, antiguedad = 0;

		System.out.println("******************************************************");
		System.out.println("*Bienvenido al sistema vacacionla de CocaCola Company*");
		System.out.println("******************************************************\n");

		System.out.println("¿Cual es el nombre del trabajador?: ");
		nombre = entrada.nextLine();

		System.out.println("Cuanto tiempo de servicio tiene el trabajador (años): ");
		antiguedad = entrada.nextInt();

		System.out.println("Cual es el nº clave de su departamento: ");
		clave = entrada.nextInt();

		if (clave == 1) {
			if (antiguedad == 1) {
				System.out.println(nombre + ", tiene derecho a 6 días");
			} else if (antiguedad >=2 && antiguedad <=6) {
				System.out.println(nombre + ", tiene derecho a 14 días");
			}else if(antiguedad >= 7) {
				System.out.println(nombre + ", tiene derecho a 20 días");
			}
		} else if (clave == 2) {
			if (antiguedad == 1) {
				System.out.println(nombre + ", tiene derecho a 7 días");
			} else if (antiguedad >=2 && antiguedad <=6) {
				System.out.println(nombre + ", tiene derecho a 15 días");
			}else if(antiguedad >= 7) {
				System.out.println(nombre + ", tiene derecho a 22 días");
			}

		} else if (clave == 3) {
			if (antiguedad == 1) {
				System.out.println(nombre + ", tiene derecho a 10 días");
			} else if (antiguedad >=2 && antiguedad <=6) {
				System.out.println(nombre + ", tiene derecho a 20 días");
			}else if(antiguedad == 7) {
				System.out.println(nombre + ", tiene derecho a 30 días");
			}

		}else {
			System.out.println("Error la clave del departamento es incorrecta");
		}
	}
}
