package com.utn.main;

import com.utn.entidades.Persona;

public class AppPrincipal {

	public static void main(String[] args) {
		
		/**Instanciar objetos de la clase Persona*/		
		Persona persona_uno = new Persona();//invocamos al metodo constructor vacio 
		Persona persona_dos = new Persona();
		Persona persona_tres = new Persona();

		System.out.println("Persona 1");
		System.out.println(persona_uno.toString());
		System.out.println("Persona 2");
		System.out.println(persona_dos.toString());
		System.out.println("Persona 3");
		System.out.println(persona_tres.toString());
		
		System.out.println("Cargamos los obejtos ");
		/**Seteamos atributos - estados a los objetos */		
		persona_uno.edad = 26;
		persona_uno.nombre = "Alex";
		persona_uno.apellido = "De Assis";
		persona_uno.domicilio = "Av. Santa e 5005";
		persona_uno.dni = 36863837;
		System.out.println("Persona 1");
		System.out.println(persona_uno.toString());
				
		persona_dos.edad = 13;
		persona_dos.nombre = "Lucas";
		persona_dos.apellido = "anelli";
		persona_dos.domicilio = "Av. Cordoba";
		persona_dos.dni = 40404040;
		System.out.println("Persona 2");
		System.out.println(persona_dos.toString());
				
		
		persona_tres.edad = 21;
		persona_tres.nombre = "Leandro";
		persona_tres.apellido = "Uema";
		persona_tres.domicilio = "Av. Corrientes";
		persona_tres.dni = 4552525;
		System.out.println("Persona 3");
		System.out.println(persona_tres.toString());
		
		
		
		
		
		
		
		
		
	}
}
