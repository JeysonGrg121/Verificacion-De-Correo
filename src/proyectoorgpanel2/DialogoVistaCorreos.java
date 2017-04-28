/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoorgpanel2;


import java.awt.Color;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Carlos
 */
// calse que muestra los correos en una ventana emergente
public class DialogoVistaCorreos extends JDialog{
    
    JPanel panel;
    JTable tablaCorreo;
    
    private DefaultTableModel dtm;
    private VentanaPrincipal ventana;
    public DialogoVistaCorreos(VentanaPrincipal ventana) {
        this.ventana = ventana; // se añade a la ventana princiapl al seleccionar la opcioin
        setSize(300, 300);// tamaño de la ventana
        setTitle("Dialogo Vista Personas"); // nombre de la pamtalla
        
        panel = new JPanel(); 
        panel.setBorder(BorderFactory.createTitledBorder("CORREOS"));
        panel.setBackground(Color.WHITE);
        panel.setLayout(null);
        add(panel);
        
        dtm = new DefaultTableModel();
        tablaCorreo = new JTable(dtm);
        // se crea una tabla con un objeto qen una sola columna para mostrar los correos ingresados
        Object[] columna = {"CORREO"};
        for (Object columna1 : columna) {
            dtm.addColumn(columna1);
        }        
        
        // aquie se le da el tamaño a la tabla del correo
        JScrollPane scrollPane = new JScrollPane(tablaCorreo);
        scrollPane.setBounds(30, 30, 240, 50);
        panel.add(scrollPane);
    }
    // metodo que actualiza los correos cada vez que se abre la ventana
    public void actualizarTablacORREOS() {
         List<Correo> lista = this.ventana.getPanel2().getListaCorreo();
         for (Correo correo : lista) { // recorre la lista de los correos
             Object[] fila = {correo.getCorreo().toString()};
             dtm.addRow(fila); // se añade el correo nuevo a la tabla
        }
    }
}


