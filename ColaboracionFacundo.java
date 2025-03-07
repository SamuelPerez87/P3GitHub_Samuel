package pruebas;

import java.time.LocalTime;
import java.util.Scanner; 

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			
		//Ejercicio1
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingresa un número: ");
		
		int nro = sc.nextInt();
		
		System.out.println("El número ingresado es: " + nro);
		
		
		//Ejercicio 2
		
		System.out.println("Ingrese una cadena de texto: ");
		String cadena1 = sc.next();		
		
		System.out.println("Ingrese otra cadena de texto: ");
		String cadena2 = sc.next();
							
		System.out.println("Cadenas: " + cadena1 + " " + cadena2);

		sc.close();
				
	}

}
