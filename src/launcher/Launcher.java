package launcher;

import Modelo.Sala;
import Vista.FrameSala;
import controlador.ControladorSala;

public class Launcher {

	static FrameSala vist_P;

	public static void main(String[] args) {

		vist_P = new FrameSala(); //Se crea al frame, Sala

		Sala sala1 = new Sala(); //Se crea al modelo, sala
		sala1.comprarBoleta();
		
		ControladorSala  ctrl = new ControladorSala(vist_P, sala1);

	}
}
