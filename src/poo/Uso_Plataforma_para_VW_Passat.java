package poo;

public class Uso_Plataforma_para_VW_Passat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Plataforma Passat = new Plataforma(); //Instanciar una clase. Ejemplar de clase
		
		System.out.println(Passat.largo_plataforma());
		
		//Modificamos el color del coche
		Passat.establece_color("blanco"); //Le pasamos el parametro "blanco" de tipo String tal como lo hemos definido en el metodo establece_color
		
		//Pintamos los datos generales de la plataforma
		System.out.println(Passat.dime_datos_generales());
		
		//Pintamos el color del coche
		System.out.println(Passat.dime_color());
		
		//Configuramos los asientos
		Passat.configura_asientos("si");
		
		//Pintamos el tipo de asientos
		System.out.println(Passat.dime_asientos());

	}

}
