/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikumpbo_4;

/**
 *
 * @author zifat
 */
public class Manusia {
    private String nama;
    protected int usia;
    public String pekerjaan;
    
    public Manusia(String nama, int usia, String pekerjaan){
        this.nama = nama;
        this.usia = usia;
        this.pekerjaan = pekerjaan;
    }
    
    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama =nama;
    }
    
    public void tampilkanInfo(){
        System.out.println("Nama      : " + nama);
        System.out.println("Usia      : " + usia);
        System.out.println("Pekerjaan : " + pekerjaan);
    }
}
