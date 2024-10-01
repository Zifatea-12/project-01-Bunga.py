/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikumpbo_5;

/**
 *
 * @author zifat
 */

// Kelas Induk Hewan
public class Hewan {
    String nama;
    String jenis;
    
    public void displayInfo() {
        System.out.println("Nama  : " + nama);
        System.out.println("Jenis : " + jenis);
    }
    
 // Kelas turunan Kucing
class Kucing extends Hewan {
    String suarakucing;
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Suara Kucing: " + suarakucing);
    }
}

// Kelas turunan Anjing
class Anjing extends Hewan {
    String suaraanjing;
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Suara Anjing: " + suaraanjing);
    }
}
  
}
