/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoorgpanel2;

/**
 *
 * @author HP
 */
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

// clase del panel de la informacion que se ha creado...
public class PanelCorreo extends JPanel implements ActionListener{
  
    
    JButton BCorreo;
    private VentanaPrincipal principal;
    private DialogoVistaCorreos dialogcorr;
    
    public PanelCorreo(VentanaPrincipal principal) {
         this.principal = principal;// se añade a la ventan aprincipal
         setBorder(BorderFactory.createTitledBorder("Correo"));// nombre del panel
         setLayout(null);
         
         BCorreo = new JButton("Ver Correos");// boton para ver los correos
         BCorreo.setFont(new Font("Serif", Font.BOLD, 18));
         BCorreo.addActionListener(this);
         BCorreo.setBounds(130, 10, 150, 20);
         add(BCorreo);
         
        setBackground( Color.GRAY );// fonde fel panel
        
         dialogcorr = new DialogoVistaCorreos(this.principal);
    }
// activacion del botton
    @Override
    public void actionPerformed(ActionEvent e) {
        dialogcorr.actualizarTablacORREOS();// se manda a la clase de dialogo correos
        dialogcorr.setVisible(true);// se hace visible la ventana
    }
    
    
    
}
