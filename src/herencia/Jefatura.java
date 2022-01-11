package herencia;

public class Jefatura extends Empleado{
	
	public Jefatura(String nom, double sue, int anio, int mes, int dia) {
		
		super(nom, sue, anio, mes, dia);
		
	}
	
	//Metodo SETTER para establecer el incentivo
	public void estableceIncentivo(double b) {
		incentivo = b;
	}
	
	//Metodo GETTER para obtener el sueldo del jefe
	public double dameSueldo() {					//Sobreescribimos el metodo herredado (dameSueldo()) para calcular el sueldo del jefe que es sueldo + incentivo
		double sueldoJefe = super.dameSueldo();		//Utilizamos super para indicar a que metodo queremos hacer referencia
		
		return sueldoJefe + incentivo;
	}
	
	private double incentivo;

}
