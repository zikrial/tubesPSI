/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.voidSpirit.productCycle.controller;

import com.voidSpirit.productCycle.model.data.ProdukModel;
import com.voidSpirit.productCycle.model.pojo.JenisProduk;
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
       
    public int ubahProduk(Produk produk) throws SQLException {
        ProdukModel model = new ProdukModel();
        return model.gantiProduk(produk);
    }
    
    public int tambahProduk(Produk produk) throws SQLException {
        ProdukModel model = new ProdukModel();
        return model.simpanProduk(produk);
    }
    
     public int hapusProduk(Produk produk) throws SQLException {
        ProdukModel model = new ProdukModel();
        return model.buangProduk(produk);
    }
    
    public int tambahJenis(JenisProduk jenisProduk) throws SQLException {
        ProdukModel model = new ProdukModel();
        return model.simpanJenis(jenisProduk);
    }
    
    public List<Produk> lihatProduk() throws SQLException{
        ProdukModel model = new ProdukModel();
        return model.lihatProduk();
    }
    
    public List<Produk> lihatJenis() throws SQLException{
        ProdukModel model = new ProdukModel();
        return model.getJenis();
    }
    
    public List<Produk> lihatNama() throws SQLException{
        ProdukModel model = new ProdukModel();
        return model.getNama();
    }
    
    public int lihatHargaStok(Produk produk, int stok) throws SQLException{
        ProdukModel model = new ProdukModel();
        return model.getHargaStok(produk, stok);
    }
    
    public int cariId(Produk produk) throws SQLException {
        ProdukModel model = new ProdukModel();
        return model.getId(produk);
    }
}
