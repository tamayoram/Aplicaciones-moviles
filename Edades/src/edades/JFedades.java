/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edades;

/**
 *
 * @author 501
 */
public class JFedades extends javax.swing.JFrame {

    /**
     * Creates new form JFedades
     */
    public JFedades() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbltitulo = new javax.swing.JLabel();
        lbledad = new javax.swing.JLabel();
        lblsexo = new javax.swing.JLabel();
        lblestcivil = new javax.swing.JLabel();
        btnprocesar = new javax.swing.JButton();
        btntotales = new javax.swing.JButton();
        lblresultado = new javax.swing.JLabel();
        txtedad = new javax.swing.JTextField();
        txtsexo = new javax.swing.JTextField();
        txtestcivil = new javax.swing.JTextField();
        lbltotalpersona = new javax.swing.JLabel();
        lblrespersona = new javax.swing.JLabel();
        lbltotalmuj = new javax.swing.JLabel();
        lblmuj18 = new javax.swing.JLabel();
        lblprommuj = new javax.swing.JLabel();
        lblporcmuj = new javax.swing.JLabel();
        lblresmuj = new javax.swing.JLabel();
        lblresmuj18 = new javax.swing.JLabel();
        lblresulporcmuj = new javax.swing.JLabel();
        lblresprommuj = new javax.swing.JLabel();
        SumEdadMuj = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbltitulo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbltitulo.setText("Algoritmos objetos");

        lbledad.setText("Edad");

        lblsexo.setText("Sexo");

        lblestcivil.setText("Estado civil");

        btnprocesar.setBackground(new java.awt.Color(102, 102, 255));
        btnprocesar.setText("Procesar");
        btnprocesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprocesarActionPerformed(evt);
            }
        });

        btntotales.setBackground(new java.awt.Color(255, 51, 51));
        btntotales.setText("Totales");
        btntotales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntotalesActionPerformed(evt);
            }
        });

        lblresultado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblresultado.setText("Resultado");

        lbltotalpersona.setText("Total personas");

        lblrespersona.setText("0");

        lbltotalmuj.setText("Total mujeres");

        lblmuj18.setText("Total mujeres mayor de edad");

        lblprommuj.setText("Promedio edad mujeres");

        lblporcmuj.setText("Porcentaje de mujeres");

        lblresmuj.setText("0");

        lblresmuj18.setText("0");

        lblresulporcmuj.setText("0");

        lblresprommuj.setText("0");

        SumEdadMuj.setBackground(new java.awt.Color(255, 255, 255));
        SumEdadMuj.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblestcivil)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbledad)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtedad, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtestcivil, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnprocesar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btntotales))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(SumEdadMuj)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblsexo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtsexo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(83, 83, 83))))
            .addGroup(layout.createSequentialGroup()
                .addGap(214, 214, 214)
                .addComponent(lblresultado)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbltitulo)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbltotalpersona)
                            .addComponent(lbltotalmuj)
                            .addComponent(lblmuj18)
                            .addComponent(lblprommuj)
                            .addComponent(lblporcmuj))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblresulporcmuj, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblresmuj18, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblresmuj, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblrespersona, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblresprommuj, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(178, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lbltitulo)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbledad)
                    .addComponent(lblsexo)
                    .addComponent(txtedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtsexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblestcivil)
                    .addComponent(txtestcivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnprocesar)
                    .addComponent(btntotales))
                .addGap(27, 27, 27)
                .addComponent(lblresultado)
                .addGap(7, 7, 7)
                .addComponent(SumEdadMuj)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbltotalpersona)
                    .addComponent(lblrespersona))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblresmuj)
                    .addComponent(lbltotalmuj))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblmuj18)
                    .addComponent(lblresmuj18))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblprommuj)
                    .addComponent(lblresprommuj))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblporcmuj)
                    .addComponent(lblresulporcmuj))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnprocesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprocesarActionPerformed
        
        int CantPersona=0;int CantMuj=0;int Canthom=0; int CantMujMayor=0;
        float PromEdadMuj=0;float PorcentMuj=0;
        
       int SumaEdadMuj=0;int Edad=0; int sexo=0; int EstadoCivil=0;
        
        //la información se captura en string del cuadro de texto, por lo que se debe convertir a integer
        Edad=Integer.valueOf(txtedad.getText());
        sexo=Integer.valueOf(txtsexo.getText());
        EstadoCivil=Integer.valueOf(txtestcivil.getText());
        
       CantPersona=Integer.valueOf(lblrespersona.getText())+1;
        
        if(sexo==1){
            CantMuj=Integer.valueOf(lblresmuj.getText())+1;
            SumaEdadMuj=Integer.valueOf(SumEdadMuj.getText())+Edad;
                
                if(Edad>18){
                    CantMujMayor=Integer.valueOf(lblresmuj18.getText())+1;
                }
        }
        else if (sexo==2)
        {
        SumaEdadMuj=Integer.valueOf(SumEdadMuj.getText());
        CantMuj=Integer.valueOf(lblresmuj.getText());
        CantMujMayor=Integer.valueOf(lblresmuj18.getText());
        Canthom=Canthom+1;    
        }
       lblrespersona.setText(String.valueOf(CantPersona));
       lblresmuj.setText(String.valueOf(CantMuj));
       lblresmuj18.setText(String.valueOf(CantMujMayor));
       SumEdadMuj.setText(String.valueOf(SumaEdadMuj));
    }//GEN-LAST:event_btnprocesarActionPerformed

    private void btntotalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntotalesActionPerformed
        
        EdadesAlgoritmosObjetos oFunciones=new EdadesAlgoritmosObjetos();
        lblresulporcmuj.setText(String.valueOf(oFunciones.PorcentajeMujeres(Integer.valueOf(lblresmuj.getText()),Integer.valueOf(lblrespersona.getText()))));
        lblresprommuj.setText(String.valueOf(oFunciones.PromedioEdadMujeres(Integer.valueOf(SumEdadMuj.getText()),Integer.valueOf(lblresmuj.getText()))));
    }//GEN-LAST:event_btntotalesActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(JFedades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFedades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFedades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFedades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFedades().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel SumEdadMuj;
    private javax.swing.JButton btnprocesar;
    private javax.swing.JButton btntotales;
    private javax.swing.JLabel lbledad;
    private javax.swing.JLabel lblestcivil;
    private javax.swing.JLabel lblmuj18;
    private javax.swing.JLabel lblporcmuj;
    private javax.swing.JLabel lblprommuj;
    private javax.swing.JLabel lblresmuj;
    private javax.swing.JLabel lblresmuj18;
    private javax.swing.JLabel lblrespersona;
    private javax.swing.JLabel lblresprommuj;
    private javax.swing.JLabel lblresulporcmuj;
    private javax.swing.JLabel lblresultado;
    private javax.swing.JLabel lblsexo;
    private javax.swing.JLabel lbltitulo;
    private javax.swing.JLabel lbltotalmuj;
    private javax.swing.JLabel lbltotalpersona;
    private javax.swing.JTextField txtedad;
    private javax.swing.JTextField txtestcivil;
    private javax.swing.JTextField txtsexo;
    // End of variables declaration//GEN-END:variables
}
