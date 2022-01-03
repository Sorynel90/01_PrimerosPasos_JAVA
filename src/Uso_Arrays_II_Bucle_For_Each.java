import javax.swing.*;
public class Uso_Arrays_II_Bucle_For_Each {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Primer ejemplo
		String[] paises = {"España", "Portugal", "Francia", "Alemania", "Italia", "Rumania", "Polonia", "Austria"};
		
		//Sintaxis del bucle FOR tradicional
		for (int i = 0; i < paises.length; i++) {
			System.out.println("Pais " + (i+1) + " " +paises[i]);
		}
		
		//Sintaxis del bucle ForEach (un bucle FOR mejorado)
		for(String elemento:paises) {
			System.out.println("Pais: " + elemento);
		}
		
		//Segundo ejemplo
		int[] num_aleatorios = new int[150];
		
		//Rellenamos la matris con numeros aleatorios
		for (int i = 0; i < num_aleatorios.length; i++) {
			num_aleatorios[i] = (int)Math.round(Math.random()*100);
		}
		
		//Imprimimos los datos de la matriz
		for (int numeros:num_aleatorios) {
			System.out.print(numeros + " ");
		}
		
		//Tercer ejemplo
		String[] coches = new String[4];

		//Rellenamos la nueva matriz con datos introducidos por el usuario
		for (int i = 0; i < coches.length; i++) {
			coches[i] = JOptionPane.showInputDialog("Introduce marca de coche " + (i+1));
		}
		
		//Imprimimos los datos introducidor por el usuario
		for(String elemento:coches) {
			System.out.println("Coche " + elemento);
		}
		
	}

}
