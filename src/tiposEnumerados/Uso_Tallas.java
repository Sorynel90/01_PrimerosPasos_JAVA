package tiposEnumerados;
import java.util.*;

public class Uso_Tallas {
	
	enum Talla {small, medium, big, superBig};		//Tipos enumerado
													//La variable de tipo objeto llamada "Talla" solo podra almacenar los valores indicados
													//{small, medium, big, superBig}
													//no se puede declarar dentro del metodo main
	
	enum Talla2 {
		
		MINI("S"), MEDIANO("M"), GRANDE("L"), EXTRA_GRANDE("XL");
		
		private Talla2(String abreviatura) {
			
			this.abreviatura = abreviatura;
			
		}
		
		public String dameAbreviatura() {
			return abreviatura;
		}
		
		private String abreviatura;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Talla s = Talla.small;			//Creamos un objeto de tipo Talla y le asignamos un de los valores definidos anteriormente
		//Talla m = Talla.medium;			//Creamos un objeto de tipo Talla y le asignamos un de los valores definidos anteriormente
		//Talla l = Talla.big;			//Creamos un objeto de tipo Talla y le asignamos un de los valores definidos anteriormente
		//Talla xl = Talla.superBig;		//Creamos un objeto de tipo Talla y le asignamos un de los valores definidos anteriormente

		//Talla xxl = Talla.megaBig;		//En este caso nos da error ya que no hemos definido el valos megaBig a la hora de crear el objeto
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Escribe una talla: MINI; MEDIANO; GRANDE; EXTRA_GRANDE");
		
		String entrada_datos = entrada.next().toUpperCase();
		
		Talla2 la_talla = Enum.valueOf(Talla2.class, entrada_datos);
		
		System.out.println("Talla: " + la_talla);
		
		System.out.println("Abreviatura: " + la_talla.dameAbreviatura());
		
	}

}
