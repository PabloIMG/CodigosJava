package tutoria6;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Maquina extends JFrame{
    
    // Atributos.
    JPanel expendedora = new JPanel();
    JLabel bebida = new JLabel("¿Coca o Pepsi?");
    JButton cocaCola = new JButton("Opción A");
    JButton pepsi = new JButton("Opción B");
    
    // Método contructor.
    public Maquina()
    {
        setBounds(100, 50, 600, 400);
        setTitle("Maquina Expendedora");
        setVisible(true);
        
        llamarMaquina();
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    // Métodos.
    private void llamarMaquina()
    {
        llamarPanel();
        llamarMensaje();
        llamarBotones();
    }
    
    private void llamarPanel()
    {
        expendedora.setLayout(null);
        expendedora.setBackground(Color.RED);
        
        this.getContentPane().add(expendedora);
    }
    
    private void llamarMensaje()
    {
        bebida.setBounds(200, 50, 150, 30);
        bebida.setFont(new Font("comic sans", 0, 20));
        
        expendedora.add(bebida);
    }
    
    private void llamarBotones()
    {
        cocaCola.setBounds(50, 90, 200, 50);
        pepsi.setBounds(310, 90, 200, 50);
        
        cocaCola.setBackground(Color.WHITE);
        pepsi.setBackground(Color.BLUE);
        
        cocaCola.setFont(new Font("times new roman", 0, 20));
        pepsi.setFont(new Font("times new roman", 0, 20));
        
        expendedora.add(cocaCola);
        expendedora.add(pepsi);
        
        JLabel imagen = new JLabel();
        imagen.setBounds(100, 180, 375, 150);
        
        /* Métodos. */
        
        // Añadir Coca-Cola.
        ActionListener opcionA = (ActionEvent ae) -> {
            
            imagen.setIcon(new ImageIcon("cocacola.png"));
            expendedora.add(imagen);
            
        };
        
        // Añadir Pepsi.
        ActionListener opcionB = (ActionEvent ae) -> {
            
            imagen.setIcon(new ImageIcon("pepsi.png"));
            expendedora.add(imagen);
            
        };
        
        // Añadir eventos.
        cocaCola.addActionListener(opcionA);
        pepsi.addActionListener(opcionB);
    }
    
}
