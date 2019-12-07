package demo;

public class DocenteDeSecundaria {

	private String Nombre;
	private String Apellido;
	private int antigüedad;
	private int edad;
	private String especialización;// (acá se alojara la materia que dicta el docente),
	private int dni;
	private int legajo;
	private int horasBase;
	private int horasExtras;
	private double sueldo;
	private String fechaDeNacimiento;

	public int getEdad() {
		return edad;
	}

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

	public int getAntigüedad() {
		return antigüedad;
	}

	public void setAntigüedad(int antigüedad) {
		this.antigüedad = antigüedad;
	}

	public String getEspecialización() {
		return especialización;
	}

	public void setEspecialización(String especialización) {
		this.especialización = especialización;
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
		this.horasBase = horasBase;
	}

	public int getHorasExtras() {
		return horasExtras;
	}

	public void setHorasExtras(int horasExtras) {
		this.horasExtras = horasExtras;
	}

	public double getSueldo() {
		return sueldo;
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

	// METODO TO STRING ME RETORNA EL ESTADO DE TODOS LOS ATRIBUTOS DE LA CLASE .
	public String toString() {

		return "DocenteDeSecundaria [Nombre=" + Nombre + ", Apellido=" + Apellido + ", antigüedad=" + antigüedad
				+ ", edad=" + edad + ", especialización=" + especialización + ", dni=" + dni + ", legajo=" + legajo
				+ ", horasBase=" + horasBase + ", horasExtras=" + horasExtras + ", sueldo=" + sueldo
				+ ", fechaDeNacimiento=" + fechaDeNacimiento + "]";
	}

}
