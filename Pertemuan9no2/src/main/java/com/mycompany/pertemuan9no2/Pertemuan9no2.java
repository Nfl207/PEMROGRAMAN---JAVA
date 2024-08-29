/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan9no2;
import java.util.Scanner;

/**
 *
 * @author Hewlette Pakard
 */
public class Pertemuan9no2 {

    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);
        
        System.out.print("Masukkan bilangan awal : ");
        int nilaiAwal = myInput.nextInt();

        System.out.print("Masukkan bilangan akir : ");
        int nilaiAkhir = myInput.nextInt();
        
        System.out.print("Hasil deret bilangan : ");

        for (int i = nilaiAwal; i <= nilaiAkhir; i += 5) {
            System.out.print(i);
            if (i + 5 <= nilaiAkhir) {
                System.out.print(", ");
            }
        }
    }
}
