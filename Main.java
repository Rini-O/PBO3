/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ketiga;

/**
 *
 * @author acer_user
 */
public class Main {
     public static void main(String[] args) {
        Mobil ertiga = new Mobil();
     
        // Panggil metode abstrak
       ertiga.Transportasi();

        // Panggil metode yang di-override
        ertiga.cekKendaraan();

        // Panggil metode yang di-overload
        ertiga.jenisKendaraan(" Suzuki");
        System.out.println(ertiga.jenisKendaraan(123));
        
        
    }
     
}
