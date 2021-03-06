/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import operacoes.Conta;

/**
 *
 * @author guilh
 */
public class Tela extends javax.swing.JFrame {
    private Conta conta1 = new Conta();
    
    /**
     * Creates new form Tela
     */
    public Tela() {
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

        jLabel1 = new javax.swing.JLabel();
        lbRitoPoints1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfValor1 = new java.awt.TextField();
        btnComprarRp1 = new javax.swing.JButton();
        btnCompraSkin1 = new javax.swing.JButton();
        lbTransacoes1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Rito Points:");

        lbRitoPoints1.setText("0 pts");

        jLabel2.setText("Transações:");

        tfValor1.setText("0");
        tfValor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfValor1ActionPerformed(evt);
            }
        });

        btnComprarRp1.setText("Comprar RP");
        btnComprarRp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarRp1ActionPerformed(evt);
            }
        });

        btnCompraSkin1.setText("Comprar Skin");
        btnCompraSkin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompraSkin1ActionPerformed(evt);
            }
        });

        lbTransacoes1.setText("---");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(tfValor1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnComprarRp1)
                            .addGap(36, 36, 36)
                            .addComponent(btnCompraSkin1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbTransacoes1)
                            .addComponent(lbRitoPoints1))))
                .addGap(93, 93, 93))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lbRitoPoints1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lbTransacoes1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfValor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCompraSkin1)
                    .addComponent(btnComprarRp1))
                .addContainerGap(113, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnComprarRp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarRp1ActionPerformed
        Integer valorDigitado = Integer.valueOf(tfValor1.getText());
        conta1.ComprarPontos(valorDigitado);
        lbRitoPoints1.setText(String.format("%d pts", conta1.getSaldo()));
    }//GEN-LAST:event_btnComprarRp1ActionPerformed

    private void btnCompraSkin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompraSkin1ActionPerformed
        Integer valorDigitado = Integer.valueOf(tfValor1.getText());
        conta1.DebitarPontos(valorDigitado);
        lbRitoPoints1.setText(String.format("%d pts", conta1.getSaldo()));
        lbTransacoes1.setText(conta1.getTransacoes().toString());
        JOptionPane.showMessageDialog(rootPane, conta1.getMensagem());
    }//GEN-LAST:event_btnCompraSkin1ActionPerformed

    private void tfValor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfValor1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfValor1ActionPerformed

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
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCompraSkin1;
    private javax.swing.JButton btnComprarRp1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lbRitoPoints1;
    private javax.swing.JLabel lbTransacoes1;
    private java.awt.TextField tfValor1;
    // End of variables declaration//GEN-END:variables
}
