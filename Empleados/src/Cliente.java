import java.util.Date;

public class Cliente extends Persona {

	int idCliente;
	Date fechaRegistro;
	boolean vip;

	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cliente(String nombre, char genero, int edad, String direccion) {
		super(nombre, genero, edad, direccion);
		// TODO Auto-generated constructor stub
	}

	public Cliente(String nombre, char genero, int edad, String direccion, int idCliente, Date fechaRegistro,
			boolean vip) {
		super(nombre, genero, edad, direccion);
		this.idCliente = idCliente;
		this.fechaRegistro = fechaRegistro;
		this.vip = vip;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public Date getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public boolean isVip() {
		return vip;
	}

	public void setVip(boolean vip) {
		this.vip = vip;
	}

	@Override
	public String toString() {
		return super.toString()+"Cliente\nidCliente: " + idCliente + "\nfechaRegistro: " + fechaRegistro + "\nvip: " + vip + "\n";
	}
	
}
