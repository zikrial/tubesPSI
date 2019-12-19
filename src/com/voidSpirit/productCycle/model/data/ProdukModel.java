/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.voidSpirit.productCycle.model.data;

import com.voidSpirit.productCycle.model.pojo.Produk;
import com.voidSpirit.productCycle.utilites.DatabaseUtilities;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Zikri
 */
public class ProdukModel {

    public int simpanProduk(Produk produk) throws SQLException {
        Connection con = DatabaseUtilities.getConnection();
        try {
                PreparedStatement stat = con.prepareStatement("INSERT INTO pengelola_produk.produk (nama_produk, id_jenis_produk, harga_produk, stok_produk) VALUES ('" + produk.getNamaProduk() + "', " + setIdJenisProduk(produk.getNamaJenis()) + ", " + produk.getHargaProduk() + ", " + produk.getStokProduk() + ")");
                return stat.executeUpdate();
        } finally {
            if (con != null) {
                con.close();
            }
        }
    }
    
    public int setIdJenisProduk(String namaJenis) throws SQLException {
        Connection con = DatabaseUtilities.getConnection();
        int jenis;
        try {
            Statement state = con.createStatement();
            ResultSet rs = state.executeQuery("SELECT id_jenis_produk FROM produk NATURAL JOIN jenis_produk WHERE nama_jenis = " + namaJenis);
            jenis = rs.getInt("id_jenis_produk");
        } finally {
            if (con != null) {
                con.close();
            }
        }
        return jenis;
    }
    
     public List<Produk> tampilJenis() throws SQLException {
        List<Produk> listProduk;
        Connection con = DatabaseUtilities.getConnection();
        try {
            Statement state = con.createStatement();
            ResultSet rs = state.executeQuery("SELECT nama_jenis FROM jenis_produk");
            listProduk = new ArrayList<>();
            while(rs.next())
            {
                Produk prd = new Produk();
                prd.setNamaJenis(rs.getString("nama_jenis"));
                
                listProduk.add(prd);
            }
        } finally {
            if (con != null) {
                con.close();
            }
        }
        return listProduk;
    }
    
    public List<Produk> lihatProduk() throws SQLException {
        List<Produk> listProduk;
        Connection con = DatabaseUtilities.getConnection();

        try {
            Statement state = con.createStatement();
            ResultSet rs = state.executeQuery("SELECT nama_produk, nama_jenis, harga_produk, stok_produk FROM produk NATURAL JOIN jenis_produk");
            listProduk = new ArrayList<>();
            while (rs.next()) {
                Produk prd = new Produk();
                prd.setNamaProduk(rs.getString("nama_produk"));
                prd.setNamaJenis(rs.getString("nama_jenis"));
                prd.setHargaProduk(rs.getInt("harga_produk"));
                prd.setStokProduk(rs.getInt("stok_produk"));
                
                listProduk.add(prd);
            }
        } finally {
            if (con != null) {
                con.close();
            }
        }
        return listProduk;
    }
}
