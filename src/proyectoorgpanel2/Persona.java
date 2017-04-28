/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoorgpanel2;

/**
 *
 * @author Carlos
 */
// clase persona
public class Persona {
    
    private String nombre;
    
    private Genero genero;
    
   
// contructor
    public Persona(String nombre, Genero genero ) {
        this.nombre = nombre;
        this.genero = genero;
       
    }
// geter and setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }    
    
}
