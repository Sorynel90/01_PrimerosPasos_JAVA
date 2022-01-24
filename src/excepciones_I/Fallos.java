package excepciones_I;

import javax.swing.JOptionPane;

public class Fallos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] mi_matriz = new int[5];
		
		mi_matriz[0] = 5;
		mi_matriz[1] = 38;
		mi_matriz[2] = -15;
		mi_matriz[3] = 92;
		mi_matriz[4] = 71	//Error en tiempo de compilacion/error de sintaxis
		mi_matriz[5] = 81;	//Error en tiempo de ejecucion - RuntimeException
		mi_matriz[6] = 91;	//Error en tiempo de ejecucion - RuntimeException
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Posicion " + i + " = " + mi_matriz[i]);
		}
		
		//Peticion de datos personales
		String nombre = JOptionPane.showInputDialog("Introduce tu nombre");
		
		int edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad"));
		
		System.out.println("Hola " + nombre + " tiens " + edad + " años. " + "El programa termino su ejecucion");

	}

}
