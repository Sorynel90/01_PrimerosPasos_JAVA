package poo_I;

import javax.swing.*;

public class Coches {

	public static void main(String[] args) {
		
		//Nos creamos un objeto de tipo plataforma (coche universal)
		Plataforma Passat = new Plataforma(); //Instanciar una clase. Ejemplar de clase
		
		System.out.println(Passat.largo_plataforma());
		
		//Modificamos el color del coche
		Passat.establece_color(JOptionPane.showInputDialog("Introduce color:")); //Le pasamos el parametro "blanco" de tipo String tal como lo hemos definido en el metodo establece_color
		
		//Pintamos los datos generales de la plataforma
		System.out.println(Passat.dime_datos_generales());
		
		//Pintamos el color del coche
		System.out.println(Passat.dime_color());
		
		//Configuramos los asientos
		Passat.configura_asientos(JOptionPane.showInputDialog("¿Tiene asientos de cureo?:"));
		
		//Pintamos el tipo de asientos
		System.out.println(Passat.dime_asientos());
		
		//Configuramos climatizador
		Passat.configura_climatizador(JOptionPane.showInputDialog("¿Tiene climatizador?"));
		
		//Pintamos si tiene o no climatizador
		System.out.println(Passat.dime_climatizador());
		
		//Pintamos el peso total del coche
		System.out.println(Passat.dime_peso_coche());
		
		//Pintamos el precio final del coche
		System.out.println("El precio final del coche es de: " + Passat.precio_coche() + " €");
		
		//-------------------------------------------------------------------------------------
		
		//Nos creamos un nuevo objeto de tipo Furgoneta
		Furgoneta mifurgoneta1 = new Furgoneta (7, 580);
		
		//Modificamos el color de la furgoneta
		mifurgoneta1.establece_color("azul");
		
		//Definimos climatizador de la furgoneta
		mifurgoneta1.configura_climatizador("si");
		
		//Definimos asientos de la furgoneta
		mifurgoneta1.configura_asientos("si");
		
		//Pintamos los datos de la furgoneta
		System.out.println("Los datos generales de la furgoneta son: " + mifurgoneta1.dime_datos_generales());
		
		//Pintamos los datos especificos de la furgoneta
		System.out.println("Los datos especificos de la furgoneta son: " + mifurgoneta1.dimeDatosFurgoneta());

	}

}
