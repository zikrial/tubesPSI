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
    
    public Produk(String namaProduk, int idJenisProduk, int hargaProduk, int stokProduk) {
        this.namaProduk = namaProduk;
        this.idJenisProduk = idJenisProduk;
        this.hargaProduk = hargaProduk;
        this.stokProduk = stokProduk;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pengelola_produk", "root", "");
            
            System.out.println("Berhasil");
            Statement statement =  con.createStatement();
            statement.executeUpdate("INSERT INTO pengelola_produk.produk (nama_produk, id_jenis_produk, harga_produk, stok_produk) VALUES ('" + namaProduk + "', " + idJenisProduk + ", " + hargaProduk + ", " + stokProduk + ")");
            
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver tidak ketemu");
            Logger.getLogger(Produk.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Produk.class.getName()).log(Level.SEVERE, null, ex);
        }
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
