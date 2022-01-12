package herencia_Interfaces;

final class Director extends Jefatura{ //Definimos la clase como "final" para que ninguna otra clase pueda herredar de esta clase
	
	public Director(String nom, double sue, int anio, int mes, int dia) {
		super(nom, sue, anio, mes, dia);
	}
	
	public final double sueldoDirector() { //Definimos el metodo como "final" para no poder soreescribirlo en otra clase
		return 200000;
	}

}
