
public class Uso_Bucle_For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * for (inicio bucle; condicion; contador bucle) {
		 * 	Linea 1
		 * 	Linea 2
		 * 	Linea 3
		 * }
		 */
		
		//Ejecutando el bucle FOR ciclo por ciclo desde 0 hasta 10
		for (int i = 0; i < 10; i++) {
			System.out.println("Este es el ciclo numero " + i + " del bucle FOR.");
		}
		
		System.out.println("");
		
		//Ejecutando el bucle FOR ciclo por ciclo desde 10 hasta 0
		for (int z = 10; z > 0; z--) {
			System.out.println("Este es el ciclo numero " + z + " del bucle FOR.");
		}
		
		System.out.println("");
		
		//Ejecutando el bucle FOR cada 2 ciclos
		for (int j = 0; j < 20; j += 2) {
			System.out.println("Este es el ciclo numero " + j +" el bucle FOR.");
		}

	}

}
