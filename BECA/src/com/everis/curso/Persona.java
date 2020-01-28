package com.everis.curso;

public class Persona {
	String nombre;
	String apellido;
	String ciudad;
	int edad;
	int diaNacimiento;
	int mesNacimiento;
	int anioNacimiento;
	boolean trabajo;
	boolean estudio;
	char sexo;

	public Persona() {

	}

	public Persona(String nombre, String apellido, String ciudad, int edad, int diaNacimiento, int mesNacimiento,
			int anioNacimiento, boolean trabajo, boolean estudio, char sexo) {

		this.nombre = nombre;
		this.apellido = apellido;
		this.ciudad = ciudad;
		this.edad = edad;
		this.diaNacimiento = diaNacimiento;
		this.mesNacimiento = mesNacimiento;
		this.anioNacimiento = anioNacimiento;
		this.trabajo = trabajo;
		this.estudio = estudio;
		this.sexo = sexo;
	}

	public int getDiaNacimiento() {
		return diaNacimiento;
	}

	public void setDiaNacimiento(int diaNacimiento) {
		this.diaNacimiento = diaNacimiento;
	}

	public int getMesNacimiento() {
		return mesNacimiento;
	}

	public void setMesNacimiento(int mesNacimiento) {
		this.mesNacimiento = mesNacimiento;
	}

	public int getAnioNacimiento() {
		return anioNacimiento;
	}

	public void setAnioNacimiento(int anioNacimiento) {
		this.anioNacimiento = anioNacimiento;
	}

	public boolean isTrabajo() {
		return trabajo;
	}

	public void setTrabajo(boolean trabajo) {
		this.trabajo = trabajo;
	}

	public boolean isEstudio() {
		return estudio;
	}

	public void setEstudio(boolean estudio) {
		this.estudio = estudio;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {

		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {

		this.apellido = apellido;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {

		this.ciudad = ciudad;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {

		this.edad = edad;
	}
}
