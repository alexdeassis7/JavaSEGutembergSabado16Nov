package com.utn;

import java.util.Scanner;

public class MainPrincipal {

	public static void main(String[] args) {		

		int opcion = 0 , numero1 = 0, numero2 = 0 ;		
		Scanner teclado  = new Scanner(System.in);		
		System.out.println("Menu principal de operaciones aritmeticas");
		System.out.println("ingrese la opcion deseada");
		System.out.println("1 : sumar");
		System.out.println("2 : restar");
		System.out.println("3 : multiplicar");
		System.out.println("4 : dividir"); 
		
		opcion = teclado.nextInt();
		
		if ( opcion < 5 && opcion > 0) {
				
		System.out.println("ingrese el numero 1");
		numero1 = teclado.nextInt();
		System.out.println("ingrese el numero 2");
		numero2 = teclado.nextInt();
		
		}		
		switch (opcion) {
		case 1:
			System.out.println("usted selecciono la opcion 1 :Sumar");
			System.out.println(numero1 + " + " + numero2 + " = " + (numero1 + numero2));
			break;
		case 2:			
			System.out.println("usted selecciono la opcion 2 :restar");
			System.out.println(numero1 + " - " + numero2 + " = " + (numero1 - numero2));
			break;

		case 3:
			System.out.println("usted selecciono la opcion 3 :Multiplicar");
			System.out.println(numero1 + " x " + numero2 + " = " + (numero1 * numero2));
			break;

		case 4:
			System.out.println("usted selecciono la opcion 4 :Dividir");			
			if (numero2 == 0) {
				System.out.println("no se puede dividir por cero en los numeros reales AMEgOOOOO!");
			}else {
				System.out.println(numero1 + " / " + numero2 + " = " + (numero1 / numero2));
			}				
			break;			
		default:
			System.out.println("La opcion ingresada es Erronea!!!!");
			break;
		}
		
		
		
	}

}
