/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.voidSpirit.productCycle.view;

import com.voidSpirit.productCycle.controller.ProdukController;
import com.voidSpirit.productCycle.model.pojo.JenisProduk;
import com.voidSpirit.productCycle.model.pojo.Produk;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author Zikri
 */
public class KelolaProdukFrame extends javax.swing.JFrame {

    /**
     * Creates new form KelolaProdukFrame
     */
    private DefaultTableModel model;
    ProdukController con = new ProdukController();

    public KelolaProdukFrame() throws SQLException {
        initComponents();
        ukuranKolom();
        isiKolom();
        this.setLocationRelativeTo(null);
        populateDataToTable();
    }

    public void isiKolom() throws SQLException {
        List<Produk> prd = con.lihatJenis();

        cmbJenis.removeAllItems();
        cmbJenis.addItem("-- Pilih Jenis --");
        for (Produk pr : prd) {
            cmbJenis.addItem(pr.getNamaJenis());
        }
    }

    public void populateDataToTable() throws SQLException {
        model = (DefaultTableModel) tabelProduk.getModel();
        List<Produk> prd = con.lihatProduk();
        int i = 0;

        for (Produk pr : prd) {
            Object[] row = new Object[5];
            row[0] = ++i;
            row[1] = pr.getNamaProduk();
            row[2] = pr.getNamaJenis();
            row[3] = pr.getHargaProduk();
            row[4] = pr.getStokProduk();
            model.addRow(row);
        }
    }

    public void ukuranKolom() {
        TableColumn column;
        tabelProduk.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        column = tabelProduk.getColumnModel().getColumn(0);
        column.setPreferredWidth(100);
        column = tabelProduk.getColumnModel().getColumn(1);
        column.setPreferredWidth(275);
        column = tabelProduk.getColumnModel().getColumn(2);
        column.setPreferredWidth(200);
        column = tabelProduk.getColumnModel().getColumn(3);
        column.setPreferredWidth(200);
        column = tabelProduk.getColumnModel().getColumn(4);
        column.setPreferredWidth(100);
    }

