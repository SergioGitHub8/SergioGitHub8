import java.util.Scanner;

public class Suma {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String operacion;
		int num1=0, num2=0, result=0;
		
		System.out.println("Que operacion quieres realizar: ");
		operacion = sc.nextLine();
		
		System.out.println("Introduzca el primer numero: ");
		num1 = sc.nextInt();
		
		System.out.println("Introduzca el segundo numero: ");
		num2 = sc.nextInt();
		
		result = num1 + num2;
		
		System.out.println("Has elegido hacer una " + operacion + "el resultado es: " + result);
		
		sc.close();

	}

}
