/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan10no2;

/**
 *
 * @author Hewlette Pakard
 */
public class Pertemuan10no2 {

    public static void main(String[] args) {
        Aritmatika1 Aritmatikaku = new Aritmatika1();
        int bilangan1 = 10, bilangan2 = 5;
        
        System.out.println("Bilangan 1= " + bilangan1);
        System.out.println("Bilangan 2= " + bilangan2);

        Aritmatikaku.setPengurangan(bilangan1, bilangan2);
        System.out.println("Hasil Pengurangan " + Aritmatikaku.getAngka());

        Aritmatikaku.setPerkalian(bilangan1, bilangan2);
        System.out.println("Hasil Perkalian " + Aritmatikaku.getAngka());

        Aritmatikaku.setPembagian(bilangan1, bilangan2);
        System.out.println("Hasil Pembagian " + Aritmatikaku.getAngka());

        Aritmatikaku.setPangkat(bilangan1, bilangan2);
        System.out.println("Hasil Pangkat " + Aritmatikaku.getAngka());
    }
}