    public void refreshTable() throws SQLException {
        DefaultTableModel model = (DefaultTableModel) tabelProduk.getModel();
        model.setRowCount(0);
        populateDataToTable();
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
        btnKembali = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelProduk = new javax.swing.JTable();
        btnTambah = new javax.swing.JButton();
        btnUbah = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        labelNama = new javax.swing.JLabel();
        labelJenis = new javax.swing.JLabel();
        labelHarga = new javax.swing.JLabel();
        labelStok = new javax.swing.JLabel();
        textFieldNama = new javax.swing.JTextField();
        cmbJenis = new javax.swing.JComboBox<String>();
        textFieldHarga = new javax.swing.JTextField();
        texttFieldStok = new javax.swing.JTextField();
        labelNama1 = new javax.swing.JLabel();
        textFieldId = new javax.swing.JTextField();
        btnTambahJenis = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        textFieldMenu = new javax.swing.JTextField();

        jLabel1.setText("Kelola Barang");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnKembali.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Clear Symbol-48.png"))); // NOI18N
        btnKembali.setText("Kembali");
        btnKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliActionPerformed(evt);
            }
        });

        tabelProduk.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "Nama", "Jenis", "Harga Satuan", "Stok"
            }
        ));
        tabelProduk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelProdukMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelProduk);

        btnTambah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-plus-64.png"))); // NOI18N
        btnTambah.setText("Tambah");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        btnUbah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-material-filled-64.png"))); // NOI18N
        btnUbah.setText("Ubah");
        btnUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahActionPerformed(evt);
            }
        });

        btnHapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-minus-64.png"))); // NOI18N
        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("KELOLA PRODUK");

        labelNama.setText("Nama Produk  ");

        labelJenis.setText("Jenis Produk   ");

        labelHarga.setText("Harga Satuan ");

        labelStok.setText("Stok Produk   ");

        cmbJenis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbJenisActionPerformed(evt);
            }
        });

        textFieldHarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldHargaActionPerformed(evt);
            }
        });

        labelNama1.setText("Id Produk");

        textFieldId.setEnabled(false);
        textFieldId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldIdActionPerformed(evt);
            }
        });

        btnTambahJenis.setText("TAMBAH MENU");
        btnTambahJenis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahJenisActionPerformed(evt);
            }
        });

        jLabel3.setText("Jenis baru :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnKembali)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(352, 352, 352))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(btnTambah)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnUbah, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelHarga, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(39, 39, 39)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(labelNama1)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(labelNama, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(labelJenis, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                    .addComponent(labelStok)
                                                    .addGap(2, 2, 2))))))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(textFieldHarga, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbJenis, javax.swing.GroupLayout.Alignment.LEADING, 0, 300, Short.MAX_VALUE)
                                    .addComponent(textFieldNama, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textFieldId, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(texttFieldStok))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel3)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(textFieldMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnTambahJenis, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(btnKembali))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelNama1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textFieldNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelNama))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelJenis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbJenis))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textFieldHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelHarga))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelStok)
                            .addComponent(texttFieldStok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(112, 112, 112))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(textFieldMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTambahJenis, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(102, 102, 102)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnTambah)
                            .addComponent(btnUbah)
                            .addComponent(btnHapus))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliActionPerformed
        new MainFrame().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnKembaliActionPerformed

    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed
        int id = Integer.valueOf(textFieldId.getText());
        String nama = textFieldNama.getText();
        String jenis = (String) cmbJenis.getSelectedItem();
        int harga = Integer.parseInt(textFieldHarga.getText());
        int stok = Integer.parseInt(texttFieldStok.getText());
        int status = 0;

        try {
            status = con.ubahProduk(new Produk(id, nama, jenis, harga, stok));
        } catch (SQLException ex) {
            Logger.getLogger(KelolaProdukFrame.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (status == 1) {
            try {
                refreshTable();
            } catch (SQLException ex) {
                Logger.getLogger(KelolaProdukFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(this, "Produk " + nama + " berhasil di Ubah");
        } else {
            JOptionPane.showMessageDialog(this, "Produk gagal di Ubah");
        }
    }//GEN-LAST:event_btnUbahActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
        int id = Integer.valueOf(textFieldId.getText());
        String nama = textFieldNama.getText();
        String jenis = (String) cmbJenis.getSelectedItem();
        int harga = Integer.parseInt(textFieldHarga.getText());
        int stok = Integer.parseInt(texttFieldStok.getText());
        int status = 0;
        try {
            status = con.hapusProduk(new Produk(nama, jenis, harga, stok));
        } catch (SQLException ex) {
            Logger.getLogger(KelolaProdukFrame.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (status == 1) {
            try {
                refreshTable();
            } catch (SQLException ex) {
                Logger.getLogger(KelolaProdukFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(this, "Produk dengan " + id + " berhasil di Hapus");
        } else {
            JOptionPane.showMessageDialog(this, "Produk gagal diHapus");
        }


    }//GEN-LAST:event_btnHapusActionPerformed

    private void textFieldHargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldHargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldHargaActionPerformed

    private void cmbJenisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbJenisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbJenisActionPerformed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        // TODO add your handling code here:
        textFieldId.getText();
        String nama = textFieldNama.getText();
        String jenis = (String) cmbJenis.getSelectedItem();
        int harga = Integer.parseInt(textFieldHarga.getText());
        int stok = Integer.parseInt(texttFieldStok.getText());
        int status = 0;

        try {
            status = con.tambahProduk(new Produk(nama, jenis, harga, stok));
        } catch (SQLException ex) {
            Logger.getLogger(KelolaProdukFrame.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (status == 1) {
            try {
                refreshTable();
            } catch (SQLException ex) {
                Logger.getLogger(KelolaProdukFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(this, "Produk " + nama + " berhasil ditambahkan");
        } else {
            JOptionPane.showMessageDialog(this, "Produk gagal ditambahkan");
        }
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnTambahJenisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahJenisActionPerformed
        // TODO add your handling code here:
        String jenis = textFieldMenu.getText();

        int status = 0;
        try {

            DefaultTableModel model = (DefaultTableModel) tabelProduk.getModel();
            status = con.tambahJenis(new JenisProduk(jenis));

            isiKolom();

        } catch (SQLException ex) {
        }
        if (status == 1) {
            JOptionPane.showMessageDialog(this, "Jenis " + jenis + " berhasil ditambahkan");
        } else {
            JOptionPane.showMessageDialog(this, "Jenis gagal ditambahkan");
        }

    }//GEN-LAST:event_btnTambahJenisActionPerformed

    private void textFieldIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldIdActionPerformed

    private void tabelProdukMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelProdukMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tabelProduk.getModel();
        int selectedIndex = tabelProduk.getSelectedRow();

        String nama = model.getValueAt(selectedIndex, 1).toString();
        String jenis = model.getValueAt(selectedIndex, 2).toString();
        int harga = (int) model.getValueAt(selectedIndex, 3);
        int stok = (int) model.getValueAt(selectedIndex, 4);

        try {
            int id = con.cariId(new Produk(nama, jenis, harga, stok));
            textFieldId.setText(Integer.toString(id));
            textFieldNama.setText(nama);
            cmbJenis.setSelectedItem(jenis);
            textFieldHarga.setText(model.getValueAt(selectedIndex, 3).toString());
            texttFieldStok.setText(model.getValueAt(selectedIndex, 4).toString());
        } catch (SQLException ex) {
            Logger.getLogger(KelolaProdukFrame.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_tabelProdukMouseClicked

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
            java.util.logging.Logger.getLogger(KelolaProdukFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KelolaProdukFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KelolaProdukFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KelolaProdukFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new KelolaProdukFrame().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(KelolaProdukFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnKembali;
    private javax.swing.JButton btnTambah;
    private javax.swing.JButton btnTambahJenis;
    private javax.swing.JButton btnUbah;
    private javax.swing.JComboBox<String> cmbJenis;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelHarga;
    private javax.swing.JLabel labelJenis;
    private javax.swing.JLabel labelNama;
    private javax.swing.JLabel labelNama1;
    private javax.swing.JLabel labelStok;
    private javax.swing.JTable tabelProduk;
    private javax.swing.JTextField textFieldHarga;
    private javax.swing.JTextField textFieldId;
    private javax.swing.JTextField textFieldMenu;
    private javax.swing.JTextField textFieldNama;
    private javax.swing.JTextField texttFieldStok;
    // End of variables declaration//GEN-END:variables
}
