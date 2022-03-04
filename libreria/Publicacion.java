package libreria;

import java.util.Scanner;

public abstract class Publicacion {
	private String codigo;
	private String titulo;
	private int a�o;
	
	public Publicacion() {
		this.codigo = "";
		this.titulo = "";
		this.a�o = 0;
	}
	
	
	
	//copia
	public Publicacion(Publicacion p) {
		this.codigo = p.codigo;
		this.titulo = p.titulo;
		this.a�o = p.a�o;
	}
	//pers
	public Publicacion(String cod, String tit, int ano) {
		this.codigo = cod;
		this.titulo = tit;
		this.a�o = ano;
	}
	
	//GET-SET
	
	public String getCodigo() {
		return codigo;
	}



	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}



	public String getTitulo() {
		return titulo;
	}



	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}



	public int getA�o() {
		return a�o;
	}



	public void setA�o(int a�o) {
		this.a�o = a�o;
	}

//-----------------------------------------------------------

	public abstract void leer(Scanner teclado);



	@Override
	public String toString() {
		return "Publicacion [codigo=" + codigo + ", titulo=" + titulo + ", a�o=" + a�o + "]";
	} 
	
	
		
	
}
