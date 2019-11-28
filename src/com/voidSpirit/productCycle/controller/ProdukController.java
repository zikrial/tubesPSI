/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.voidSpirit.productCycle.controller;

import com.voidSpirit.productCycle.view.TambahProdukFrame;
import com.voidSpirit.productCycle.model.Produk;

/**
 *
 * @author Zikri
 */
public class ProdukController {
    
    TambahProdukFrame tambahFrame;
    
    public ProdukController() {
        tambahFrame = new TambahProdukFrame();
    }
    
    public void start() {
        tambahFrame.setVisible(true);
    }
    
            
    public static Produk tambahProduk(String namaProduk, int idJenisProduk, int hargaProduk, int stokProduk) {
            
        return new Produk(namaProduk, idJenisProduk, hargaProduk, stokProduk);
            
    }   
    
}
