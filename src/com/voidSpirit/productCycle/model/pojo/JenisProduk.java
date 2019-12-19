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
public class JenisProduk {

    private int idJenisProduk;
    private String namaJenis;
    
    public JenisProduk() {
        idJenisProduk = 0;
        namaJenis = ""; 
    }
    
    public JenisProduk(String namaJenis) {
        this.namaJenis = namaJenis;
    }

    public int getIdJenisProduk() {
        return idJenisProduk;
    }

    public void setIdJenisProduk(int idJenisProduk) {
        this.idJenisProduk = idJenisProduk;
    }

    public String getNamaJenis() {
        return namaJenis;
    }

    public void setNamaJenis(String namaJenis) {
        this.namaJenis = namaJenis;
    }
}
