/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3;

/**
 *
 * @author zifat
 */
public class Mobil {
   private String merk;
   private final String model;
   private final int tahun;
   private String warna;
   
    // Constructor
    public Mobil(String merk, String model, int tahun){
        this.merk = merk;
        this.model = model;
        this.tahun = tahun;
        this.warna = warna;
    }
    
  // Getter dan setter
    public String getMerk(){
        return merk;
    }
    public void setMerk(String merk){
        this.merk = merk;
    }
  // Setter dan getter untuk atribut lainnya
    public void startEngine(){
        System.out.println("Mesin mobil" + merk + "menyala");
    }
    public void displayInfo() {
        System.out.println("Merk: " + merk);
        System.out.println("Model: " + model);
        System.out.println("Tahun: " + tahun);
        System.out.println("Warna:" + warna);
    }
    public void setWarna(String warna){
        this.warna = warna;
    }
}

