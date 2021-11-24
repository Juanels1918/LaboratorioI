package Vista;

import javax.swing.*;

public class Sala extends JFrame {
    private JPanel panel1;

    public Sala (){
        setContentPane(panel1);
        setSize(600, 300);
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("El mejor cine do mundo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

}
