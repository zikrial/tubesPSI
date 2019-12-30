/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.voidSpirit.productCycle.controller;

import com.voidSpirit.productCycle.model.data.LaporanModel;
import com.voidSpirit.productCycle.model.pojo.Laporan;
import java.sql.SQLException;

/**
 *
 * @author Didi-PC
 */
public class LaporanController {

    public int tambahProduk(Laporan laporan) throws SQLException {
        LaporanModel model = new LaporanModel();
        return model.simpanPenjualan(laporan);
    }
}
