package ifs;

import java.util.Scanner;

public class Bandera2 {

	public Bandera2 (String string) {
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.print("Introduce un número del 0 al 9: ");

		int numero = in.nextInt();
		String respuesta = "";
		if (numero >= 0 && numero <= 9) {
			if (numero < 4) {
				respuesta = "Azul";
			} else if (numero < 6) {
				respuesta = "Blanco";
			} else {
				respuesta = "Rojo";
			}
			System.out.println("El color es " + respuesta);
		} else {
			System.out.println("El número no es correcto");
		}
	}
}