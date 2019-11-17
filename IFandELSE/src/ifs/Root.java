package ifs;

public class Root {

	public static void main(String[] args) {
		double original = 2;
		double root = Math.sqrt(original);
		double rootSquared = root * root;
		final double EPSILON = 1E-12; 
		if (Math.abs (rootSquared - original) < EPSILON) {
			System.out.println("Son el mismo");
		}
		else {
			System.out.println("Raiz cuadrada es " + rootSquared);
		}
	}
	

}
