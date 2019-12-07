package demo;

import java.util.Scanner;

public class DocenteDeSecundaria {

	DocenteDePrimaria d1 = new DocenteDePrimaria();
	private String Nombre;
	private String Apellido;
	private int antig�edad;
	private int edad;
	private String especializacion;// (ac� se alojara la materia que dicta el docente),
	private int dni;
	private int legajo;
	private int horasBase;
	private int horasExtras;
	private double sueldo;
	private String fechaDeNacimiento;
	// este array lo utilizamos para cargas los sueldo de cada mes
	private double[] arrayAnioSueldos = new double[12];

	private final float precioHoraBase = (d1.getPrecioHoraBase() * 1.15f);
	private final float precioHoraExtra = (d1.getPrecioHoraExtra() * 1.15f);

	static int UltimoNumeroDeLegajoCreado = 1;
//	Crear, adem�s:   -un bloque inicializador que inicialice: 
//		las horasBase y horaExtras en cero y la especializaci�n en �null�

	{
		horasBase = 0;
		horasExtras = 0;
		especializacion = null;
		legajo = UltimoNumeroDeLegajoCreado;
		UltimoNumeroDeLegajoCreado++;
	}

	/** constructor que inicialice el nombre */
	public DocenteDeSecundaria(String nombre) {
		Nombre = nombre;
	}

	public DocenteDeSecundaria() {

	}

	/** - un constructor que inicialice el dni */
	public DocenteDeSecundaria(int dni) {
		this.dni = dni;

	}

	/** - un constructor que inicialice dni , nombre y especializacion */
	public DocenteDeSecundaria(int dni, String nombre, String especializacion) {
		this.dni = dni;
		this.Nombre = nombre;
		this.especializacion = especializacion;
	}

//	un m�todo que retorne el nombre y el dni 
	public String RetornaNombreYdni() {
		return Nombre + dni;
	}

	// un m�todo que retorne el sueldo neto

	public int getEdad() {
		return edad;
	}

//	un m�todo que retorne el sueldo neto 
	public double getSueldoBruto() {

		sueldo = (precioHoraBase * horasBase) + (precioHoraExtra * horasExtras);

		return sueldo;
	}

	// m�todo que retorna el sueldo bruto (sueldo neto menos el 21%)
	public float sueldoNeto() {

		float sueldoNeto = (float) (getSueldoBruto() - (getSueldoBruto() * 0.21));
		return sueldoNeto;
	}

	// un m�todo que calcule el sueldo anual complementario

	public void setEdad(int edad) {
		if (edad > 23 && edad < 55)
			this.edad = edad;
		else
			System.out.println("Edad invalida ");
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	public int getAntig�edad() {
		return antig�edad;
	}

	public void setAntig�edad(int antig�edad) {
		this.antig�edad = antig�edad;
	}

	public String getEspecializaci�n() {
		return especializacion;
	}

	public void setEspecializaci�n(String especializaci�n) {
		this.especializacion = especializaci�n;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public int getLegajo() {
		return legajo;
	}

	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}

	public int getHorasBase() {
		return horasBase;
	}

	public void setHorasBase() {
		int horasIngresada = 0;

		do {

			Scanner teclado = new Scanner(System.in);
			System.out.println("ingrese por favor las horas base");
			horasIngresada = teclado.nextInt();

			if (horasIngresada < 40) {
				System.out.println("Error , no debe cargar menos de 40 horas base intente de nuevo");
			}

		} while (horasIngresada < 40);

		this.horasBase = horasBase;
		System.out.println("se cargaron las horas Base al docente ");

	}

	public int getHorasExtras() {
		return horasExtras;
	}

	public void setHorasExtras() {
		int horasIngresada = 0;

		do {

			Scanner teclado = new Scanner(System.in);
			System.out.println("ingrese por favor las horas Extras");
			horasIngresada = teclado.nextInt();

			if (horasIngresada >= 20) {
				System.out.println("Error , no debe cargar mas de 20 extras intente de nuevo");
			}

		} while (horasIngresada >= 20);

		this.horasExtras = horasExtras;
		System.out.println("se cargaron las horas Extras al docente ");

	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public String getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	public void setFechaDeNacimiento(String fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	// METODO TO STRING ME RETORNA EL ESTADO DE TODOS LOS ATRIBUTOS DE LA CLASE.
//	un m�todo ToString

	public String toString() {
		return "DocenteDeSecundaria [Nombre=" + Nombre + ", Apellido=" + Apellido + ", antig�edad=" + antig�edad
				+ ", edad=" + edad + ", especializacion=" + especializacion + ", dni=" + dni + ", legajo=" + legajo
				+ ", horasBase=" + horasBase + ", horasExtras=" + horasExtras + ", sueldo=" + sueldo
				+ ", fechaDeNacimiento=" + fechaDeNacimiento + ", precioHoraBase=" + precioHoraBase
				+ ", precioHoraExtra=" + precioHoraExtra + "]";
	}

	public void guardarSueldoEnArray(int mesIngresado) {
		// TODO Auto-generated method stub
		arrayAnioSueldos[mesIngresado] = getSueldoBruto();

	}

	public double calcularSAC(int semestre) {
		double sumatoria = 0;
		double sueldoMayor = 0;
		if (semestre == 1) {
			sueldoMayor = arrayAnioSueldos[1];
			for (int i = 1; i < 7; i++) {
				// BUSCAMOS EL MAYOR SUELDO
				if (arrayAnioSueldos[i + 1] > arrayAnioSueldos[i]) {
					sueldoMayor = arrayAnioSueldos[i + 1];
				}
			}
		} else {
			sueldoMayor = arrayAnioSueldos[7];
			for (int i = 7; i < 13; i++) {
				// BUSCAMOS EL MAYOR SUELDO
				if (arrayAnioSueldos[i + 1] > arrayAnioSueldos[i]) {
					sueldoMayor = arrayAnioSueldos[i + 1];
				}
			}

		}

		return sueldoMayor / 2;
	}

}
