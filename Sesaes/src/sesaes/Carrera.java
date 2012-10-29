/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sesaes;

/**
 *
 * @author Milii2
 */
public class Carrera {
    String nombre;
    int codigo;

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public Carrera(String nombre, int codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }
}
