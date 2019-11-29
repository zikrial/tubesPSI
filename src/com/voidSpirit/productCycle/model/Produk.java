/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.voidSpirit.productCycle.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Zikri
 */
public class Produk {
    
    private String namaProduk;
    private int idJenisProduk;
    private int hargaProduk;
    private int stokProduk;
    
    private Connection con;
    
    public Produk(String namaProduk, int idJenisProduk, int hargaProduk, int stokProduk) {
        this.namaProduk = namaProduk;
        this.idJenisProduk = idJenisProduk;
        this.hargaProduk = hargaProduk;
        this.stokProduk = stokProduk;
        

        connectDB();
        insertData();
    } 
    
    private Statement insertData() {
        Statement statement = null;
        try {
            statement = con.createStatement();
            statement.executeUpdate("INSERT INTO pengelola_produk.produk (nama_produk, id_jenis_produk, harga_produk, stok_produk) VALUES ('" + namaProduk + "', " + idJenisProduk + ", " + hargaProduk + ", " + stokProduk + ")");
        } catch (SQLException ex) {
            System.out.println("Data gagal ditambahkan");
            Logger.getLogger(Produk.class.getName()).log(Level.SEVERE, null, ex);
        }
        return statement;
    }
    
    private void connectDB() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pengelola_produk", "root", "");
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver tidak ketemu");
            Logger.getLogger(Produk.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Produk.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Produk[] loadProduk() {
        Produk[] pr = new Produk[3];
        pr[0] = new Produk(namaProduk, idJenisProduk, hargaProduk, stokProduk);
        pr[1] = new Produk(namaProduk, idJenisProduk, hargaProduk, stokProduk);
        pr[2] = new Produk(namaProduk, idJenisProduk, hargaProduk, stokProduk);
        
        return pr;
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
