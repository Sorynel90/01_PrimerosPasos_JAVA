package primeros_pasos;

public class Uso_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaramos el array
		int[] mi_matriz1 = new int[5];
		//int mi_matriz2[] = new int[5];
		
		//Asignamos valores a nuestra matriz
		mi_matriz1[0] = 5;
		mi_matriz1[1] = 30;
		mi_matriz1[2] = -15;
		mi_matriz1[3] = 92;
		mi_matriz1[4] = 71;
		
		int[] mi_matriz2 = {20, 10, -77, 38, 60, 78, 25, 80, 58, 10, 39, 90, 99, -38, -49};
		
		//Imprimimos los valores de la matriz (forma no habitual)
		System.out.println(mi_matriz1[0]);
		System.out.println(mi_matriz1[1]);
		System.out.println(mi_matriz1[2]);
		System.out.println(mi_matriz1[3]);
		System.out.println(mi_matriz1[4]);
		
		System.out.println("");
		
		//Imprimimos los valores de la matriz (forma habitual)
		for (int i = 0; i < 5; i++) {
			System.out.println("Valor del indice " + i + " = " + mi_matriz1[i]);
		}
		
		System.out.println("");
		
		for (int i = 0; i < mi_matriz2.length; i++) {
			System.out.println("Valor del indice " + i + " = " +mi_matriz2[i]);
		}

	}

}
