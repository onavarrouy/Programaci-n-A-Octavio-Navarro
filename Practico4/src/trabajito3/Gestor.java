package trabajito3;

import java.util.Scanner;

public class Gestor {

	public static void main(String[] args) {

		Pintura pintura1 = new Pintura(null, null, null, null, null, false);
		Escultura escultura1 = new Escultura(null, null, null, null, null, 0);
		Fotografia fotografia1 = new Fotografia(null, null, null, null, null, null);
		Scanner sc = new Scanner(System.in);

		int opcion = 0;
		int opcion1 = 0;

		do {

			System.out.println("--MENU--");
			System.out.println("1- Ingrese la Obra");
			System.out.println("2- Mostrar Obras");
			System.out.println("3- Salir");
			opcion = sc.nextInt();

			switch (opcion) {

			case 1:

				System.out.println("Que Obra desea ingresar?");
				System.out.println("1- Pintura");
				System.out.println("2- Escultura");
				System.out.println("3- Fotografia");
				opcion1 = sc.nextInt();
				if (opcion1 == 1) {
					sc.nextLine();
					System.out.println("PINTURA");
					System.out.println("Ingrese el autor");
					String autorP = sc.nextLine();
					System.out.println("Ingrese el estilo de la Obra");
					String estiloP = sc.nextLine();
					System.out.println("Ingrese el nombre de la Obra");
					String nombreP = sc.nextLine();
					System.out.println("Ingrese el movimiento artistico");
					String movimientoArt = sc.nextLine();
					System.out.println("Ingrese la ubicacion de la pintura");
					String ubiPintura = sc.nextLine();
					System.out.println("La pintura esta en exhibicion?");
					System.out.println("Responda solo con SI/NO");
					boolean enExhibicion = false;
					String exhibicionR = sc.nextLine();
					if (exhibicionR.equalsIgnoreCase("no")) {
						enExhibicion = false;
					}
					altaPintura(pintura1, autorP, estiloP, nombreP, movimientoArt, ubiPintura, enExhibicion);

				} else if (opcion1 == 2) {
					sc.nextLine();
					System.out.println("ESCULTURA");
					System.out.println("Ingrese el autor");
					String autorE = sc.nextLine();
					System.out.println("Ingrese el estilo de la Obra");
					String estiloE = sc.nextLine();
					System.out.println("Ingrese el nombre de la Obra");
					String nombreE = sc.nextLine();
					System.out.println("Ingrese el tipo de Material");
					String tipoMat = sc.nextLine();
					System.out.println("Ingrese la ubicacion de la Escultura");
					String ubiEscultura = sc.nextLine();
					System.out.println("Ingrese el peso de la escultura");
					int pesoEscultura = sc.nextInt();
					sc.nextLine();
					altaEscultura(escultura1, autorE, estiloE, nombreE, tipoMat, ubiEscultura, pesoEscultura);

				} else if (opcion1 == 3) {
					sc.nextLine();
					System.out.println("FOTOGRAFIA");
					System.out.println("Ingrese el autor");
					String autorF = sc.nextLine();
					System.out.println("Ingrese el estilo de la Obra");
					String estiloF = sc.nextLine();
					System.out.println("Ingrese el nombre de la Obra");
					String nombreF = sc.nextLine();
					System.out.println("Ingrese el ID de la foto");
					String idFoto = sc.nextLine();
					System.out.println("Ingrese el tipo de camara");
					String tipoCam = sc.nextLine();
					System.out.println("Ingrese el tipo de lente");
					String tipoLen = sc.nextLine();
					altaFotografia(fotografia1, autorF, estiloF, nombreF, idFoto, tipoCam, tipoLen);
				}
				break;

			case 2:
				listado(pintura1, escultura1, fotografia1);
				break;

			}

		} while (opcion != 3);
		System.out.println("Saliendo...");
	}

	public static void altaPintura(Pintura p, String autor, String estilo, String nombre, String movimientoArtistico,
			String ubicacionPintura, boolean enExhibicion) {

		p.setAutor(autor);
		p.setEstilo(estilo);
		p.setNombre(nombre);
		p.setMovimientoArtistico(movimientoArtistico);
		p.setUbicacionPintura(ubicacionPintura);
		p.setEnExhibicion(enExhibicion);
	}

	public static void altaEscultura(Escultura e, String autor, String estilo, String nombre, String tipoMaterial,
			String ubicacionEscultura, double peso) {

		e.setAutor(autor);
		e.setEstilo(estilo);
		e.setNombre(nombre);
		e.setTipoMaterial(tipoMaterial);
		e.setUbicacionEscultura(ubicacionEscultura);
		e.setPeso(peso);
	}

	public static void altaFotografia(Fotografia f, String autor, String estilo, String nombre, String idFoto,
			String tipoCamara, String tipoLente) {

		f.setAutor(tipoLente);
		f.setEstilo(estilo);
		f.setNombre(nombre);
		f.setIdFoto(idFoto);
		f.setTipoCamara(tipoCamara);
		f.setTipoLente(tipoLente);

	}

	public static void listado(Pintura p, Escultura e, Fotografia f) {
		if (p.getNombre() != null) {
			System.out.println("Listado de Pinturas");
			System.out.println("Autor: " + p.getAutor());
			System.out.println("Estilo: " + p.getEstilo());
			System.out.println("Nombre: " + p.getNombre());
			System.out.println("Movimiento artistico: " + p.getMovimientoArtistico());
			System.out.println("Ubicacion de la pintura: " + p.getUbicacionPintura());
			System.out.println("Esta exhibicion?: " + p.getEnExhibicion());
		} else {
			System.out.println("No se han ingresado pinturas");
		}
		if (e.getNombre() != null) {
			System.out.println("Listado de Esculturas");
			System.out.println("Autor: " + e.getAutor());
			System.out.println("Estilo: " + e.getEstilo());
			System.out.println("Nombre: " + e.getNombre());
			System.out.println("Tipo de material: " + e.getTipoMaterial());
			System.out.println("Ubicacion de la escultura: " + e.getUbicacionEscultura());
			System.out.println("Peso: " + e.getPeso());
		} else {
			System.out.println("No se han ingresado esculturas");
		}
		if (f.getNombre() != null) {
			System.out.println("Listado de Fotografias");
			System.out.println("Autor: " + f.getAutor());
			System.out.println("Estilo: " + f.getEstilo());
			System.out.println("Nombre: " + f.getNombre());
			System.out.println("ID foto: " + f.getIdFoto());
			System.out.println("tipo de camara: " + f.getTipoCamara());
			System.out.println("tipo de lente: " + f.getTipoLente());
		} else {
			System.out.println("No se han ingresado fotografias");

		}

	}
}
