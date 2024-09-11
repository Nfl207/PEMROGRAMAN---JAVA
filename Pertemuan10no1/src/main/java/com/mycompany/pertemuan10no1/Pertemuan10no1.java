/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan10no1;

/**
 *
 * @author Hewlette Pakard
 */
public class Pertemuan10no1 {

    public static void main(String[] args) {
        Aritmatika3 Aritmatikaku = new Aritmatika3();
        int a = 10, b = 20;

        Aritmatikaku.setTambah(a, b);
        System.out.println("Bilangan 1= " + a);
        System.out.println("Bilangan 2= " + b);
        System.out.println("Hasil Pertambahan " + Aritmatikaku.getAngka());

        Aritmatikaku.setPengurangan(a, b);
        System.out.println("Hasil Pengurangan " + Aritmatikaku.getAngka());

        Aritmatikaku.setPerkalian(a, b);
        System.out.println("Hasil Perkalian " + Aritmatikaku.getAngka());

        Aritmatikaku.setPembagian(a, b);
        System.out.println("Hasil Pembagian " + Aritmatikaku.getAngka());
        
        System.out.println("SEBUTKAN 5 NEGARA DI ASIA " + Aritmatikaku.getAngka());

        Aritmatikaku.setPangkat(a, b);
        System.out.println("Hasil Pangkat " + Aritmatikaku.getAngka());
    }
}
