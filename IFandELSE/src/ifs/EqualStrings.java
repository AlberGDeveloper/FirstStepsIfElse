package ifs;

public class EqualStrings {

	public static void main(String[] args) {
		String first = "Uda";
		String second = "city";
		String firstAndSecond = first + second;
		String third = "Udacity";

		if (firstAndSecond.equals(third)) {
			System.out.println("Son el mismo");

		} else {
			System.out.println("firstAndSecond is " + firstAndSecond);
		}
	}
}