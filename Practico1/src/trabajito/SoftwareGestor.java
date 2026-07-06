package trabajito;

import java.util.Scanner;

public class SoftwareGestor {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Electronica arregloElec[] = new Electronica[10];
		Alimentos arregloAlimen[] = new Alimentos[10];
		Ropa arregloRopa[] = new Ropa[10];

		int opcion = 0;
		int opcion1 = 0;
		

		do {

			System.out.println("--MENU--");
			System.out.println("1- Ingrese el producto");
			System.out.println("2- Mostrar productos");
			System.out.println("3- Eliminar un alimento");
			System.out.println("4- Eliminar una prenda de ropa");
			System.out.println("5- Eliminar un electronico");
			System.out.println("6- Modificar instancias");
			System.out.println("7- Salir...");
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
					altaAlimentos(arregloAlimen, nombreAlimento, IDalimento, precioAlimento, marcaAlimento, calorias,
							peso);

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
					altaRopa(arregloRopa, nombreRopa, IDropa, precioRopa, marcaRopa, tipoTela, talle);

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
					altaElectronica(arregloElec, nombreElectro, IDelectro, precioElectro, marcaElec, potenciaVatios,
							maximoVoltaje);

				}
				break;

			case 2:
				listado(arregloAlimen);
                listado(arregloRopa);
                listado(arregloElec);
                break;

			case 3:
				System.out.println("Borre un alimento con su ID");
				int borrarIDalimen = sc.nextInt();
				bajaAlimen(borrarIDalimen, arregloAlimen);
				System.out.println("Alimento eliminado");
				break;

			case 4:
				System.out.print("Borre una prenda con su ID: ");
				int borrarIDropa = sc.nextInt();
				bajaRopa(borrarIDropa, arregloRopa);
				
				break;

			case 5:
				System.out.print("Borre un electrodomestico con su ID: ");
				int borrarIDelec = sc.nextInt();
				bajaElec(borrarIDelec, arregloElec);
		
				break;

