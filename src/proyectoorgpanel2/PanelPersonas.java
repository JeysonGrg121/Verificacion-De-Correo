/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoorgpanel2;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

/**
 *
 * @author Carlos
 */
// calse del panel de mostrar las personas 
public class PanelPersonas extends JPanel implements ActionListener{
  
    JButton BVista;
    private DialogoVistaPersonas dialog;
    private VentanaPrincipal ventana;
    
    
    public PanelPersonas(VentanaPrincipal ventana) {
         this.ventana = ventana;
         setBorder(BorderFactory.createTitledBorder("General"));// nombre del oanel
         setLayout(null);
         
         BVista = new JButton("Ver Personas");// boton para ver las perosnas
         BVista.setFont(new Font("Serif", Font.BOLD, 18));
         BVista.addActionListener(this);
         BVista.setBounds(130, 10, 150, 20);
         add(BVista);
         
       
        setBackground( Color.GRAY );// color de fondo
         
         dialog = new DialogoVistaPersonas(this.ventana);
         
    }
    // activacion del boton
    @Override
    public void actionPerformed(ActionEvent e) {
        dialog.actualizarTabla();// se manda la activacion a la calse de dialogo personas
        dialog.setVisible(true);// se hace visible la ventana
        
    }
    
    
    
}
