package Vista;

import Modelo.Sala;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.Color;
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

	Sala objSala = new Sala();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			try {
				FramePelicula frame = new FramePelicula();
				frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}

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
		comboBoxPeliculas.addItem(objSala.mostrarNombrePeli(0));
		comboBoxPeliculas.addItem(objSala.mostrarNombrePeli(1));
		comboBoxPeliculas.addItem(objSala.mostrarNombrePeli(2));
		comboBoxPeliculas.setBounds(112, 15, 314, 26);
		contentPane.add(comboBoxPeliculas);

		JLabel lblPelicula = new JLabel("Pelicula:");
		lblPelicula.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPelicula.setBounds(10, 11, 112, 26);
		contentPane.add(lblPelicula);
		
		lblImagen = new JLabel("Imagen");
		lblImagen.setBounds(10, 52, 211, 211);
		contentPane.add(lblImagen);

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

		/*String itemSeleecionado = (String)cv.getSelectedItem();
        if (objSala.mostrarNombrePeli(0).equals(itemSeleecionado)) {
            FramePelicula.setLblTitulo(objSala.mostrarNombrePeli(0));
            FramePelicula.lblDirector.setText(objSala.mostrarDirector(0));
            FramePelicula.lblEdad.setText(String.valueOf(objSala.mostrarEdadMin(0)));
            FramePelicula.lblDuracion.setText(String.valueOf(objSala.mostrarDuracion(0)));
        }
        if (objSala.mostrarNombrePeli(1).equals(itemSeleecionado)) {
            FramePelicula.lblTitulo.setText(objSala.mostrarNombrePeli(1));
            FramePelicula.lblDirector.setText(objSala.mostrarDirector(1));
            FramePelicula.lblEdad.setText(String.valueOf(objSala.mostrarEdadMin(1)));
            FramePelicula.lblDuracion.setText(String.valueOf(objSala.mostrarDuracion(1)));
        }
        if (objSala.mostrarNombrePeli(2).equals(itemSeleecionado)) {
            FramePelicula.lblTitulo.setText(objSala.mostrarNombrePeli(2));
            FramePelicula.lblDirector.setText(objSala.mostrarDirector(2));
            FramePelicula.lblEdad.setText(String.valueOf(objSala.mostrarEdadMin(2)));
            FramePelicula.lblDuracion.setText(String.valueOf(objSala.mostrarDuracion(2)));
        }
        */
	}
}
