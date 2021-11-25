package Vista;

import javax.swing.*;

import javax.swing.table.DefaultTableModel;

import controlador.ControladorSala;
import java.awt.Color;
import java.awt.Image;

import javax.swing.border.LineBorder;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrameSala extends JFrame {
	
	static JPanel panel1;
    static JTextField tfdPelicula;
    private JTextField Pantalla;
    
    //Botones
    public JButton btnavanzarHora;
    public JButton btncompBoletas;
    public JButton btnpeliculas;
    
    static private JLabel hora;
    public JTable table;
    
   public FrameSala (){
    	panel1 = new JPanel(); 
    	panel1.setBackground(new Color(102, 205, 170));
    	setContentPane(panel1);
        setSize(432, 294);
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("El mejor cine do mundhino :3");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        panel1.setLayout(null);
        //Botones 
        panel1.add(avanzarHora());
        panel1.add(compBoletas());
        panel1.add(peliculas());
        panel1.add(pel_Edad());
        
        panel1.add(tfdPelicula());
        panel1.add(hora());
        
        JLabel LImagen = new JLabel();
		ImageIcon foto = new ImageIcon(this.getClass().getResource("/imagenes/baner.jpg"));
			Image imagen = foto.getImage() ;
			Image imagen2 = imagen.getScaledInstance(428, 83, Image.SCALE_SMOOTH);
		foto = new ImageIcon(imagen2);
		LImagen.setIcon(foto);
		LImagen.setBounds(0, 0, 428, 83);
		panel1.add(LImagen);
        panel1.add(table());
        {
        	Pantalla = new JTextField();
        	Pantalla.setEditable(false);
        	Pantalla.setHorizontalAlignment(SwingConstants.CENTER);
        	Pantalla.setText("Pantalla");
        	Pantalla.setBounds(195, 232, 199, 20);
        	panel1.add(Pantalla);
        	Pantalla.setColumns(10);
        }
        
        this.setVisible(true);
    }
    
 // -- -- -- JLABEL  
    
    public JLabel hora() {
    	hora = new JLabel("11:00");
    	hora.setHorizontalAlignment(SwingConstants.CENTER);
    	hora.setFont(new Font("Consolas", Font.BOLD, 40));
    	hora.setBounds(209, 127, 172, 47);
    	return hora;
	}
    
		    public void setHora(int h) {
		    	hora.setText(h+":00");
			}
    
    public JLabel pel_Edad() {
    	JLabel pel_Edad = new JLabel("Pelicula Actual:");
        pel_Edad.setFont(new Font("Tahoma", Font.PLAIN, 16));
        pel_Edad.setBounds(20, 94, 199, 16);
        return pel_Edad;
	}
   
 // -- -- -- JBUTTON   
    
    public JButton avanzarHora() {
    	btnavanzarHora = new JButton("Avanzar hora");
        btnavanzarHora.setBounds(20, 127, 147, 33);
        return btnavanzarHora;
	}
    
    
	public JButton compBoletas() {
		btncompBoletas = new JButton("Comprar boletas");
		btncompBoletas.setBounds(20, 171, 147, 33);
		return btncompBoletas;
		}
	public JButton peliculas() {
		btnpeliculas = new JButton("Peliculas");
		btnpeliculas.setBounds(20, 215, 147, 33);
		return btnpeliculas;
	}

	// -- -- -- JTABLE  
	
    public JTable table() {
        table = new JTable();
         table.setColumnSelectionAllowed(true);
         table.setCellSelectionEnabled(true);
         table.setBounds(195, 167, 199, 64);
         return table;
	}
    
	// -- -- -- JTEXTFIELD
    
    public JTextField tfdPelicula() {
    	tfdPelicula = new JTextField();
    	tfdPelicula.setEditable(false);
    	tfdPelicula.setBounds(170, 93, 235, 20);
         tfdPelicula.setColumns(10);
         return tfdPelicula;
	}

			public static void setTfdPelicula(String nomPel) {
				tfdPelicula.setText(nomPel);
			}
    		
    	
    
}
