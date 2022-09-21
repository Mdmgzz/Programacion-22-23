package exercise8;

import java.util.Scanner;

public class Exercise8 {

	public static void main(String[] args) {
		Scanner lectura = new Scanner (System.in);
		try (Scanner sc = new Scanner (System.in)) {
			System.out.print("Introduzca un numero: ");
			double numero;
			numero = sc.nextDouble();
			
				System.out.println(numero);
		}
		lectura.close();
	}

}
