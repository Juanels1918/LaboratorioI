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
import java.awt.Color;

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
		setTitle("Comprar boleto");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 350, 402);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(72, 209, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPelicula = new JLabel("Pelicula:");
		lblPelicula.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPelicula.setBounds(10, 27, 95, 22);
		contentPane.add(lblPelicula);
		
		JTextField comboBoxPeliculas = new JTextField();
		comboBoxPeliculas.setEditable(false);
		comboBoxPeliculas.setBounds(115, 23, 211, 26);
		contentPane.add(comboBoxPeliculas);
		
		JLabel lblPrecio = new JLabel("Precio:");
		lblPrecio.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPrecio.setBounds(10, 92, 95, 22);
		contentPane.add(lblPrecio);
		
		textFieldPrecio = new JTextField();
		textFieldPrecio.setEditable(false);
		textFieldPrecio.setBounds(115, 92, 211, 22);
		contentPane.add(textFieldPrecio);
		textFieldPrecio.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNombre.setBounds(10, 172, 95, 25);
		contentPane.add(lblNombre);
		
		JLabel lblEdad = new JLabel("Edad:");
		lblEdad.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblEdad.setBounds(10, 222, 95, 25);
		contentPane.add(lblEdad);
		
		JLabel lblDinero = new JLabel("Dinero:");
		lblDinero.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDinero.setBounds(10, 272, 95, 25);
		contentPane.add(lblDinero);
		
		textFieldNombre = new JTextField();
		textFieldNombre.setBounds(115, 172, 211, 25);
		contentPane.add(textFieldNombre);
		textFieldNombre.setColumns(10);
		
		textFieldEdad = new JTextField();
		textFieldEdad.setColumns(10);
		textFieldEdad.setBounds(115, 222, 211, 25);
		contentPane.add(textFieldEdad);
		
		textFieldDinero = new JTextField();
		textFieldDinero.setColumns(10);
		textFieldDinero.setBounds(115, 272, 211, 25);
		contentPane.add(textFieldDinero);
		
		JButton btnComprar = new JButton("Comprar");
		btnComprar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnComprar.setBounds(105, 314, 136, 40);
		contentPane.add(btnComprar);
	}
}
