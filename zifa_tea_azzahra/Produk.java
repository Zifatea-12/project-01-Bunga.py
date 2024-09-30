/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.responsiuts.zifa_tea_azzahra;

/**
 *
 * @author zifat
 */
public class Produk {
    private String namaProduk;
    private double harga;
    
    public Produk(String namaProduk, double harga){
        this.namaProduk = namaProduk;
        this.harga      = harga;
    }
 
//Getter dan Setter
    public String getNamaProduk(){
        return namaProduk;
    }
    
    public void setNamaProduk(String namaProduk){
        this.namaProduk = namaProduk;
    }
    
    public double getHarga(){
        return harga;
    }
    
    public void setHarga(double harga){
        this.harga = harga;
    }
    
// Metode tampilkanInfo()
    public void tampilkanInfo(){
        System.out.println("Nama Produk: " + namaProduk);
        System.out.println("Harga: " + harga);
    }
 
// Kelas Elektronik (Turunan dari Produk)
class Elektronik extends Produk {
    private int garansi;
    
    public Elektronik(String namaProduk, double harga, int garansi){
        super(namaProduk, harga);
        this.garansi = garansi;
    }

// Getter dan Setter
    public int getGaransi(){
        return garansi;
    }
    
    public void setgaransi(int garansi){
        this.garansi = garansi;
    }

// Override metode tampilkanInfo()
@Override
public void tampilkanInfo(){
    super.tampilkanInfo();
        System.out.println("Garansi: " + garansi + " tahun");
}
}

// Kelas Makanan (Turunan dari produk)
class Makanan extends Produk {
    private final String tanggalKadaluarsa;
    
    public Makanan(String namaProduk, double harga, String tanggalKadaluarsa){
        super(namaProduk, harga);
        this.tanggalKadaluarsa = tanggalKadaluarsa;
    }
    
// Getter dan Setter
    public String getTanggalKadaluarsa(){
        return tanggalKadaluarsa;
    }
    
// Override metode tampilkanInfo()
@Override
public void tampilkanInfo(){
    super.tampilkanInfo();
        System.out.println("Tanggal Kadaluarsa: " + tanggalKadaluarsa);
}
}
}
