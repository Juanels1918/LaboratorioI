package Vista;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class FrameCompra extends JFrame {
	
	private JPanel contentPane;
	private JTextField textFieldPrecio;
	private JTextField textFieldNombre;
	private JTextField textFieldEdad;
	private JTextField textFieldDinero;
	private JTextField tfdPeliculas;
	public JButton btnComprar;

	/**
	 * Create the frame.
	 */
	public FrameCompra() {
		contentPane = new JPanel();
		setTitle("Comprar boleto");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 350, 336);
		contentPane.setBackground(new Color(32, 178, 170));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPelicula = new JLabel("Pelicula:");
		lblPelicula.setFont(new Font("Corbel", Font.PLAIN, 20));
		lblPelicula.setBounds(10, 27, 95, 22);
		contentPane.add(lblPelicula);
		
		tfdPeliculas = new JTextField();
		tfdPeliculas.setEditable(false);
		tfdPeliculas.setBounds(115, 23, 211, 26);
		contentPane.add(tfdPeliculas);
		
		JLabel lblPrecio = new JLabel("Precio:");
		lblPrecio.setFont(new Font("Corbel", Font.PLAIN, 20));
		lblPrecio.setBounds(10, 60, 95, 22);
		contentPane.add(lblPrecio);
		
		textFieldPrecio = new JTextField();
		textFieldPrecio.setEditable(false);
		textFieldPrecio.setBounds(115, 60, 211, 22);
		contentPane.add(textFieldPrecio);
		textFieldPrecio.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Corbel", Font.PLAIN, 20));
		lblNombre.setBounds(10, 133, 95, 25);
		contentPane.add(lblNombre);
		
		JLabel lblEdad = new JLabel("Edad:");
		lblEdad.setFont(new Font("Corbel", Font.PLAIN, 20));
		lblEdad.setBounds(10, 169, 95, 25);
		contentPane.add(lblEdad);
		
		JLabel lblDinero = new JLabel("Dinero:");
		lblDinero.setFont(new Font("Corbel", Font.PLAIN, 20));
		lblDinero.setBounds(10, 205, 95, 25);
		contentPane.add(lblDinero);
		
		textFieldNombre = new JTextField();
		textFieldNombre.setBounds(115, 133, 211, 25);
		contentPane.add(textFieldNombre);
		textFieldNombre.setColumns(10);
		
		textFieldEdad = new JTextField();
		textFieldEdad.setColumns(10);
		textFieldEdad.setBounds(115, 169, 211, 25);
		contentPane.add(textFieldEdad);
		
		textFieldDinero = new JTextField();
		textFieldDinero.setColumns(10);
		textFieldDinero.setBounds(115, 205, 211, 25);
		contentPane.add(textFieldDinero);
		contentPane.add(btnComprar());
		
		JLabel lblEspectador = new JLabel("Espectador");
		lblEspectador.setFont(new Font("Corbel", Font.PLAIN, 20));
		lblEspectador.setBounds(109, 97, 136, 25);
		contentPane.add(lblEspectador);
		this.setVisible(true);
	}
	
	public JButton btnComprar()
	{
		btnComprar = new JButton("Comprar");
		btnComprar.setFont(new Font("Corbel", Font.PLAIN, 20));
		btnComprar.setBounds(97, 241, 136, 40);
		return btnComprar;
	}
	
	// --- -- -- Setters & Getters
	
	public JTextField getTextFieldPeliculas() {
		return tfdPeliculas;
	}

	public void setTextFieldPeliculas(String Pelicula) {
		this.tfdPeliculas.setText(Pelicula);
	}

	public JTextField getTextFieldPrecio() {
		return textFieldPrecio;	
	}

	public JTextField getTextFieldNombre() {
		return textFieldNombre;
	}

	public JTextField getTextFieldEdad() {
		return textFieldEdad;
	}

	public JTextField getTextFieldDinero() {
		return textFieldDinero;
	}

	public void setTextFieldPrecio(Double dinero) {
		this.textFieldPrecio.setText(Double.toString(dinero));
	}

	public void setTextFieldNombre(JTextField textFieldNombre) {
		this.textFieldNombre = textFieldNombre;
	}

	public void setTextFieldEdad(JTextField textFieldEdad) {
		this.textFieldEdad = textFieldEdad;
	}
}
