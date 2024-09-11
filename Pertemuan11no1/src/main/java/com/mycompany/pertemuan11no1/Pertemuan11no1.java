/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan11no1;

/**
 *
 * @author Hewlette Pakard
 */
public class Pertemuan11no1 {

    public static void main(String[] args) {
        Karyawan karyawan1 = new Karyawan();
        karyawan1.setKaryawan(0001, "Jeki", "A", "Manager", 4000000);
        karyawan1.getKaryawan();
        
        Karyawan karyawan2 = new Karyawan();
        karyawan2.setKaryawan(0002, "doni", "B", "Supervisor", 7000000);
        karyawan2.getKaryawan();
    }
}
