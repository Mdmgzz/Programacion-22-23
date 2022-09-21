package exercise9;

import java.util.Scanner;

public class Exercise9 {

	public static void main(String[] args) {
		Scanner lectura = new Scanner (System.in);
		try (Scanner sc = new Scanner (System.in)) {
			System.out.print("Introduzca tu edad: ");
			byte numero;
			numero = sc.nextbyte();
			
				System.out.println(numero);
		}
		lectura.close();
	}

}
