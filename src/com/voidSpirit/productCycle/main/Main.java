/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.voidSpirit.productCycle.main;

import com.voidSpirit.productCycle.controller.ProdukController;

/**
 *
 * @author Zikri
 */
public class Main {
    public static void main(String[] args) {
        ProdukController prd = new ProdukController();
        prd.start();
    }
}

