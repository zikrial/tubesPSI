/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.voidSpirit.productCycle.utilites;

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
}
