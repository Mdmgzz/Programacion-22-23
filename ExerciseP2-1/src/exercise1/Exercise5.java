package exercise1;

import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {
		// Bloque de variables
		double altura , largo , area, perimetro  ;
		//Construccion del codigo
		Scanner sc = new Scanner(System.in);
		System.out.print("Altura del rectangulo: ");
		altura= sc.nextDouble();
		System.out.print("Largo del rectangulo: ");
		largo= sc.nextDouble();
		area= altura*largo;
		perimetro= altura*2+largo*2;
		//mostramos el resultado de las operaciones
		System.out.println("El área del rectangulo es de "+ area);
		System.out.print("El perimetro del rectangulo es de "+ perimetro);
		sc.close();

	}

}
