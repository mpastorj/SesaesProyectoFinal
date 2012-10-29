/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sesaes;

/**
 *
 * @author Milii2
 */
public class Medico {
    String nombre;
    String fecha_nac;
    String fecha_ing;

    public Medico(String nombre, String fecha_nac, String fecha_ing) {
        this.nombre = nombre;
        this.fecha_nac = fecha_nac;
        this.fecha_ing = fecha_ing;
    }

    public String getFecha_ing() {
        return fecha_ing;
    }

    public String getFecha_nac() {
        return fecha_nac;
    }

    public String getNombre() {
        return nombre;
    }

    public void setFecha_ing(String fecha_ing) {
        this.fecha_ing = fecha_ing;
    }

    public void setFecha_nac(String fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
