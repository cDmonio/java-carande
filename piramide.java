import java.util.Scanner;

public class piramide {

	public static void main (String args[]) {

		/*
		  ejemplo:

		      x
		     xxx
		    xxxxx
		   xxxxxxx
		  xxxxxxxxx

		 pisos = 5
		 linea = x
		 linea += 'xx'
		 espacios = pisos - 1
		 espacios --

		*/

		Scanner scanner = new Scanner(System.in);

		String linea = "x";
		String espacios = " ";

		System.out.print("Introduce el numero de pisos: ");
		int pisos=scanner.nextInt();
		int contador = 1;
		int controlador = pisos;

		//bucle principal
		for (int i=0;i<pisos;i++) {

			//bucle para espacios
			while (contador<controlador) {
				System.out.print(espacios);
				contador++;
			}

			//reiniciar contador y decrementar controlador (controlador=pisos)
			contador=1;
			controlador--;

			//lineas
			System.out.println(linea);
			linea+="xx";

		}

	}
}
