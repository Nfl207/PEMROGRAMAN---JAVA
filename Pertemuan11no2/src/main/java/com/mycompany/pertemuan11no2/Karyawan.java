/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pertemuan11no2;

/**
 *
 * @author Hewlette Pakard
 */
public class Karyawan {
   int Id, GajiPokok, Gol;
    String Nama, Jabatan;
    
    void setKaryawan(int Id, String Nama, int Gol, String Jabatan, int GajiPokok) {
        this.Id = Id;
        this.Nama = Nama;
        this.Gol = Gol;
        this.Jabatan = Jabatan;
        this.GajiPokok = GajiPokok;
    } 
    
    void getKaryawan() {
        System.out.println("Id Karyawan : " + Id);
        System.out.println("Nama Karyawan : " + Nama);
        System.out.println("Gol : " + Gol);
        System.out.println("Jabatan : " + Jabatan);
        System.out.println("Gaji Pokok : " + GajiPokok);
    }
}
