package exercisebasic;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		// creamos el scanner 
		Scanner sc = new Scanner (System.in);
		//pedimos el año de nacimiento
			System.out.print("Introduzca tu año de nacimiento: ");
			// creamos la variable en la cual vamos a guardar el año de nacimiento 
			int cump;
			//guardamos el año en la variable
			cump= sc.nextInt();
			//pedimos al cliente el año actual
			System.out.print("\nInrtoduzca el año actual: ");
			// creamos la variable
			int fecha;
			// guardamos el año actual en la variable creada
			fecha= sc.nextInt();
			// creamos una variable en la que guardaremos el resultado de la operación
			int res=fecha-cump;
			// mostramos el resultado de la operacion
				System.out.print("Usted tiene: "+ res +" Años");
		sc.close();
	}

}
