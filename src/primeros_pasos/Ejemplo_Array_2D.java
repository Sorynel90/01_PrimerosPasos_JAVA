package primeros_pasos;

public class Ejemplo_Array_2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Ejercicio para calcular el saldo aplicando un interes de 10%, 11%, 12%, 13%, 14% y 15% durante 5 años
		
		//Declaramos el interes mas bajo y el saldo acumulado
		double acumulado;
		double interes = 0.10;
		
		//Declaramos la matriz 6x5 (6 tipos de intereses durante 5 años en cada)
		double [][] saldo = new double[6][5];
		
		//Rellenamos la matriz
		for(int i = 0; i < 6; i++) {
			
			//Declaramos el saldo inicial para cada tipo de interes (con 10% hasta que finaliza el bucle, despues con 11% ...)
			saldo[i][0] = 10000;
			acumulado = 10000;
			
			for(int j = 1; j < 5; j++) {
				
				//Calculamos el saldo tras aplicar el interes para cada año
				acumulado = acumulado + (acumulado * interes);
				saldo [i][j] = acumulado;
				
			}
			
			//Incrementamos el interes
			interes = interes + 0.01;
			
		}
		
		//Pintamos el resultado de la matriz
		for (int x = 0; x < 5; x++) {
			System.out.println();
			
			for(int y = 0; y < 6; y++) {
				System.out.printf("%1.2f", saldo[y][x]);
				System.out.print(" ");
			}
			
		}

	}

}
