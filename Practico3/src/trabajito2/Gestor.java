package trabajito2;

import java.util.Scanner;

public class Gestor {

	public static void main(String[] args) {

		Casa casa1 = new Casa(null, null, 0, 0, 0);
		Apartamento apartamento1 = new Apartamento(null, null, 0, 0, 0);
		Scanner sc = new Scanner(System.in);

		int opcion = 0;
		int opcion1 = 0;

		do {

			System.out.println("--MENU--");
			System.out.println("1- Ingrese una instancia");
			System.out.println("2- Mostrar instancia");
			System.out.println("3- Salir");
			opcion = sc.nextInt();

			switch (opcion) {

			case 1:

				System.out.println("Que instancia deseas ingresar?");
				System.out.println("1- Casa ");
				System.out.println("2- Apartamento ");
				opcion1 = sc.nextInt();
				if (opcion1 == 1) {
					sc.nextLine();
					System.out.println("Casa");
					System.out.println("Ingrese el nombre de la instancia");
					String nombreCasa = sc.nextLine();
					System.out.println("Ingrese el nombre de la direccion");
					String nombreDireccionC = sc.nextLine();
					System.out.println("Ingese los metros cuadrados");
					Double mtroCuadrados = sc.nextDouble();
					System.out.println("Ingrese nro de pisos");
					sc.nextLine();
					int nroPisos = sc.nextInt();
					System.out.println("Ingrese codigo postal");
					int codigoPost = sc.nextInt();
					sc.nextLine();
					altaCasa(casa1, nombreCasa, nombreDireccionC, mtroCuadrados, nroPisos, codigoPost);

				} else if (opcion1 == 2) {
					sc.nextLine();
					System.out.println("Apartamento");
					System.out.println("Ingrese el nombre de la instanca");
					String nombreApart = sc.nextLine();
					System.out.println("Ingrese el nombre de la direccion");
					String nombreDireccionA = sc.nextLine();
					System.out.println("Ingrese el nro de apartamentos");
					int nroApart = sc.nextInt();
					sc.nextLine();
					System.out.println("Ingrese el nro de habitaciones");
					int nroHabitaciones = sc.nextInt();
					sc.nextLine();
					System.out.println("Ingrese el nro de Baños");
					int nroBanios = sc.nextInt();
					sc.nextLine();
					altaApartamento(apartamento1, nombreApart, nombreDireccionA, nroApart, nroHabitaciones, nroBanios);
				}
				break;

			case 2:
				listado(casa1, apartamento1);
				break;

			}

		} while (opcion != 3);
		System.out.println("Saliendo...");
	}

	public static void altaCasa(Casa c, String nombre, String direccion, double metrosCuadrados, int numeroPisos,
			int codigoPostal) {

		c.setNombre(nombre);
		c.setDireccion(direccion);
		c.setMetrosCuadrados(metrosCuadrados);
		c.setNumeroPisos(numeroPisos);
		c.setCodigoPostal(codigoPostal);
	}

	public static void altaApartamento(Apartamento a, String nombre, String direccion, int nroApartamentos,
			int nroHabitaciones, int nroBanios) {

		a.setNombre(nombre);
		a.setDireccion(direccion);
		a.setNroApartamento(nroApartamentos);
		a.setNroHabitaciones(nroHabitaciones);
		a.setNroBanios(nroBanios);
	}

	public static void listado(Casa c, Apartamento a) {
		if (c.getNombre() != null) {
			System.out.println("Listado de casas");
			System.out.println("Nombre: " + c.getNombre());
			System.out.println("Direccion: " + c.getDireccion());
			System.out.println("Metros cuadrados: " + c.getMetrosCuadrados());
			System.out.println("Nro de pisos: " + c.getNumeroPisos());
			System.out.println("Codigo postal: " + c.getCodigoPostal());
		} else {
			System.out.println("No se han ingresado casas");
		}
		if (a.getNombre() != null) {
			System.out.println("Listado de Apartamentos");
			System.out.println("Nombre: " + a.getNombre());
			System.out.println("Direccion: " + a.getDireccion());
			System.out.println("Numero apartamentos: " + a.getNroApartamento());
			System.out.println("Numero habitaciones: " + a.getNroHabitaciones());
			System.out.println("Numero baños: " + a.getNroBanios());
		} else {
			System.out.println("No se ingresaron apartamentos");
		}

	}

}
