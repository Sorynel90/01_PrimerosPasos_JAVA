package primeros_pasos;
import javax.swing.*;
public class Peso_Ideal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaramos una variable para el genero
		String genero = "";
		
		//Solicitamos al usuario que nos introduzca el genero
		do {
			genero = JOptionPane.showInputDialog("Introduce tu genero (H/M)");
		} while (genero.equalsIgnoreCase("H")==false && genero.equalsIgnoreCase("M")==false);
		
		//Solicitamos al usuario su altura
		int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu altura en cm"));
		
		//Declaramos una variable para el peso
		int pesoIdeal = 0;
		
		//Realizamos los calculos en funcion del genero introducido por el usuario
		if (genero.equalsIgnoreCase("H")) {
			pesoIdeal = altura - 110;
		} else if (genero.equalsIgnoreCase("M")) {
			pesoIdeal = altura - 120;
		}
		
		System.out.println("Su peso ideal es: " + pesoIdeal + " kg.");

	}

}
