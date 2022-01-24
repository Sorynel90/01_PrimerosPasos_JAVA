package temporizador;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.Timer;
import java.awt.Toolkit;

public class PruebaTemporizador2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Reloj miReloj = new Reloj(3000, true);
		
		miReloj.enMarcha();
		
		JOptionPane.showMessageDialog(null, "Pulsa aceptar para finalizar");
		
		System.exit(0);

	}

}

class Reloj {
	
	//Constructor con parametros
	public Reloj(int intervalo, boolean sonido) {
		
		this.intervalo = intervalo;
		this.sonido = sonido;
		
	}
	
	//Metodo para poner en marcha el reloj
	public void enMarcha() {
		ActionListener oyente = new DameLaHora2();
		
		Timer miTemporizador = new Timer(intervalo, oyente);
		
		miTemporizador.start();
	}
	
	private int intervalo;
	private boolean sonido;
	
	//Inner class
	private class DameLaHora2 implements ActionListener {

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
	
}