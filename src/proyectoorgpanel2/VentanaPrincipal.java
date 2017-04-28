/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoorgpanel2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Carlos
 */
// clase donde se hace visible cada clase del programa
public class VentanaPrincipal extends JFrame implements ActionListener{
    
    private Panel1 panel1;
    private Panel2 panel2;
    private PanelPersonas panel3;
    private JMenuBar menuBar;
    private JMenu MFile;
    private JMenu MEdit;
    private JMenuItem MNewProject;
    private JMenuItem MNewFile;
    private JMenuItem MNexit;
    private JMenuItem MUndo;
    private JPanel jpanel;
    private PanelCorreo panelcorreo;
    private PanelAgregarFoto panFot;
    
    private static final String PERSONAS_REGISTRADAS = "PERSONAS REGISTRADAS";
    private static final String CORREOS_REGISTRADOS = "CORREOS REGISTRADAS";
    private static final String CREADORES = "CREADORES";
    private static final String EXIT = "EXIT";
    
        
    public VentanaPrincipal() {
        setSize(800, 350);
        setTitle("RegistroII");
        setLocation(200, 100);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);
        setLayout(null);
        
        panFot = new PanelAgregarFoto(this);
        panFot.setBounds(320, 85, 430, 128);
        add(panFot, BorderLayout.SOUTH);
        
        panel1 = new Panel1(this);
        panel1.setBounds(10, 10, 300, 120);
        add(panel1);
        
        panel2 = new Panel2(this);
        panel2.setBounds(10, 130, 300, 85);
        add(panel2);
        
        panel3 = new PanelPersonas(this);
        panel3.setBounds(320, 10, 430, 35);
        add(panel3);
        
        panelcorreo = new PanelCorreo(this);
        panelcorreo.setBounds(320, 45, 430, 35);
        add(panelcorreo);
        
      
        
        
        
        
        
        
        menuBar = new JMenuBar();        
        setJMenuBar(menuBar);
        
        
        MFile = new JMenu("HISTORIAL");
        
        MNewProject = new JMenuItem("PERSONAS REGISTRADAS");
        MNewProject.setActionCommand(PERSONAS_REGISTRADAS);
        MNewProject.addActionListener(panel3);
        MNewFile = new JMenuItem("CORREOS REGISTRADOS");
        MNewFile.setActionCommand(CORREOS_REGISTRADOS);
        MNewFile.addActionListener(panelcorreo);
        MNexit = new JMenuItem("Exit");
        MNexit.setActionCommand(EXIT);
        MNexit.addActionListener(this);
        
        MFile.add(MNewProject);
        MFile.add(MNewFile);
        MFile.add(MNexit);
        menuBar.add(MFile);
        
        MEdit = new JMenu("INFO");
        
        MUndo = new JMenuItem("informacion");
        MUndo.setActionCommand(CREADORES);
        MUndo.addActionListener(this);
        MEdit.add(MUndo);
        menuBar.add(MEdit);
        
        
        
        
        setVisible(true);
        
    }

    public Panel1 getPanel1() {
        return panel1;
    }

    public Panel2 getPanel2() {
        return panel2;
    }

    public PanelPersonas getPanel3() {
        return panel3;
    }

    public PanelCorreo getPanelcorreo() {
        return panelcorreo;
    }

    public PanelAgregarFoto getPanFot() {
        return panFot;
    }
    
    
    
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals(PERSONAS_REGISTRADAS)) {
            panel3.BVista.addActionListener(panel1);
        } else if(e.getActionCommand().equals(CORREOS_REGISTRADOS)) {
               panelcorreo.BCorreo.addActionListener(panel1);
            }else if(e.getActionCommand().equals(CREADORES)) {
               JOptionPane.showMessageDialog(this, "AUTORES: \n Jeyson Duarte");
               
   
            }else if(e.getActionCommand().equals(EXIT)) {
            System.exit(0);
            }
        }
    }
      


