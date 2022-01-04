import java.util.*;
import javax.swing.*;
public class Areas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Elige una opcion: \n1: Cuadrado \n2: Rectangulo \n3: Triangulo \n4: Circulo");

		int figura = entrada.nextInt();
		
		switch (figura) {
		case 1:
			
			//Solicitamos al usuario la longitud del lado y utilizando el metodo parseInt lo convertimos de String a entero
			int lado = Integer.parseInt(JOptionPane.showInputDialog("Introduce la longitud del lado del cuadrado."));
			
			//Calculamos el area del triangulo utilizando el metodo Math.pow y el resultado lo imprimimos en consola
			System.out.println("El area del cuadrado es: " + Math.pow(lado, 2));
			break;
			
		case 2:
			int base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base del rectangulo."));
			int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura del rectangulo."));
			System.out.println("El area del rectangulo es: " + (base * altura));
			break;
			
		case 3:
			//Reutilizamos las variables declaradas anteriormente
			base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base del triangulo."));
			altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura del triangulo."));
			break;
			
		case 4:
			int radio = Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio del circulo."));
			System.out.println("El area del circulo es: ");
			System.out.printf("%1.2f", Math.PI*(Math.pow(radio, 2)));
			break;

		default:
			System.out.println("Opcion incorrecta.");
			break;
		}
	}

}
