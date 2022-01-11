package jerarquia;

import java.util.*;

public class Uso_Persona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona[] lasPersonas = new Persona[2];
		
		lasPersonas[0] = new Empleado("Luis Conde", 50000, 2009, 02, 25);
		lasPersonas[1] = new Alumno("Ana Lopez" ,"Biologicas");
		
		for (Persona p: lasPersonas) {
			System.out.println(p.dameNombre() + ", " + p.dameDescripcion());
		}

	}

}

abstract class Persona {		//Definimos la clase como abstract porque tenemos un metodo abstract
	
	public Persona(String nom) {
		nombre = nom;
	}
	
	public String dameNombre() {
		return nombre;
	}
	
	public abstract String dameDescripcion();	//Declaramos un metodo abstracto (se utiliza como "plantilla" para crearlo segun las necesidades en cada clase donde se hereda este metodo)
	
	private String nombre;
	
}

class Empleado extends Persona{
	
	private String nom;
	private double sue;
	private int anio;
	private int mes;
	private int dia;
	
	private double sueldo;
	private Date altaContrato;
	private int Id;
	private static int IdSiguiente = 1;
	
	public Empleado(String nom, double sue, int anio, int mes, int dia) {
		
		super(nom);
		
		sueldo = sue;
		
		GregorianCalendar calendario = new GregorianCalendar(anio, mes-1, dia);
		
		altaContrato = calendario.getTime();
		
		++IdSiguiente;
		Id = IdSiguiente;
		
	}
		
		//Metodo GETTER para el sueldo
		public double dameSueldo() {
			return sueldo;
		}
		
		//Metodo GETTER para el alta contrato
		public Date dameFechaContrato() {
			return altaContrato;
		}
		
		//Metodo SETTER para aumentar el sueldo
		public void subeSueldo(double porcentaje) {
			double aumento = sueldo * porcentaje / 100;
			sueldo += aumento;
		}
		
		//Al herredar de una clase abstracta, estamos obligados a redefinir el metodo abstracto
		public String dameDescripcion() {
			return "Este empleado tiene un Id = " + Id + " con un sueldo = " + sueldo;
		}

}

class Alumno extends Persona {
	
	public Alumno(String nom, String car) {
		
		super(nom);
		carrera = car;
		
	}
	
	public String dameDescripcion() {
		return "Este alumno esta estudiando la carrera de " + carrera;
	}
	
	private String carrera;
	
}