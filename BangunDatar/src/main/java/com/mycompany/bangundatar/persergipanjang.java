/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bangundatar;

/**
 *
 * @author Paiss
 */
public class persergipanjang extends BangunDatar {

    private double panjang;
    private double lebar;

    public persergipanjang() {
    }

    public persergipanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public persergipanjang(double panjang, double lebar, String nama, int jumlahSudut) {
        super(nama, jumlahSudut);
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    @Override
    public double hitungLuas() {
        return panjang * lebar;
    }

    @Override
    public double hitungKeliling() {
        return panjang + lebar;
    }    
}