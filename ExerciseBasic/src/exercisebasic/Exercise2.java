package exercisebasic;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		//creamos el scanner 
		Scanner lectura = new Scanner (System.in);
		// imprimimos en la consola la pregunta para reguistrar una edad	
		System.out.print("Introduzca su edad: ");
		//creamos la variable para guardar la edad
			int num;
			//guardamos la edad escrita en la variable
			num= lectura.nextInt();
			//variable para sumarle uno a la edad del cliente
			int masUno;
			masUno= num + 1;
			//mostramos la respuesta en la consola con la edad que tendrá el cliente el próximo año
				System.out.print("En su próximo cumpleaños cumplirás: " + masUno);
		lectura.close();
	}

}
