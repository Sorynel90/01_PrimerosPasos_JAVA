package herencia_Interfaces;

public interface Jefes extends Trabajadores{
	
	String tomar_decisiones(String decision);	//Si obviamos los modificadores public abstract, el programa java da por echo de que nuestro metodo es public abstract

}
