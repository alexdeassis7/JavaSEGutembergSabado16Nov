package demo;

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
//	un m�todo que calcule el sueldo anual complementario 	
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

	public void setHorasBase(int horasBase) {
		if (horasBase >= 40) {
			this.horasBase = horasBase;
		} else {
			System.out.println("ERROR : No se puede cargar menos de 40 horas base al Docente");
		}
	}

	public int getHorasExtras() {
		return horasExtras;
	}

	public void setHorasExtras(int horasExtras) {
		if (horasExtras <= 20) {
			this.horasExtras = horasExtras;
		} else {
			System.out.println("ERROR: no se puede realizar mas de 20 hs Extras por mes!");
		}

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

}
