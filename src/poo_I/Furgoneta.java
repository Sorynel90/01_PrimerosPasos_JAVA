package poo_I;

//Utilizamos "extends Plataforma" para heredar los atributos y los metodos de la clase Plataforma.java
//de este forma, las clases pasan a llamarse de la siguiente manera:
//Plataforma.java se llamara LA SUPER CLASE (CLASE PADRE)
//Uso_Plataforma_para_VW_Caddy.java de llamara LA SUB CLASE (CLASE HIJO)
//En JAVA solo se puede heredar de una unica clase
public class Furgoneta extends Plataforma{
	
	//Definimos atributos proprios de la clase Uso_Plataforma_para_VW_Caddy.java
	private int plazas_extra;
	private int capacidad_carga;
	
	public Furgoneta(int plazas_extra, int capacidad_carga) {
		
		super();	//llamar al constructor de la clase padre (Plataforma.java)
		this.plazas_extra = plazas_extra;
		this.capacidad_carga = capacidad_carga;
		
	}
	
	//Metodo GETTER para el objeto Furgoneta
	public String dimeDatosFurgoneta() {
		return "La capacidad de carga es: " + capacidad_carga + " Y las plazas son: " + plazas_extra;
	}

}
