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
	public ControladorCompra(FrameCompra frameCompra, Sala sala)
	{
		this.frameCompra = frameCompra;
		this.sala = sala;
		this.frameCompra.btnComprar.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("asas");
		//verifica que el comprador tenga edad y dinero suficiente para comprar la boleta
		int edad = Integer.parseInt(frameCompra.getTextFieldEdad().getText());
		int dinero = Integer.parseInt(frameCompra.getTextFieldDinero().getText());
		if( edad >= pelicula.getEdadMin() && dinero >= pelicula.getPrecio())
		{
			//creo espectador
			espectador = new Espectador(frameCompra.getTextFieldNombre().getText(), edad, dinero);
			sala.comprarBoleta();
			boleto = sala.getB();
			FrameBoleto frame = new FrameBoleto(edad, dinero, pelicula.getNombre(), frameCompra.getTextFieldNombre().getText(), boleto.getAsiento());
			frame.setVisible(true);
		}else {
			
		}
	}
	
}
