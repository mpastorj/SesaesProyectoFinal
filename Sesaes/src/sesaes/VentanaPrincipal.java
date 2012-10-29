/*
VentanaPrincipal.java
 */
package sesaes;

import java.awt.Image;
import java.awt.Toolkit;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class VentanaPrincipal extends javax.swing.JFrame {

    /** Crea new form VentanaPrincipal */
    public VentanaPrincipal() {
        
        initComponents();   
        botones2.add(diurna); 
        botones2.add(vespertina);
    }

    @SuppressWarnings("unchecked")
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botones2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nombrealumno = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        rutalumno = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        facultad = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        carrera = new javax.swing.JComboBox();
        jlabel11 = new javax.swing.JLabel();
        profesionalingreso = new javax.swing.JComboBox();
        ingresar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        especialidadingreso = new javax.swing.JComboBox();
        diurna = new javax.swing.JRadioButton();
        vespertina = new javax.swing.JRadioButton();
        estadisticas = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuuno = new javax.swing.JMenu();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("SESAES");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(java.awt.SystemColor.control);
        setIconImage(getIconImage());
        setMinimumSize(new java.awt.Dimension(100, 100));
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Ingreso:"));
        jPanel1.setMaximumSize(new java.awt.Dimension(214748, 32767));
        jPanel1.setMinimumSize(new java.awt.Dimension(90, 90));
        jPanel1.setPreferredSize(new java.awt.Dimension(576, 330));

        jLabel1.setText("Nombre:");

        nombrealumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombrealumnoActionPerformed(evt);
            }
        });

        jLabel2.setText("RUT:");

        rutalumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rutalumnoActionPerformed(evt);
            }
        });
        rutalumno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                rutalumnoKeyTyped(evt);
            }
        });

        jLabel3.setText("Facultad:");

        facultad.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<Seleccione una opción>", "Administración y Economía", "Ciencias de la Construcción y Ordenamiento Territorial", "Ciencias Naturales, Matemática y del Medio Ambiente", "Humanidades y Tecnologías de la Comunicación Social", "Ingeniería" }));
        facultad.setEnabled(false);
        facultad.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                facultadItemStateChanged(evt);
            }
        });
        facultad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facultadActionPerformed(evt);
            }
        });

        jLabel4.setText("Carrera:");

        carrera.setEnabled(false);
        carrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carreraActionPerformed(evt);
            }
        });

        jlabel11.setText("Profesional:");

        profesionalingreso.setEnabled(false);
        profesionalingreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profesionalingresoActionPerformed(evt);
            }
        });

        ingresar.setFont(new java.awt.Font("Tahoma", 1, 13));
        ingresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/escuchar-flecha-hacia-la-derecha-icono-5927-96 (2).png"))); // NOI18N
        ingresar.setText("Ingresar");
        ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarActionPerformed(evt);
            }
        });

        jLabel6.setText("Especialidad:");

        jLabel7.setBackground(new java.awt.Color(204, 204, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/sesaest (4).jpg"))); // NOI18N
        jLabel7.setLabelFor(jLabel7);
        jLabel7.setText("jLabel7");
        jLabel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel7.setPreferredSize(new java.awt.Dimension(150, 170));

        especialidadingreso.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<Seleccione una opción>", "Medicina General", "Medicina Interna", "Traumatología", "Nutriología", "Kinesiología", "Neurología", "Psiquiatría", "Psicología", "Cirugía", "Odontología General", "Medicina en Hematología", "Enfermería" }));
        especialidadingreso.setEnabled(false);
        especialidadingreso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                especialidadingresoMouseClicked(evt);
            }
        });
        especialidadingreso.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                especialidadingresoItemStateChanged(evt);
            }
        });
        especialidadingreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                especialidadingresoActionPerformed(evt);
            }
        });

        diurna.setText("Carrera diurna");
        diurna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diurnaActionPerformed(evt);
            }
        });

        vespertina.setText("Carrera vespertina");
        vespertina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vespertinaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jlabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(facultad, javax.swing.GroupLayout.Alignment.TRAILING, 0, 334, Short.MAX_VALUE)
                                    .addComponent(carrera, javax.swing.GroupLayout.Alignment.TRAILING, 0, 334, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addComponent(rutalumno, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombrealumno, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(especialidadingreso, javax.swing.GroupLayout.Alignment.TRAILING, 0, 334, Short.MAX_VALUE)
                            .addComponent(profesionalingreso, javax.swing.GroupLayout.Alignment.TRAILING, 0, 334, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(diurna)
                        .addGap(58, 58, 58)
                        .addComponent(vespertina)
                        .addGap(99, 99, 99)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(ingresar, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(nombrealumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(rutalumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(9, 9, 9)
                                .addComponent(diurna))
                            .addComponent(vespertina))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(facultad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(carrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(especialidadingreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlabel11)
                            .addComponent(profesionalingreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27))
        );

        estadisticas.setFont(new java.awt.Font("Tahoma", 1, 13));
        estadisticas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/graficoazul.png"))); // NOI18N
        estadisticas.setText("Estadísticas");
        estadisticas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estadisticasActionPerformed(evt);
            }
        });

        menuuno.setText("Configuración");
        menuuno.setFont(new java.awt.Font("Tahoma", 0, 13));
        menuuno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuunoActionPerformed(evt);
            }
        });

        jSeparator2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jSeparator2MouseClicked(evt);
            }
        });
        menuuno.add(jSeparator2);

        jMenuItem1.setFont(new java.awt.Font("Tahoma", 0, 13));
        jMenuItem1.setText("Ingresar Profesional");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menuuno.add(jMenuItem1);

        jMenuBar1.add(menuuno);

        jMenu2.setText("Información");
        jMenu2.setFont(new java.awt.Font("Tahoma", 0, 13));
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });
        jMenu2.add(jSeparator1);

        jMenuItem2.setText("Acerca de");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 663, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(254, Short.MAX_VALUE)
                .addComponent(estadisticas, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(254, 254, 254))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(estadisticas, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

      
    private void nombrealumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombrealumnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombrealumnoActionPerformed

    private void estadisticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estadisticasActionPerformed
        ConectarBD();
        
        VentanaEstadisticas v = new VentanaEstadisticas();
        v.setVisible(true);         
    }//GEN-LAST:event_estadisticasActionPerformed
    //private static ServerSocket SERVER_SOCKET;
    
    private void ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarActionPerformed
            
            ConectarBD();
            
            String nombre_a = nombrealumno.getText();
            String rut_a = rutalumno.getText();
            String profesionalnombre=(String)profesionalingreso.getSelectedItem();
            int codigoprofesional=0;
            conexion cn=new conexion();
            int codigocarrera = 0;
            String nombrecarrera=(String)carrera.getSelectedItem();
           
            if(nombre_a.length()>0 && rut_a.length()>7 && profesionalnombre.length()>0 && nombrecarrera.length()>0){    
            cn.setEsSelect(true);
            cn.setComandoSQL("select cod_c  from carrera where nombre ='"+nombrecarrera+"'" );
            cn.conectar();
           
            try {
            while(cn.getRst().next())
            codigocarrera=cn.getRst().getInt("cod_c");
            } catch (SQLException ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, "Error al asignar codigo de carrera", ex);
            }
            cn.cerrarConexion();
            
            //Obtiene fecha actual
            java.util.Date utilDate = new java.util.Date(); 
            long lnMilisegundos = utilDate.getTime();
            java.sql.Time sqlTime = new java.sql.Time(lnMilisegundos);
            java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
            
            cn.setEsSelect(true);
            cn.setComandoSQL("select rut from alumno where rut = '"+rut_a+"'");
            cn.conectar();
            
            try {
            if(cn.getRst().next()== false)
            {
            conexion cn1=new conexion();
            cn1.setEsSelect(false);
            cn1.setComandoSQL("insert into alumno(nombre,rut,cod_c) values('" + nombre_a + "','" + rut_a + "',"+codigocarrera+")");
   
            cn1.conectar();
            cn1.cerrarConexion();
            }
            } catch (SQLException ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, "Error al insertar detalles del alumno", ex);
            }
            
            cn.cerrarConexion();
            
  
            cn.conectar();
            try {
            if(cn.getRst().next()== false)
            {
            conexion cn1=new conexion();
            cn1.setEsSelect(false);
            cn1.setComandoSQL("insert into alumno(nombre,rut,cod_c) values('" + nombre_a + "','" + rut_a + "',"+codigocarrera+")");
   
            cn1.conectar();
            cn1.cerrarConexion();
            }
            } catch (SQLException ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            cn.cerrarConexion();
           
            
            cn.setEsSelect(true); 
            cn.setComandoSQL("select codigo_p from profesional where (nombre='"+profesionalnombre+"')");
            cn.conectar();
            
            try {
            while(cn.getRst().next())
            codigoprofesional=cn.getRst().getInt("codigo_p");
            } catch (SQLException ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, "Error al asignar codigo de especialidad", ex);
            }
            cn.cerrarConexion();
           
             cn.setEsSelect(false); 
             cn.setComandoSQL("insert into atencion(cod_p,rut,fecha_a) values("+codigoprofesional+",'"+rut_a+"','"+sqlDate.toString()+"')");
             cn.conectar();
             cn.cerrarConexion();
             javax.swing.JOptionPane.showMessageDialog (null, "La información ha sido ingresada con éxito", "Ficha de Ingreso", JOptionPane.INFORMATION_MESSAGE);      
  
            }
            else
            javax.swing.JOptionPane.showMessageDialog (null, "Hay datos faltantes", "Ficha de Ingreso", JOptionPane.INFORMATION_MESSAGE);
   
    }//GEN-LAST:event_ingresarActionPerformed

    private void facultadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facultadActionPerformed
      ConectarBD();
      int tipo;
      if (diurna.isSelected()==true){
          tipo = 0;
      }
      else{
          tipo = 1;
      }
      conexion cn = new conexion();
      
      String facultades = (String)facultad.getSelectedItem(); 
      cn.setEsSelect(true);
      cn.setComandoSQL("select nombre,tipo from carrera where codigo_f = (select codigo_f from facultad where nombre_f = '"+facultades+"' ) and tipo = '"+tipo+"' order by nombre");
      cn.conectar();
      
        try {  
           while(cn.getRst().next())
           {
          carrera.addItem(cn.getRst().getObject("nombre"));       
        }
        } catch (SQLException ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, "Error al cargar lista de carreras segun facultad", ex);
        } 
         cn.cerrarConexion();  
    }//GEN-LAST:event_facultadActionPerformed

    private void facultadItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_facultadItemStateChanged

        carrera.removeAllItems();
      
    }//GEN-LAST:event_facultadItemStateChanged

    private void especialidadingresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_especialidadingresoActionPerformed
      ConectarBD();
      conexion cn = new conexion();
      
      String especialidades = (String)especialidadingreso.getSelectedItem(); 
      cn.setEsSelect(true);
      cn.setComandoSQL("select nombre as nombreprofe from profesional where codigo_p IN (select codigo_p from profeespe where codigo_e = (select codigo_e from especialidad where nombre='"+especialidades+"' ))  order by nombre");
      cn.conectar();
 
        try { 
           while(cn.getRst().next())
           {
           
          profesionalingreso.addItem(cn.getRst().getObject("nombreprofe"));
                 
        }
        } catch (SQLException ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, "Error al cargar lista de médicos por especialidad", ex);
        } 
         cn.cerrarConexion();
    }//GEN-LAST:event_especialidadingresoActionPerformed

    private void especialidadingresoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_especialidadingresoItemStateChanged
      profesionalingreso.removeAllItems();
    }//GEN-LAST:event_especialidadingresoItemStateChanged

    private void especialidadingresoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_especialidadingresoMouseClicked
    
    }//GEN-LAST:event_especialidadingresoMouseClicked

    private void menuunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuunoActionPerformed

    }//GEN-LAST:event_menuunoActionPerformed

    private void jSeparator2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSeparator2MouseClicked

    }//GEN-LAST:event_jSeparator2MouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       VentanaConfiguracion v = new VentanaConfiguracion();
       v.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed

    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        VentanaAcercaDe a = new VentanaAcercaDe();
        a.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void rutalumnoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rutalumnoKeyTyped
        if(rutalumno.getText().length()==9)
        evt.consume();
    }//GEN-LAST:event_rutalumnoKeyTyped

    private void rutalumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rutalumnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rutalumnoActionPerformed

    private void carreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carreraActionPerformed
        // TODO add your handling code here:
        //ConectarBD();
    }//GEN-LAST:event_carreraActionPerformed

    private void profesionalingresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profesionalingresoActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_profesionalingresoActionPerformed

    private void diurnaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diurnaActionPerformed
        // TODO add your handling code here:
        
        if (diurna.isSelected()==true){
        facultad.setSelectedIndex(0);
        carrera.removeAllItems();
        this.facultad.enable();
        this.carrera.enable();
        this.profesionalingreso.enable();
        this.especialidadingreso.enable();
        
        }    
    }//GEN-LAST:event_diurnaActionPerformed

    private void vespertinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vespertinaActionPerformed
        // TODO add your handling code here:
        if (vespertina.isSelected()==true){
        facultad.setSelectedIndex(0);
        carrera.removeAllItems();
        this.facultad.enable();
        this.carrera.enable();
        this.profesionalingreso.enable();
        this.especialidadingreso.enable();
        
      }
    }//GEN-LAST:event_vespertinaActionPerformed

    private void ConectarBD(){
    try {
            Runtime.getRuntime().exec("C:\\wamp\\wampmanager.exe ");
            
        } catch (IOException ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
    
    //Sobreescribe getIconImage para personalizar icono
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
                new VentanaPrincipal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup botones2;
    private javax.swing.JComboBox carrera;
    public javax.swing.JRadioButton diurna;
    private javax.swing.JComboBox especialidadingreso;
    private javax.swing.JButton estadisticas;
    public javax.swing.JComboBox facultad;
    private javax.swing.JButton ingresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JLabel jlabel11;
    private javax.swing.JMenu menuuno;
    protected javax.swing.JTextField nombrealumno;
    private javax.swing.JComboBox profesionalingreso;
    protected javax.swing.JTextField rutalumno;
    public javax.swing.JRadioButton vespertina;
    // End of variables declaration//GEN-END:variables
}
