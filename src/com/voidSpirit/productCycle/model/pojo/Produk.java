/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.voidSpirit.productCycle.model.pojo;

/**
 *
 * @author Zikri
 */
public class Produk {

    private String namaProduk;
    private int idJenisProduk;
    private int hargaProduk;
    private int stokProduk;

    public Produk(String namaProduk, int idJenisProduk, int hargaProduk, int stokProduk) {
        this.namaProduk = namaProduk;
        this.idJenisProduk = idJenisProduk;
        this.hargaProduk = hargaProduk;
        this.stokProduk = stokProduk;
    }
    
    public Produk() {
        namaProduk = "";
        idJenisProduk = 0;
        hargaProduk = 0;
        stokProduk = 0;
    }

    public String getNamaProduk() {
        return namaProduk;
    }

    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }

    public int getIdJenisProduk() {
        return idJenisProduk;
    }

    public void setIdJenisProduk(int idJenisProduk) {
        this.idJenisProduk = idJenisProduk;
    }

    public int getHargaProduk() {
        return hargaProduk;
    }

    public void setHargaProduk(int hargaProduk) {
        this.hargaProduk = hargaProduk;
    }

    public int getStokProduk() {
        return stokProduk;
    }

    public void setStokProduk(int stokProduk) {
        this.stokProduk = stokProduk;
    }
}
