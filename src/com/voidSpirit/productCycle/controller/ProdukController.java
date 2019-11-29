/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.voidSpirit.productCycle.controller;

import com.voidSpirit.productCycle.model.Produk;
import com.voidSpirit.productCycle.view.MainFrame;

/**
 *
 * @author Zikri
 */
public class ProdukController {
    
    MainFrame mainFrame;
    
    public ProdukController() {
        mainFrame = new MainFrame();
    }
    
    public void start() {
        mainFrame.setVisible(true);
    }
    
            
    public static Produk tambahProduk(String namaProduk, int idJenisProduk, int hargaProduk, int stokProduk) {
            
        return new Produk(namaProduk, idJenisProduk, hargaProduk, stokProduk);
            
    }
}
