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
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

/**
 *
 * @author Carlos
 */

// panel de la persona que se va a agregar
public class Panel1 extends JPanel implements ActionListener{
    
    JLabel LNombre, LGenero, LNacionalidad;
    JTextField JTNombre;
    JComboBox CMGenero, CBNacionalidad;
    JButton BGuardar;
    
    private List<Persona> listaArtista;// lista de las personas
    private Persona artista;
    private VentanaPrincipal ventana;
            
    public Panel1(VentanaPrincipal ventana) {
         this.ventana = ventana;// se añade a la ventana princiapl
         setBorder(BorderFactory.createTitledBorder("REGISTRAR PERSONA"));// titulo del panel
         setLayout(null);
         listaArtista = new ArrayList<Persona>();
         
         LNombre = new JLabel ("Nombre:");// etiqueta que dice NOMBRE
         LGenero = new JLabel ("Genero:");// etiqueta que dice GENERO
        
         
         LNombre.setBounds(30, 30, 100, 20);// tamaño de la etiqueta NOMBRE
         add(LNombre);
         
         LGenero.setBounds(30, 54, 100, 20);// tamañoi de la etiqueta GENERO
         add(LGenero);

         
         JTNombre = new JTextField();// espacio para leer el nombre
         JTNombre.setBounds(140, 30, 150, 20);// tamaño del espacio
         add(JTNombre);
         
         CMGenero = new JComboBox(Genero.values());// combox para el genero
         CMGenero.setBounds(140, 54, 150, 20);// tamaño del combox
         add(CMGenero);

      
         
         BGuardar = new JButton("Guardar");// boton para guardar
         BGuardar.setBounds(140, 75, 150, 20);// tamaño del boton
         BGuardar.addActionListener(this);// aticavion
         add(BGuardar);
         
         setBackground( Color.GRAY );// color de fondo
        
         
    }
    // metodo de la activacion del boton
    @Override
    public void actionPerformed(ActionEvent e) {
        // si los datos son validos se añade a la lista de la persona, y se muestra el mensaje de que fue se creo correctamemte
        // y vacia los campos para una persona nueva
        if(validarDatosArtista()){
            artista = new Persona(JTNombre.getText(), ((Genero) CMGenero.getSelectedItem()));
            listaArtista.add(artista);
            JOptionPane.showMessageDialog(null, "Artista creado.", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            vaciarDatos();
          
            
       }
    }
    // metodo que vacia los datos
    private void vaciarDatos() {
        JTNombre.setText("");
        LNombre.setForeground(Color.BLACK);
        CMGenero.setSelectedIndex(0);
        
    }
    // metodoq ue valida los datos si los campos fueron llenado
    private boolean validarDatosArtista() {
        if(JTNombre.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Debe ingresar el nombre.", "Mensaje", JOptionPane.ERROR_MESSAGE);
            LNombre.setForeground(Color.red);
            return false;
        } else if(CMGenero.getSelectedItem() == Genero.SELECCIONE) {// mensaje de error por si la seleccion del genero es seleccionar
            JOptionPane.showMessageDialog(this, "Debe seleccionar un genero.", "Mensaje", JOptionPane.ERROR_MESSAGE);
            return false;        
        }  
        
        return true;
    }
    // retorna la lista con los campos actualiazados..
    public List<Persona> getListaArtista() {
        return listaArtista;
    }
    
    
}
