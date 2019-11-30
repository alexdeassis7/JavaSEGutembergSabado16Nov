package com.utn.clase3;

import javax.swing.JOptionPane;

public class Persona {
	
	/** ATRIBUTOS DE LA CLASE Persona */
	
	//Encapsulamos atributo nombre
	private String nombre;
	private long dni;
	private int edad;
	private char sexo;
	private String direccion;
	private String estadoCivil;
	private long telefono;

	// BLOQUE INICIALIZADOR

	// Este bloque de codigo sera compartido por todo los constructores
	{
		telefono = 15537407;
	}

	/**
	 * COnstructores Caracteristicas
	 *  1.Tiene el mismo nombre que la clase a la que pertenece
	 *   2.una clase puede tener varios constructores pero con distintos parametros de entrada 
	 * 3.No se puede Heredar 
	 * 4.No puede devolver ningun valor( Return ) incluyendo void
	 *  5.Debe ser Public para que pueda ser invocado desde cualquier clase del programa, salvo en casos excepcionales 
	 */

	/** SOBRECARGA DE METODOS CONSTRUCTORES */

	// CONSTRUCTOR VACIO
	public Persona() {

	}

	// CONSTRUCTOR CON 3 PARAMETROS
	public Persona(String nombre, long dni, char sexo) {
		this.nombre = nombre;
		this.dni = dni;
		this.sexo = sexo;

	}

	// CONSTRUCTOR CON todos lo atributos como parametros
	public Persona(String nombre, long dni, int edad, char sexo, String direccion, String estadoCivil) {
		this.nombre = nombre;
		this.dni = dni;
		this.edad = edad;
		this.sexo = sexo;
		this.direccion = direccion;
		this.estadoCivil = estadoCivil;

	}
	
	//SobreEscritura(Override) De Metodo ToString()
	public String toString() {
		return "Persona [nombre=" + nombre + ", dni=" + dni + ", edad=" + edad + ", sexo=" + sexo + ", direccion="
				+ direccion + ", estadoCivil=" + estadoCivil + ", telefono=" + telefono + "]";
	}

	//ENCAPSULAMIENTO : Metodos Getters and Setters
	
	//GETTERS : nos permite obtener el estado de un atributo de la clase 
	public String getNombre() 
	{
		return nombre;
	}
	//SETTERS : nos permite  controlar como se modifica el estado de un atributo de la clase 
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public long getTelefono() {
		return telefono;
	}
	
	public void setTelefono(long telefono){
		this.telefono = telefono ;
	}

	public long getDni() {
		return dni;
	}

	public void setDni(long dni) {
		this.dni = dni;
	}

	public int getEdad() {
		return edad;
	}

	//VALIDAMOS DENTRO DEL SETTERS QUE EL USUARIO NO PUEDA INGRESAR UNA EDAD NEGATIVA , EN TAL CASO 
	//MOSTRAMOS UN MENSAJE DE ERROR "ERROR : Edad Invalida"
	public void setEdad(int edad) {
	
		if(edad < 0 ) {
			
			JOptionPane.showMessageDialog(null, "ERROR : Edad Invalida");
	
		}else{ 
		
			JOptionPane.showMessageDialog(null, "Edad Modificada correctamente");
				this.edad = edad;
	
		}
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	
	
	
	
	

}
