/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.voidSpirit.productCycle.controller;

import com.voidSpirit.productCycle.model.data.TransaksiModel;
import com.voidSpirit.productCycle.model.pojo.Transaksi;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Zikri
 */
public class TransaksiController {
   
    public int tambahTransaksi(Transaksi transaksi) throws SQLException {
        TransaksiModel model = new TransaksiModel();
        return model.simpanTransaksi(transaksi);
    }
    
    
    public List<Transaksi> lihatTransaksi() throws SQLException{
        TransaksiModel model = new TransaksiModel();
        return model.lihatTransaksi();
    }
}
