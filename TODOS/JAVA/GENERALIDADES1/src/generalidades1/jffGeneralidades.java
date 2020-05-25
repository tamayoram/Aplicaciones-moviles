package generalidades1;



public class jffGeneralidades extends javax.swing.JFrame {

    
    
    public jffGeneralidades() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("jButton1");
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
                .addGap(330, 330, 330)
                .addComponent(jButton1)
                .addContainerGap(393, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(264, 264, 264)
                .addComponent(jButton1)
                .addContainerGap(272, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        //I. Comentarios en java son de 2 tipos o formas:
        //1. Comentario por línea siempre se comienza con los caracteres unidos //
        //2. Comentario x bloques, permiten comentariar 1 o varias líneas y se hace de la siguiente manera: /* texto  */
        /*
        Esto es un comentario para va´ias líneas.
        Otra línea
        */
        
        //II. TIPOS DE DATOS
        // Son los que permiten darle la propiedad de qué almacenar a una variable.
        //int, double, boolean, byte, char, String, short, long
        //III. Definición de variables en java
        //SINTAXIS, pilas así como le ordene así me lo tiene que escribir.
        // TIPODEDATO NOMBREDELAVARIABLE OPERADORRELACIONALDEASIGNACION quemevaallevaroasignar ;
        int Variable1 = 0; String Nombre = ""; short N1 =0; boolean Casadot = true; boolean Casadof = false;
        //IV. Cómo realizar operaciones?
        // Contador: ContadorMujeres = ContadorMujeres + 1
        //Acumulador: AcumuladorDeEdades = AcumuladorDeEdades + Edad
        //Porcentaje: PorcentajeMujeresDelGrupo = (ValorInferior * Porcentaje)/ValorSuperior
        //Promedio:  Promedio = (SumaDeUnAcumulador)/ContadorDeVecesQueAcumulo
        //OperaciónAritméticaGemeral: ValorNominaPagada = ValorBruto + Bonificaciones - Deducciones
        
        

        
    }//GEN-LAST:event_jButton1ActionPerformed


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
            java.util.logging.Logger.getLogger(jffGeneralidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jffGeneralidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jffGeneralidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jffGeneralidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jffGeneralidades().setVisible(true);
            }
        });
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
