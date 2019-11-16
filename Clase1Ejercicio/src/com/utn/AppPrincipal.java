package com.utn;

public class AppPrincipal {

	public static void main(String[] args) {
		Auto a1 = new Auto ();

		a1.color =  "rojo";
		a1.coupe = true;
		a1.motor = 2.0;
		a1.modelo = "a4";
		a1.marca = "audi";
		
		
		System.out.println(a1.toString());
		
		a1.arrancar();
		a1.acelerar();
		a1.frenar();
		
		Auto a2 = new Auto();
		
		a2.color =  "azul";
		a2.motor = 1.6;
		a2.modelo = "corolla";
		a2.marca = "toyota";


		System.out.println(a2.toString());
		
		a2.arrancar();
		a2.acelerar();
		a2.frenar();
		
	}

}
