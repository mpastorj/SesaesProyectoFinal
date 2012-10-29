
/*
 * VentanaConfiguracion.java
 */
package sesaes;

import java.awt.Image;
import java.awt.Toolkit;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.sql.SQLException;
import java.text.DateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class VentanaConfiguracion extends javax.swing.JFrame {

    /** Crea new form VentanaConfiguracion */
    public VentanaConfiguracion() {
        initComponents();  
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupodebotones = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        agreganombre = new javax.swing.JTextField();
        agregarut = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        dianac = new javax.swing.JComboBox();
        mesnac = new javax.swing.JComboBox();
        añonac = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        diaingreso = new javax.swing.JComboBox();
        mesingreso = new javax.swing.JComboBox();
        añoingreso = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        agregaespecialidad = new javax.swing.JTextField();
        agregar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        eliminarmedico = new javax.swing.JRadioButton();
        eliminar = new javax.swing.JComboBox();
        botoneliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("> Agregar Nuevo Médico");
        setIconImage(getIconImage());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Agregar Médico"));

        jLabel1.setText("Nombre:");

        agregarut.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                agregarutKeyTyped(evt);
            }
        });

        jLabel2.setText("RUT:");

        jLabel3.setText("F. de Nac:");

        dianac.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        mesnac.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));

        añonac.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000" }));

        jLabel4.setText("F. de Ingreso:");

        diaingreso.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        mesingreso.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        mesingreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mesingresoActionPerformed(evt);
            }
        });

        añoingreso.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012" }));

        jLabel5.setText("Especialidad:");

        agregar.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/candado2 (1).png"))); // NOI18N
        agregar.setText("Guardar");
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(agregarut, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                            .addComponent(agreganombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(diaingreso, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dianac, 0, 53, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(mesingreso, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(mesnac, 0, 89, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(añonac, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(añoingreso, 0, 65, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(agregar, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(agregaespecialidad, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(agreganombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agregarut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(mesnac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(añonac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dianac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(diaingreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mesingreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(añoingreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(agregaespecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(agregar))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Eliminar Registro"));

        eliminarmedico.setText("Eliminar Médico");
        eliminarmedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarmedicoActionPerformed(evt);
            }
        });

        botoneliminar.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        botoneliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminar.png"))); // NOI18N
        botoneliminar.setText("Eliminar");
        botoneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botoneliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(eliminar, 0, 344, Short.MAX_VALUE)
                    .addComponent(eliminarmedico)
                    .addComponent(botoneliminar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(eliminarmedico)
                .addGap(18, 18, 18)
                .addComponent(eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botoneliminar)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mesingresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mesingresoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mesingresoActionPerformed

   
    
    protected int asignames(){
        String mes_nac=(String)mesnac.getSelectedItem();
        int numero=0;
        if("Enero".equals(mes_nac))
        numero=01;
        if("Febrero".equals(mes_nac))
        numero=02;
        if("Marzo".equals(mes_nac))
        numero=03;
        if("Abril".equals(mes_nac))
        numero=04;
        if("Mayo".equals(mes_nac))
        numero=05;
        if("Junio".equals(mes_nac))
        numero=06;
        if("Julio".equals(mes_nac))
        numero=07;
        if("Agosto".equals(mes_nac))
        numero=8;
        if("Septiembre".equals(mes_nac))
        numero=9;
        if("Octubre".equals(mes_nac))
        numero=10;
        if("Noviembre".equals(mes_nac))
        numero=11;
        if("Diciembre".equals(mes_nac))
        numero=12;   
        
        return numero;
            
    }
    
    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed

            
        DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy-MM-dd");
        conexion cn=new conexion();
        String nombre=agreganombre.getText();
        String rut=agregarut.getText();
        String especialidad=agregaespecialidad.getText();
        //Fecha de Nacimiento
        String dia_nac=(String)dianac.getSelectedItem();
        String mes_naci=(String)mesnac.getSelectedItem();
        String año_nac=(String)añonac.getSelectedItem();
        int mes_nac=asignames();
        String mesnuevo=String.valueOf(mes_nac);
        String fecha_nac=año_nac+"-"+mesnuevo+"-"+dia_nac;    
        //Fecha de ingreso
        String dia_ingreso=(String)diaingreso.getSelectedItem();
        String mes_ingreso=(String)mesingreso.getSelectedItem();
        String año_ingreso=(String)añoingreso.getSelectedItem();
        int mesdeingreso=asignames();
        String mesnuevoingreso=String.valueOf(mesdeingreso);
        String fecha_de_ingreso=año_ingreso+"-"+mesnuevoingreso+"-"+dia_ingreso;
        
        int codigoespecialidad=0;           
        int codigoprofesional=0;
        
        Date fechaingresa=null;
        Date fecha=null;
        try {
        formatoDelTexto.setLenient(false);
        fecha = formatoDelTexto.parse(fecha_nac);
        fechaingresa=formatoDelTexto.parse(fecha_de_ingreso);
    
        } catch (ParseException ex) {
         Logger.getLogger(VentanaEstadisticas.class.getName()).log(Level.SEVERE, "Error en el formato de fecha de nacimiento", ex);
        }
        
        if(nombre.length()>0 && rut.length()>7 && especialidad.length()>0){
        cn.setEsSelect(false);      
        cn.setComandoSQL("insert into profesional(nombre,fecha_nac,fecha_ingreso) values('" + nombre + "','"+df.format(fecha).toString() +"','"+df.format(fechaingresa).toString()+"')");       
        cn.conectar();       
        cn.cerrarConexion();
        
        cn.setEsSelect(true);
        cn.setComandoSQL("select codigo_e from especialidad where nombre='"+especialidad+"'");
        cn.conectar();
        
        try {
            while(cn.getRst().next())
            codigoespecialidad=cn.getRst().getInt("codigo_e");
        } catch (SQLException ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, "Error en la asignación de codigo de especialidad", ex);
        }
        cn.cerrarConexion();
        
        cn.setEsSelect(true);
        cn.setComandoSQL("select codigo_p from profesional where nombre='"+nombre+"'");
        cn.conectar();
        try {
            while(cn.getRst().next())
            codigoprofesional=cn.getRst().getInt("codigo_p");
        } catch (SQLException ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, "Error en la asignación de codigo de profesional", ex);
        }
        cn.cerrarConexion();
            
            
        cn.setEsSelect(false);
        cn.setComandoSQL("insert into profeespe(codigo_p,codigo_e) values("+codigoprofesional+","+codigoespecialidad+")");
        cn.conectar();
        cn.cerrarConexion();
        javax.swing.JOptionPane.showMessageDialog (null, "Información Ingresada con Éxito", "Ficha de Ingreso", JOptionPane.INFORMATION_MESSAGE);
        }
        else
            javax.swing.JOptionPane.showMessageDialog (null, "Hay datos faltantes", "Ficha de Ingreso", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_agregarActionPerformed

    private void agregarutKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_agregarutKeyTyped
        if(agregarut.getText().length()==9)
        evt.consume();
    }//GEN-LAST:event_agregarutKeyTyped

    private void botoneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botoneliminarActionPerformed
        // TODO add your handling code here:
        conexion cn=new conexion();
        cn.setEsSelect(false);
        String medico=(String)eliminar.getSelectedItem();
        if(eliminarmedico.isSelected()==true){
        JOptionPane.showMessageDialog(null,"Se eliminaran TODOS los registros asociados al Profesional '"+medico+"'","ADVERTENCIA",JOptionPane.WARNING_MESSAGE);
        int i =JOptionPane.showConfirmDialog(this,"¿Realmente Desea Continuar con la Operación?","Confirmación",JOptionPane.YES_NO_OPTION);
        if(i==0){
        cn.setComandoSQL("delete from profesional where nombre='"+medico+"'");
        cn.conectar();
        cn.cerrarConexion();
        System.runFinalization();
        }    
        }
        else
            javax.swing.JOptionPane.showMessageDialog (null, "Debe seleccionar un Profesional", "ERROR", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_botoneliminarActionPerformed

    private void eliminarmedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarmedicoActionPerformed

        eliminar.disable();
        conexion cn=new conexion();
        cn.setEsSelect(true);
        if(eliminarmedico.isSelected()==true){
            eliminar.enable();
            cn.setComandoSQL("select nombre from profesional order by nombre");
            cn.conectar();
            try { 
           while(cn.getRst().next())
           {
           
          eliminar.addItem(cn.getRst().getObject("nombre"));
                 
        }
        } catch (SQLException ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, "Error al cargar lista de médicos por especialidad", ex);
        } 
         cn.cerrarConexion();
        }
        else 
            eliminar.disable();
    }//GEN-LAST:event_eliminarmedicoActionPerformed

    
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
                new VentanaConfiguracion().setVisible(true);
                
                
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField agregaespecialidad;
    private javax.swing.JTextField agreganombre;
    private javax.swing.JButton agregar;
    private javax.swing.JTextField agregarut;
    private javax.swing.JComboBox añoingreso;
    private javax.swing.JComboBox añonac;
    private javax.swing.JButton botoneliminar;
    private javax.swing.JComboBox diaingreso;
    private javax.swing.JComboBox dianac;
    private javax.swing.JComboBox eliminar;
    private javax.swing.JRadioButton eliminarmedico;
    private javax.swing.ButtonGroup grupodebotones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JComboBox mesingreso;
    private javax.swing.JComboBox mesnac;
    // End of variables declaration//GEN-END:variables
}
