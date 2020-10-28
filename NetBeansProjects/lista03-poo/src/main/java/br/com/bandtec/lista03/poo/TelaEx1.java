/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.lista03.poo;

import javax.swing.JLabel;

/**
 *
 * @author guilh
 */
public class TelaEx1 extends javax.swing.JFrame {
    Dadinhos Dadinho01 = new Dadinhos();
    Dadinhos Dadinho02 = new Dadinhos();
   
    void Vitorias(){
        if(Dadinho01.getSorteio() > Dadinho02.getSorteio()){
            Dadinho01.AdicionarVitorias();
            lblVenc.setText("Dadinho01 Venceu");
            
        }else if(Dadinho02.getSorteio() > Dadinho01.getSorteio()){
            Dadinho02.AdicionarVitorias();
            lblVenc.setText("Dadinho02 Venceu");
        }else{
        lblVenc.setText("Empate");
        }
    }
    void AtualizarDadinhos( JLabel ValorDadinho, Dadinhos Dadinhos0101, JLabel Vitorias){
    ValorDadinho.setText(Dadinhos0101.getSorteio().toString());
    Vitorias.setText(Dadinhos0101.GetVitorias().toString());
    }

    /**
     * Creates new form TelaEx1
     */
    public TelaEx1() {
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
        jLabel2 = new javax.swing.JLabel();
        lblDadinho01 = new javax.swing.JLabel();
        lblDadinho02 = new javax.swing.JLabel();
        lblVenceu = new javax.swing.JLabel();
        btnSortDad = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblVit01 = new javax.swing.JLabel();
        lblVit02 = new javax.swing.JLabel();
        lblVenc = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Dadinho01:");

        jLabel2.setText("Dadinho02:");

        lblDadinho01.setText("---");

        lblDadinho02.setText("---");

        lblVenceu.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblVenceu.setForeground(new java.awt.Color(51, 255, 0));
        lblVenceu.setText("Dadinho --- Venceu");

        btnSortDad.setText("Sortear Dadinhos");
        btnSortDad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSortDadActionPerformed(evt);
            }
        });

        jLabel6.setText("Vitórias Dadinho01:");

        jLabel7.setText("Vitórias Dadinho02:");

        lblVit01.setText("---");

        lblVit02.setText("---");

        lblVenc.setText("Dadinho--- Venceu");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblDadinho01)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblVit01)
                                .addGap(51, 51, 51)
                                .addComponent(jLabel7)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblVit02)
                            .addComponent(lblDadinho02)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(lblVenceu))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(btnSortDad))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(lblVenc)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblDadinho01)
                    .addComponent(jLabel2)
                    .addComponent(lblDadinho02))
                .addGap(52, 52, 52)
                .addComponent(lblVenceu)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(lblVit01)
                    .addComponent(lblVit02))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblVenc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(btnSortDad)
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSortDadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSortDadActionPerformed
        Dadinho01.SorteioDadinhos();
        Dadinho02.SorteioDadinhos();
        Vitorias();
        AtualizarDadinhos(lblDadinho01, Dadinho01, lblVit01);
        AtualizarDadinhos(lblDadinho02, Dadinho02, lblVit02);

    }//GEN-LAST:event_btnSortDadActionPerformed

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
            java.util.logging.Logger.getLogger(TelaEx1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaEx1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaEx1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaEx1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaEx1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSortDad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lblDadinho01;
    private javax.swing.JLabel lblDadinho02;
    private javax.swing.JLabel lblVenc;
    private javax.swing.JLabel lblVenceu;
    private javax.swing.JLabel lblVit01;
    private javax.swing.JLabel lblVit02;
    // End of variables declaration//GEN-END:variables
}
