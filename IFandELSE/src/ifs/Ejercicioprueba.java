package ifs;

import java.lang.*;

public class Ejercicioprueba {

	public static void main(String[] args) {
		Ejercicioprueba ejemplo = new Ejercicioprueba();
		System.out.println(ejemplo.exactlyOneThree(4,4));

	}



	public int exactlyOneThree(int x, int y) {
		if (x == 3 ^ y == 3)
		// if ((x == 3 && y != 3) || (x !=3 && y==3)) // TODO: if exactly one of x and y
		// is 3
		{
			return 1;
		} else {
			return 0;
		}
	}
}
