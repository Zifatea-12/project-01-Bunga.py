/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3;

/**
 *
 * @author zifat
 */
public class Main {
    public static void main(String[] args) {
        // Membuat objek mobil pertama
        Mobil mobil1 = new Mobil("Toyota", "Innova", 2020);

        // Membuat objek mobil kedua
        Mobil mobil2 = new Mobil("Honda", "Civic", 2023);

        // Menampilkan informasi mobil
        mobil1.displayInfo();
        System.out.println();
        mobil2.displayInfo();
    }
}
