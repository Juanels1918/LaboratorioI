package Vista;

import Modelo.Sala;

import java.awt.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FramePelicula extends JFrame {

	private JPanel contentPane;
	public JComboBox comboBoxPeliculas;

	public static void setLblTitulo(String titulo) {
		lblTitulo.setText(titulo);
	}

	public static void setLblDirector(JLabel lblDirector) {
		FramePelicula.lblDirector = lblDirector;
	}

	public static void setLblEdad(JLabel lblEdad) {
		FramePelicula.lblEdad = lblEdad;
	}

	public static void setLblDuracion(JLabel lblDuracion) {
		FramePelicula.lblDuracion = lblDuracion;
	}

	public static JLabel lblImagen;
	public static JLabel lblTitulo;
	public static JLabel lblDirector;
	public static JLabel lblEdad;
	public static JLabel lblDuracion;

	/**
	 * Create the frame.
	 */
	public FramePelicula() {
		setTitle("Peliculas");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 416);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(32, 178, 170));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		comboBoxPeliculas = new JComboBox();
		comboBoxPeliculas.setBounds(112, 15, 314, 26);
		contentPane.add(comboBoxPeliculas);

		JLabel lblPelicula = new JLabel("Pelicula:");
		lblPelicula.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPelicula.setBounds(10, 11, 112, 26);
		contentPane.add(lblPelicula);
		
		lblImagen = new JLabel();
		lblImagen.setBounds(10, 52, 211, 300);
		contentPane.add(lblImagen);
		
		lblTitulo = new JLabel("Titulo");
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblTitulo.setBounds(247, 57, 120, 26);
		contentPane.add(lblTitulo);

		lblDirector = new JLabel("Director");
		lblDirector.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblDirector.setBounds(247, 94, 150, 26);
		contentPane.add(lblDirector);
		
		lblEdad = new JLabel(String.valueOf(0));
		lblEdad.setForeground(new Color(0, 0, 0));
		lblEdad.setBackground(new Color(255, 255, 255));
		lblEdad.setFont(new Font("Impact", Font.PLAIN, 37));
		lblEdad.setBounds(257, 186, 74, 66);
		contentPane.add(lblEdad);
		
		lblDuracion = new JLabel(String.valueOf(0));
		lblDuracion.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblDuracion.setBounds(247, 141, 150, 26);
		contentPane.add(lblDuracion);
		
		JLabel lblNewLabel = new JLabel("Edad min:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(244, 178, 150, 14);
		contentPane.add(lblNewLabel);

	}
}
