/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoorgpanel2;


import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import proyectoorgpanel2.Correo;

/**
 *
 * @author Carlos
 */

// panel que agrega los correos
public class Panel2 extends JPanel implements ActionListener{
    
    private JLabel LCorreo;
    private JTextField JTNombre;;
    private VentanaPrincipal ventana;
    private JButton Guardar;
    
    private List<Correo> listaCorreo;
    private Correo correo;
    public Panel2(VentanaPrincipal ventana) {
         
        this.ventana = ventana; // se añade a la ventana principal
         setBorder(BorderFactory.createTitledBorder("CORREO"));// nombtre del panel
         setLayout(null);
         listaCorreo = new ArrayList<Correo>();// lista de los correos
         
         LCorreo = new JLabel("Correo: ");// etiqueta del espacio para agregar el correo
         LCorreo.setBounds(30, 30, 100, 20); // tamaño de la etiqueta
         add(LCorreo);
         
         JTNombre = new JTextField();// espacio para escribir el correo
         JTNombre.setBounds(140, 30, 150, 20);// tamaño de este
         add(JTNombre);
         
         Guardar = new JButton("Guardar");// boton guardar
         Guardar.setBounds(140, 50, 150, 20);// tamaño del boton
         Guardar.addActionListener(this);// activacion del boton
         add(Guardar);  
         
        setBackground( Color.GRAY );// color del fondo el panel
        
    }
    
    // calse de la activacion del boton 
    @Override
    public void actionPerformed(ActionEvent e) {
        if(validarDatosCorreo(JTNombre.getText())){ // si es valido el correo se acativa un mesaje qie fue guadado correctamente
             correo = new Correo(JTNombre.getText());
             JOptionPane.showMessageDialog(this, "email valido", "guardado", JOptionPane.INFORMATION_MESSAGE);
             LCorreo.setForeground(Color.GREEN);
             listaCorreo.add(correo);
             JTNombre.requestFocus();
             vaciarDatos();// vacia los datos
       }else{// si el cotreo es inavlido manada mensaje de error
             JOptionPane.showMessageDialog(this, "email invalido", "intente de nuevo", JOptionPane.INFORMATION_MESSAGE);
             LCorreo.setForeground(Color.red);
             JTNombre.requestFocus();
         }
    }
    // metodo que valida los datos de la cadena de caracteres
    private boolean validarDatosCorreo(String Correo) {
        Pattern pat = null;
        Matcher mat = null;
        
        pat = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");// aquie es la validacion del correp con los caracteres que puede tener el correo
        mat = pat.matcher(Correo);
        
        if(mat.find()){
            return true;
        }else {
            return false;
        }
        
    }
    
    // se retorna la lista de correo actualizada
    public List<Correo> getListaCorreo() {
        return listaCorreo;
    }
    // vacia el campo tam pronto se manda un mensaje
    private void vaciarDatos() {
    JTNombre.setText("");
    
    }
         
    
     
    }
    
    
    
    
    
    
    

