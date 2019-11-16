package com.utn;

public class Auto {
	String color ;
	String marca ;
	String modelo ;
	boolean coupe  ;
	double motor;
	//metodos de la clase : dan un comportamiento a los objetos !
	
	public void arrancar () {
		System.out.println("estoy arrancando el " + marca);
		
	}
	public void acelerar () {
		System.out.println("Estoy acelerando el "+ marca);
		
	}	
	public void  frenar () {
	
		System.out.println("Estoy deteniendo el " + marca);
	}

	
	
	
	@Override
	public String toString() {
		return "Auto [color=" + color + ", marca=" + marca + ", modelo=" + modelo + ", coupe=" + coupe + ", motor="
				+ motor + "]";
	}
	
	
	

}
