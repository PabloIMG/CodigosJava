package borradorjuego;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Juego extends JFrame{
    
    // Atributos.
    JPanel menu = new JPanel();
    JPanel juego = new JPanel();
    JLabel titulo = new JLabel();
    int puntaje = 0;
    
    // Constructor.
    public Juego()
    {
        setBounds(100, 100, 500, 500);
        setTitle("Super Mouse Clicker");
        setVisible(true);
        setLocationRelativeTo(null);
        
        agregarElementos();
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    // Métodos.
    private void agregarElementos()
    {
        crearMenu();
        agregarTitulo(1);
        agregarBoton();
    }
    
    private void crearMenu()
    {
        menu.setLayout(null);
        menu.setBackground(java.awt.Color.GREEN);
        
        this.getContentPane().add(menu);
    }
    
    private void crearJuego()
    {
        juego.setLayout(null);
        juego.setBackground(Color.MAGENTA);
        
        agregarTitulo(2);
        
        agregarBotonJuego();
        
        this.getContentPane().add(juego);
    }
    
    private void agregarTitulo(int modo)
    {
        if(modo == 1)
        {
            titulo.setBounds(30, 10, 400, 30);
            titulo.setText("SUPER MOUSE CLICKER");
            titulo.setFont(new Font("cooper black", 0, 30));
        
            menu.add(titulo);
        }
        else
        {
            titulo.setBounds(30, 10, 400, 30);
            titulo.setText("Puntaje: " + puntaje);
            titulo.setFont(new Font("cooper black", 0, 30));
        
            juego.add(titulo);
        }
    }
    
    private void agregarBoton()
    {
        JButton botonInicio = new JButton("Iniciar juego");
        
        botonInicio.setFont(new Font("cooper black", 0, 20));
        botonInicio.setBounds(150, 300, 200, 100);
        botonInicio.setBackground(Color.PINK);
        
        ActionListener iniciarJuego = (ActionEvent ae) -> {
            getContentPane().remove(menu);
            getContentPane().add(juego);
            crearJuego();
            revalidate();
        };
        
        botonInicio.addActionListener(iniciarJuego);
        
        menu.add(botonInicio);
    }
    
    private void agregarBotonJuego()
    {
        JButton botonJuego = new JButton("Clic!!");
        
        botonJuego.setFont(new Font("cooper black", 0, 20));
        botonJuego.setBounds((int)(Math.random()*500), (int)(Math.random()*400)+41, 100, 50);
        botonJuego.setBackground(Color.cyan);
        
        juego.add(botonJuego);
        
        ActionListener clic = (ActionEvent ae) -> {
            botonJuego.setBounds((int)(Math.random()*300), (int)(Math.random()*400)+41, 100, 50);
            puntaje++;
            titulo.setText("Puntaje: " + puntaje);
        };
        
        botonJuego.addActionListener(clic);
    }
}
