/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan11no2;
import java.util.Scanner;

/**
 *
 * @author Hewlette Pakard
 */
public class Pertemuan11no2 {

    public static void main(String[] args) {
         Scanner myInput = new Scanner(System.in);
        
        System.out.print("ID Karyawan : ");
        int IdKaryawan = myInput.nextInt();
        myInput.nextLine();

        System.out.print("Nama Karyawan : ");
        String NamaKaryawan = myInput.nextLine();
        
        System.out.print("Gol : ");
        int Gol = myInput.nextInt();

        String Jabatan = "";
        int GajiPokok = 0;
        System.out.println("-----------------------------");
        switch (Gol) {
            case 1:
                Jabatan = "Asisten Staff";
                GajiPokok = 3000000;
                break;
            case 2:
                Jabatan = "Staff";
                GajiPokok = 3500000;
                break;
            case 3:
                Jabatan = "Supervisor";
                GajiPokok = 4000000;
                break;
            case 4:
                Jabatan = "Asisten Manager";
                GajiPokok = 5000000;
                break;
            case 5:
                Jabatan = "Manager";
                GajiPokok = 6000000;
                break;
            default:
                System.out.println("GOLONGAN YANG DIMASUKAN SALAH!!!");
                return;
        }
            Karyawan karyawan1 = new Karyawan();
        karyawan1.setKaryawan(IdKaryawan, NamaKaryawan, Gol, Jabatan, GajiPokok);
        karyawan1.getKaryawan();
    }
}
