/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan6no1;
import java.util.Scanner;

/**
 *
 * @author Hewlette Pakard
 */
public class Pertemuan6no1 {

    public static void main(String[] args) {
          Scanner myInput = new Scanner(System.in);

        System.out.println("Masukan NIM:");
        String nim = myInput.nextLine();

        System.out.println("Masukan Nama:");
        String nama = myInput.nextLine();

        System.out.println("Masukan Nilai:");
        int nilai = myInput.nextInt();

        String grade;
        String keterangan;
        if (nilai < 50) {
            grade = "Tidak lulus";
            keterangan = "NT YA BANG";}
        else if (nilai >= 50 && nilai < 60) {
            grade = "D";
            keterangan = "Lulus";} 
        else if (nilai >= 60 && nilai < 70) {
            grade = "C";
            keterangan = "Lulus";}
        else if (nilai >= 70 && nilai < 80) {
            grade = "B";
            keterangan = "Lulus";}
        else if (nilai >= 80 && nilai < 90) {
            grade = "A";
            keterangan = "Lulus";}
        else if (nilai >= 90 && nilai < 100) {
            grade = "A+";
            keterangan = "Lulus";}
        else {
            grade = "Data nilai salah";
            keterangan = "KELAS BANH LULUS";
        }

        System.out.println("-----------------------");
        System.out.println("Grade: " + grade);
        System.out.println("Keterangan: " + keterangan);
    }
}
