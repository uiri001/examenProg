package libreria;

import java.util.Scanner;

public class Libro extends Publicacion{

	private int numPaginas;
	
	public Libro() {
		this.numPaginas = 0;
	}
	public Libro(int numPag, String cod, String tit, int ano) {
		super(cod,tit,ano);
	}
	@Override
	public void leer(Scanner teclado) {
		
		
	}
	public String toString() {
		
		return "Libro [numPaginas=" + numPaginas + "]";
	}
}
