package herencia;

public class Uso_Empleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creamos un objeto de tipo Jefatura
		Jefatura jefe_RRHH = new Jefatura("Sorin", 100000, 2004, 01, 07);
		//Establecemos un incentivo para el objeto creado
		jefe_RRHH.estableceIncentivo(3939);
		
		
		Empleado[] misEmpleados = new Empleado[6];
		
		misEmpleados[0] = new Empleado("Paco", 25000, 1990, 12, 17);
		misEmpleados[1] = new Empleado("Pepito", 30000, 1995, 6, 2);
		misEmpleados[2] = new Empleado("Juanito", 35000, 2002, 3, 15);
		misEmpleados[3] = new Empleado("Antonio");
		misEmpleados[4] = jefe_RRHH; //Polimorfismo en accion. Principio de sustitucion
		misEmpleados[5] = new Jefatura("Antonia", 70000, 2010, 05, 10);
		
		Jefatura jefa_Finanzas = (Jefatura) misEmpleados[5]; 	//Casting para convertir un objeto de un tipo a otro tipo
		jefa_Finanzas.estableceIncentivo(1500);					//En nuestro caso de tipo Empleado a tipo Jefatura
																//Hay que ver la estructura de la herencia ya que no siempre se puede hacer casting d eun tipo a otro
		
		
		for(Empleado e:misEmpleados) {
			e.subeSueldo(5);
		}
		
		for(Empleado e:misEmpleados) {
			System.out.println("Nombre: " + e.dameNombre() + "\nSueldo: " + e.dameSueldo() + "\nFecha de alta: " + e.dameFechaContrato() + "\n");
		}

	}

}
