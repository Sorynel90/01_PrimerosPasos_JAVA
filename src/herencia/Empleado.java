package herencia;

import java.util.*;

public class Empleado {
	
	private String nom;
	private double sue;
	private int anio;
	private int mes;
	private int dia;
	private String nombre;
	private double sueldo;
	private Date altaContrato;
	private int Id;
	private static int IdSiguiente = 1;
	
	public Empleado(String nom, double sue, int anio, int mes, int dia) {
		
		nombre = nom;
		sueldo = sue;
		
		GregorianCalendar calendario = new GregorianCalendar(anio, mes-1, dia);
		
		altaContrato = calendario.getTime();
		
		++IdSiguiente;
		Id = IdSiguiente;
		
	}
	
	//Sobrecargamos el metodo constructor con solo un parametro
		public Empleado(String nom) {
			this(nom, 30000, 2000 ,01 ,01); 	//Utilizamos this para llamar al otro constructor de la clase (si hay varios constructores, java elije automaticamente el constructor en funcion de los parametros)
		}										//Este caso se utiliza para dar un valor predeterminado a determinados parametros
												//3000 = sue | 2000 = anio | 01 = mes | 01 = dia
		//Metodo GETTER para el nombre
		public String dameNombre() {
			return nombre;
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

}
