package demo;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class AppPrincipal {
	public static void main(String[] args) {
		// genere una clase principal con un vector de 3 docentes y testee el
//			correcto funcionamiento de todo su programa cargando 12 meses de sueldo para cada sub 
//			índice del vector
		DocenteDeSecundaria primerDocente = new DocenteDeSecundaria();

		Scanner teclado = new Scanner(System.in);

		int opcion = 1, flag = 0;

		do {

			flag++;

			System.out.println("Welcome to admin Employed System ");
			System.out.println("Que mes desea cargar ");
			int mesIngresado = teclado.nextInt();

			switch (mesIngresado) {
			case 1:// ENERO
				primerDocente.setHorasBase();
				primerDocente.setHorasExtras();
				primerDocente.guardarSueldoEnArray(mesIngresado);
				break;
			case 2:// febrero
				primerDocente.setHorasBase();
				primerDocente.setHorasExtras();
				primerDocente.guardarSueldoEnArray(mesIngresado);

				break;

			case 3:// marzo
				primerDocente.setHorasBase();
				primerDocente.setHorasExtras();
				primerDocente.guardarSueldoEnArray(mesIngresado);

				break;

			case 4:// Abril
				primerDocente.setHorasBase();
				primerDocente.setHorasExtras();
				primerDocente.guardarSueldoEnArray(mesIngresado);

				break;

			case 5:// mayo
				primerDocente.setHorasBase();
				primerDocente.setHorasExtras();
				primerDocente.guardarSueldoEnArray(mesIngresado);

				break;

			case 6:// junio
				primerDocente.setHorasBase();
				primerDocente.setHorasExtras();
				primerDocente.guardarSueldoEnArray(mesIngresado);

				break;

			case 7:// julio
				primerDocente.setHorasBase();
				primerDocente.setHorasExtras();
				primerDocente.guardarSueldoEnArray(mesIngresado);

				break;

			case 8:// agosto
				primerDocente.setHorasBase();
				primerDocente.setHorasExtras();
				primerDocente.guardarSueldoEnArray(mesIngresado);

				break;

			case 9:// Sept
				primerDocente.setHorasBase();
				primerDocente.setHorasExtras();
				primerDocente.guardarSueldoEnArray(mesIngresado);

				break;

			case 10:// Oct
				primerDocente.setHorasBase();
				primerDocente.setHorasExtras();
				primerDocente.guardarSueldoEnArray(mesIngresado);

				break;

			case 11:// nov
				primerDocente.setHorasBase();
				primerDocente.setHorasExtras();
				primerDocente.guardarSueldoEnArray(mesIngresado);

				break;

			case 12:// diciembre
				primerDocente.setHorasBase();
				primerDocente.setHorasExtras();
				primerDocente.guardarSueldoEnArray(mesIngresado);
				break;

			default:
				System.out.println("NO existe el mes que ingreso ");
				break;
			}

			if (flag >= 1) {
				System.out.println("desea carga otro mes");
				System.out.println("opcion 1 = SI  o ingrese cualquier otro numero para salir del programa ");
				opcion = teclado.nextInt();
			}
		} while (opcion == 1);
//		System.out.println("El sueldo bruto sera :" + primerDocente.getSueldoBruto());
//		System.out.println("El sueldo Neto sera :" + primerDocente.sueldoNeto());
//
		System.out.println(primerDocente.toString());
//
//		DocenteDeSecundaria d2 = new DocenteDeSecundaria(36863837);
//		DocenteDeSecundaria d3 = new DocenteDeSecundaria("Leandro");
//		DocenteDeSecundaria d4 = new DocenteDeSecundaria(41085907, "gabriel", "MAtematicas");
//		d4.setApellido("gomez");
//		d4.setEdad(45);
//		System.out.println(d2.toString());
//		System.out.println(d3.toString());
//		System.out.println(d4.toString());

	}
}
