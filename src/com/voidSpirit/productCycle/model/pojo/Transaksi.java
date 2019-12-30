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
public class Transaksi {
    private int id;
    private String namaProduk;
    private int stokTerjual;
    private int totalPendapatan;
    
    public Transaksi() {
        id = 0;
        namaProduk = "";
        stokTerjual = 0;
        totalPendapatan = 0;
    }
    
    public Transaksi(String namaProduk, int stokTerjual, int totalPendapatan) {
        this.namaProduk = namaProduk;
        this.stokTerjual = stokTerjual;
        this.totalPendapatan = totalPendapatan;
    }
    
    public Transaksi(int id, String namaProduk, int stokTerjual) {
        this.id = id;
        this.namaProduk = namaProduk;
        this.stokTerjual = stokTerjual;
    }
    
    public Transaksi(String namaProduk, int stokTerjual) {
        this.namaProduk = namaProduk;
        this.stokTerjual = stokTerjual;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNamaProduk() {
        return namaProduk;
    }

    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }

    public int getStokTerjual() {
        return stokTerjual;
    }

    public void setStokTerjual(int stokTerjual) {
        this.stokTerjual = stokTerjual;
    }

    public int getTotalPendapatan() {
        return totalPendapatan;
    }

    public void setTotalPendapatan(int totalPendapatan) {
        this.totalPendapatan = totalPendapatan;
    }
    
}
