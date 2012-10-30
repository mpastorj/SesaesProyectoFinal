//hola soy el oscar
//mi aportacion. jean (:
/*
 * VentanaEstadisticas.java

 //holi :B
 */
package sesaes;

import java.awt.Image;
import java.awt.Toolkit;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class VentanaEstadisticas extends javax.swing.JFrame {

    
    public VentanaEstadisticas() {
        initComponents();
        
        grupodebotones.add(opcion1);
        grupodebotones.add(opcion2);
        grupodebotones.add(opcion3);
        
        
     conexion cn = new conexion();
     cn.setEsSelect(true);
     cn.setComandoSQL("select nombre from profesional order by nombre");
     cn.conectar();
        try {
            while(cn.getRst().next())
            {
                buscamedico.addItem(cn.getRst().getObject("nombre"));
            }    
        } catch (SQLException ex) {
            Logger.getLogger(VentanaEstadisticas.class.getName()).log(Level.SEVERE, "Error en desplegar médico", ex);
        }
      cn.cerrarConexion(); 
     
    
      
      cn.setComandoSQL("select nombre from especialidad order by nombre");
      cn.conectar();
        try {
            while(cn.getRst().next())
                buscaespecialidad.addItem(cn.getRst().getObject("nombre"));
        } catch (SQLException ex) {
            Logger.getLogger(VentanaEstadisticas.class.getName()).log(Level.SEVERE, "Error en desplegar especialidad", ex);
        }
        cn.cerrarConexion();
              
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupodebotones = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        buscamedico = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        buscaespecialidad = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        buscaalumno = new javax.swing.JTextField();
        mostrar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        buscaaño = new javax.swing.JComboBox();
        opcion1 = new javax.swing.JRadioButton();
        opcion2 = new javax.swing.JRadioButton();
        opcion3 = new javax.swing.JRadioButton();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        buscames = new javax.swing.JComboBox();
        buscaperiodo = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        trimestre = new javax.swing.JComboBox();
        semestre = new javax.swing.JComboBox();
        jSeparator2 = new javax.swing.JSeparator();
        botonlistar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Estadísticas");
        setIconImage(getIconImage());

        jLabel1.setText("Seleccionar Médico:");

        buscamedico.setEnabled(false);
        buscamedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscamedicoActionPerformed(evt);
            }
        });

        jLabel2.setText("Seleccionar Especialidad:");

        buscaespecialidad.setEnabled(false);

        jLabel3.setText("Ingrese RUT del Alumno:");

        buscaalumno.setEnabled(false);
        buscaalumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscaalumnoActionPerformed(evt);
            }
        });
        buscaalumno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                buscaalumnoKeyTyped(evt);
            }
        });

        mostrar.setFont(new java.awt.Font("Tahoma", 1, 13));
        mostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lupa-psd-468x468.png"))); // NOI18N
        mostrar.setText("Mostrar");
        mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarActionPerformed(evt);
            }
        });

        jLabel4.setText("Seleccione Año:");

        buscaaño.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2012", "2013", "2014", "2015", "2016", "2017", "2018" }));

        opcion1.setFont(new java.awt.Font("Tahoma", 0, 12));
        opcion1.setText("Médico");
        opcion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion1ActionPerformed(evt);
            }
        });

        opcion2.setFont(new java.awt.Font("Tahoma", 0, 12));
        opcion2.setText("Especialidad");
        opcion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion2ActionPerformed(evt);
            }
        });

        opcion3.setFont(new java.awt.Font("Tahoma", 0, 12));
        opcion3.setText("Alumno");
        opcion3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion3ActionPerformed(evt);
            }
        });

        jLabel6.setText("Mes:");

        buscames.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));

        buscaperiodo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Mensual", "Trimestral", "Semestral", "Anual" }));
        buscaperiodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscaperiodoActionPerformed(evt);
            }
        });

        jLabel7.setText("Seleccione Periodo:");

        jLabel5.setText("Trimestre:");

        jLabel8.setText("Semestre:");

        trimestre.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1°", "2°", "3°", "4°" }));
        trimestre.setEnabled(false);

        semestre.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1°", "2°" }));
        semestre.setEnabled(false);
        semestre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                semestreActionPerformed(evt);
            }
        });

        botonlistar.setFont(new java.awt.Font("Tahoma", 1, 13));
        botonlistar.setText("Listar Especialidades");
        botonlistar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonlistarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(opcion1)
                        .addGap(56, 56, 56)
                        .addComponent(opcion2)
                        .addGap(46, 46, 46)
                        .addComponent(opcion3))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(buscaespecialidad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(buscamedico, 0, 272, Short.MAX_VALUE))
                                    .addComponent(buscaalumno, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(trimestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buscaperiodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(semestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buscames, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buscaaño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(294, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonlistar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                        .addComponent(mostrar)))
                .addGap(36, 36, 36))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(opcion1)
                    .addComponent(opcion2)
                    .addComponent(opcion3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(buscamedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(buscaespecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(buscaalumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(buscames, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscaperiodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(trimestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(semestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(buscaaño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonlistar, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                    .addComponent(mostrar))
                .addGap(11, 11, 11))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscamedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscamedicoActionPerformed
    
    }//GEN-LAST:event_buscamedicoActionPerformed

    private void buscaalumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscaalumnoActionPerformed
    
    }//GEN-LAST:event_buscaalumnoActionPerformed

    private void opcion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion1ActionPerformed

        if(opcion1.isSelected()==true){  
           buscamedico.enable();
           buscaespecialidad.disable();
           buscaalumno.disable();
        }

    }//GEN-LAST:event_opcion1ActionPerformed

    private void opcion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion2ActionPerformed

        if(opcion2.isSelected()==true){
           buscamedico.disable();
           buscaespecialidad.enable();
           buscaalumno.disable();
        }
    }//GEN-LAST:event_opcion2ActionPerformed

    private void opcion3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion3ActionPerformed

      if(opcion3.isSelected()){ 
          buscaalumno.enable();
          buscamedico.disable();
          buscaespecialidad.disable();
      }
       
    }//GEN-LAST:event_opcion3ActionPerformed

    private void mostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarActionPerformed

        String medico=(String)buscamedico.getSelectedItem();
        String especialidad=(String)buscaespecialidad.getSelectedItem();
        String rut_alumno=(String)buscaalumno.getText();
        String año = (String)buscaaño.getSelectedItem();
        int mes = buscames.getSelectedIndex()+1;
        String mes2 = (String)buscames.getSelectedItem();
        
        
        Tabla t = new Tabla();
        DefaultTableModel modelo = new DefaultTableModel(); 
        t.tabla.setModel(modelo);
        
        String consulta = ""; 
        String titulo = ""; 
        
        switch(buscaperiodo.getSelectedIndex())
        {
          case 0:
          consulta = "AND MONTH(fecha_a) = "+mes+""; 
          titulo = " "+mes2+" del año "+año+"";
          break;
          case 1:
            if(trimestre.getSelectedIndex()==0)
            {
                consulta = "AND MONTH(fecha_a) BETWEEN 1 AND 3  ";
                titulo = " Primer Trimestre del año "+año+"";
            }    
            else if(trimestre.getSelectedIndex()==1)
            {
                consulta = "AND MONTH(fecha_a) BETWEEN 4 AND 6 ";
                titulo = " Segundo Trimestre del año "+año+""; 
            }    
            else if(trimestre.getSelectedIndex()==2)
            {
                consulta = "AND MONTH(fecha_a) BETWEEN 7 AND 9  ";
                titulo = " Tercer Trimestre del año "+año+"";  
            }   
            else{
                consulta = "AND MONTH(fecha_a) BETWEEN 10 AND 12  ";
                titulo = " Cuarto Trimestre del año "+año+"";
                }
              break;
          case 2:
              if(semestre.getSelectedIndex()==0)
              {    
              consulta = "AND MONTH(fecha_a) BETWEEN 1 AND 6  ";
              titulo = " Primer Semestre del año "+año+"";
              }
              else
              {
                  consulta = "AND MONTH(fecha_a) BETWEEN 7 AND 12  ";
                  titulo = "Segundo Semestre del año "+año+"";
              }    
              break;
          default:
              titulo = " año "+año+"";
              break;
       }       
       
        
        String consulta2 = "";      
          
        switch(buscaperiodo.getSelectedIndex())
        {
          case 0:
          consulta2 = "AND MONTH(a.fecha_a) = "+mes+"";    
          break;
          case 1:
            if(trimestre.getSelectedIndex()==0)
                consulta2 = "AND MONTH(a.fecha_a) BETWEEN 1 AND 3  ";
            else if(trimestre.getSelectedIndex()==1)
                consulta2 = "AND MONTH(a.fecha_a) BETWEEN 4 AND 6 ";
            else if(trimestre.getSelectedIndex()==2)
                consulta2 = "AND MONTH(a.fecha_a) BETWEEN 7 AND 9  ";
            else
                consulta2 = "AND MONTH(a.fecha_a) BETWEEN 10 AND 12  ";
              break;
          case 2:
              if(semestre.getSelectedIndex()==0)
              consulta2 = "AND MONTH(a.fecha_a) BETWEEN 1 AND 6  ";
              else
                  consulta2 = "AND MONTH(a.fecha_a) BETWEEN 7 AND 12  ";
              break;
       }       
       
       
        conexion cn= new conexion();
       
        if(opcion1.isSelected()==true)
        {
       
            cn.setEsSelect(true);              
            cn.setComandoSQL("select  CASE WHEN MONTH(fecha_a) = 1 THEN 'Enero'"
              + " WHEN MONTH(fecha_a) = 2 THEN 'Febrero' "
              + "WHEN MONTH(fecha_a) = 3 THEN 'Marzo' "
              + "WHEN MONTH(fecha_a) = 4 THEN 'Abril' "
              + "WHEN MONTH(fecha_a) = 5 THEN 'Mayo' "
              + "WHEN MONTH(fecha_a) = 6 THEN 'Junio' "
              + "WHEN MONTH(fecha_a) = 7 THEN 'Julio' "
              + "WHEN MONTH(fecha_a) = 8 THEN 'Agosto' "
              + "WHEN MONTH(fecha_a) = 9 THEN 'Septiembre' "
              + "WHEN MONTH(fecha_a) = 10 THEN 'Octubre' "
              + "WHEN MONTH(fecha_a) = 11 THEN 'Noviembre'"
              + " WHEN MONTH(fecha_a) = 12 THEN 'Diciembre' "
              + "ELSE 'esto no es un mes' END as Mes, count(*) as 'Num de Atenciones' "
              + "from atencion "
              + "where cod_p = (select codigo_p from profesional where nombre = '"+medico+"')"
              + " "+consulta+" "
              + "group by Mes order by MONTH(fecha_a)");
              
      
        t.titulotabla.setText("Estadísticas de: "+medico+"");
        t.titulotabla2.setText("Periodo: "+titulo+"");
       
     }
      
      if(opcion2.isSelected()==true)
      {
      cn.setEsSelect(true); 
      
      cn.setComandoSQL("select  CASE WHEN MONTH(fecha_a) = 1 THEN 'Enero'"
              + " WHEN MONTH(fecha_a) = 2 THEN 'Febrero' "
              + "WHEN MONTH(fecha_a) = 3 THEN 'Marzo' "
              + "WHEN MONTH(fecha_a) = 4 THEN 'Abril' "
              + "WHEN MONTH(fecha_a) = 5 THEN 'Mayo' "
              + "WHEN MONTH(fecha_a) = 6 THEN 'Junio' "
              + "WHEN MONTH(fecha_a) = 7 THEN 'Julio' "
              + "WHEN MONTH(fecha_a) = 8 THEN 'Agosto' "
              + "WHEN MONTH(fecha_a) = 9 THEN 'Septiembre' "
              + "WHEN MONTH(fecha_a) = 10 THEN 'Octubre' "
              + "WHEN MONTH(fecha_a) = 11 THEN 'Noviembre'"
              + " WHEN MONTH(fecha_a) = 12 THEN 'Diciembre' "
              + "ELSE 'esto no es un mes' END as Mes, count(*) as 'Num de Atenciones' "
              + "from atencion "
              + "where cod_p in (select codigo_p from profeespe where codigo_e ="
              + "(select codigo_e from especialidad where nombre = '"+especialidad+"')) "
              + " "+consulta+" "
              + "group by Mes order by MONTH(fecha_a)");
      
      t.titulotabla.setText("Estadísticas de: "+especialidad+"");
      t.titulotabla2.setText("Periodo: "+titulo+"");
            
      }
      
      
      if(opcion3.isSelected()==true)
      {
            if(rut_alumno.length()>8){
            try {
                conexion cn1 = new conexion();                                  
                                                                                
                cn1.setEsSelect(true);                                          
                cn1.setComandoSQL("select nombre from alumno where rut = '"+rut_alumno+"'");
                cn1.conectar();
                               
                if(cn1.getRst().next()==true);
                {
                 t.titulotabla.setText("Estadísticas de: "+cn1.getRst().getString("nombre") +"");
                 t.titulotabla2.setText("Periodo: "+titulo+"");
                }
                 cn1.cerrarConexion();            
                                                                                
                 cn.setEsSelect(true);                                 
                 cn.setComandoSQL("select  e.nombre AS Especialidad, "
                        + "p.nombre AS 'Atendido por:', DATE_FORMAT(a.fecha_a,'%d/%m/%Y') AS 'Fecha de atención:' "
                        + "from atencion a , profesional p , profeespe pf , especialidad e  "
                        + "where a.rut = '"+rut_alumno+"' AND a.cod_p = pf.codigo_p AND pf.codigo_e = e.codigo_e "
                        + "AND pf.codigo_p = p.codigo_p  "+consulta2+" order by a.fecha_a");
                                
            } catch (SQLException ex) {
                javax.swing.JOptionPane.showMessageDialog (null, "Rut no encontrado", "ERROR", JOptionPane.INFORMATION_MESSAGE);
               // Logger.getLogger(VentanaEstadisticas.class.getName()).log(Level.SEVERE, "Error en selección de opcion 3", ex);
            }
            }
            else
                javax.swing.JOptionPane.showMessageDialog (null, "Hay datos faltantes", "ESTADISTICAS POR ALUMNO", JOptionPane.INFORMATION_MESSAGE);
                
      }
      
      String seleccion1=(String)buscaperiodo.getSelectedItem();
      if("Mensual".equals(seleccion1))
          t.muestratotal.setText("Total Mensual");
      if("Semestral".equals(seleccion1))
          t.muestratotal.setText("Total Semestre");
      if("Anual".equals(seleccion1))
          t.muestratotal.setText("Total Anual");
      else
          t.muestratotal.setText("Total Trimestre");
      
        cn.conectar();
        //Asigna cantidad de columnas para el JTable
        ResultSet rs = cn.getRst();
            try {
                ResultSetMetaData rsMd = rs.getMetaData();
                int cantidadColumnas = rsMd.getColumnCount();
                for (int i = 1; i <= cantidadColumnas; i++) {
        modelo.addColumn(rsMd.getColumnLabel(i));
        }
                int suma=0;
                int titulocolumna=1;
        //Creando las filas para el JTable 
        while (rs.next()) {
        Object[] fila = new Object[cantidadColumnas];
        for (int i = 0; i < cantidadColumnas; i++) {
        fila[i]=rs.getObject(i+1);
       
        while (cantidadColumnas==1){
        
        //j++;
                if(titulocolumna==modelo.findColumn("Num de Atenciones")){
           
                 String ahora=(String) rs.getObject(i);
                 int yaya=Integer.parseInt(ahora);
                suma=yaya + suma;
                }
        }
        
        }
        modelo.addRow(fila);
        }
             String numCadena= Integer.toString(suma);
              t.total.setText(numCadena);
        rs.close();
        cn.cerrarConexion();
            } catch (SQLException ex) {
                Logger.getLogger(VentanaEstadisticas.class.getName()).log(Level.SEVERE, "Error en la asignación de filas y columnas", ex);
            }
                          
    t.setVisible(true);                 
                  
    }//GEN-LAST:event_mostrarActionPerformed

    private void buscaalumnoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscaalumnoKeyTyped
     if(buscaalumno.getText().length()==9)
         evt.consume();
    }//GEN-LAST:event_buscaalumnoKeyTyped

    private void semestreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_semestreActionPerformed

    }//GEN-LAST:event_semestreActionPerformed

    private void buscaperiodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscaperiodoActionPerformed
        if(buscaperiodo.getSelectedIndex()==0)
        {
            buscames.setEnabled(true);
            trimestre.setEnabled(false);
            semestre.setEnabled(false);
        }            
        else if(buscaperiodo.getSelectedIndex()==1)
        {
            trimestre.setEnabled(true);
             buscames.setEnabled(false);
             semestre.setEnabled(false);
        }    
        else if(buscaperiodo.getSelectedIndex()==2)
        {
            semestre.setEnabled(true);
             trimestre.setEnabled(false);
             buscames.setEnabled(false);
        }
        else
        {
        semestre.setEnabled(false);
        trimestre.setEnabled(false);
        buscames.setEnabled(false);
        }
    }//GEN-LAST:event_buscaperiodoActionPerformed

    private void botonlistarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonlistarActionPerformed
        // TODO add your handling code here:
        
        Tabla t = new Tabla();
        DefaultTableModel modelo = new DefaultTableModel(); 
       
        t.tabla.setModel(modelo);
        conexion cn=new conexion();
        cn.setEsSelect(true);

        cn.setComandoSQL("select e.nombre as 'Especialidad', count(c.codigo_e) as 'Cantidad de Profesionales' from especialidad e, profeespe c where c.codigo_e=e.codigo_e group by c.codigo_e order by e.nombre");

        cn.conectar();
        ResultSet rs = cn.getRst();
            try {
                ResultSetMetaData rsMd = rs.getMetaData();
                int cantidadColumnas = rsMd.getColumnCount();
                for (int i = 1; i <= cantidadColumnas; i++) {
        modelo.addColumn(rsMd.getColumnLabel(i));
        }
        //Creando las filas para el JTable 
        while (rs.next()) {
        Object[] fila = new Object[cantidadColumnas];
        for (int i = 0; i < cantidadColumnas; i++) {
        fila[i]=rs.getObject(i+1);
        }
        modelo.addRow(fila);
        }
        rs.close();
        cn.cerrarConexion();
            } catch (SQLException ex) {
                Logger.getLogger(VentanaEstadisticas.class.getName()).log(Level.SEVERE, "Error en la asignación de filas y columnas", ex);
            }
   t.titulotabla.setText("Cantidad de Profesionales por Especialidad");            
   t.setVisible(true);  
    }//GEN-LAST:event_botonlistarActionPerformed

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
                throw new UnsupportedOperationException("Not supported yet.");
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonlistar;
    public javax.swing.JTextField buscaalumno;
    private javax.swing.JComboBox buscaaño;
    public javax.swing.JComboBox buscaespecialidad;
    public javax.swing.JComboBox buscamedico;
    private javax.swing.JComboBox buscames;
    private javax.swing.JComboBox buscaperiodo;
    private javax.swing.ButtonGroup grupodebotones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JButton mostrar;
    private javax.swing.JRadioButton opcion1;
    private javax.swing.JRadioButton opcion2;
    private javax.swing.JRadioButton opcion3;
    private javax.swing.JComboBox semestre;
    private javax.swing.JComboBox trimestre;
    // End of variables declaration//GEN-END:variables

}
