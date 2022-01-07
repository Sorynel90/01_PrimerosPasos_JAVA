package poo_II;

public class Pruebas_Final_Static {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empleados trabajador1 = new Empleados("Paco");
		Empleados trabajador2 = new Empleados("Ana");
		Empleados trabajador3 = new Empleados("Antonio");
		Empleados trabajador4 = new Empleados("Maria");
		
		trabajador1.cambiaSeccion("RRHH");
		/*trabajador1.cambiaNombre("Maria");*/
		
		System.out.println(trabajador1.devuelveDatos());
		
		System.out.println(trabajador2.devuelveDatos());
		
		System.out.println(trabajador3.devuelveDatos());
		
		System.out.println(trabajador4.devuelveDatos());
		
		System.out.println(Empleados.dameIdSiguiente());

	}

}

class Empleados {
	
	public Empleados(String nom) {
		
		nombre = nom;
		seccion = "Administracion";
		Id = IdSiguiente; //Definimos el estado inicial
		IdSiguiente++; //Incrementamos el valor
		
	}
	
	//Metodo SETTER para la seccion
	public void cambiaSeccion(String seccion) {
		
		this.seccion = seccion;
		
	}
	
	//Metodo GETTER para el nombre y la seccion
	public String devuelveDatos() {
		return "El nombre es: " + nombre + ", la seccion es: " + seccion + " y el id es: " + Id;
	}
	
	//Metodo static (los metodos static no actuan sobre objetos, se llaman a traves del nombre de la clase Empleados.dameIdSiguiente())
	//Para poder acceder a variables o constantes declaradas estas deben de ser tambien static
	public static String dameIdSiguiente( ) {
		return "El Id siguiente es: " + IdSiguiente;
	}
	
	//Metodo SETTER para el nombre
	/*public void cambiaNombre(String nombre) {
		this.nombre = nombre; //el error es debido a que el atributo nombre es de tipo final y no puede ser modificado
	}*/
	
	private final String nombre; //final - para no poder modificar el nombre durante la ejecucion del programa (constante en JAVA)
	private String seccion;
	private int Id; 
	private static int IdSiguiente = 1; //static - para dar "unicidad" a cada objeto
	
}