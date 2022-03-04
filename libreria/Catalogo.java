package libreria;

import java.util.ArrayList;

public class Catalogo {
	ArrayList<Publicacion> lista = new ArrayList<>();
	public ArrayList<Publicacion> getLista(){
		return lista;
	}
	public void fillData() {

		Libro l1 = new Libro(123,"1","Marina",2001);
		Libro l2 = new Libro(123,"2","Bajo la misma estrella",2001);
		Libro l3 = new Libro(123,"3","La hoz del comunismo",2001);

		Revista r1 = new Revista(1,"123","Hola",2014);
		Revista r2 = new Revista(1,"123","Pronto",2014);
		Revista r3 = new Revista(1,"123","ForoCoches",2014);
	}
	
	public int posicionPublicacion(String cod) {
		boolean encontrado = false;
		int pos = 0;
		for (int i = 0; i< lista.size();i++) {
			if (cod.equalsIgnoreCase(lista.get(i).getCodigo())) {
				encontrado = true;
				pos = lista.indexOf(cod);
			} else {
				encontrado = false;
			}	
		}
		return pos;
	}
}
