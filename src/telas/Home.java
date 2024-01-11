package telas;

public class Home extends javax.swing.JFrame {
    public Home() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ButtonIMC = new javax.swing.JButton();
        ButtonRecomendacoes = new javax.swing.JButton();
        ButtonGastoCalorico = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ButtonIMC.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        ButtonIMC.setText("IMC");
        ButtonIMC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonIMCActionPerformed(evt);
            }
        });

        ButtonRecomendacoes.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        ButtonRecomendacoes.setText("Recomendações");
        ButtonRecomendacoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonRecomendacoesActionPerformed(evt);
            }
        });

        ButtonGastoCalorico.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        ButtonGastoCalorico.setText("Gasto calórico");
        ButtonGastoCalorico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonGastoCaloricoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(ButtonIMC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ButtonGastoCalorico, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                    .addComponent(ButtonRecomendacoes, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE))
                .addGap(88, 88, 88))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(ButtonIMC, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                .addGap(42, 42, 42)
                .addComponent(ButtonGastoCalorico, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                .addGap(42, 42, 42)
                .addComponent(ButtonRecomendacoes, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                .addGap(42, 42, 42))
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

    private void ButtonIMCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonIMCActionPerformed
        IMC imc = new IMC(this);
        imc.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ButtonIMCActionPerformed

    private void ButtonRecomendacoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonRecomendacoesActionPerformed
        Recomendacoes recomendacoes = new Recomendacoes();
        recomendacoes.setVisible(true);
    }//GEN-LAST:event_ButtonRecomendacoesActionPerformed

    private void ButtonGastoCaloricoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonGastoCaloricoActionPerformed
        GastoCalorico gastocalorico = new GastoCalorico();
        gastocalorico.setVisible(true);
    }//GEN-LAST:event_ButtonGastoCaloricoActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonGastoCalorico;
    private javax.swing.JButton ButtonIMC;
    private javax.swing.JButton ButtonRecomendacoes;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
