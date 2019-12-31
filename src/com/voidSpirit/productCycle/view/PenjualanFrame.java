/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.voidSpirit.productCycle.view;

import com.voidSpirit.productCycle.controller.LaporanController;
import com.voidSpirit.productCycle.controller.ProdukController;
import com.voidSpirit.productCycle.controller.TransaksiController;
import com.voidSpirit.productCycle.model.pojo.Laporan;
import com.voidSpirit.productCycle.model.pojo.Produk;
import com.voidSpirit.productCycle.model.pojo.Transaksi;
import com.voidSpirit.productCycle.utilites.ProdukUtilities;
import com.voidSpirit.productCycle.utilites.TransaksiUtilities;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Zikri
 */
public class PenjualanFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFram
     */
    private DefaultTableModel model;
    ProdukController conP = new ProdukController();
    TransaksiController conT = new TransaksiController();
    LaporanController conL = new LaporanController();

    public PenjualanFrame() throws SQLException {
        initComponents();
        this.setLocationRelativeTo(null);
        isiKolom();
        populateDataToTable();
    }
    
    private void isiField() {
        tfId.setText("");
        cmbNamaProduk.setSelectedIndex(0);
        tfStokTerjual.setText("");
    }

    public void populateDataToTable() throws SQLException {
        model = (DefaultTableModel) tblTransaksi.getModel();
        List<Transaksi> tr = conT.lihatTransaksi();
        int i = 0;

        for (Transaksi tra : tr) {
            Object[] row = new Object[4];
            row[0] = ++i;
            row[1] = tra.getNamaProduk();
            row[2] = tra.getStokTerjual();
            row[3] = tra.getTotalPendapatan();
            model.addRow(row);
        }
    }

    public void refreshTable() throws SQLException {
        DefaultTableModel model = (DefaultTableModel) tblTransaksi.getModel();
        model.setRowCount(0);
        populateDataToTable();
    }

    public void isiKolom() throws SQLException {
        List<Produk> prd = conP.lihatNama();

        cmbNamaProduk.removeAllItems();
        cmbNamaProduk.addItem("-- Pilih Produk --");
        for (Produk pr : prd) {
            cmbNamaProduk.addItem(pr.getNamaProduk());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblHalUtama = new javax.swing.JLabel();
        lblNama = new javax.swing.JLabel();
        lblStok = new javax.swing.JLabel();
        btnTambah = new javax.swing.JButton();
        btnKembali = new javax.swing.JButton();
        tfStokTerjual = new javax.swing.JTextField();
        cmbNamaProduk = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTransaksi = new javax.swing.JTable();
        btnProses = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        lblId = new javax.swing.JLabel();
        tfId = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblHalUtama.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblHalUtama.setText("PENJUALAN PRODUK");

        lblNama.setText("Nama  Produk :");

        lblStok.setText("Stok terjual : ");

        btnTambah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-plus-64.png"))); // NOI18N
        btnTambah.setText("Tambah");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        btnKembali.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Clear Symbol-48.png"))); // NOI18N
        btnKembali.setText("Kembali");
        btnKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliActionPerformed(evt);
            }
        });

        tfStokTerjual.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfStokTerjualKeyTyped(evt);
            }
        });

        tblTransaksi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "Nama Produk", "Stok Terjual", "Total Perjualan"
            }
        ));
        tblTransaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTransaksiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblTransaksi);

        btnProses.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-process-64.png"))); // NOI18N
        btnProses.setText("Proses");
        btnProses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProsesActionPerformed(evt);
            }
        });

        btnHapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-minus-64.png"))); // NOI18N
        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        lblId.setText("Id : ");

        tfId.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnKembali)
                        .addGap(239, 239, 239)
                        .addComponent(lblHalUtama))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnProses, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 830, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfStokTerjual, javax.swing.GroupLayout.PREFERRED_SIZE, 725, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblStok)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblNama)
                                        .addComponent(lblId))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(cmbNamaProduk, 0, 725, Short.MAX_VALUE)
                                        .addComponent(tfId)))))))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnKembali))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(lblHalUtama)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(lblId)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNama)
                            .addComponent(cmbNamaProduk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblStok)
                            .addComponent(tfStokTerjual, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnTambah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnHapus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnProses, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(tfId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(190, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliActionPerformed
        new MainFrame().setVisible(true);
        this.setVisible(false);

        int status = 0;
        try {
            status = conT.hapusSemuaTransaksi();
            refreshTable();
        } catch (SQLException ex) {
        }
    }//GEN-LAST:event_btnKembaliActionPerformed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        // TODO add your handling code here:
        int status = 0;
        int stok;
        String nama = cmbNamaProduk.getSelectedItem().toString();

        if (!tfStokTerjual.getText().equals("")) {
            stok = Integer.valueOf(tfStokTerjual.getText());
        } else {
            stok = 0;
        }

        if (TransaksiUtilities.checkData(new Transaksi(nama, stok))) {
            try {
                if (TransaksiUtilities.checkStok(conP.cariStok(nama), stok)) {
                    try {
                        int hargaTotal = conP.lihatHargaStok(new Produk(cmbNamaProduk.getSelectedItem().toString()), Integer.valueOf(tfStokTerjual.getText()));
                        status = conT.tambahTransaksi(new Transaksi(cmbNamaProduk.getSelectedItem().toString(), Integer.valueOf(tfStokTerjual.getText()), hargaTotal));
                    } catch (SQLException ex) {
                        Logger.getLogger(KelolaProdukFrame.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    if (status == 1) {
                        try {
                            refreshTable();
                        } catch (SQLException ex) {
                            Logger.getLogger(KelolaProdukFrame.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        JOptionPane.showMessageDialog(this, "Transaksi berhasil ditambahkan");
                    } else {
                        JOptionPane.showMessageDialog(this, "Transaksi gagal ditambahkan");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Stok yang diinput melebihi batas");
                }
            } catch (SQLException ex) {
                Logger.getLogger(PenjualanFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Inputan tidak boleh kosong");
        }
        isiField();
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
        int id;
        int status = 0;

        if (!tfId.getText().equals("")) {
            id = Integer.valueOf(tfId.getText());
        } else {
            id = 0;
        }

        if (TransaksiUtilities.checkDataId(id)) {
            try {
                status = conT.hapusTransaksi(id);
            } catch (SQLException ex) {
                Logger.getLogger(KelolaProdukFrame.class.getName()).log(Level.SEVERE, null, ex);
            }

            if (status == 1) {
                try {
                    refreshTable();
                } catch (SQLException ex) {
                    Logger.getLogger(PenjualanFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
                JOptionPane.showMessageDialog(this, "Transaksi dengan " + id + " berhasil di Hapus");
            } else {
                JOptionPane.showMessageDialog(this, "Transaksi gagal diHapus");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Silahkan pilih yang ingin dihapus");
        }
        isiField();

    }//GEN-LAST:event_btnHapusActionPerformed

    private void tblTransaksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTransaksiMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tblTransaksi.getModel();
        int selectedIndex = tblTransaksi.getSelectedRow();

        String nama = model.getValueAt(selectedIndex, 1).toString();
        int stok = (int) model.getValueAt(selectedIndex, 2);
        int total = (int) model.getValueAt(selectedIndex, 3);

        try {
            int id = conT.cariId(new Transaksi(nama, stok, total));
            tfId.setText(Integer.toString(id));
            cmbNamaProduk.setSelectedItem(nama);
            tfStokTerjual.setText(model.getValueAt(selectedIndex, 2).toString());
        } catch (SQLException ex) {
            Logger.getLogger(PenjualanFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tblTransaksiMouseClicked

    private void btnProsesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProsesActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tblTransaksi.getModel();
        int baris = model.getRowCount();
        int total = 0;
        int stok = 0;
        int status1 = 0;
        int status2 = 0;
        int status3 = 0;
        for (int i = 0; i < baris; i++) {
            total = total + (int) model.getValueAt(i, 3);
        }
        for (int i = 0; i < baris; i++) {
            try {
                String nama = (String) model.getValueAt(i, 1);
                stok = conP.cariStok((String) model.getValueAt(i, 1)) - (int) model.getValueAt(i, 2);
                status3 = conP.ubahStok(nama, stok);
            } catch (SQLException ex) {
                Logger.getLogger(PenjualanFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (total != 0) {
            try {
                status1 = conL.tambahProduk(new Laporan(total));
                status2 = conT.hapusSemuaTransaksi();
                refreshTable();
            } catch (SQLException ex) {
            }

            if (status1 == 1 || status2 == 0) {
                JOptionPane.showMessageDialog(null, "Transaksi telah berhasil dengan hasil penjualan sebanyak Rp." + Integer.toString(total));
            } else {
                JOptionPane.showMessageDialog(this, "Transaksi gagal");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Transaksi masih kosong");
        }
    }//GEN-LAST:event_btnProsesActionPerformed

    private void tfStokTerjualKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfStokTerjualKeyTyped
        // TODO add your handling code here:
        ProdukUtilities.checkNumber(evt);
    }//GEN-LAST:event_tfStokTerjualKeyTyped

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
            java.util.logging.Logger.getLogger(PenjualanFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PenjualanFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PenjualanFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PenjualanFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new PenjualanFrame().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(PenjualanFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnKembali;
    private javax.swing.JButton btnProses;
    private javax.swing.JButton btnTambah;
    private javax.swing.JComboBox<String> cmbNamaProduk;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblHalUtama;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblNama;
    private javax.swing.JLabel lblStok;
    private javax.swing.JTable tblTransaksi;
    private javax.swing.JTextField tfId;
    private javax.swing.JTextField tfStokTerjual;
    // End of variables declaration//GEN-END:variables
}
