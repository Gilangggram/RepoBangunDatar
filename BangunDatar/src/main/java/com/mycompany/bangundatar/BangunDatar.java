/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bangundatar;

/**
 *
 * @author Gilang
 */
public abstract class BangunDatar {
    private String nama;
    private int jumlahSudut;

    public BangunDatar() {
    }

    public BangunDatar(String nama, int jumlahSudut) {
        this.nama = nama;
        this.jumlahSudut = jumlahSudut;
    }
    
    public abstract double hitungLuas();
    
    public abstract double hitungKeliling();
}
