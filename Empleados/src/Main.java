
public class Main {

	public static void main(String[] args) {

		// Creaci�n nueva Persona

		Persona Person1 = new Persona("Sergio", 'H', 24, "Calle la Torre, 95 Elx");
		System.out.println(Person1);

		// Creacion de nuevo cliente con los atributos de persona + los atributos de
		// cliente

		Cliente Cliente1 = new Cliente("Sergio", 'H', 24, "Calle la Tore 95, Elx", 1, null, true);
		System.out.println(Cliente1);

		// Creaci�n nueva Persona

		Persona Person2 = new Persona("Sofia", 'M', 25, "Av Mendez Nu�ez, 50 Alicante");
		System.out.println(Person2);

		// Creacion de nuevo Empleado con los atributos de persona + los atributos de
		// empleado

		Empleado Empleado1 = new Empleado("Sofia", 'M', 25, "Av Mendez Nu�ez, 50 Alicante", 1, 1850.5);
		System.out.println(Empleado1);

	}
}
