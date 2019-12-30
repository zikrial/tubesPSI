/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.voidSpirit.productCycle.model.pojo;

/**
 *
 * @author Didi-PC
 */
public class Laporan {

    private int id;
    private int hasilPenjualan;

    public Laporan() {
        this.id = 0;
        this.hasilPenjualan = 0;
    }

    public Laporan(int id, int hasilPenjualan) {
        this.id = id;
        this.hasilPenjualan = hasilPenjualan;
    }

    public Laporan(int hasilPenjualan) {
        this.hasilPenjualan = hasilPenjualan;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHasilPenjualan() {
        return hasilPenjualan;
    }

    public void setHasilPenjualan(int hasilPenjualan) {
        this.hasilPenjualan = hasilPenjualan;
    }
}
