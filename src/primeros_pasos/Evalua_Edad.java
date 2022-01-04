package primeros_pasos;
import java.util.*;
public class Evalua_Edad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		
		//Condicional IF-ELSE
		System.out.println("Introduce tu edad, por favor.");
		
		int edad1 = entrada.nextInt();
		
		if (edad1 >= 18) {
			System.out.println("Eres mayor de edad.");
		} else {
			System.out.println("Eres menor de edad.");
			
		}
		
		//Condicional IF-ELSE IF-ELSE
		System.out.println("Introduce de nuevo tu edad, por favor.");
		
		int edad2 = entrada.nextInt();
		
		if (edad2 < 18) {
			System.out.println("Eres un adolescente.");
		} else if (edad2 < 40) {
			System.out.println("Eres joven.");
		} else if (edad2 < 65) {
			System.out.println("Eres maduro.");
		} else {
			System.out.println("Cuidate.");
		}

	}

}
