package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;

public class FrameBoleto extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameBoleto frame = new FrameBoleto();
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
	public FrameBoleto() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 402, 161);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(245, 222, 179));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblID = new JLabel("Boleto #");
		lblID.setFont(new Font("Consolas", Font.PLAIN, 16));
		lblID.setBounds(29, 11, 147, 40);
		contentPane.add(lblID);
		
		JLabel lblPrecio = new JLabel("$: ");
		lblPrecio.setFont(new Font("Consolas", Font.PLAIN, 16));
		lblPrecio.setBounds(257, 24, 109, 14);
		contentPane.add(lblPrecio);
		
		JLabel lblPelicula = new JLabel("Pelicula: ");
		lblPelicula.setFont(new Font("Consolas", Font.PLAIN, 16));
		lblPelicula.setBounds(29, 51, 369, 14);
		contentPane.add(lblPelicula);
		
		JLabel lblNombre = new JLabel("Nombre: ");
		lblNombre.setFont(new Font("Consolas", Font.PLAIN, 16));
		lblNombre.setBounds(29, 76, 337, 14);
		contentPane.add(lblNombre);
		
		JLabel lblAsiento = new JLabel("Asiento: ");
		lblAsiento.setFont(new Font("Consolas", Font.PLAIN, 17));
		lblAsiento.setBounds(29, 101, 128, 14);
		contentPane.add(lblAsiento);
		setTitle("BOLETO");
	}
}
