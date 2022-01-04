
public class Uso_Arrays_Bidimensionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaramos matriz de 2 dimensiones
		int[][] matriz_bidimensional = new int[4][5];
		
		//Rellenamos la matriz manualmente
		matriz_bidimensional[0][0] = 15;
		matriz_bidimensional[0][1] = 21;
		matriz_bidimensional[0][2] = 18;
		matriz_bidimensional[0][3] = 9;
		matriz_bidimensional[0][4] = 15;
		
		matriz_bidimensional[1][0] = 10;
		matriz_bidimensional[1][1] = 52;
		matriz_bidimensional[1][2] = 17;
		matriz_bidimensional[1][3] = 19;
		matriz_bidimensional[1][4] = 7;
		
		matriz_bidimensional[2][0] = 19;
		matriz_bidimensional[2][1] = 2;
		matriz_bidimensional[2][2] = 19;
		matriz_bidimensional[2][3] = 17;
		matriz_bidimensional[2][4] = 7;
		
		matriz_bidimensional[3][0] = 92;
		matriz_bidimensional[3][1] = 13;
		matriz_bidimensional[3][2] = 13;
		matriz_bidimensional[3][3] = 32;
		matriz_bidimensional[3][4] = 41;
		
		//Recorrrer la matriz con 2 bucles FOR
		for (int i = 0; i < 4; i++) {
			System.out.println();
			for(int j = 0; j < 5; j++) {
				System.out.println("El valor del indice en la posicion: " + "[" + i + "]" + "[" + j + "]" + " es: " + matriz_bidimensional[i][j]);
			}
		}
		
		//Rellenamos el array manualmente pero de forma mas simple
		int[][] matrix = {
				{15,79,36,15,57},
				{67,12,56,90,44},
				{13,23,33,43,53},
				{11,12,13,14,15},
				{11,22,33,44,55}
		};
		
		//Recorrer la matriz con 2 bucles ForEach
		for(int[]fila:matrix) {
			System.out.println();
			for(int z: fila) {
				System.out.print(z + " ");
			}
		}

	}

}
