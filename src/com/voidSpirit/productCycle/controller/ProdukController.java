/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.voidSpirit.productCycle.controller;

import com.voidSpirit.productCycle.model.data.ProdukModel;
import com.voidSpirit.productCycle.model.pojo.Produk;
import com.voidSpirit.productCycle.view.MainFrame;
import java.sql.SQLException;
import java.util.List;

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

    public int tambahProduk(Produk produk) throws SQLException {
        ProdukModel model = new ProdukModel();
        return model.simpanProduk(produk);
    }
    
    public List<Produk> lihatProduk() throws SQLException{
        ProdukModel model = new ProdukModel();
        return model.lihatProduk();
    }
    
    public List<Produk> lihatJenis() throws SQLException{
        ProdukModel model = new ProdukModel();
        return model.tampilJenis();
    }
}
