import javax.swing.JOptionPane;

public class Entrada_ejemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre_usuario = JOptionPane.showInputDialog("Introduce tu nombre, por favor.");
		
		//El metodo showInputDialog de la clase JOptionPane siempre nos devuelve un String
		String edad = JOptionPane.showInputDialog("Introduce tu edad, por favot");
		
		/*Como el metodo showInputDialog de la clase JOptionPane siempre nos devuelve un String
		 *entonces para obtener un numero es necesario convertir el String a int
		 */
		int edad_usuario = Integer.parseInt(edad);
		
		System.out.println("Hola " + nombre_usuario + ". El año que viene, tendras " + (edad_usuario + 1) + " años.");

	}

}
