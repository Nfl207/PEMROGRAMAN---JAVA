/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan7no2;
import java.util.Scanner;

/**
 *
 * @author Hewlette Pakard
 */
public class Pertemuan7no2 {

    public static void main(String[] args) {
       Scanner myInput = new Scanner(System.in);

        System.out.print("NIM: ");
        String nim = myInput.nextLine();

        System.out.print("NAMA : ");
        String nama = myInput.nextLine();

        System.out.print("TAHUN : ");
        int tahun = myInput.nextInt();

        System.out.print("PILIH PEMINATAN : ");
        char peminatan = myInput.next().charAt(0);

        switch (tahun) {
            case 1:
                System.out.println("Bahasa Inggris, Matematika, Sains");
                break;
            case 2:
                switch (peminatan) {
                    case 'C':
                        System.out.println("Sistem Operasi, Pemrograman Java, Struktur Data");
                        break;
                    case 'E':
                        System.out.println("Algoritma, Logika Informatika");
                        break;
                    case 'M':
                        System.out.println("DBMS, Manajemen Proyek");
                        break;
                    default:
                        System.out.println("Peminatan tidak valid");
                        break;
                }
                break;
            case 3:
                switch (peminatan) {
                    case 'C':
                        System.out.println("Organisasi Komputer, MultiMedia");
                        break;
                    case 'E':
                        System.out.println("Perancangan Sistem, Pemrograman WEB");
                        break;
                    case 'M':
                        System.out.println("Pemrograman Mobile, Pemrograman Java 2");
                        break;
                    default:
                        System.out.println("Peminatan tidak valid");
                        break;
                }
                break;
            case 4:
                switch (peminatan) {
                    case 'C':
                        System.out.println("Komunikasi Data, MultiMedia");
                        break;
                    case 'E':
                        System.out.println("Sistem Terdistribusi, Image Processing");
                        break;
                    case 'M':
                        System.out.println("SIM, Sistem Jaringan");
                        break;
                    default:
                        System.out.println("Peminatan tidak valid");
                        break;
                }
                break;
            default:
                System.out.println("Tahun tidak valid");
                break;
        }
    }
}
