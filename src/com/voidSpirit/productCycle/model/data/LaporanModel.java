/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.voidSpirit.productCycle.model.data;

import com.voidSpirit.productCycle.model.pojo.Laporan;
import com.voidSpirit.productCycle.utilites.DatabaseUtilities;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Didi-PC
 */
public class LaporanModel {

    public int simpanPenjualan(Laporan laporan) throws SQLException {
        Connection con = DatabaseUtilities.getConnection();
        try {
            PreparedStatement stat = con.prepareStatement("INSERT INTO pengelola_produk.laporan (hasil_penjualan) VALUES (?)");
            stat.setInt(1, laporan.getHasilPenjualan());
            return stat.executeUpdate();
        } finally {
            if (con != null) {
                con.close();
            }
        }
    }
}
