package com.utn.entidades;

public class Persona {
	//Atributos de la clase persona 
	
	public int edad = 0 ;
	public String nombre = null;
	public String apellido = null;
	public String domicilio = null;
	public int dni = 0 ;
	
	//Metodo constructor vacio! no es necesario declararlo , esta implicita en todas las clase!
	public Persona() {
		
	}

	//reescribimos el metodo toString de la superclase Object (Clase padre de todas las clases en java)
	public String toString() {
		return "Persona [edad=" + edad + ", nombre=" + nombre + ", apellido=" + apellido + ", domicilio=" + domicilio
				+ ", dni=" + dni + "]";
	}
	
	
//	Metodos de la clase persona 
	
	

}
