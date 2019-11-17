package ifs;

import java.util.Scanner;

public class Alcalde {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String alcalde = sc.nextLine();
//		String alcalde1 = "";
//		String alcalde2 = null;
		String declaracion = "";

		if (alcalde==null) {
			declaracion = "No hubo entrevista";

		} else if (alcalde.equals("")) {
			declaracion = "No dijo nada";


		} else 
			declaracion = "No hubo entrevista";
			System.out.println(declaracion);
		
	}
}