package pruebasventanas;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ventana extends JFrame{
    
    // Atributos.
    JPanel menu = new JPanel();
    JButton boton = new JButton();
    JTextArea areaTexto = new JTextArea();
    
    // Constructor de la ventana.
    public ventana ()
    {
        setBounds(50, 50, 450, 500);
        setTitle("Ejercicio");
        setVisible(true);
        setLocationRelativeTo(null);
        
        agregarElementos();
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void agregarElementos() {
        
        agregarPanel();
        //agregarCajaTextoChico();
        agregarCajaTextoGrande();
        agregarBotones();
    }
    
    // Método de panel.
    private void agregarPanel()
    {
        menu.setLayout(null);
        menu.setBackground(Color.yellow);
        
        this.getContentPane().add(menu);
    }
    
    private void agregarCajaTextoChico()
    {
        // Instanciar objeto de tipo TextField.
        JTextField cajaChica = new JTextField("Escribe aquí");
        
        // Asignar dimensiones al objeto.
        cajaChica.setBounds(50, 50, 200, 30);
        
        // Añadir objeto al panel.
        menu.add(cajaChica);
    }
    
    private void agregarCajaTextoGrande()
    {   
        // Asignar dimensiones al objeto.
        areaTexto.setBounds(20, 20, 300, 200);
        
        // Añadir objeto al panel.
        menu.add(areaTexto);
    }
    
    private void agregarBotones()
    {
        boton.setBounds(100, 250, 150, 50);
        
        menu.add(boton);
        agregarOyenteRaton();
    }
    
    private void agregarOyenteRaton()
    {
        MouseListener oyenteRaton = new MouseListener()
        {
            @Override
            public void mouseClicked(MouseEvent me) {
                areaTexto.append("Mouse hizo clic dentro del boton\n");
            }

            @Override
            public void mousePressed(MouseEvent me) {
                areaTexto.append("Mouse se esta presionando\n");
            }

            @Override
            public void mouseReleased(MouseEvent me) {
                areaTexto.append("Mouse hizo clic dentro o fuera del boton\n");
            }

            @Override
            public void mouseEntered(MouseEvent me) {
                areaTexto.append("Mouse entró al boton\n");
            }

            @Override
            public void mouseExited(MouseEvent me) {
                areaTexto.append("Mouse salió del boton\n");
            }
        };
        
        boton.addMouseListener(oyenteRaton);
    }
    
}
