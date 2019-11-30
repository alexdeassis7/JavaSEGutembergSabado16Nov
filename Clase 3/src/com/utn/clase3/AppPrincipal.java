package com.utn.clase3;

import javax.swing.JOptionPane;

public class AppPrincipal {

	public static void main(String[] args) throws Exception {

		/** Instanciamos Objetos De La Clase Persona */
		// Utilizamos el Constructor Implicito
		// Heredado de la clase Object ( Constructor Vacio )
		Persona p1 = new Persona();
		
		// Mostramos el estado de los atributos
		// del objeto p1 mediante el metodo ToString
		System.out.println("******* PERSONA 1 *******");
		System.out.println(p1.toString());
	
		//SOLICITAMOS QEU INGRESE LOS DATOS EL USUARIO		
		String nombreIngresado = JOptionPane.showInputDialog("Ingrese el nombre de la persona");
		String direccionIngresada =  JOptionPane.showInputDialog("Ingrese la direccion de la persona");
		String estadoCivilIngresado = JOptionPane.showInputDialog("Ingrese el estado Civil de la persona");
		int edadIngresada = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad de la persona"));
		
		//SETEAMOS LOS DATOS INGRESADOS AL OBJETO PERSONA P1
		p1.setNombre(nombreIngresado);
		p1.setDireccion(direccionIngresada);
		p1.setEstadoCivil(estadoCivilIngresado);
		p1.setEdad(edadIngresada);
		
		// Mostramos el estado de los atributos
		// del objeto p1 mediante el metodo ToString
		System.out.println("******* PERSONA 1 luego de setear los datos *******");
		System.out.println(p1.toString());
		JOptionPane.showMessageDialog(null, "Los datos ingresados son : \nNombre : " + nombreIngresado 
				+" \nDireccion: "+ direccionIngresada + "\nEstado Civil: " + estadoCivilIngresado +
				" \nEdad: " + edadIngresada);
		
		
		
		//p1.nombre = "Leandro"; SIN ENCAPSULAMIENTO
		
		//CON ENCAPSULAMIETO
//		p1.setNombre("Leandro");
//		p1.setDireccion("Av Santa fe 5006 ");
//		p1.setDni(4148414);
//		p1.setEdad(-89);
//		p1.setTelefono(46544658);
//		p1.setEstadoCivil("Casado");
//		p1.setSexo('M');
		
		// Mostramos el estado de los atributos de P2
//		System.out.println("******* PERSONA 1 *******");
//		System.out.println(p1.toString());
		
//		instanciamos una persona mediante ewl constructor con parametros
//		Persona p2 = new Persona("Alex", 36863835, 'M');
		
		// Mostramos el estado de los atributos de P2
//		System.out.println("******* PERSONA 2 *******");
//		System.out.println(p2.toString());
//		
//		instanciamos una persona mediante ewl constructor con parametros
//		Persona p3 = new Persona("Lucas", 1122333,13,'M',"San telmo Av Belgrano 132", "Soltero");	
//		
		// Mostramos el estado de los atributos de P3
//		System.out.println("******* PERSONA 3 *******");
//		System.out.println(p3.toString());
		
		
		
		
	}
}
