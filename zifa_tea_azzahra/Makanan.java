/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.responsiuts.zifa_tea_azzahra;

/**
 *
 * @author zifat
 */
import java.time.LocalDate;

public class Makanan extends Produk {
    private LocalDate tanggalKadaluarsa;
    public Makanan(String namaProduk, double harga, LocalDate tanggalKadaluarsa) {
        super(namaProduk, harga);
        this.tanggalKadaluarsa = tanggalKadaluarsa;
    }
        public LocalDate getTanggalKadaluarsa() {
        return tanggalKadaluarsa;
    }
    public void setTanggalKadaluarsa(LocalDate tanggalKadaluarsa) {
        this.tanggalKadaluarsa = tanggalKadaluarsa;
    }
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Tanggal Kadaluarsa: " + tanggalKadaluarsa);
    }
}
