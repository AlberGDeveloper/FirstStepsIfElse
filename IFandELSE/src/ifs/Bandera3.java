package ifs;

import java.util.Scanner;

public class Bandera3 {

	public static void main(String[] args) {

		Scanner x = new Scanner(System.in);

		System.out.print("Introduce un numero del 1 al 9 para X: ");

		int valorx = x.nextInt();

		Scanner y = new Scanner(System.in);

		System.out.print("Introduce un numero del 1 al 9 para Y: ");

		int valory = y.nextInt();

		String respuesta = "";

		if (valorx <= 3 && valorx > 0)

			respuesta = "Blanco";

		else if (valorx >= 4 && valorx <= 6)

			respuesta = "Blanco";

		else if (valorx >= 7 && valorx <= 9)

			respuesta = "Blanco";

		if (valory <= 3 && valory > 0)

			respuesta = "Blanco";

		else if (valory >= 4 && valory <= 6)

			respuesta = "Azul";

		else if (valory >= 7 && valory <= 9)

			respuesta = "Blanco";

		else

			respuesta = "El número no es correcto";

		System.out.println("El color es " + respuesta);

	}

}