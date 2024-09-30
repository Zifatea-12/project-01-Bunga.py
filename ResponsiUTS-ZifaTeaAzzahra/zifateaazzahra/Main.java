/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.responsiuts.zifateaazzahra;

import com.mycompany.responsiuts.zifateaazzahra.Produk.Elektronik;
import com.mycompany.responsiuts.zifateaazzahra.Produk.Makanan;

/**
 *
 * @author zifat
 */
public class Main {
    public static void main(String[] args){
        // Membuat Objek Elektronik
        Produk.Elektronik laptop = new Elektronik("Laptop", 15000000, 2);
        laptop.tampilkanInfo();
        
        System.out.println();
        
        // Membuat Objek Pegawaitetap
        Pegawai Albert = new PegawaiTetap("Albert", 5000000, 1000000);
        Albert.tampilkanInfo();
        
        System.out.println();
        
        // Polimorfisme dengan produk makanan
        Produk.Makanan snack = new Makanan("Snack", 15000, "2023-12-30");
        snack.tampilkanInfo();
        
        System.out.println();
        
        // Polimorfisme dengan pegawai kontrak
        Pegawai nathan = new PegawaiKontrak("Nathan", 3000000, 12);
        nathan.tampilkanInfo();
    }
}
