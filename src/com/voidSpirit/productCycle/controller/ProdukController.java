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
}
