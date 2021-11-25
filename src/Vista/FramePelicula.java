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

	public static void setLblImagen(JLabel lblImagen) {
		FramePelicula.lblImagen = lblImagen;
	}

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 316);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 205, 170));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		comboBoxPeliculas = new JComboBox();
		comboBoxPeliculas.setBounds(112, 15, 314, 26);
		contentPane.add(comboBoxPeliculas);

		JLabel lblPelicula = new JLabel("Pelicula:");
		lblPelicula.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPelicula.setBounds(10, 11, 112, 26);
		contentPane.add(lblPelicula);
		
		lblImagen = new JLabel("Imagen");
		lblImagen.setBounds(10, 52, 211, 211);

		lblTitulo = new JLabel("Titulo");
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTitulo.setBounds(247, 52, 120, 26);
		contentPane.add(lblTitulo);

		lblDirector = new JLabel("Director");
		lblDirector.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblDirector.setBounds(247, 94, 120, 26);
		contentPane.add(lblDirector);
		
		lblEdad = new JLabel(String.valueOf(0));
		lblEdad.setForeground(new Color(0, 0, 0));
		lblEdad.setBackground(new Color(255, 255, 255));
		lblEdad.setFont(new Font("Impact", Font.PLAIN, 37));
		lblEdad.setBounds(257, 181, 74, 66);
		contentPane.add(lblEdad);
		
		lblDuracion = new JLabel(String.valueOf(0));
		lblDuracion.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblDuracion.setBounds(247, 141, 120, 26);
		contentPane.add(lblDuracion);

	}
}
