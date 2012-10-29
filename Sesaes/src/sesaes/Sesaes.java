/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sesaes;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Milii2
 */
public class Sesaes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, UnsupportedLookAndFeelException {
        
        UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        VentanaPrincipal v = new VentanaPrincipal();
        v.setVisible(true);
        
    }
}
