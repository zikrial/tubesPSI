/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.voidSpirit.productCycle.utilites;

import com.voidSpirit.productCycle.model.pojo.Produk;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Zikri
 */
public class ProdukUtilities {

    public static int getTotal(int harga, int stok) {
        int totalHarga = 0;
        totalHarga= harga * stok;
        return totalHarga;
    }
    
    public static boolean checkData(Produk pr) {
       if(!pr.getNamaProduk().isEmpty() && !pr.getNamaJenis().equalsIgnoreCase("-- Pilih Jenis --") && pr.getHargaProduk() > 0 && pr.getStokProduk() > 0) {
           return true;
       } 
       return false;
    }
    
    public static boolean checkData(String jenis) {
       if(!jenis.isEmpty()) {
           return true;
       } 
       return false;
    }
    
    public static void checkNumber(KeyEvent a) {
        if(Character.isAlphabetic(a.getKeyChar())) {
            a.consume();
            JOptionPane.showMessageDialog(null, "Inputan tidak boleh selain angka");
        }
    }
}
