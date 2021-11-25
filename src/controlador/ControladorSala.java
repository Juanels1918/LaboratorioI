package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;

import Modelo.Pelicula;
import Modelo.Sala;
import Vista.FrameCompra;
import Vista.FramePelicula;
import Vista.FrameSala;

public class ControladorSala implements ActionListener{

	private FrameSala Frame; //Vista
	private Sala model;		//Modelo
	static FramePelicula vist_Peli;
	static FrameCompra vist_Comp;
	
	static DefaultTableModel modelo;
	
	//Constructor
	public ControladorSala(FrameSala Frame, Sala model) {
		this.Frame = Frame;
		this.model = model; 
		this.Frame.btnavanzarHora.addActionListener(this);
		this.Frame.btncompBoletas.addActionListener(this);
		this.Frame.btnpeliculas.addActionListener(this);
		this.Frame.table.setModel(modeloTabla(this.model.getAsientos()));
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton boton;
		boton = (JButton) e.getSource();
		if(boton.getText().equals("Avanzar hora")) {
			model.setHora(2);
			model.setPeliculaActual((int) Math.floor(Math.random()*(3 - 1 + 1) + 0));
			Frame.setHora(model.getHora());
			System.out.println("asas");
		}
		if(boton.getText().equals("Comprar boletas")) {
			System.out.println("Comprar boletas");
			
			vist_Comp  = new FrameCompra();
			ControladorCompra  ctrl = new ControladorCompra(vist_Comp, model);
		}
		if(boton.getText().equals("Peliculas")) {
			System.out.println("Peliculas");
			vist_Peli  = new FramePelicula();
			vist_Peli.setVisible(true);
			ControladorPelicula  ctrl = new ControladorPelicula(vist_Peli, model);
		}
	}

	 public static DefaultTableModel modeloTabla(ArrayList<String> asientos){
		 
			modelo = new DefaultTableModel();
	        for(int i=0; i<4; i++) { modelo.addColumn(i);}
	        int i=15;
	        while (i>0) {
	        	String[] tit = new String[4];
	        	for (int j = 0; j < 4; j++) {
		        	tit[j] = asientos.get(i);
		        	i--;
				}
	        	modelo.addRow(tit);
			}
	        return modelo;
	        
	    }
}
