package exercise1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
			Scanner sc = new Scanner (System.in);
			final int YEAR;
			int Age,BornIn;
			YEAR = 2022;
			System.out.print("How old are you this year?");
			Age= sc.nextInt();
			BornIn = YEAR-Age;
			System.out.print("I think you born in "+ BornIn);
			sc.close();
	}

}
