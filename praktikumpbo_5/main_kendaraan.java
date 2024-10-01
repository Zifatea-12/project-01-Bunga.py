/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikumpbo_5;

/**
 *
 * @author zifat
 */

public class main_kendaraan {
    public static void main(String[] args){
        mobil Mobil = new mobil();
        Mobil.nama = "McLarren P1";
        Mobil.kecepatan = 350;
        Mobil.jenis = "mobil";
        Mobil.warnamobil = "Amethyst Black";
        Mobil.displayinfo();
        
        motor Motor= new motor();
        Motor.nama = "BMW S1000RR";
        Motor.kecepatan = 200;
        Motor.jenis = "motor";
        Motor.warnamotor = "Light White Uni";
        Motor.displayinfo();
    }
}
