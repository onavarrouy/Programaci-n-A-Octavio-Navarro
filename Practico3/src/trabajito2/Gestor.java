package trabajito2;

import java.util.Scanner;

public class Gestor {

	public static void main(String[] args) {

		Casa arregloCasa[] = new Casa[10];
		Apartamento arregloApart[] = new Apartamento[10];

		Scanner sc = new Scanner(System.in);

		int opcion = 0;
		int opcion1 = 0;

		do {

			System.out.println("--MENU--");
			System.out.println("1- Ingrese una instancia");
			System.out.println("2- Mostrar instancia");
			System.out.println("3- Eliminar una casa");
			System.out.println("4- Eliminar un apartamento");
			System.out.println("5- Modificar instancias");
			System.out.println("6- Salir...");
			opcion = sc.nextInt();
			sc.nextLine();

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
					int nroPisos = sc.nextInt();
					sc.nextLine();
					System.out.println("Ingrese codigo postal");
					int codigoPost = sc.nextInt();
					sc.nextLine();
					altaCasa(arregloCasa, nombreCasa, nombreDireccionC, mtroCuadrados, nroPisos, codigoPost);

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
					altaApartamento(arregloApart, nombreApart, nombreDireccionA, nroApart, nroHabitaciones, nroBanios);
				}
				break;

			case 2:
				listado(arregloCasa);
				listado(arregloApart);
				break;

			case 3:
				System.out.println("Borre una casa con su nombre");
				String borrarCasa = sc.nextLine();
				bajaCasa(borrarCasa, arregloCasa);
				System.out.println("Instancia eliminada");
				break;

			case 4:
				System.out.println("Borre un apartamento con su nombre");
				String borrarApart = sc.nextLine();
				bajaApart(borrarApart, arregloApart);
				System.out.println("Instancia eliminada");
				break;

			case 5:
				System.out.println("Cual instancia desea modificar?");
				System.out.println("1 - Casa");
				System.out.println("2 - Apartamento");
				int opcion2 = sc.nextInt();
				sc.nextLine();
				if (opcion2 == 1) {
					System.out.println("Ingrese el nombre de la casa");
					String IDInstan1 = sc.nextLine();
					modifCasa(arregloCasa, IDInstan1);
				} else if (opcion2 == 2) {
					System.out.println("Ingrese el nombre del apartamento");
					String IDInstan2 = sc.nextLine();
					modifApart(arregloApart, IDInstan2);
				}
				break;

			case 6:
				System.out.println("Saliendo...");
				break;

			}

		} while (opcion != 6);
		System.out.println("Saliendo...");
	}

	public static void altaCasa(Casa[] c, String nombre, String direccion, double metrosCuadrados, int numeroPisos,
			int codigoPostal) {

		for (int i = 0; i < c.length; i++) {

			if (c[i] == null) {
				c[i] = new Casa(nombre, direccion, metrosCuadrados, numeroPisos, codigoPostal);
				System.out.println("Casa ingresada correctamente");
				break;

			}
		}
	}

	public static void altaApartamento(Apartamento[] a, String nombre, String direccion, int nroApartamento,
			int nroHabitaciones, int nroBanios) {

		for (int i = 0; i < a.length; i++) {

			if (a[i] == null) {
				a[i] = new Apartamento(nombre, direccion, nroApartamento, nroHabitaciones, nroBanios);
				System.out.println("Apartamento ingresado correctamente");
				break;
			}
		}
	}

	public static void listado(Casa[] c) {
		for (int i = 0; i < c.length; i++) {
			if (c[i] != null) {
				System.out.println("LISTADO DE CASAS");
				System.out.println("=Casa " + i + "=");
				System.out.println("Nombre: " + c[i].getNombre());
				System.out.println("Direccion: " + c[i].getDireccion());
				System.out.println("Metros cuadrados: " + c[i].getMetrosCuadrados());
				System.out.println("Nro de pisos: " + c[i].getNumeroPisos());
				System.out.println("Codigo postal: " + c[i].getCodigoPostal());

			}
		}

	}

	public static void listado(Apartamento[] a) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] != null) {
				System.out.println("LISTADO DE APARTAMENTOS");
				System.out.println("=Apartamento " + i + "=");
				System.out.println("Nombre: " + a[i].getNombre());
				System.out.println("Direccion: " + a[i].getDireccion());
				System.out.println("Nro apartamento: " + a[i].getNroApartamento());
				System.out.println("Nro habitaciones: " + a[i].getNroHabitaciones());
				System.out.println("Nro banios: " + a[i].getNroBanios());

			}
		}
	}

	public static void bajaCasa(String borrarCasa, Casa[] c) {

		for (int i = 0; i < c.length; i++) {
			if (c[i] != null && c[i].getNombre().equalsIgnoreCase(borrarCasa)) {
				c[i] = null;
				System.out.println("Casa eliminada");
				break;
			}
		}
	}

	public static void bajaApart(String borrarApart, Apartamento[] a) {

		for (int i = 0; i < a.length; i++) {
			if (a[i] != null && a[i].getNombre().equalsIgnoreCase(borrarApart)) {
				a[i] = null;
				System.out.println("Apartamento eliminado correctamente");
				break;
			}
		}
	}

	public static void modifCasa(Casa[] c, String IDInstan1) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < c.length; i++) {
			if (c[i] != null && c[i].getNombre().equals(IDInstan1)) {
				int o = 0;
				System.out.println("Seleccione el atributo que desee modificar: ");
				System.out.println("1- Nombre");
				System.out.println("2- Direccion ");
				System.out.println("3- Metros cuadrados ");
				System.out.println("4- Nro de pisos ");
				System.out.println("5- Codigo postal ");
				o = sc.nextInt();
				sc.nextLine();
				if (o == 1) {
					System.out.println("Ingrese un nuevo nombre");
					String nombre = sc.nextLine();
					c[i].setNombre(nombre);
					System.out.println("Nombre modificado...");
					break;
				} else if (o == 2) {
					System.out.println("Ingrese una nueva direccion");
					String direccion = sc.nextLine();
					c[i].setDireccion(direccion);
					System.out.println("Direccion modificada...");
					break;
				} else if (o == 3) {
					System.out.println("Ingrese nuevos metros cuadrados ");
					double metrosCuadrados = sc.nextDouble();
					sc.nextLine();
					c[i].setMetrosCuadrados(metrosCuadrados);
					System.out.println("Metros cuadrados modificados...");
					break;
				} else if (o == 4) {
					System.out.println("Ingrese el nuevo nro de pisos");
					int nroPisos = sc.nextInt();
					c[i].setNumeroPisos(nroPisos);
					System.out.println("Nro de pisos modificados...");
					break;
				} else if (o == 5) {
					System.out.println("Ingrese el nuevo codigo postal");
					int codigoPostal = sc.nextInt();
					sc.nextLine();
					c[i].setCodigoPostal(codigoPostal);
					System.out.println("Codigo postal modificiado...");
					break;
				}
			}
		}
	}

	public static void modifApart(Apartamento[] a, String IDInstan2) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			if (a[i] != null && a[i].getNombre().equals(IDInstan2)) {
				int o = 0;
				System.out.println("Seleccione el atributo que desee modificar: ");
				System.out.println("1- Nombre");
				System.out.println("2- Direccion ");
				System.out.println("3- Nro apartamento ");
				System.out.println("4- Nro habitaciones ");
				System.out.println("5- Nro banios ");
				o = sc.nextInt();
				sc.nextLine();
				if (o == 1) {
					System.out.println("Ingrese un nuevo nombre");
					String nombre = sc.nextLine();
					a[i].setNombre(nombre);
					System.out.println("Nombre modificado...");
					break;
				} else if (o == 2) {
					System.out.println("Ingrese una nueva direccion");
					String direccion = sc.nextLine();
					a[i].setDireccion(direccion);
					System.out.println("Direccion modificada...");
					break;
				} else if (o == 3) {
					System.out.println("Ingrese nuevo nro de apartamento ");
					int nroApartamento = sc.nextInt();
					sc.nextLine();
					a[i].setNroApartamento(nroApartamento);
					System.out.println("Nro de apartamento modificado...");
					break;
				} else if (o == 4) {
					System.out.println("Ingrese el nuevo nro de habitaciones");
					int nroHabitaciones = sc.nextInt();
					a[i].setNroHabitaciones(nroHabitaciones);
					System.out.println("Nro de habitaciones modificados...");
					break;
				} else if (o == 5) {
					System.out.println("Ingrese el nuevo nro de baños");
					int nroBanios = sc.nextInt();
					sc.nextLine();
					a[i].setNroBanios(nroBanios);
					System.out.println("Nro de banios modificiado...");
					break;
				}
			}
		}
	}
}