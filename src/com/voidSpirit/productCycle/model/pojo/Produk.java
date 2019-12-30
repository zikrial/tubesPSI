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

    private int id;
    private String namaProduk;
    private String namaJenis;
    private int hargaProduk;
    private int stokProduk;
    
    private String menu;
    
    public Produk(String namaProduk, String namaJenis, int hargaProduk, int stokProduk) {
        this.namaProduk = namaProduk;
        this.namaJenis = namaJenis;
        this.hargaProduk = hargaProduk;
        this.stokProduk = stokProduk;
    }
        
    public Produk(int id, String namaProduk, String namaJenis, int hargaProduk, int stokProduk) {
        this.id = id;
        this.namaProduk = namaProduk;
        this.namaJenis = namaJenis;
        this.hargaProduk = hargaProduk;
        this.stokProduk = stokProduk;
    }
    
    public Produk(String namaProduk) {
        this.namaProduk = namaProduk;
    }
    
    public Produk(int id) {
        this.id = id;
    }
    
    public Produk() {
        namaProduk = "";
        namaJenis = "";
        menu = "";
        hargaProduk = 0;
        stokProduk = 0;
    }

    public String getNamaProduk() {
        return namaProduk;
    }

    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }

    public String getNamaJenis() {
        return namaJenis;
    }

    public void setNamaJenis(String namaJenis) {
        this.namaJenis = namaJenis;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
