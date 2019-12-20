/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.voidSpirit.productCycle.model.data;

import com.voidSpirit.productCycle.model.pojo.Transaksi;
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
public class TransaksiModel {
    
    public int simpanTransaksi(Transaksi transaksi) throws SQLException {
        Connection con = DatabaseUtilities.getConnection();
        try {
            PreparedStatement stat = con.prepareStatement("INSERT INTO pengelola_produk.transaksi (nama_produk, stok_terjual, total_pendapatan) VALUES (?,?,?)");
            stat.setString(1, transaksi.getNamaProduk());
            stat.setInt(2, transaksi.getStokTerjual());
            stat.setInt(3, transaksi.getTotalPendapatan());
            return stat.executeUpdate();
        } finally {
            if (con != null) {
                con.close();
            }
        }
    }
    
        public List<Transaksi> lihatTransaksi() throws SQLException {
        List<Transaksi> listTransaksi;
        Connection con = DatabaseUtilities.getConnection();

        try {
            Statement state = con.createStatement();
            ResultSet rs = state.executeQuery("SELECT nama_produk, stok_terjual, total_pendapatan FROM transaksi");
            listTransaksi = new ArrayList<>();
            while (rs.next()) {
                Transaksi tr = new Transaksi();
                tr.setNamaProduk(rs.getString("nama_produk"));
                tr.setStokTerjual(rs.getInt("stok_terjual"));
                tr.setTotalPendapatan(rs.getInt("total_pendapatan"));

                listTransaksi.add(tr);
            }
        } finally {
            if (con != null) {
                con.close();
            }
        }
        return listTransaksi;
    }
}
