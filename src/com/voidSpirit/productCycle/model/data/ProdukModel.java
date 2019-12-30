/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.voidSpirit.productCycle.model.data;

import com.voidSpirit.productCycle.model.pojo.JenisProduk;
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
            PreparedStatement stat = con.prepareStatement("INSERT INTO pengelola_produk.produk (nama_produk, id_jenis_produk, harga_produk, stok_produk) VALUES (?,?,?,?)");
            stat.setString(1, produk.getNamaProduk());
            stat.setInt(2, getIdJenisProduk(produk.getNamaJenis()));
            stat.setInt(3, produk.getHargaProduk());
            stat.setInt(4, produk.getStokProduk());
            return stat.executeUpdate();
        } finally {
            if (con != null) {
                con.close();
            }
        }
    }

    public int gantiProduk(Produk produk) throws SQLException {
        Connection con = DatabaseUtilities.getConnection();
        try {
            PreparedStatement stat = con.prepareStatement("UPDATE pengelola_produk.produk SET nama_produk=?, id_jenis_produk=?, harga_produk=?, stok_produk=? WHERE id=?");
            stat.setString(1, produk.getNamaProduk());
            stat.setInt(2, getIdJenisProduk(produk.getNamaJenis()));
            stat.setInt(3, produk.getHargaProduk());
            stat.setInt(4, produk.getStokProduk());
            stat.setInt(5, produk.getId());
            return stat.executeUpdate();
        } finally {
            if (con != null) {
                con.close();
            }
        }
    }

    public int buangProduk(Produk produk) throws SQLException {
        Connection con = DatabaseUtilities.getConnection();
        try {
            PreparedStatement stat = con.prepareStatement("DELETE FROM pengelola_produk.produk WHERE id=?");
            stat.setInt(1, getId(produk));
            return stat.executeUpdate();
        } finally {
            if (con != null) {
                con.close();
            }
        }
    }

    public int simpanJenis(JenisProduk jenisProduk) throws SQLException {
        Connection con = DatabaseUtilities.getConnection();
        try {
            PreparedStatement stat = con.prepareStatement("INSERT INTO pengelola_produk.jenis_produk (nama_jenis) VALUES (?)");
            stat.setString(1, jenisProduk.getNamaJenis());
            return stat.executeUpdate();
        } finally {
            if (con != null) {
                con.close();
            }
        }
    }

    public int getIdJenisProduk(String namaJenis) throws SQLException {
        Connection con = DatabaseUtilities.getConnection();
        int jenis = 0;
        try {
            Statement state = con.createStatement();
            ResultSet rs = state.executeQuery("SELECT produk.id_jenis_produk FROM produk, jenis_produk WHERE nama_jenis = '" + namaJenis + "' AND produk.id_jenis_produk = jenis_produk.id_jenis_produk");
            while (rs.next()) {
                jenis = rs.getInt("id_jenis_produk");
            }
        } finally {
            if (con != null) {
                con.close();
            }
        }
        return jenis;
    }

    public int getId(Produk produk) throws SQLException {
        Connection con = DatabaseUtilities.getConnection();
        int id = 0;
        try {
            Statement state = con.createStatement();
            ResultSet rs = state.executeQuery("SELECT id FROM produk NATURAL JOIN jenis_produk WHERE nama_jenis = '" + produk.getNamaJenis() + "' AND harga_produk = " + produk.getHargaProduk() + " AND stok_produk = " + produk.getStokProduk());
            while (rs.next()) {
                id = rs.getInt("id");
            }
        } finally {
            if (con != null) {
                con.close();
            }
        }
        return id;
    }

    public List<Produk> getJenis() throws SQLException {
        List<Produk> listProduk;
        Connection con = DatabaseUtilities.getConnection();
        try {
            Statement state = con.createStatement();
            ResultSet rs = state.executeQuery("SELECT nama_jenis FROM jenis_produk");
            listProduk = new ArrayList<>();
            while (rs.next()) {
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

    public List<Produk> getNama() throws SQLException {
        List<Produk> listProduk;
        Connection con = DatabaseUtilities.getConnection();
        try {
            Statement state = con.createStatement();
            ResultSet rs = state.executeQuery("SELECT nama_produk FROM produk");
            listProduk = new ArrayList<>();
            while (rs.next()) {
                Produk prd = new Produk();
                prd.setNamaProduk(rs.getString("nama_produk"));

                listProduk.add(prd);
            }
        } finally {
            if (con != null) {
                con.close();
            }
        }
        return listProduk;
    }

    public int getHargaStok(Produk produk, int stok) throws SQLException {
        Connection con = DatabaseUtilities.getConnection();
        int harga = 0;
        int hargaTotal = 0;
        try {
            Statement state = con.createStatement();
            ResultSet rs = state.executeQuery("SELECT harga_produk, stok_produk FROM produk WHERE nama_produk = '" + produk.getNamaProduk() + "'");
            while (rs.next()) {
                harga = rs.getInt("harga_produk");
                
                hargaTotal = harga * stok;
            }
        } finally {
            if (con != null) {
                con.close();
            }
        }
        return hargaTotal;
    }

    public List<Produk> lihatProduk() throws SQLException {
        List<Produk> listProduk;
        Connection con = DatabaseUtilities.getConnection();

        try {
            Statement state = con.createStatement();
            ResultSet rs = state.executeQuery("SELECT id,nama_produk, nama_jenis, harga_produk, stok_produk FROM produk NATURAL JOIN jenis_produk");
            listProduk = new ArrayList<>();
            while (rs.next()) {
                Produk prd = new Produk();
                prd.setNamaProduk(rs.getString("id"));
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
    
    public int updateStok(int stok, int stokTerjual) throws SQLException {
        List<Produk> listProduk;
        Connection con = DatabaseUtilities.getConnection();
        try {
            Statement state = con.createStatement();
            ResultSet rs = state.executeQuery("UPDATE produk SET stok_produk = " + stok + "WHERE id=?");
            listProduk = new ArrayList<>();
            while (rs.next()) {
                Produk prd = new Produk();
                prd.setStokProduk(rs.getInt("stok_produk") - stokTerjual);

                listProduk.add(prd);
            }
        } finally {
            if (con != null) {
                con.close();
            }
        }
        return stok;
    }
}
