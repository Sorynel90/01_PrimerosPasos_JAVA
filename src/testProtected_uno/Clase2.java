package testProtected_uno;

import testProtected_dos.Clase3;

public class Clase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Clase1 miObj = new Clase1();		//Podemos crear el objeto de tipo Clase1 ya que tiene el modificador por defecto
		
		Clase3 miObj2 = new Clase3();
		
		//Prueba con miObj y miObj2 para ver el funcionamiento del modificador por defecto y el modificador protected

	}

}
