package temporizador;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.Timer;
import java.awt.Toolkit;

public class PruebaTemporizador3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Reloj1 miReloj = new Reloj1();
		
		miReloj.enMarcha(3000, true);
		
		JOptionPane.showMessageDialog(null, "Pulsa aceptar para finalizar");
		
		System.exit(0);

	}

}

class Reloj1 {
	
	//Constructor con parametros
	/*
	public Reloj1(int intervalo, boolean sonido) {
		
		this.intervalo = intervalo;
		this.sonido = sonido;
		
	}*/
	
	//Metodo para poner en marcha el reloj
	public void enMarcha(int intervalo,final boolean sonido) {
		
		//Inner local class
		class DameLaHora2 implements ActionListener {

			@Override
			public void actionPerformed(ActionEvent evento) {
				// TODO Auto-generated method stub
				Date ahora = new Date();
				System.out.println("La hora actual es: " + ahora);
				
				if(sonido) {
					Toolkit.getDefaultToolkit().beep();
				}
				
			}
			
		}
		
		ActionListener oyente = new DameLaHora2();
		
		Timer miTemporizador = new Timer(intervalo, oyente);
		
		miTemporizador.start();
	}	
	
}