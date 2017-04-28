/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoorgpanel2;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

/**
 *
 * @author Carlos
 */
// clase que añade la imagne del registro
public class PanelAgregarFoto extends JPanel {
    
    private JLabel Imagen;
    private JLabel imagenPrincipal;
    private VentanaPrincipal ventana;
    
    public PanelAgregarFoto(VentanaPrincipal ventana){
        this.ventana= ventana;// se añade a la ventana principal
        
        FlowLayout layout = new FlowLayout( );
        layout.setHgap( 0 );
        layout.setVgap( -45 );
        setLayout( layout );
        
        ImageIcon icono = new ImageIcon( "src/Imagen/registro.jpeg" );// direccion de la imagen
        
        imagenPrincipal = new JLabel( "" );
        imagenPrincipal.setIcon( icono );
        add( imagenPrincipal );
        
        setBackground( Color.GRAY );// color de fondo
        setBorder( new LineBorder( Color.ORANGE ) );// color del borde le la imagen
    }
    
    
}

