package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

public class FramePelicula extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FramePelicula frame = new FramePelicula();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
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
		
		JComboBox comboBoxPeliculas = new JComboBox();
		comboBoxPeliculas.setEditable(true);
		comboBoxPeliculas.setBounds(112, 15, 314, 26);
		contentPane.add(comboBoxPeliculas);
		
		JLabel lblPelicula = new JLabel("Pelicula:");
		lblPelicula.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPelicula.setBounds(10, 11, 112, 26);
		contentPane.add(lblPelicula);
		
		JLabel lblImagen = new JLabel("Imagen");
		lblImagen.setBounds(10, 52, 211, 211);
		contentPane.add(lblImagen);
		
		JLabel lblTitulo = new JLabel("\"Titulo\"");
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTitulo.setBounds(247, 52, 120, 26);
		contentPane.add(lblTitulo);
		
		JLabel lblDirector = new JLabel("\"Director\"");
		lblDirector.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblDirector.setBounds(247, 94, 120, 26);
		contentPane.add(lblDirector);
		
		JLabel lblEdad = new JLabel("\"11\"");
		lblEdad.setForeground(new Color(0, 0, 0));
		lblEdad.setBackground(new Color(255, 255, 255));
		lblEdad.setFont(new Font("Impact", Font.PLAIN, 37));
		lblEdad.setBounds(257, 181, 74, 66);
		contentPane.add(lblEdad);
		
		JLabel lblDuracin = new JLabel("\"Duraci\u00F3n\"");
		lblDuracin.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblDuracin.setBounds(247, 141, 120, 26);
		contentPane.add(lblDuracin);
	}
}
