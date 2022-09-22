package exercise12;

import java.util.Locale;
import java.util.Scanner;

public class Exercise12 {

	public static void main(String[] args) {
		//creamos el scanner para leer las notas 
				Scanner circulo = new Scanner (System.in);
				//añadimos esta linea para que nos salgan los decimales con . 
				circulo.useLocale(Locale.US);
				//pedimos el radio del circulo
				System.out.print("Escriba el radio del circulo: ");
				//creamos una variable para guardar la nota
				double rad;
				//guardamos la la 1º nota en la variable 
				rad = circulo.nextDouble();
				//creamos la variable donde se ejecutará la op
				double res1;
				res1= 2*Math.PI*rad;
				// ahora mostraremos el resultado del radio en la consola
				System.out.print("el radio del circulo es de: "+ res1 + " cm");
				//creamos la 2º variable que sera la que calcule la longitud
				double res2;
				res2 = Math.PI*rad*rad;
				//mostramos el resultado de la longitud
				System.out.print("\nLa longitud del circulo es de: "+ res2 + " cm");
				
				
				
				
				circulo.close();
	}

}
