package libreria;

import java.util.Scanner;

public class LibreriaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean salir = false;
		int o = 0;
		Scanner teclado = new Scanner(System.in);
		ListaSocios ls = new ListaSocios();
		Socio s = new Socio();
		Catalogo c = new Catalogo();

		System.out.println("Bienvenido a la libreria virtual");
		System.out.println("---------------------------------------");
		System.out.println("Introduce tu DNI: ");
		String dni = teclado.next();

		if (!ls.esSocio(dni)) {
			System.out.println("Este DNI no se encuentra en la base de datos. Redirigiendo al menu de alta de socio...");
			ls.hacerSocio();
		} 
			// EMPIEZA EL MENU
			do {
				System.out.println("Que quieres hacer?");
				System.out.println("1. Mostrar el catalogo");
				System.out.println("2. Alquilar algo");
				System.out.println("3. Mostrar lista de socios");
				System.out.println("4. Añadir una revista o libro");
				System.out.println("5. Mostrar publis de un socio");
				System.out.println("0. Salir");
				o = teclado.nextInt();
				switch (o) {
				case 1: 
					
					for (int i = 0; i<c.getLista().size();i++) {
						c.getLista().get(i).toString();
						ls.getListaSocios().get(i).print();
					}
					break;
				case 2: 
					System.out.println("Introduce el codigo de la publi: ");
					String cod = teclado.next();
					
					break;
				case 3:
					break;
				case 4:
					break;
				case 5:
					break;
				}
			} while (!salir);
		}

	
}
