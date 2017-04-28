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


// calse que muestra las personas ingresadas en una ventana emergente
public class DialogoVistaPersonas extends JDialog{
    
    JPanel panel;
    JTable tablaArtista;
    
    private DefaultTableModel dtm;
    private VentanaPrincipal ventana;
    public DialogoVistaPersonas(VentanaPrincipal ventana) {
        this.ventana = ventana; // se añade a la venta principal tan pronto se selecione la opcion
        setSize(300, 300);// tamaño de la ventan
        setTitle("Dialogo Vista Personas");//  nombre de la ventana
        
        panel = new JPanel();
        panel.setBorder(BorderFactory.createTitledBorder("PERSONAS"));
        panel.setBackground(Color.WHITE);
        panel.setLayout(null);
        add(panel);
        
        dtm = new DefaultTableModel();
        tablaArtista = new JTable(dtm);
        // se crea una tabla para visualizar la informacion de la persona
        Object[] columna = {"Nombre", "Genero"};
        for (Object columna1 : columna) {
            dtm.addColumn(columna1);
        }        
        
        // se alade la tabla a la ventana
        JScrollPane scrollPane = new JScrollPane(tablaArtista);
        scrollPane.setBounds(30, 30, 240, 50);
        panel.add(scrollPane);
    }
    // se acatualiza la lista cada vez que se seleciona la oopcion
    public void actualizarTabla() {
         List<Persona> lista = this.ventana.getPanel1().getListaArtista();
         for (Persona artista : lista) {// recorre la lista para mostarr las personas nuevas
             Object[] fila = {artista.getNombre(), artista.getGenero().toString()};
             dtm.addRow(fila);// se añade la nueva persona si la hay
        }
    }
}
