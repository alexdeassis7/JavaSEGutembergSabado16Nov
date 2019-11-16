package edu.frba.utn;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class AppPrincipal {

	public static void main(String[] args) {
		//Soy un comentario de linea 	
		
		/**Comentario de bloque
		 * Ejercicio 1 :Un empleado necesita saber su salario semanal el cual dependera 
		de las horas trabajadas durante esa semana , si trabaja hasta 40 hs se le abonaran
		16 dolares la hora , si supera las 40 horas , el excendente sera considerado como 
		hs extras las cuales se abonaran 20 dolares la hs*/
		
		/*JAVA DOC*/
		int horastrabajadas = 0;
		int precioPorHoraBase = 16;
		int precioPorHoraExtra = 20;
		double salarioSemanal = 0 ;
		
		/**Solicitamos datos al usuario*/
		//Scanner teclado = new Scanner(System.in);
		
		//System.out.println("Ingrese las horas que trabajo durante esta semana ! ");
		//horastrabajadas = teclado.nextInt();
		
		//System.out.println("usted ingreso " + horastrabajadas + " Horas ");
		
		/**Plan  b */
		
		
		horastrabajadas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las horas trabajadas !"));
		JOptionPane.showMessageDialog(null, "Usted ingreso " + horastrabajadas);
		
		if (horastrabajadas <= 40 ) {
			//calculamos salario sin hs extras
			salarioSemanal = precioPorHoraBase * horastrabajadas;
			
		}else {
			
			int horasExtras = horastrabajadas - 40 ;
			salarioSemanal = (precioPorHoraBase * 40 ) + horasExtras  * precioPorHoraExtra;
						
		}
		
	  JOptionPane.showMessageDialog(null, "usted recibira " + salarioSemanal + " dolares por el trabajao de esta semana" );
		
		
		
		
		
		
		
	}

}
