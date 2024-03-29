/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.voidSpirit.productCycle.view;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Zikri
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnPindahLaporan = new javax.swing.JButton();
        btnPindahPenjualan = new javax.swing.JButton();
        btnPindahKelola = new javax.swing.JButton();
        lblBanner = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        lblKelola = new javax.swing.JLabel();
        lblPenjualan = new javax.swing.JLabel();
        lblPelaporan = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(0, 0));

        btnPindahLaporan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-accounting-64.png"))); // NOI18N
        btnPindahLaporan.setMaximumSize(new java.awt.Dimension(80, 50));
        btnPindahLaporan.setMinimumSize(new java.awt.Dimension(80, 50));
        btnPindahLaporan.setPreferredSize(new java.awt.Dimension(80, 50));
        btnPindahLaporan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPindahLaporanActionPerformed(evt);
            }
        });

        btnPindahPenjualan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Penjulan.png"))); // NOI18N
        btnPindahPenjualan.setMaximumSize(new java.awt.Dimension(80, 50));
        btnPindahPenjualan.setMinimumSize(new java.awt.Dimension(80, 50));
        btnPindahPenjualan.setPreferredSize(new java.awt.Dimension(80, 50));
        btnPindahPenjualan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPindahPenjualanActionPerformed(evt);
            }
        });

        btnPindahKelola.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-view-64.png"))); // NOI18N
        btnPindahKelola.setMaximumSize(new java.awt.Dimension(80, 50));
        btnPindahKelola.setMinimumSize(new java.awt.Dimension(80, 50));
        btnPindahKelola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPindahKelolaActionPerformed(evt);
            }
        });

        lblBanner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Banner.png"))); // NOI18N

        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Exit-32.png"))); // NOI18N
        btnExit.setText("EXIT");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        lblKelola.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblKelola.setText("Kelola Produk");

        lblPenjualan.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblPenjualan.setText("Penjualan Produk");

        lblPelaporan.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblPelaporan.setText("Pelaporan Produk");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnPindahKelola, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPindahPenjualan, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPindahLaporan, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExit))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(lblKelola)
                        .addGap(140, 140, 140)
                        .addComponent(lblPenjualan)
                        .addGap(126, 126, 126)
                        .addComponent(lblPelaporan))
                    .addComponent(lblBanner))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPindahLaporan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPindahPenjualan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPindahKelola, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPelaporan, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPenjualan)
                    .addComponent(lblKelola))
                .addGap(30, 30, 30)
                .addComponent(lblBanner)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPindahLaporanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPindahLaporanActionPerformed
        try {
            new LaporanFrame().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setVisible(false);
    }//GEN-LAST:event_btnPindahLaporanActionPerformed

    private void btnPindahPenjualanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPindahPenjualanActionPerformed
        try {
            new PenjualanFrame().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setVisible(false);
    }//GEN-LAST:event_btnPindahPenjualanActionPerformed

    private void btnPindahKelolaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPindahKelolaActionPerformed
        try {
            new KelolaProdukFrame().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setVisible(false);
    }//GEN-LAST:event_btnPindahKelolaActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnExitActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnPindahKelola;
    private javax.swing.JButton btnPindahLaporan;
    private javax.swing.JButton btnPindahPenjualan;
    private javax.swing.JLabel lblBanner;
    private javax.swing.JLabel lblKelola;
    private javax.swing.JLabel lblPelaporan;
    private javax.swing.JLabel lblPenjualan;
    // End of variables declaration//GEN-END:variables
}
