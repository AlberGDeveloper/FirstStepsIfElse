package ifs;

public class Lineas {
	public static void main(String args[]) {
		int j = 5;
		switch (j) {
		case 5: case 4:
			System.out.println("5********");
//		case 4:
//			System.out.println("4********");
//			break;
		case 3:
			System.out.println("3********");
			break;
		case 2:
			System.out.println("2********");
		case 1:
			System.out.println("1********");
		default:
			System.out.println("Por defecto");
		}
	}
}
