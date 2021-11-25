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
    }

    @Override
    public void actionPerformed(ItemEvent e) {
        JComboBox cv;
        cv = (JComboBox) e.getSource();

    }
}
