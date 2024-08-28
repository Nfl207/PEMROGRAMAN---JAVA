/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan5no2;
import java.util.Scanner;

/**
 *
 * @author Hewlette Pakard
 */
public class Pertemuan5no2 {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
       System.out.print("17");
       double alas = input.nextDouble();
       
       System.out.print("11");
       double tinggi = input.nextDouble();
       
       double luas = (alas*tinggi)/2;
       System.out.println("Luas Segitiga: " + luas);
       
       input.close();
       
       
    }
}
