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

		try {
			vist_P = new FrameSala(); //Se crea al frame, Sala
			Sala sala1 = new Sala(); //Se crea al modelo, sala
			ControladorSala  ctrl = new ControladorSala(vist_P, sala1);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}