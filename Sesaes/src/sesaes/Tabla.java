/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Tabla.java
 *
 * Created on 12-07-2012, 02:20:41 AM
 */
package sesaes;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import javax.swing.JFrame;

/**
 *
 * @author Milii2
 */
public class Tabla extends javax.swing.JFrame {

    
    /** Creates new form Tabla */
    //protected JList list2; 
    public JFrame VentanaEstadisticas;
    public Tabla() {
        initComponents();

    
       
    }
   
    public Tabla(JFrame VentanaEstadisticas) {
        this.VentanaEstadisticas=VentanaEstadisticas;
      
      
        
        throw new UnsupportedOperationException("Not yet implemented");
    }
    

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scroll = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        titulotabla = new javax.swing.JLabel();
        titulotabla2 = new javax.swing.JLabel();
        exportarexcel = new javax.swing.JButton();
        total = new javax.swing.JTextField();
        muestratotal = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tabla de Estadística");
        setIconImage(getIconImage());

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        scroll.setViewportView(tabla);

        titulotabla.setFont(new java.awt.Font("Verdana", 1, 12));
        titulotabla.setForeground(new java.awt.Color(0, 0, 153));

        titulotabla2.setFont(new java.awt.Font("Verdana", 1, 12));
        titulotabla2.setForeground(new java.awt.Color(51, 204, 0));

        exportarexcel.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        exportarexcel.setText("Copiar al Portapapeles");
        exportarexcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportarexcelActionPerformed(evt);
            }
        });

        muestratotal.setFont(new java.awt.Font("Tahoma", 1, 13));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("Generar PDF");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(muestratotal, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(110, 110, 110)
                            .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(171, 171, 171)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(titulotabla)
                                .addComponent(titulotabla2)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(exportarexcel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(titulotabla)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(titulotabla2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(exportarexcel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(muestratotal))
                .addContainerGap(121, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exportarexcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportarexcelActionPerformed
 
StringSelection stsel;
        StringBuilder sbf = new StringBuilder();
        int rowCount = tabla.getRowCount ();
        int colCount = tabla.getColumnCount();
        String titulo=titulotabla.getText();
        sbf.append(titulotabla.getText());
        sbf.append("\n");
        sbf.append(titulotabla2.getText());
        sbf.append("\n");
        sbf.append(muestratotal.getText());
        sbf.append(total.getText());
        sbf.append("\n");
        
        for(int i=0; i<colCount; i++){
            sbf.append(tabla.getColumnName(i));
            if (i < colCount - 1) { sbf.append("\t"); }
        }
        sbf.append("\n");
            
        for (int row = 0; row < rowCount; row++) {
            for (int col = 0; col < colCount; col++) {
                sbf.append(tabla.getValueAt(row,col));
                if (col < colCount - 1) { sbf.append("\t"); }
            }
            sbf.append("\n");
        }
        
        stsel = new StringSelection(sbf.toString());
        java.awt.datatransfer.Clipboard system = Toolkit.getDefaultToolkit().getSystemClipboard();
        system.setContents(stsel, stsel);
       
       
       
        
    }//GEN-LAST:event_exportarexcelActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       GenerarPDF pdf = new GenerarPDF();
       
       pdf.print(tabla,titulotabla.getText());
    }//GEN-LAST:event_jButton1ActionPerformed
    
    /**
     * @param args the command line arguments
     */
    
    @Override
    public Image getIconImage() {
    Image retValue = Toolkit.getDefaultToolkit().
    getImage(ClassLoader.getSystemResource("imagenes/graficoazul.png"));
    
    return retValue;
    }
        
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new Tabla().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exportarexcel;
    private javax.swing.JButton jButton1;
    protected javax.swing.JLabel muestratotal;
    protected javax.swing.JScrollPane scroll;
    protected javax.swing.JTable tabla;
    protected javax.swing.JLabel titulotabla;
    protected javax.swing.JLabel titulotabla2;
    protected javax.swing.JTextField total;
    // End of variables declaration//GEN-END:variables
}
