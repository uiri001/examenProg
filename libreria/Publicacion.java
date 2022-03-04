package libreria;

import java.util.Scanner;

public abstract class Publicacion {
	private String codigo;
	private String titulo;
	private int año;
	
	public Publicacion() {
		this.codigo = "";
		this.titulo = "";
		this.año = 0;
	}
	
	
	
	//copia
	public Publicacion(Publicacion p) {
		this.codigo = p.codigo;
		this.titulo = p.titulo;
		this.año = p.año;
	}
	//pers
	public Publicacion(String cod, String tit, int ano) {
		this.codigo = cod;
		this.titulo = tit;
		this.año = ano;
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



	public int getAño() {
		return año;
	}



	public void setAño(int año) {
		this.año = año;
	}

//-----------------------------------------------------------

	public abstract void leer(Scanner teclado);



	@Override
	public String toString() {
		return "Publicacion [codigo=" + codigo + ", titulo=" + titulo + ", año=" + año + "]";
	} 
	
	
		
	
}
