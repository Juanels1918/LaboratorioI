package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;

import Modelo.Sala;
import Vista.FrameSala;

public class ControladorSala implements ActionListener{

	private FrameSala Frame; //Vista
	private Sala model;		//Modelo
	
	
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
			model.setHora(3);
			Frame.setHora(model.getHora());
		}
		if(boton.getText().equals("Comprar boletas")) {
			System.out.println("Comprar boletas");
		}
		if(boton.getText().equals("Peliculas")) {
			System.out.println("Peliculas");
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
