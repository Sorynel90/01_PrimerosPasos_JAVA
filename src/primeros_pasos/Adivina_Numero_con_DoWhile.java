package primeros_pasos;
import java.util.*;

public class Adivina_Numero_con_DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Generamos un numero aleatorio entre 0 y 100 y lo convertimos a numero entero
		int aleatorio = (int)(Math.random() * 100);
		
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		
		//Declaramos una variable para solicitar al usuario un numero 
		int numero = 0;
		
		//Declaramos una variable para contar los numeros de los intentos
		int intentos = 0;
		
		//Solicitamos al usuario que introduzca un numero
		System.out.println("Introduce un numero entre 0 y 100, por favor.");
		
		//Creamos el bucle DoWhile para comprobar si el numero introducido por el usuario es igual que el numero generado por el sistema
		do {
			
			//Contamos los intentos realizados por el usuario
			intentos++;
			
			//Solicitamos al usuario que introduzca un numero
			numero = entrada.nextInt();
			
			//Comparamos el numero introducido por el usuario con el numero generado por el sistema y le informamos al usuario si tiene que elegir un numero menor
			if (aleatorio < numero) {
				System.out.println("El numero generado por el sistema es menor que el numero introducido, intentelo de nuevo.");
			}
			
			//Comparamos el numero introducido por el usuario con el numero generado por el sistema y le informamos al usuario si tiene que elegir un numero maior
			else if (aleatorio > numero) {
				System.out.println("El numero generado por el sistema es mayor que el numero introducido, intentelo de nuevo.");
			}
			
		} while (numero != aleatorio);
		
		//Si se cumplen las condiciones, informamos al usuario de su acierto y le monstramos en cuantos intentos lo ha ascertado
		System.out.println("Felicidades, numero acertado en " + intentos + " intentos.");

	}

}
