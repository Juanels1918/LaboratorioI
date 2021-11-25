package controlador;

import Modelo.Boleto;
import Modelo.Espectador;
import Modelo.Pelicula;
import Modelo.Sala;
import Vista.FrameBoleto;
import Vista.FrameCompra;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorCompra implements ActionListener
{
 
	/*¨
	 * Atributos
	 */
	private FrameCompra frameCompra; //vista
	//modelos
	private Boleto boleto;
	private Espectador espectador;
	private Pelicula pelicula;
	private Sala sala;
	
	//constructor
	public ControladorCompra(FrameCompra frameCompra, Pelicula pelicula, Sala sala)
	{
		this.frameCompra = frameCompra;
		this.pelicula = pelicula;
		this.sala = sala;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		//verifica que el comprador tenga edad y dinero suficiente para comprar la boleta
		int edad = Integer.parseInt(frameCompra.getTextFieldEdad().getText());
		int dinero = Integer.parseInt(frameCompra.getTextFieldDinero().getText());
		if( edad >= pelicula.getEdadMin() && dinero >= pelicula.getPrecio())
		{
			//creo espectador
			espectador = new Espectador(frameCompra.getTextFieldNombre().getText(), edad, dinero);
			sala.comprarBoleta();
			FrameBoleto frame = new FrameBoleto(edad, dinero, pelicula.getNombre(), frameCompra.getTextFieldNombre().getText(), boleto.getAsiento());
			frame.setVisible(true);
		}else {
			
		}
	}

	//getters and setter
	public FrameCompra getFrameCompra() {
		return frameCompra;
	}

	public void setFrameCompra(FrameCompra frameCompra) {
		this.frameCompra = frameCompra;
	}

	public Boleto getBoleto() {
		return boleto;
	}

	public void setBoleto(Boleto boleto) {
		this.boleto = boleto;
	}

	public Espectador getEspectador() {
		return espectador;
	}

	public void setEspectador(Espectador espectador) {
		this.espectador = espectador;
	}

	public Pelicula getPelicula() {
		return pelicula;
	}

	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}

	public Sala getSala() {
		return sala;
	}

	public void setSala(Sala sala) {
		this.sala = sala;
	}
	
}
