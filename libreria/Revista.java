package libreria;

import java.util.Scanner;

public class Revista extends Publicacion{
	private int numero;
	
	public Revista() {
		this.numero = 0;
	}

	public Revista(int num, String cod, String titulo, int a�o) {
		super(cod, titulo, a�o);
		this.numero = num;
	}
	@Override
	public void leer(Scanner teclado) {
		
		
	}

	@Override
	public String toString() {
		return "Revista [numero=" + numero + "]";
	}
	
	
}
