package ejemplo.general.de.poo;

public class jffConstructores extends javax.swing.JFrame {

    public jffConstructores() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbCONSTRUCTORES = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jbCONSTRUCTORES.setText("CONSTRUCTORES");
        jbCONSTRUCTORES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCONSTRUCTORESActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(jbCONSTRUCTORES)
                .addContainerGap(284, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(215, Short.MAX_VALUE)
                .addComponent(jbCONSTRUCTORES)
                .addGap(155, 155, 155))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbCONSTRUCTORESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCONSTRUCTORESActionPerformed

        jcConstructoresEquiposDeFutbol ojcConstructoresEquiposDeFutbol1 = new 
                jcConstructoresEquiposDeFutbol();
        jcConstructoresEquiposDeFutbol ojcConstructoresEquiposDeFutbol2 = new 
                jcConstructoresEquiposDeFutbol("Real Madrid");
        jcConstructoresEquiposDeFutbol ojcConstructoresEquiposDeFutbol3 = new 
                jcConstructoresEquiposDeFutbol("Real Madrid", "España", 24, 6);
        
   
      System.out.println(ojcConstructoresEquiposDeFutbol1.getCiudadDelEquipo() + 
              ojcConstructoresEquiposDeFutbol1.getNombreDelEquipo() +
              ojcConstructoresEquiposDeFutbol1.getCantidadDeJugadores() +
              ojcConstructoresEquiposDeFutbol1.getPuntos()
              );
      
      System.out.println(ojcConstructoresEquiposDeFutbol2.getCiudadDelEquipo() + 
              ojcConstructoresEquiposDeFutbol2.getNombreDelEquipo() +
              ojcConstructoresEquiposDeFutbol2.getCantidadDeJugadores() +
              ojcConstructoresEquiposDeFutbol2.getPuntos()
              );
      
      System.out.println(ojcConstructoresEquiposDeFutbol3.getCiudadDelEquipo() + 
              ojcConstructoresEquiposDeFutbol2.getNombreDelEquipo() +
              ojcConstructoresEquiposDeFutbol3.getCantidadDeJugadores() +
              ojcConstructoresEquiposDeFutbol3.getPuntos()
              );            
        
        
    }//GEN-LAST:event_jbCONSTRUCTORESActionPerformed

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
            java.util.logging.Logger.getLogger(jffConstructores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jffConstructores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jffConstructores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jffConstructores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jffConstructores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbCONSTRUCTORES;
    // End of variables declaration//GEN-END:variables
}
