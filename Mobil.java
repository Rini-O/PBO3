/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ketiga;

/**
 *
 * @author acer_user
 */
public class Mobil extends Kendaraan {
    
    @Override
    public void Transportasi() {
        System.out.println("Mobil termasuk transportasi darat");
    }
    
     @Override
    public void hitungKecepatan() {
        System.out.println("Setiap Mobil punya kecepatan");
    }
    

    //method overload
    public void jenisKendaraan(String jenis) {
        System.out.println("Ini adalah kendaraan" + jenis);
    }

    public String jenisKendaraan(int no_rangka) {
        return "Kendaraan memiliki nomor rangka " + no_rangka;
    }
    
    
    public void cekKendaraan(){
        this.hitungKecepatan();
        super.hitungKecepatan();
   }
    
    
}
