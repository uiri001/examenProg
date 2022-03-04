package libreria;

import java.util.ArrayList;
import java.util.Scanner;

public class Socio {
	private String dni;
	private String nombre;
	private String apellido;
	private int edad;
	private ArrayList<Publicacion> aPublicacion;
	
	
	public Socio () {
		this.dni = "";
		this.nombre = "";
		this.apellido = "";
		this.edad = 0;
		
	}
	
	public Socio(String dni, String n, String a, int edad) {
		this.dni = dni;
		this.nombre = n;
		this.apellido = a;
		this.edad = edad;
	}
	public void leer(Scanner teclado) {
		
		boolean error = false;
		
		do {
			
		error = false;
		System.out.println("Introduce la edad:");
		String c = teclado.next();
		try {
			edad = Integer.parseInt(c);

		} catch (NumberFormatException nfe) {
			
			System.out.println("Error, no has introducido un num");
			error = true;
		}
		} while (error);
	}
	
	public void añadirPublicacion(Publicacion p) {
		aPublicacion.add(p);
		
	}


	public void print() {
		 System.out.println("Socio [dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + "]");
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
}
