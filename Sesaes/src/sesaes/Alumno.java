/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sesaes;

/**
 *
 * @author Milii2
 */
public class Alumno {
    public String nombre;
    public String rut;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public Alumno(String nombre, String rut) {
        this.nombre = nombre;
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRut() {
        return rut;
    }
}
    