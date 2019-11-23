package com.utn.entidades;

import javax.swing.JOptionPane;

public class Calculadora {
	// atributos
	public int resultado = 0;
	public int numero1 = 0;
	public int numero2 = 0;

	// Metodos de la clase : Definen un comportamiento
	public int sumar() {
		resultado = numero1 + numero2;
		return resultado;
	}

	public int restar() {
		resultado = numero1 - numero2;
		return resultado;
	}

	public int multiplicar() {
		resultado = numero1 * numero2;
		return resultado;
	}

	public float dividir() {
		float rs = 0;
		/**
		 * utilizamos la palabra reservada this para invocar al atributo de la clase !
		 */
		// this.resultado = 10;
		if (numero2 == 0) {
			JOptionPane.showMessageDialog(null, "no se puede dividir por cero en lo numeros reales");
		} else {
			rs = numero1 / numero2;
		}
		return rs;
	}

	// Procedimiento1
	public void mostrarResultado(int resultadoAmostrar) {
		JOptionPane.showMessageDialog(null, "El resultado de la opercaion es : " + resultadoAmostrar);

	}

	/** Sobrecarga de Metodos */
	// Procedimiento 2
	public void mostrarResultado(float resultadoAmostrar) {
		JOptionPane.showMessageDialog(null, "El resultado de la opercaion es : " + resultadoAmostrar);

	}

	public void solicitarDatos() {
		numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero 1"));
		numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero 2"));

	}

	public void mostrarError(String MensajeAmostrar) {

		JOptionPane.showMessageDialog(null, MensajeAmostrar);

	}

}
