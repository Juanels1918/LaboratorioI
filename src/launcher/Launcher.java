package launcher;

import Modelo.Sala;
import Vista.FramePelicula;
import Vista.FrameSala;
import controlador.ControladorPelicula;
import controlador.ControladorSala;

public class Launcher {

	static FrameSala vist_P;
	static FramePelicula vist_Peli;
	
	public static void main(String[] args) {

		vist_P = new FrameSala(); //Se crea al frame, Sala
		//vist_Peli  = new FramePelicula();
		
		Sala sala1 = new Sala(); //Se crea al modelo, sala
		sala1.comprarBoleta();
		
		//ControladorPelicula  ctrl = new ControladorPelicula(vist_Peli, sala1);
		ControladorSala  ctrl = new ControladorSala(vist_P, sala1);

	}
}
