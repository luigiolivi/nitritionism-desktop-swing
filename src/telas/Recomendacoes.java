/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

import javax.swing.JOptionPane;

/**
 *
 * @author etero
 */
public class Recomendacoes extends javax.swing.JFrame {

    /**
     * Creates new form Recomendacoes
     */
    public Recomendacoes() {
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

        jPanel1 = new javax.swing.JPanel();
        LabelRecomendacoes = new javax.swing.JLabel();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        LabelCalorias = new javax.swing.JLabel();
        Input = new javax.swing.JTextField();
        Botao = new javax.swing.JButton();
        jInternalFrame2 = new javax.swing.JInternalFrame();
        LabelCarboidratosFinal = new javax.swing.JLabel();
        LabelProteina = new javax.swing.JLabel();
        LabelGordura = new javax.swing.JLabel();
        LabelCarbohidratos = new javax.swing.JLabel();
        LabelProteinaFinal = new javax.swing.JLabel();
        LabelGorduraFinal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LabelRecomendacoes.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        LabelRecomendacoes.setText("Recomendações");

        jInternalFrame1.setVisible(true);

        LabelCalorias.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        LabelCalorias.setText("Calorias diárias (kcal):");

        Input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputActionPerformed(evt);
            }
        });

        Botao.setText("Calcular");
        Botao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(LabelCalorias)
                .addGap(18, 18, 18)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Input, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Botao, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelCalorias)
                    .addComponent(Input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Botao, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 14, Short.MAX_VALUE))
        );

        jInternalFrame2.setVisible(true);

        LabelCarboidratosFinal.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        LabelCarboidratosFinal.setText(" ");

        LabelProteina.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        LabelProteina.setText("Proteína (25%):");

        LabelGordura.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        LabelGordura.setText("Gordura (25%):");

        LabelCarbohidratos.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        LabelCarbohidratos.setText("Carboidratos (50%):");

        LabelProteinaFinal.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        LabelProteinaFinal.setText(" ");

        LabelGorduraFinal.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        LabelGorduraFinal.setText(" ");

        javax.swing.GroupLayout jInternalFrame2Layout = new javax.swing.GroupLayout(jInternalFrame2.getContentPane());
        jInternalFrame2.getContentPane().setLayout(jInternalFrame2Layout);
        jInternalFrame2Layout.setHorizontalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame2Layout.createSequentialGroup()
                        .addComponent(LabelCarbohidratos)
                        .addGap(18, 18, 18)
                        .addComponent(LabelCarboidratosFinal))
                    .addGroup(jInternalFrame2Layout.createSequentialGroup()
                        .addComponent(LabelGordura)
                        .addGap(18, 18, 18)
                        .addComponent(LabelGorduraFinal))
                    .addGroup(jInternalFrame2Layout.createSequentialGroup()
                        .addComponent(LabelProteina)
                        .addGap(18, 18, 18)
                        .addComponent(LabelProteinaFinal)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jInternalFrame2Layout.setVerticalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame2Layout.createSequentialGroup()
                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelCarbohidratos)
                    .addComponent(LabelCarboidratosFinal))
                .addGap(24, 24, 24)
                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelProteina)
                    .addComponent(LabelProteinaFinal))
                .addGap(18, 18, 18)
                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelGordura)
                    .addComponent(LabelGorduraFinal))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LabelRecomendacoes)
                    .addComponent(jInternalFrame1)
                    .addComponent(jInternalFrame2))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(LabelRecomendacoes)
                .addGap(18, 18, 18)
                .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jInternalFrame2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void InputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InputActionPerformed

    private void BotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoActionPerformed
        String strCalorias = Input.getText();
        
        if (strCalorias.isEmpty()) {
            JOptionPane.showMessageDialog(null, "O campo deve ser preenchido.");
        }
        
        else if (!strCalorias.matches("[0-9]{3,6}")) {
            JOptionPane.showMessageDialog(null, "O campo deve ser preenchido com formato coerente.");
        }
        
        else {
            double calorias = Double.parseDouble(strCalorias);
        
            double carboidratos = calorias * 0.5 / 4;
            String carboidratosResultado = String.valueOf(carboidratos);
            LabelCarboidratosFinal.setText(carboidratosResultado);

            double proteinas = calorias * 0.25 / 4;
            String proteinasResultado = String.valueOf(proteinas);
            LabelProteinaFinal.setText(proteinasResultado);

            double gordura = calorias * 0.25 / 9;
            String gorduraResultado = String.valueOf(gordura);
            LabelGorduraFinal.setText(gorduraResultado);
        }
        
    }//GEN-LAST:event_BotaoActionPerformed
 
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
            java.util.logging.Logger.getLogger(Recomendacoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Recomendacoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Recomendacoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Recomendacoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Recomendacoes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Botao;
    private javax.swing.JTextField Input;
    private javax.swing.JLabel LabelCalorias;
    private javax.swing.JLabel LabelCarbohidratos;
    private javax.swing.JLabel LabelCarboidratosFinal;
    private javax.swing.JLabel LabelGordura;
    private javax.swing.JLabel LabelGorduraFinal;
    private javax.swing.JLabel LabelProteina;
    private javax.swing.JLabel LabelProteinaFinal;
    private javax.swing.JLabel LabelRecomendacoes;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JInternalFrame jInternalFrame2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
