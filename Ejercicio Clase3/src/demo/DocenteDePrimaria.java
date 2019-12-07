package demo;

public class DocenteDePrimaria {

//	Un docente de Primaria debera tener un m�nimo de 40hs base que se le
//	acreditaran 500 pesos cada hora, luego podr� realizar un m�ximo de 20 horas 
//	extras que se le pagaran 750 pesos , si el docente fuera de secundaria cobrar�a un 15% 
//	m�s que un docente de primaria, tenga en cuenta que el docente no podra ser menor de 23 a�os 
//	y mayor de 55 a�os,
	static int UltimoNumeroDeLegajoCreado = 1;
	
	private String Nombre;
	private String Apellido;
	private int antig�edad;
	private int edad;
	private String especializaci�n;// (ac� se alojara la materia que dicta el docente),
	private int dni;
	private int legajo;
	private int horasBase;
	private int horasExtras;
	private double sueldo;
	private String fechaDeNacimiento;

	private final int precioHoraBase = 500;
	private final int precioHoraExtra = 750;

	{
		horasBase = 0;
		horasExtras = 0;
		especializaci�n = null;
	}

	/**constructor que inicialice el nombre*/  
	public DocenteDePrimaria(String nombre) {		
		Nombre = nombre;
		legajo = UltimoNumeroDeLegajoCreado ;
		UltimoNumeroDeLegajoCreado ++;		
	}
	
	public DocenteDePrimaria() {
		UltimoNumeroDeLegajoCreado ++;
	}
	

	public int getPrecioHoraBase() {
		return precioHoraBase;
	}

	public int getPrecioHoraExtra() {
		return precioHoraExtra;
	}
	
	public double getSueldoBruto() {
		sueldo = (precioHoraBase * horasBase) + (precioHoraExtra * horasExtras);
		return sueldo;
	}
	public void setHorasBase(int horasBase) {
		if (horasBase >= 40) {
			this.horasBase = horasBase;
		} else {
			System.out.println("ERROR : No se puede cargar menos de 40 horas base al Docente");
		}
	}
	public void setEdad(int edad) {
		if (edad >= 23 && edad <= 55) {
			this.edad = edad;
		} else {
			System.out.println("ERROR:  no podemos tener docentes con " + edad + " a�os");
		}
	}

	public void setHorasExtras(int horasExtras) {
		if (horasExtras <= 20) {
			this.horasExtras = horasExtras;
		} else {
			System.out.println("ERROR: no se puede realizar mas de 20 hs Extras por mes!");
		}

	}

	public int getHorasExtras() {
		return horasExtras;
	}

	public int getEdad() {
		return edad;
	}

}
