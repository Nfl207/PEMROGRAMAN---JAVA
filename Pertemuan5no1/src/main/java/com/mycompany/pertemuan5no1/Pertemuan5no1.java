/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan5no1;
import java.util.Scanner;
/**
 *
 * @author Hewlette Pakard
 */
public class Pertemuan5no1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("## Pendataan Karyawan PT.kuda terbang ##");
        
        System.out.print("Nama karyawan: ");
        String Nama = input.nextLine();

        System.out.print("Alamat: ");
        String Alamat = input.nextLine();

        System.out.print("Usia: ");
        int Usia = input.nextInt();

        System.out.print("Gaji: Rp ");
        long Gaji = input.nextLong();

        System.out.println("-----------------------------------");
        System.out.println("Nama Karyawan: " + Nama);
        System.out.println("Alamat: " + Alamat);
        System.out.println("Usia: " + Usia + " tahun");
        System.out.println("Gaji:" + Gaji);
        System.out.println("-----------------------");
    
    }
}
