
public class Empleado extends Persona {

	int idEmpleado;
	double sueldo;

	public Empleado() {

		super();
		// TODO Auto-generated constructor stub
	}

	public Empleado(String nombre, char genero, int edad, String direccion) {
		super(nombre, genero, edad, direccion);
		// TODO Auto-generated constructor stub
	}

	public Empleado(String nombre, char genero, int edad, String direccion, int idEmpleado, double sueldo) {
		super(nombre, genero, edad, direccion);
		this.idEmpleado = idEmpleado;
		this.sueldo = sueldo;
	}

	public int getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	
	@Override
	public String toString() {
		return super.toString()+"Empleado\nidEmpleado: " + idEmpleado + "\nSueldo: " + sueldo + "�";
	}
	
}
