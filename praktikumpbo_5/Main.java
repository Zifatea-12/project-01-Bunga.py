/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikumpbo_5;

/**
 *
 * @author zifat
 */
public class Main {
        public static void main(String[] args) {
        kucing Kucing = new kucing();
        Kucing.nama        = "Kalashnikov";
        Kucing.jenis       = "Maine coon";
        Kucing.suarakucing = "Mawrr";
        Kucing.displayInfo();

        anjing Anjing = new anjing();
        Anjing.nama        = "Ruthenkov";
        Anjing.jenis       = "Malamut Alaska";
        Anjing.suaraanjing = "Woof";
        Anjing.displayInfo();
    }

}
