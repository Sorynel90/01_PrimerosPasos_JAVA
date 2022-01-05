package poo_I;

public class Plataforma {
	
	//Propriedades fijas de la plataforma (caracteristicas comunes)
	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int peso_plataforma;
	
	//Propriedades que pueden variar en funcion del coche
	private String color;
	private int peso_total;
	private boolean asientos_cuero, climatizador;
	
	//Creamos el metodo constructor (Metodos que se encarga de dar el estado inicial de nuestro objeto)
	public Plataforma() {
		
		ruedas = 4;
		largo = 4767;
		ancho = 1832;
		motor = 1968;
		peso_plataforma = 1200;
		
	}
	
	//Metodo GETTER para el largo
	public String largo_plataforma() {
		return "El largo del coche es de " + largo + " cm.";
	}
	
	//Metodo SETTER
	public void establece_color(String color_coche) { //(String color_coche) => paso de parametros
		//color = "azul";
		color = color_coche;
	}
	
	//Metodo GETTER para el color
	public String dime_color() {
		return "El color del coche es: " + color;
	}
	
	//Metodo GETTER para obtener las propriedades fijas
	public String dime_datos_generales( ) {
		return "La plataforma del vehiculo tiene " + ruedas + " ruedas. Mide " + largo + " cm de largo y " 
				+ ancho + " cm de ancho. Y tiene un peso de " + peso_plataforma + " kg.";
	}
	
	//Metodo SETTER para los asientos
	public void configura_asientos(String asientos_cuero) {
		//Para almacenar un String en boolean hay que confecionar de otra forma el metodo
		//this.asientos_cuero = asientos_cuero; //El operador this se utiliza para indicar el atributo de la clase y no el parametro del metodo
		
		if(asientos_cuero.equalsIgnoreCase("si")) {
			this.asientos_cuero = true;
		} else {
			this.asientos_cuero = false;
		}
	}
	
	//Metodo GETTER para los asientos
	public String dime_asientos( ) {
		if (asientos_cuero==true) {
			return "El coche tiene asientos de cuero";
		} else {
			return "El coche tiene asientos de serie";
		}
	}
	
	//Metodo SETTER para el climatizador
	public void configura_climatizador(String climatizador) {
		if(climatizador.equalsIgnoreCase("si")) {
			this.climatizador=true;
		} else {
			this.climatizador=false;
		}
	}
	
	//Metodo GETTER para el climatizador
	public String dime_climatizador() {
		if(climatizador==true) {
			return "El coche incorpora climatizador";
		} else {
			return "El coche incorpora aire acondicionado";
		}
	}
	
	//Metodo SETTER y GETTER al mismo tiempo (practica no recomendada) 
	public String dime_peso_coche() {
		int peso_carroceria = 500;
		peso_total = peso_plataforma + peso_carroceria;
		
		if(asientos_cuero==true) {
			peso_total = peso_total + 50;
		}
		
		if(climatizador==true) {
			peso_total = peso_total + 20;
		}
		
		return "El peso total del coche es de: " + peso_total + " kg.";
		
	}
	
	//Metodo GETTER para el precio final
	public int precio_coche() {
		int precio_final = 10000;
		
		if(asientos_cuero==true) {
			precio_final += 2000;
		}
		
		if(climatizador==true) {
			precio_final += 1500;
		}
		
		return precio_final;
		
	}

}
