package controlador;

import Modelo.Boleto;
import Modelo.Espectador;
import Modelo.Sala;
import Vista.FrameBoleto;
import Vista.FrameCompra;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ControladorCompra implements ActionListener
{
	
	//Atributos
	private FrameCompra frameCompra; 		//Vista
	private Boleto boleto;					//Modelos
	private Espectador espectador;
	private Sala sala;
	static private int id;
	
	
	//Constructor
	public ControladorCompra(FrameCompra frameCompra, Sala sala)
	{
		this.frameCompra = frameCompra;
		this.sala = sala;
		this.frameCompra.btnComprar.addActionListener(this);
		this.frameCompra.setTextFieldPeliculas(sala.getPeliculaActual());
		for (int i = 0; i < 3; i++) { //Obtener el ID de la pelicula actual
			if (sala.mostrarNombrePeli(i).equals(sala.getPeliculaActual())) {
				id = i;
				break;
			}
		}
		this.frameCompra.setTextFieldPrecio(sala.mostrarPrecio(id));
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		try {
			//verifica que el comprador tenga edad y dinero suficiente para comprar la boleta
			int edad = Integer.parseInt(frameCompra.getTextFieldEdad().getText());
			int dinero = Integer.parseInt(frameCompra.getTextFieldDinero().getText());
			
			if( edad >= sala.mostrarEdadMin(id))
			{
				if (dinero >= sala.mostrarPrecio(id)) {
					//Cumplidos los dos parametros, Crea espectador
					espectador = new Espectador(frameCompra.getTextFieldNombre().getText(), frameCompra.getTextFieldEdad().getText(), frameCompra.getTextFieldDinero().getText());
		
					boleto = sala.comprarBoleta(); //Generar boleto y traerlo
					
					//String id, String precio, String pelicula, String nombre, String asiento
					FrameBoleto frame = new FrameBoleto(boleto.getId(), frameCompra.getTextFieldPrecio().getText(), boleto.getNombrePelicula(), espectador.getNombre(), boleto.getAsiento().toString());
					frameCompra.setVisible(false);
					frame.setVisible(true);
					ControladorSala.actualizarTabla();
				} else {
					JOptionPane.showMessageDialog(frameCompra, "Dinero insuficiente");
				}
			}else {
				JOptionPane.showMessageDialog(frameCompra, "Edad minima no cumplida");
			}
			
		} catch (NumberFormatException e2) { //Si no se digita algo en los espacios de números el programa maneja el error indicando
			JOptionPane.showMessageDialog(frameCompra, "Digite en los espacios vacios");
		}
		
	}
	
}
