package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class FrameCompra extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldPrecio;
	private JTextField textFieldNombre;
	private JTextField textFieldEdad;
	private JTextField textFieldDinero;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameCompra frame = new FrameCompra();
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
	public FrameCompra() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 389, 475);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPelicula = new JLabel("Pelicula:");
		lblPelicula.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPelicula.setBounds(51, 28, 95, 22);
		contentPane.add(lblPelicula);
		
		JComboBox comboBoxPeliculas = new JComboBox();
		comboBoxPeliculas.setEditable(true);
		comboBoxPeliculas.setBounds(156, 28, 140, 26);
		contentPane.add(comboBoxPeliculas);
		
		JLabel lblPrecio = new JLabel("Precio:");
		lblPrecio.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPrecio.setBounds(51, 97, 85, 22);
		contentPane.add(lblPrecio);
		
		textFieldPrecio = new JTextField();
		textFieldPrecio.setBounds(156, 97, 140, 22);
		contentPane.add(textFieldPrecio);
		textFieldPrecio.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNombre.setBounds(51, 177, 114, 25);
		contentPane.add(lblNombre);
		
		JLabel lblEdad = new JLabel("Edad:");
		lblEdad.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblEdad.setBounds(51, 227, 82, 25);
		contentPane.add(lblEdad);
		
		JLabel lblDinero = new JLabel("Dinero:");
		lblDinero.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDinero.setBounds(51, 277, 82, 25);
		contentPane.add(lblDinero);
		
		textFieldNombre = new JTextField();
		textFieldNombre.setBounds(156, 177, 140, 25);
		contentPane.add(textFieldNombre);
		textFieldNombre.setColumns(10);
		
		textFieldEdad = new JTextField();
		textFieldEdad.setColumns(10);
		textFieldEdad.setBounds(156, 227, 140, 25);
		contentPane.add(textFieldEdad);
		
		textFieldDinero = new JTextField();
		textFieldDinero.setColumns(10);
		textFieldDinero.setBounds(156, 277, 140, 25);
		contentPane.add(textFieldDinero);
		
		JButton btnComprar = new JButton("Comprar");
		btnComprar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnComprar.setBounds(137, 355, 136, 40);
		contentPane.add(btnComprar);
	}
}
