package exercise1;

import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		// Bloque de variables
		int x, y, e;
		// bloque de codigo
		Scanner keyboard= new Scanner (System.in);
		System.out.print("Dale un valor a la x ");
		x = keyboard.nextInt();
		System.out.print("Dale un valor a la  y ");
		y = keyboard.nextInt();
		// cambiamos entre si los valores de las variables
		e = x;
		x = y;
		y = e;
		
		//mostramos el resultado
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
		
		
		keyboard.close();
	}


	}