package com.everis.curso;

public class Card {

	public static void main(String[] args) {
		String Nombre = "Sergio";
		String Apellido = "Vizcaino";
		int Edad = 24;
		int DiaNacimiento = 28;
		int MesNacimiento = 11;
		int AnioNacimiento = 1995;
		boolean Trabajo = false;
		boolean Estudio = true;
		char Sexo = 'H';
		String RespuestaTrabajo;
		String RespuestaEstudio;
		
		if(Trabajo == false) {
			
			RespuestaTrabajo = "no estoy trabajando"; 
		}else {
			
			RespuestaTrabajo = "si estoy trabajando";
		}
		
		if(Estudio == false) {
			
			RespuestaEstudio = "no estoy estudiando"; 
		}else {
			
			RespuestaEstudio = "si estoy estudiando";
		}
		
		
		if(Sexo == 'H') {
			Sexo = 'H';
		}else {
			Sexo = 'M';
		}
		
		
	System.out.println("Buenas Tardes mi nombre es: " + Nombre + " " + Apellido + " naci el " + DiaNacimiento
	+ "/" + MesNacimiento + "/" + AnioNacimiento + ", tengo " + Edad + " a�os, actuamente " + RespuestaTrabajo
	+ " en cambio "+ RespuestaEstudio + " y por ultimo soy " + Sexo);
		
		
				
		

	}

}
