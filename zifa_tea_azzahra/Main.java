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

public class Main {
    public static void main(String[] args) {
        // Membuat objek Elektronik
        Produk laptop = new Elektronik("Laptop", 15000000, 2);
        laptop.tampilkanInfo();

        System.out.println();

        // Membuat objek PegawaiTetap
        Pegawai Tea = new PegawaiTetap("Tea", 5000000, 1000000);
        Tea.tampilkanInfo();

        System.out.println();

        // Polimorfisme
        Produk snack = new Makanan("Snack", 15000, "2023-12-30");
        Pegawai Nathan = new PegawaiKontrak("Nathan", 3000000, 12);

        snack.tampilkanInfo();
        System.out.println();
        Nathan.tampilkanInfo();
    }
}
