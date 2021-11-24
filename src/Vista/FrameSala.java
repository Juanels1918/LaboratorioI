package Vista;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import controlador.Controlador;
import java.awt.Color;
import java.awt.Image;

import javax.swing.border.LineBorder;
import java.awt.Font;

public class FrameSala extends JFrame {
	
	static JPanel panel1;
    static DefaultTableModel modelo;
    private static JTable table;
    static JTextField campo;

    public FrameSala (){
    	panel1 = new JPanel(); 
    	panel1.setBackground(new Color(102, 205, 170));
        setSize(567, 360);
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("El mejor cine do mundhino :3");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        setContentPane(panel1);
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
			Image imagen2 = imagen.getScaledInstance(394, 83, Image.SCALE_SMOOTH);
		foto = new ImageIcon(imagen2);
		LImagen.setIcon(foto);
		LImagen.setBounds(0, 0, 394, 83);
		panel1.add(LImagen);

        panel1.add(table());
    }
    
    public JTextField campo() {
    	campo = new JTextField();
    	campo.setEditable(false);
    	campo.setBounds(20, 122, 123, 20);
         campo.setColumns(10);
         return campo;
	}
    
    public JLabel hora() {
    	JLabel hora = new JLabel("11:40");
    	hora.setHorizontalAlignment(SwingConstants.CENTER);
    	hora.setFont(new Font("Consolas", Font.BOLD, 40));
    	hora.setBounds(391, 0, 172, 83);
    	return hora;
	}
    
    public JLabel sgtPel() {
    	 JLabel sgtPel = new JLabel("Siguiente pelicula: ");
         sgtPel.setFont(new Font("Tahoma", Font.PLAIN, 16));
         sgtPel.setBounds(20, 104, 140, 14);
        return sgtPel;
	}
    
    public JLabel pel_Edad() {
    	JLabel pel_Edad = new JLabel("Pelicula + Edad ");
        pel_Edad.setFont(new Font("Tahoma", Font.PLAIN, 16));
        pel_Edad.setBounds(308, 109, 199, 14);
        return pel_Edad;
	}
    
    public JButton avanzarHora() {
    	JButton avanzarHora = new JButton("Avanzar hora");
        avanzarHora.setBounds(20, 153, 147, 33);
        return avanzarHora;
	}
	public JButton compBoletas() {
		JButton compBoletas = new JButton("Comprar boletas");
		compBoletas.setBounds(20, 197, 147, 33);
		return compBoletas;
		}
	public JButton peliculas() {
		JButton peliculas = new JButton("Pelicula");
		peliculas.setBounds(20, 241, 147, 33);
		return peliculas;
	}
    public JTable table() {
    	 table = new JTable();
         table.setColumnSelectionAllowed(true);
         table.setCellSelectionEnabled(true);
         table.setBounds(203, 153, 299, 160);
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
