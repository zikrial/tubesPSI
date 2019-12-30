/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.voidSpirit.productCycle.utilites;

import com.voidSpirit.productCycle.model.pojo.Transaksi;

/**
 *
 * @author A wahyu setiawan
 */
public class TransaksiUtilities {

    public static boolean checkData(Transaksi tr) {
        if (tr.getStokTerjual() > 0 && !tr.getNamaProduk().equalsIgnoreCase("-- Pilih Produk --")) {
            return true;
        }
        return false;
    }
    
    public static boolean checkDataId(int id) {
        if (id > 0) {
            return true;
        }
        return false;
    }
    
    public static boolean checkStok(int stok, int stokTerjual) {
        if(stok > stokTerjual) {
            return true;
        } else {
            return false;
        }
    }
}
