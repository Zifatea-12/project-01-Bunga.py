/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.responsiuts.zifa_tea_azzahra;

/**
 *
 * @author zifat
 */
public class Pegawai {
    private String namaPegawai;
    private double gaji;
    
    public Pegawai(String namaPegawai, double gaji){
        this.namaPegawai = namaPegawai;
        this.gaji = gaji;
    }
    
// Getter dan Setter
    public String getNamaPegawai(){
        return namaPegawai;
    }
    
    public void setNamaPegawai(String namaPegawai){
        this.namaPegawai = namaPegawai;
    }
    
    public double getGaji(){
        return gaji;
    }
    
    public void setgaji(double gaji){
        this.gaji = gaji;
    }
   
// Metode tampilkanInfo()
    public void tampilkanInfo(){
        System.out.println("Nama Pegawai: " + namaPegawai);
        System.out.println("Gaji: " + gaji);
    }
}

// Kelas PegawaiTetap (turunan dari Pegawai)
class PegawaiTetap extends Pegawai {
    private double tunjangan;
    
    public PegawaiTetap(String namaPegawai, double gaji, double tunjangan){
        super(namaPegawai, gaji);
        this.tunjangan = tunjangan;
    }
    
// Getter dan Setter
    public double getTunjangan(){
       return tunjangan;
    }
    
    public void setTunjangan(double tunjangan){
        this.tunjangan = tunjangan;
    }
    
// Override metode tampilkanInfo()
@Override
public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Tunjangan: " + tunjangan);
}   
}

// Kelas PegawaiKontrak (turunan dari Pegawai)
class PegawaiKontrak extends Pegawai {
    private int lamaKontrak; //dalam bulan
    
    public PegawaiKontrak(String namaPegawai, double gaji, int lamaKontrak) {
        super(namaPegawai, gaji);
        this.lamaKontrak = lamaKontrak;
    }
    
// Getter dan setter
    public int getLamaKontrak(){
        return lamaKontrak;
    }
    
    public void setLamaKontrak(int lamaKontrak){
        this.lamaKontrak = lamaKontrak;
    }
    
// Override metode tampilkanInfo()
@Override
public void tampilkanInfo(){
    super.tampilkanInfo();
    System.out.println("Lama Kontrak: " + lamaKontrak + "bulan");
}
}
