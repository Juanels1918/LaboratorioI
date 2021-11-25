package Vista;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import controlador.Controlador;
import java.awt.Color;
import java.awt.Image;

import javax.swing.border.LineBorder;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrameSala extends JFrame {
	
	static JPanel panel1;
    static DefaultTableModel modelo;
    static JTextField tfdPelicula;
    private JTextField tfdSiguiente;
    private JTextField Pantalla;

    public FrameSala (){
    	panel1 = new JPanel(); 
    	panel1.setBackground(new Color(102, 205, 170));
    	setContentPane(panel1);
        setSize(432, 360);
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("El mejor cine do mundhino :3");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        panel1.setLayout(null);
        
        panel1.add(avanzarHora());
        panel1.add(compBoletas());
        panel1.add(peliculas());
        
        panel1.add(sgtPel());
        panel1.add(pel_Edad());
        
        panel1.add(campo());
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
        
        tfdSiguiente = new JTextField();
        tfdSiguiente.setBounds(170, 120, 235, 20);
        panel1.add(tfdSiguiente);
        tfdSiguiente.setColumns(10);
        {
        	Pantalla = new JTextField();
        	Pantalla.setEditable(false);
        	Pantalla.setHorizontalAlignment(SwingConstants.CENTER);
        	Pantalla.setText("Pantalla");
        	Pantalla.setBounds(195, 282, 199, 20);
        	panel1.add(Pantalla);
        	Pantalla.setColumns(10);
        }
        
        this.setVisible(true);
    }
    
    public JTextField campo() {
    	tfdPelicula = new JTextField();
    	tfdPelicula.setEditable(false);
    	tfdPelicula.setBounds(170, 93, 235, 20);
         tfdPelicula.setColumns(10);
         return tfdPelicula;
	}
    
    public JLabel hora() {
    	JLabel hora = new JLabel("11:40");
    	hora.setHorizontalAlignment(SwingConstants.CENTER);
    	hora.setFont(new Font("Consolas", Font.BOLD, 40));
    	hora.setBounds(206, 166, 172, 47);
    	return hora;
	}
    
    public JLabel sgtPel() {
    	 JLabel sgtPel = new JLabel("Siguiente pelicula: ");
         sgtPel.setFont(new Font("Tahoma", Font.PLAIN, 16));
         sgtPel.setBounds(20, 121, 140, 19);
        return sgtPel;
	}
    
    public JLabel pel_Edad() {
    	JLabel pel_Edad = new JLabel("Pelicula Actual:");
        pel_Edad.setFont(new Font("Tahoma", Font.PLAIN, 16));
        pel_Edad.setBounds(20, 94, 199, 16);
        return pel_Edad;
	}
    
    public JButton avanzarHora() {
    	JButton btnavanzarHora = new JButton("Avanzar hora");
        btnavanzarHora.setBounds(20, 188, 147, 33);
        return btnavanzarHora;
	}
	public JButton compBoletas() {
		JButton btncompBoletas = new JButton("Comprar boletas");
		btncompBoletas.setBounds(20, 232, 147, 33);
		return btncompBoletas;
		}
	public JButton peliculas() {
		JButton btnpeliculas = new JButton("Peliculas");
		btnpeliculas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnpeliculas.setBounds(20, 276, 147, 33);
		return btnpeliculas;
	}
    public JTable table() {
        JTable table = new JTable();
        table.setModel(new DefaultTableModel(
        	new Object[][] {
        		{null, null, null, null},
        		{null, null, null, null},
        		{null, null, null, null},
        		{null, null, null, null},
        	},
        	new String[] {
        		"New column", "New column", "New column", "New column"
        	}
        ));
         table.setColumnSelectionAllowed(true);
         table.setCellSelectionEnabled(true);
         table.setBounds(195, 215, 199, 64);
         return table;
	}
    
    public static DefaultTableModel tabla(){
		modelo = new DefaultTableModel();
		//int[][] n = Controlador.getArrayNumeros();
        for(int i=0; i<4; i++) { modelo.addColumn(i);}
        for(int i=0; i<4; i++) { 
        	//String[] tit = {aCadena(n[i][0]),aCadena(n[i][1]),aCadena(n[i][2]),aCadena(n[i][3]),aCadena(n[i][4]),aCadena(n[i][5]),aCadena(n[i][6]),aCadena(n[i][7]),aCadena(n[i][8]),};
     	//modelo.addRow(i);
     	}
        return modelo;
        
    }
}
