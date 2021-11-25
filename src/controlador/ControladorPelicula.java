package controlador;

import Modelo.Pelicula;
import Modelo.Sala;
import Vista.FramePelicula;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;

public class ControladorPelicula implements ActionListener {

    private FramePelicula vista;
    private Sala objSala;

    public ControladorPelicula (FramePelicula vista, Sala objSala){
        this.vista = vista;
        this.objSala = objSala;
        this.vista.comboBoxPeliculas.addActionListener(this);
        this.vista.comboBoxPeliculas.addItem(objSala.mostrarNombrePeli(0));
        this.vista.comboBoxPeliculas.addItem(objSala.mostrarNombrePeli(1));
        this.vista.comboBoxPeliculas.addItem(objSala.mostrarNombrePeli(2));
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		JComboBox combo;
		combo = (JComboBox) e.getSource();
		
	    if (objSala.mostrarNombrePeli(0).equals(combo.getSelectedItem())) {
            FramePelicula.lblTitulo.setText(objSala.mostrarNombrePeli(0));
            FramePelicula.lblDirector.setText(objSala.mostrarDirector(0));
            FramePelicula.lblEdad.setText(String.valueOf(objSala.mostrarEdadMin(0)));
            FramePelicula.lblDuracion.setText(String.valueOf(objSala.mostrarDuracion(0)));
        }
        if (objSala.mostrarNombrePeli(1).equals(combo.getSelectedItem())) {
            FramePelicula.lblTitulo.setText(objSala.mostrarNombrePeli(1));
            FramePelicula.lblDirector.setText(objSala.mostrarDirector(1));
            FramePelicula.lblEdad.setText(String.valueOf(objSala.mostrarEdadMin(1)));
            FramePelicula.lblDuracion.setText(String.valueOf(objSala.mostrarDuracion(1)));
        }
        if (objSala.mostrarNombrePeli(2).equals(combo.getSelectedItem())) {
            FramePelicula.lblTitulo.setText(objSala.mostrarNombrePeli(2));
            FramePelicula.lblDirector.setText(objSala.mostrarDirector(2));
            FramePelicula.lblEdad.setText(String.valueOf(objSala.mostrarEdadMin(2)));
            FramePelicula.lblDuracion.setText(String.valueOf(objSala.mostrarDuracion(2)));
        }
	}


}