			case 6: 
				System.out.println("Que producto desea modificar?: ");
				System.out.println("1- Alimento");
				System.out.println("2- Ropa");
				System.out.println("3- Electronica");
				int opcion3 = sc.nextInt();
				sc.nextLine();
				if (opcion3 == 1) {
				System.out.println("Ingrese el ID del alimento: ");
				int ID1 = sc.nextInt();
				modifAlimento(arregloAlimen, ID1);
				} else if (opcion3 == 2) {
				System.out.println("Ingrese el ID de la prenda");
				int ID2 = sc.nextInt();
				modifRopa(arregloRopa, ID2);
				} else if (opcion3 == 3) {
				System.out.println("Ingrese el ID del electrodomestico");
				int ID3 = sc.nextInt();
				modifElec(arregloElec, ID3);
					}
				break;
				
				
				
				
			case 7:
				System.out.println("Saliendo...");
				break;
			}

		} while (opcion != 7);
		System.out.println("Saliendo...");
	}

	public static void altaAlimentos(Alimentos[] a, String nombre, int IDAlimen, double precio, String marca,
			double calorias, double peso) {

		for (int i = 0; i < a.length; i++) {

			if (a[i] == null) {
				a[i] = new Alimentos(IDAlimen, nombre, precio, marca, calorias, peso);
				System.out.println("Alimento ingresado correctamente");
				break;
			}
		}
	}

	public static void altaRopa(Ropa[] r, String nombre, int ID, double precio, String marcaRopa, String tipoTela,
			String talle) {

		for (int i = 0; i < r.length; i++) {

			if (r[i] == null) {
				r[i] = new Ropa(ID, nombre, precio, marcaRopa, tipoTela, talle);
				System.out.println("Ropa ingresada correctamente");
				break;

			}

		}

	}

	public static void altaElectronica(Electronica[] e, String nombre, int ID, double precio, String marcaElec,
			double potenciaVatios, double maximoVoltaje) {

		for (int i = 0; i < e.length; i++) {

			if (e[i] == null) {
				e[i] = new Electronica(ID, nombre, precio, marcaElec, potenciaVatios, maximoVoltaje);
				System.out.println("Electronico ingresado correctamente");
				break;
			}
		}

	}

	public static void listado(Alimentos[] a) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] != null) {
				System.out.println("LISTADO DE ALIMENTOS");
				System.out.println("=Alimento " + i + "=");
				System.out.println("ID: " + a[i].getID());
				System.out.println("Nombre: " + a[i].getNombre());
				System.out.println("Precio: " + a[i].getPrecio());
				System.out.println("Marca del alimento: " + a[i].getMarcaAlimento());
				System.out.println("Calorias: " + a[i].getCalorias());
				System.out.println("Peso: " + a[i].getPeso());

			}
		}

	}

	public static void listado(Ropa[] r) {
		for (int i = 0; i < r.length; i++) {
			if (r[i] != null) {
				System.out.println("LISTADO DE ROPA");
				System.out.println("=Ropa " + i + "=");
				System.out.println("ID: " + r[i].getID());
				System.out.println("Nombre: " + r[i].getNombre());
				System.out.println("Precio: " + r[i].getPrecio());
				System.out.println("Marca de ropa: " + r[i].getMarcaRopa());
				System.out.println("Tipo de tela: " + r[i].getTipoTela());
				System.out.println("Talle: " + r[i].getTalle());

			}
		}
	}

	public static void listado(Electronica[] e) {
		for (int i = 0; i < e.length; i++) {
			if (e[i] != null) {
				System.out.println("LISTADO ELECTRONICA");
				System.out.println("=Eletronico " + i + "=");
				System.out.println("ID: " + e[i].getID());
				System.out.println("Nombre: " + e[i].getNombre());
				System.out.println("Precio: " + e[i].getPrecio());
				System.out.println("Marca del electronico: " + e[i].getMarcaElec());
				System.out.println("Potencia Vatios: " + e[i].getPotenciaVatios());
				System.out.println("Maximo voltaje: " + e[i].getMaximoVoltaje());
			}
		}
	}

	public static void bajaAlimen(int bajaIDal, Alimentos[] a) {

		for (int i = 0; i < a.length; i++) {
			if (a[i].getID() == bajaIDal) {
				a[i] = null;
				System.out.println("Alimento eliminado");
				break;
			}
		}
	}

	public static void bajaRopa(int bajaIDropa, Ropa[] r) {

		for (int i = 0; i < r.length; i++) {
			if (r[i].getID() == bajaIDropa) {
				r[i] = null;
				System.out.println("Ropa eliminada");
				break;
			}
		}

	}

	public static void bajaElec(int bajaIDelec, Electronica[] e) {

		for (int i = 0; i < e.length; i++) {
			if (e[i].getID() == bajaIDelec) {
				e[i] = null;
				System.out.println("Electronico eliminado");
				break;
			}
		}
	}

	public static void modifAlimento(Alimentos[] a, int cod2) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			if (a[i] != null && a[i].getID() == cod2) {
				int o = 0;
				System.out.println("Seleccione el atributo que desee modificar: ");
				System.out.println("1- ID");
				System.out.println("2- Nombre ");
				System.out.println("3- Precio ");
				System.out.println("4- Marca del alimento ");
				System.out.println("5- calorias ");
				System.out.println("6- peso ");
				o = sc.nextInt();
				sc.nextLine();
				if (o == 1) {
					System.out.println("Ingrese un nuevo ID");
					int ID = sc.nextInt();
					a[i].setID(ID);
					System.out.println("ID modificado...");
					break;
				} else if (o == 2) {
					System.out.println("Ingrese un nuevo nombre");
					String nombre = sc.nextLine();
					a[i].setNombre(nombre);
					System.out.println("Nombre modificado...");
					break;
				} else if (o == 3) {
					System.out.println("Ingrese nuevo precio ");
					double precio = sc.nextDouble();
					sc.nextLine();
					a[i].setPrecio(precio);
					System.out.println("Precio cambiado...");
					break;
				} else if (o == 4) {
					System.out.println("Ingrese la nueva marca del alimento");
					String marcaAlimento = sc.nextLine();
					a[i].setMarcaAlimento(marcaAlimento);
					System.out.println("Marca del alimento modificada...");
					break;
				} else if (o == 5) {
					System.out.println("Ingrese las nuevas calorias del alimento");
					double calorias = sc.nextDouble();
					sc.nextLine();
					a[i].setCalorias(calorias);
					System.out.println("Calorias modificadas...");
					break;
				} else if (o == 6) {
					System.out.println("Ingrese el nuevo peso ");
					double peso = sc.nextDouble();
					sc.nextLine();
					a[i].setPeso(peso);
					System.out.println("Peso modoficado...");
					break;

				}

			}
		}

	}

	public static void modifRopa(Ropa[] r, int cod2) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < r.length; i++) {
			if (r[i] != null && r[i].getID() == cod2) {
				int o = 0;
				System.out.println("Seleccione el atributo que desee modificar: ");
				System.out.println("1- ID");
				System.out.println("2- Nombre ");
				System.out.println("3- Precio ");
				System.out.println("4- Marca de ropa ");
				System.out.println("5- tipo de tela ");
				System.out.println("6- talle ");
				o = sc.nextInt();
				sc.nextLine();
				if (o == 1) {
					System.out.println("Ingrese un nuevo ID");
					int ID = sc.nextInt();
					r[i].setID(ID);
					;
					System.out.println("ID modificado...");
					break;
				} else if (o == 2) {
					System.out.println("Ingrese un nuevo nombre");
					String nombre = sc.nextLine();
					r[i].setNombre(nombre);
					System.out.println("Nombre modificado...");
					break;
				} else if (o == 3) {
					System.out.println("Ingrese nuevo precio ");
					double precio = sc.nextDouble();
					sc.nextLine();
					r[i].setPrecio(precio);
					System.out.println("Precio cambiado...");
					break;
				} else if (o == 4) {
					System.out.println("Ingrese la nueva marca de ropa");
					String marcaRopa = sc.nextLine();
					r[i].setMarcaRopa(marcaRopa);
					System.out.println("Marca de ropa modificada...");
					break;
			   } else if (o == 5) {
					System.out.println("Ingrese el nuevo tipo de tela");
					String tipoTela = sc.nextLine();
					r[i].setTipoTela(tipoTela);
					System.out.println("Tipo de tela modificada...");
					break;
			   } else if (o == 6) {
					System.out.println("Ingrese el nuevo talle");
					String talle = sc.nextLine();
					r[i].setTalle(talle);
					System.out.println("El talle ha sido modificado...");
					break;
				}
			}
		}
	}
	
	public static void modifElec(Electronica[] e, int cod2) {
		Scanner sc = new Scanner (System.in);
		for (int i = 0; i < e.length; i++) {
			if (e[i] != null && e[i].getID() == cod2) {
				int o = 0;
				System.out.println("Seleccione el atributo que desee modificar: ");
				System.out.println("1- ID");
				System.out.println("2- Nombre ");
				System.out.println("3- Precio ");
				System.out.println("4- Marca electronica ");
				System.out.println("5- Potencia vatios ");
				System.out.println("6- Maximo voltaje ");
				o = sc.nextInt();
				sc.nextLine();
				if (o == 1) {
					System.out.println("Ingrese un nuevo ID");
					int ID = sc.nextInt();
					e[i].setID(ID);;
					System.out.println("ID modificado...");
					break;
				} else if (o == 2) {
					System.out.println("Ingrese un nuevo nombre");
					String nombre = sc.nextLine();
					e[i].setNombre(nombre);
					System.out.println("Nombre modificado...");
					break;
				} else if (o == 3) {
					System.out.println("Ingrese nuevo precio ");
					double precio = sc.nextDouble();
					sc.nextLine();
					e[i].setPrecio(precio);
					System.out.println("Precio cambiado...");
					break;	
				} else if (o == 4) {
					System.out.println("Ingrese la nueva marca de Electronica");
					String marcaElec = sc.nextLine();
					e[i].setMarcaElec(marcaElec);
					System.out.println("La marca de electronica ha sido modificada...");
					break;
				} else if (o == 5) {
					System.out.println("Ingrese la nueva potencia de vatios");
					double potenciaVatios = sc.nextDouble();
					e[i].setPotenciaVatios(potenciaVatios);
					System.out.println("La potencia de los Vatios ha sido modificada..");
					break;
				} else if (o == 6) {
					System.out.println("Ingrse el nuevo maximo voltaje");
					double maximoVoltaje = sc.nextDouble();
					sc.nextLine();
					e[i].setMaximoVoltaje(maximoVoltaje);
					System.out.println("El maximo voltaje ha sido modificado...");
					break;
				}
			}
		}
	}
}

//Para el case 6 recurrí a la ayuda de un compañero, Facundo Lagos, para que me explicara como se hacía la opcion modificar, ya que yo esa semana falté.