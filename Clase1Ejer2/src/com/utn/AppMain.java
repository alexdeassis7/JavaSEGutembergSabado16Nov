package com.utn;

import java.util.Scanner;

public class AppMain {

	public static void main(String[] args) {
		/** Calcular el promedio de siete notas de la materia Algebra */

		double promedio, nota, sumaNotas = 0;

		Scanner teclado = new Scanner(System.in);

//		for (int i = 0; i < 7 ; i++) {
//			
//			System.out.println("ingrese la nota " + ( i + 1));			
//			nota = teclado.nextDouble();
//			//sumaNotas = sumaNotas + nota;
//			sumaNotas += nota;
//		}
//		
//		promedio = sumaNotas / 7 ;
//		
//		System.out.println("El promedio de sus notas es : " + promedio);
//		

		int x = 0;
	
		
		while (x < 7){
			System.out.println("ingrese la nota " + (x + 1));
			nota = teclado.nextDouble();
			// sumaNotas = sumaNotas + nota;
			sumaNotas += nota;
			x++;

		} 


		promedio = sumaNotas / 7;

		System.out.println("El promedio de sus notas es : " + promedio);

	}

}
