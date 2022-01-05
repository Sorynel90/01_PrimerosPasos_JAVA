package poo_II;

import java.util.*;

public class Uso_Empleado {

	public static void main(String[] args) {
		
		/*
		//Creamos 3 objetos de tipo Empleado
		Empleado empleado1 = new Empleado("Paco", 25000, 1990, 12, 17);
		Empleado empleado2 = new Empleado("Pepito", 30000, 1995, 6, 2);
		Empleado empleado3 = new Empleado("Juanito", 35000, 2002, 3, 15);
		
		//Aplicamos el metodo subeSueldo para subir el sueldo a los empleados
		empleado1.subeSueldo(5);
		empleado2.subeSueldo(5);
		empleado3.subeSueldo(5);
		
		//Pintamos la el sueldo tras la subida
		System.out.println("Nombre: " + empleado1.dameNombre() + "\nSueldo: " + empleado1.dameSueldo() + "\nFecha de alta: " + empleado1.dameFechaContrato());
		System.out.println();
		System.out.println("Nombre: " + empleado2.dameNombre() + "\nSueldo: " + empleado2.dameSueldo() + "\nFecha de alta: " + empleado2.dameFechaContrato());
		System.out.println();
		System.out.println("Nombre: " + empleado3.dameNombre() + "\nSueldo: " + empleado3.dameSueldo() + "\nFecha de alta: " + empleado3.dameFechaContrato());
		*/
		
		//Metodo alternativo con Array y bucles FOR para subir de sueldo y pintar
		Empleado[] misEmpleados = new Empleado[3];
		
		//Para almacenar diferentes tipos de datos en un array hay que crear una clase, previamente, donde manejar los tipos de datos deseados
		misEmpleados[0] = new Empleado("Paco", 25000, 1990, 12, 17);
		misEmpleados[1] = new Empleado("Pepito", 30000, 1995, 6, 2);
		misEmpleados[2] = new Empleado("Juanito", 35000, 2002, 3, 15);
		
		/* BUCLES FOR TRADICIONALES
		//Subimos el sueldo de los empleados con un bucle FOR
		for(int i=0; i<3; i++) {
			misEmpleados[i].subeSueldo(5);
		}
		
		//Pintamos la infor de empleados con un bucle FOR
		for(int i=0; i<3; i++) {
			System.out.println("Nombre: " + misEmpleados[i].dameNombre() + "\nSueldo: " + misEmpleados[i].dameSueldo() + "\nFecha de alta: " + misEmpleados[i].dameFechaContrato());
		}*/
		
		//BUCLES FOR MEJORADOS
		for(Empleado e:misEmpleados) {
			e.subeSueldo(5);
		}
		
		for(Empleado e:misEmpleados) {
			System.out.println("Nombre: " + e.dameNombre() + "\nSueldo: " + e.dameSueldo() + "\nFecha de alta: " + e.dameFechaContrato());
		}
		
	}

}

class Empleado {
	
	//Creamos el constructor de la clase con argumentos
	public Empleado(String nom, double sue, int anio, int mes, int dia) {
		
		nombre = nom;
		sueldo = sue;
		
		//Creamos un objeto de tipo GregorianCalendar para definir la fecha de alta
		GregorianCalendar calendario = new GregorianCalendar(anio, mes-1, dia);
		
		//Definimos la fecha de alta del contrato utilizando el objeto de tipo GregorianCalendar y el metodo getTime()
		altaContrato = calendario.getTime();
		
	}
	
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
	
	//Declaramos las variables de la clase
	private String nombre;
	private double sueldo;
	private Date altaContrato;
	
	
}