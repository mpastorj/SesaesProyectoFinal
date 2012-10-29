/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sesaes;

/**
 *
 * @author Milii2
 */
public class Facultad {
    String nombre;
    String direccion;

    public Facultad(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
