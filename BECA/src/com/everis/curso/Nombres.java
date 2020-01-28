package com.everis.curso;

import java.util.Scanner;

public class Nombres {

	public static void main(String[] args) {
		int contador;
		Persona[] nombres = new Persona[2];
		Scanner sc = new Scanner(System.in);
		for (contador = 0; contador < 2; contador++) {

			nombres[contador] = new Persona();

			System.out.println("Introduce el nombre ");
			nombres[contador].setNombre(sc.nextLine());
			System.out.println("Introduce el apellido ");
			nombres[contador].setApellido(sc.nextLine());
			System.out.println("Introduce la ciudad ");
			nombres[contador].setCiudad(sc.nextLine());
			System.out.println("Introduce la edad ");
			nombres[contador].setEdad(sc.nextInt());
			System.out.println("Introduce tu dia de nacimiento ");
			nombres[contador].setDiaNacimiento(sc.nextInt());
			System.out.println("Introduce tu mes de nacimiento ");
			nombres[contador].setMesNacimiento(sc.nextInt());
			System.out.println("Introduce tu año de nacimiento");
			nombres[contador].setAnioNacimiento(sc.nextInt());
			System.out.println("Estudias?");
			nombres[contador].setEstudio(sc.nextBoolean());
			System.out.println("Trabajas?");
			nombres[contador].setTrabajo(sc.nextBoolean());
			System.out.println("H/M");
			nombres[contador].setSexo(sc.next().charAt(0));

			if (sc.hasNextLine()) {
				sc.nextLine();
			}
		}

		for (contador = 0; contador < 2; contador++) {
			System.out.println("Mi nombre es " + nombres[contador].nombre + " " + nombres[contador].apellido
					+ ", mi ciudad es " + nombres[contador].ciudad + " naci el " + nombres[contador].diaNacimiento + "/"
					+ nombres[contador].mesNacimiento + "/" + nombres[contador].anioNacimiento + ", ¿estudio? "
					+ nombres[contador].estudio + " ¿trabajo? " + nombres[contador].trabajo + ", mi genero es "
					+ nombres[contador].sexo);
		}
		sc.close();
	}
}