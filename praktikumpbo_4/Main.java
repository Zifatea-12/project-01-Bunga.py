/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikumpbo_4;

/**
 *
 * @author zifat
 */
public class Main {
    public static void main(String[] args){
        //Mmebuat Objek bekerja dan menginisalisasi dengan nama, usia, pekerjaan, dan gaji
        Pekerja pekerja = new Pekerja("Mahendra", 28, "Dosen Kalkulus", 5500000);
        
        //Menampilkan informasi pekerja dengan menggunakan metode toString()
        System.out.println(pekerja.toString());
    }
}
