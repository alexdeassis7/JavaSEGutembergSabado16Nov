package com.utn.clase2;

import javax.swing.JOptionPane;

import com.utn.entidades.Calculadora;

public class AppPrincipal {

	public static void main(String[] args) {
		// Creamos una instancia de la clase calculadora (Objeto c1)
		Calculadora c1 = new Calculadora();
		boolean entreAldefaultConMAcri = false;

		int opcionIngresada = 0, respuestaUsuario = 0;// variable que determina que operacion realizar

		do {
			opcionIngresada = Integer.parseInt(JOptionPane.showInputDialog(
					"ingrese la operacion a realizar \n1 .SUMA  \n 2.RESTA \n 3.MULTIPLICAR \n 4.DIVIDIR"));

			switch (opcionIngresada) {
			case 1:
				// SUMAMOS LOS DATOS INGRESADOS
				c1.solicitarDatos();
				c1.mostrarResultado(c1.sumar());
				break;
			case 2:
				// RESTAMOS LOS DATOS INGRESADOS
				c1.solicitarDatos();
				c1.mostrarResultado(c1.restar());
				break;
			case 3:
				// MULTIPLICAMOS LOS DATOS INGRESADOS
				c1.solicitarDatos();
				c1.mostrarResultado(c1.multiplicar());
				break;
			case 4:
				// DIVIDIMOS LOS DATOS INGRESADOS
				c1.solicitarDatos();
				c1.mostrarResultado(c1.dividir());
				break;
			default:
				c1.mostrarError("la opciòn ingresada no es valida , vuelva a intentar con otra opciòn");
				entreAldefaultConMAcri = true;
				respuestaUsuario = 1;
				break;

			}
			if (!entreAldefaultConMAcri) {
				respuestaUsuario = Integer.parseInt(JOptionPane.showInputDialog(
						"Desea realizar otra operaciòn en la calculadora \n ingrese 1 para continuar \n distindo de 1 para Salir"));
			} else {

				entreAldefaultConMAcri = false;
			}

		} while (respuestaUsuario == 1);

	}

}
