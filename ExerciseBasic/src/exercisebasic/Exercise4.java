package exercisebasic;

import java.util.Locale;
import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		//creamos el scanner para leer las notas 
		Scanner notas = new Scanner (System.in);
		//añadimos esta linea para que nos salgan los decimales con . 
		notas.useLocale(Locale.US);
		//pedimos la primera nota para la nota media
		System.out.print("Escriba la 1º nota: ");
		//creamos una variable para guardar la nota
		double prim;
		//guardamos la la 1º nota en la variable 
		prim = notas.nextDouble();
		//pedimos al cliente la 2º nota 
		System.out.print("\nEscriba la 2º nota: ");
		//creamos la segunda variable
		double seg;
		//Guardamos la 2º nota en la 2º variable 
		seg = notas.nextDouble();
		//creamos una variable para sumar las notas
		double total;
		total= prim + seg ;
		//creamos la ultima variable para hacer la media de las dos notas
		double resultado;
		resultado= total / 2;
		//mostramos el resultado al cliente
		System.out.print("\nLa media de las notas es de: "+ resultado +" Puntos");
		
		notas.close();
	}
	}

