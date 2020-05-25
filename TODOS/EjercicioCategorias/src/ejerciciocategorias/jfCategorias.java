
package ejerciciocategorias;


public class jfCategorias extends javax.swing.JFrame {

    //Variables públicas dentro de la clase
    int ContadorNinos = 0; int PesoNinos = 0; int ContadorJovenes = 0; int PesoJovenes = 0;
    int ContadorAdulto = 0; int PesoAdulto = 0; int ContadorViejos = 0; int PesoViejos = 0;

    
    
    public jfCategorias() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtfEdad = new javax.swing.JTextField();
        jtfPeso = new javax.swing.JTextField();
        jlblCategorias = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jbCalcularRegistro = new javax.swing.JButton();
        jbCalculePromedios = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jlblPromedioNinos = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jlblPromedioJovenes = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jlblPromedioAdultos = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jlblPromedioViejos = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("CATEGORÍAS");

        jLabel2.setText("Peso:");

        jLabel3.setText("Edad:");

        jtfEdad.setText("0");

        jtfPeso.setText("0");

        jLabel5.setText("Categoría");

        jbCalcularRegistro.setText("Procesar Registro");
        jbCalcularRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCalcularRegistroActionPerformed(evt);
            }
        });

        jbCalculePromedios.setText("Calcule Promedios");
        jbCalculePromedios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCalculePromediosActionPerformed(evt);
            }
        });

        jLabel4.setText("Totales");

        jLabel6.setText("Promedio de niños:");

        jlblPromedioNinos.setText("0");

        jLabel8.setText("Promedio de jóvenes:");

        jlblPromedioJovenes.setText("0");

        jLabel10.setText("Promedio de adultos:");

        jlblPromedioAdultos.setText("0");

        jLabel12.setText("Promedio de viejos:");

        jlblPromedioViejos.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(371, 371, 371)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(129, 129, 129)
                                .addComponent(jtfEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(121, 121, 121)
                                .addComponent(jtfPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jlblCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(80, 80, 80))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(252, 252, 252))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(382, 382, 382)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbCalcularRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel10)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jlblPromedioAdultos))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(95, 95, 95)
                                    .addComponent(jlblPromedioNinos))))
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbCalculePromedios, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel12)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jlblPromedioViejos))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addGap(106, 106, 106)
                                    .addComponent(jlblPromedioJovenes))))))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel1)
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jtfPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jlblCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtfEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbCalculePromedios, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                    .addComponent(jbCalcularRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(46, 46, 46)
                .addComponent(jLabel4)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jlblPromedioNinos)
                    .addComponent(jLabel8)
                    .addComponent(jlblPromedioJovenes))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jlblPromedioAdultos)
                    .addComponent(jLabel12)
                    .addComponent(jlblPromedioViejos))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbCalcularRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCalcularRegistroActionPerformed
        int Peso=0; int Edad=0;
        
        Peso = Integer.valueOf(jtfPeso.getText());
        Edad = Integer.valueOf(jtfEdad.getText());
        
        
	if (Edad >0 && Edad<=12)
        {
		ContadorNinos=ContadorNinos + 1;
		PesoNinos=PesoNinos + Peso;
                jlblCategorias.setText("Niño");
        }
        else
        {
		if (Edad >=13 && Edad<=29)
                {
			ContadorJovenes=ContadorJovenes + 1;
			PesoJovenes=PesoJovenes + Peso;
                        jlblCategorias.setText("Jóven");
                }
                else
                {
			if (Edad >=30 && Edad<=59)
                        {
				ContadorAdulto=ContadorAdulto + 1;
				PesoAdulto=PesoAdulto + Peso;
                                jlblCategorias.setText("Adulto");
                        }
                        else
                        {
				ContadorViejos=ContadorViejos + 1;
				PesoViejos=PesoViejos + Peso;
                                jlblCategorias.setText("Viejo");
                        }
                }
        }        
        
        
    }//GEN-LAST:event_jbCalcularRegistroActionPerformed

    private void jbCalculePromediosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCalculePromediosActionPerformed

        double PromedioNinos=0; double PromedioJovenes = 0; double PromedioAdultos = 0; double PromedioViejos = 0;
        
        PromedioNinos = PesoNinos/ContadorNinos;
        PromedioJovenes = PesoJovenes/ContadorJovenes;
        PromedioAdultos = PesoAdulto/ContadorAdulto;
        PromedioViejos = PesoViejos/ContadorViejos;
        
        
        jlblPromedioNinos.setText(String.valueOf(PromedioNinos));
        jlblPromedioJovenes.setText(String.valueOf(PromedioJovenes));
        jlblPromedioAdultos.setText(String.valueOf(PromedioAdultos)); 
        jlblPromedioViejos.setText(String.valueOf(PromedioViejos));
        
    }//GEN-LAST:event_jbCalculePromediosActionPerformed

    public static void main(String args[]) {

        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(jfCategorias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfCategorias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfCategorias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfCategorias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfCategorias().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JButton jbCalcularRegistro;
    private javax.swing.JButton jbCalculePromedios;
    private javax.swing.JLabel jlblCategorias;
    private javax.swing.JLabel jlblPromedioAdultos;
    private javax.swing.JLabel jlblPromedioJovenes;
    private javax.swing.JLabel jlblPromedioNinos;
    private javax.swing.JLabel jlblPromedioViejos;
    private javax.swing.JTextField jtfEdad;
    private javax.swing.JTextField jtfPeso;
    // End of variables declaration//GEN-END:variables
}
