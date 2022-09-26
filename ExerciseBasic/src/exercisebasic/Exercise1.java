package exercisebasic;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		//creamos el scanner que nos leera el numero
		Scanner lectura = new Scanner (System.in);{
			//preguntamos por el numero a escribir
			System.out.print("Introduzca un numero: ");
			//creamos la variable en la que guardaremos el numero
			double numero;
			// Guardamos el numero escrito en la variable
			numero = lectura.nextDouble();
			// Escribimos el resultado del numero escrito
				System.out.println("ha escrito el numero:  " + numero);
		}
		lectura.close();
	}

}
