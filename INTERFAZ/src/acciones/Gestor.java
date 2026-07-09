package acciones;

import java.util.Scanner;

public class Gestor {

	public static void main(String[] args) {
		Dino dinosaurio1 = new Dino("Mirta");
		Perro perro1 = new Perro("Guille");
		Scanner sc = new Scanner(System.in);

		int opcion = 0;
		int opcion1 = 0;

		do {

			System.out.println("=MENU=");
			System.out.println("1- Dar de comer al Dino/Perro");
			System.out.println("2- Dormir al Dino/Perro");
			System.out.println("3- Salir");
			opcion = sc.nextInt();

			switch (opcion) {

			case 1:
				int alimentar;
				System.out.println("Qué animal quiere alimentar?");
				System.out.println("1- Perro");
				System.out.println("2- Dino");
				alimentar = sc.nextInt();

				if (alimentar == 1) {
					perro1.comer();

				}
				if (alimentar == 2) {
					dinosaurio1.comer();

					break;
				}

			case 2:
				int dormir;
				System.out.println("Qué animal va a dormir");
				System.out.println("1- Perro");
				System.out.println("2- Dino");
				dormir = sc.nextInt();

				if (dormir == 1) {
					perro1.dormir();

				}
				if (dormir == 2) {
					dinosaurio1.dormir();

					break;
				}
			}

		} while (opcion != 3);
		System.out.println("Saliendo...");
	}
}
