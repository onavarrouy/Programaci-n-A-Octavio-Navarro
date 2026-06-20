package trabajito;

import java.util.Scanner;

public class SoftwareGestor {

	public static void main(String[] args) {

		Electronica electronica1 = new Electronica(0, null, 0, null, 0, 0);
		Alimentos alimentos1 = new Alimentos(0, null, 0, null, 0, 0);
		Ropa ropa1 = new Ropa(0, null, 0, null, null, null);
		Scanner sc = new Scanner(System.in);
	
		int opcion = 0;
		int opcion1 = 0;

		do {

			System.out.println("--MENU--");
			System.out.println("1- Ingrese el producto");
			System.out.println("2- Mostrar productos");
			System.out.println("3- Salir");
			opcion = sc.nextInt();

			switch (opcion) {

			case 1:
				// Ingrese productos
				System.out.println("Que es lo que deasea ingresar?");
				System.out.println("1- Alimentos");
				System.out.println("2- Ropa");
				System.out.println("3- Electronica");
				opcion1 = sc.nextInt();
				if (opcion1 == 1) {
					System.out.println("ALIMENTOS");
					System.out.println("Ingrese el id del producto");
					int IDalimento = sc.nextInt();
					sc.nextLine();
					System.out.println("Ingrese el nombre del producto");
					String nombreAlimento = sc.nextLine();
					System.out.println("Ingrese el precio del producto");
					Double precioAlimento = sc.nextDouble();
					System.out.println("Ingrese la marca del alimento");
					sc.nextLine();
					String marcaAlimento = sc.nextLine();
					System.out.println("Ingrese las calorias del alimento");
					double calorias = sc.nextDouble();
					System.out.println("Ingrese el peso del alimento");
					double peso = sc.nextDouble();
					altaAlimentos(alimentos1, nombreAlimento, IDalimento, precioAlimento, marcaAlimento, calorias, peso);
					
				} else if (opcion1 == 2) {
					System.out.println("ROPA");
					System.out.println("Ingrese el ID del producto");
					int IDropa = sc.nextInt();
					sc.nextLine();
					System.out.println("Ingrese el nombre del producto");
					String nombreRopa = sc.nextLine();
					System.out.println("Ingrese el precio de un producto");
					double precioRopa = sc.nextDouble();
					sc.nextLine();
					System.out.println("Ingrese la marca de ropa");
					String marcaRopa = sc.nextLine();
					System.out.println("Ingrese el tipo de tela");
					String tipoTela = sc.nextLine();
					System.out.println("Ingrese el talle");
					String talle = sc.nextLine();
					altaRopa(ropa1, nombreRopa, IDropa, precioRopa, marcaRopa, tipoTela, talle);
					
				} else if (opcion1 == 3) {
					System.out.println("ELECTRONICA");
					System.out.println("Ingrese el ID del producto");
					int IDelectro = sc.nextInt();
					sc.nextLine();
					System.out.println("Ingrese el nombre del producto");
					String nombreElectro = sc.nextLine();
					System.out.println("Ingrese el precio de un producto");
					double precioElectro = sc.nextDouble();
					sc.nextLine();
					System.out.println("Ingrese marca del electrodomestico");
					String marcaElec = sc.nextLine();
					System.out.println("Ingrese la potencia en vatios");
					double potenciaVatios = sc.nextDouble();
					sc.nextLine();
					System.out.println("Ingrese el maximo voltaje");
					double maximoVoltaje = sc.nextDouble();
					sc.nextLine();
				altaElectronica(electronica1, nombreElectro, IDelectro, precioElectro, marcaElec, potenciaVatios, maximoVoltaje );
				//Facundo Lagos me ayudó a solucionar el problema del buffer aplicando esto: sc.nextLine(); 
				}
				break;

			case 2:
				listado(alimentos1, ropa1, electronica1);
				break;

			}

		} while (opcion != 3);
		System.out.println("Saliendo...");
	}

	public static void altaAlimentos(Alimentos a, String nombre, int ID, double precio, String marca, double calorias,
			double peso) {

		a.setNombre(nombre);
		a.setID(ID);
		a.setPrecio(precio);
		a.setMarcaAlimento(marca);
		a.setCalorias(calorias);
		a.setPeso(peso);
	}

	public static void altaRopa(Ropa r, String nombre, int ID, double precio, String marcaRopa, String tipoTela,
			String talle) {

		r.setNombre(nombre);
		r.setID(ID);
		r.setPrecio(precio);
		r.setMarcaRopa(marcaRopa);
		r.setTipoTela(tipoTela);
		r.setTalle(talle);
	}

	public static void altaElectronica(Electronica e, String nombre, int ID, double precio, String marcaElec,
			double potenciaVatios, double maximoVoltaje) {

		e.setNombre(nombre);
		e.setID(ID);
		e.setPrecio(precio);
		e.setMarcaElec(marcaElec);
		e.setPotenciaVatios(potenciaVatios);
		e.setMaximoVoltaje(maximoVoltaje);
	}

	public static void listado(Alimentos a, Ropa r, Electronica e) {
		if (a.getNombre() != null) {
			System.out.println("Listado de Alimentos");
			System.out.println("Nombre: " + a.getNombre());
			System.out.println("ID del Producto: " + a.getID());
			System.out.println("Precio del Producto: " + a.getPrecio());
			System.out.println("Marca del alimento: " + a.getMarcaAlimento());
			System.out.println("Calorias del alimento: " + a.getCalorias());
			System.out.println("Peso: " + a.getPeso());
		} else {
			System.out.println("No se han ingresado alimentos");
		}
		if (r.getNombre() != null) {
			System.out.println("Listado de Ropa");
			System.out.println("Nombre: " + r.getNombre());
			System.out.println("ID del Producto: " + r.getID());
			System.out.println("Precio del Producto: " + r.getPrecio());
			System.out.println("Marca de la prenda: " + r.getMarcaRopa());
			System.out.println("Tipo de tela: " + r.getTipoTela());
			System.out.println("Talle de la prenda: " + r.getTalle());
		} else {
			System.out.println("No se ha ingresado ropa");
		}
		if (e.getNombre() != null) {
			System.out.println("Listado de Electronica");
			System.out.println("Nombre: " + e.getNombre());
			System.out.println("ID del Producto: " + e.getID());
			System.out.println("Precio del Producto: " + e.getPrecio());
			System.out.println("Marca del electrodomestico: " + e.getMarcaElec());
			System.out.println("Potencia vatios: " + e.getPotenciaVatios());
			System.out.println("Maximo voltaje: " + e.getMaximoVoltaje());
		} else {
			System.out.println("No se han ingresados electrodomesticos");

		}

	}
}