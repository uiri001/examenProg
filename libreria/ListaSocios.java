package libreria;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaSocios {
	 ArrayList<Socio> listaSocios = new ArrayList<>();
	
	public ListaSocios() {
		
	}
	public void fillData() {
		//meter datos
		Socio s1 = new Socio("356236", "Paco","Porras",111);
		Socio s2 = new Socio("12434343", "Pantxike","Palu",111);
		Socio s3 = new Socio("2456876", "Pedro","Picapiedra",111);
		Socio s4 = new Socio("4344353", "Santiago","Abascal",111);
		Socio s5 = new Socio("4564523", "Vladimir","Zelenski",111);
		listaSocios.add(s1);
		listaSocios.add(s2);
		listaSocios.add(s3);
		listaSocios.add(s4);
		listaSocios.add(s5);
		
	}
	
	public boolean esSocio(String dni) {
		boolean esSocio = false;
		Socio s = new Socio();
		
		for (int i = 0;i<listaSocios.size(); i++) {
			if (listaSocios.get(i).toString().equals(dni)) {
				esSocio = true;
			} else {
				esSocio = false;
			}
		}
		return esSocio;
	}
	
	public void hacerSocio() {
		Scanner teclado = new Scanner(System.in);
		Socio s = new Socio();
		System.out.println("Introduce tu DNI");
		String dni = teclado.next();
		System.out.println("Introduce el nombre: ");
		String nombre = teclado.next();
		System.out.println("Introduce el apellido");
		String apellido = teclado.next();
		s.leer(teclado);
		
		Socio s1 = new Socio(dni,nombre,apellido,s.getEdad());
		System.out.println("DATOS GUARDADOS");
	}
	
	public int posicionSocio(String dni) {
		boolean encontrado = false;
		int pos = 0;
		for (int i = 0; i< listaSocios.size();i++) {
			if (dni.equalsIgnoreCase(listaSocios.get(i).getDni())) {
				encontrado = true;
				pos = listaSocios.indexOf(dni);
			} else {
				encontrado = false;
			}	
		}
		return pos;
	}

	public ArrayList<Socio> getListaSocios() {
		return listaSocios;
	}

	
	
}
