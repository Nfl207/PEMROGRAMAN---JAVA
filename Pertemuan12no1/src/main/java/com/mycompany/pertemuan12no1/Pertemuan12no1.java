/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan12no1;

/**
 *
 * @author Hewlette Pakard
 */
public class Pertemuan12no1 extends karyawan{
    
    int bonus = 1000000;
    int gajiTotal = gaji + bonus + tunjanganMakan + transport;

    public static void main(String[] args) {
        Pertemuan12no1 sa = new Pertemuan12no1();
        System.out.println("Gaji SystemAnalyst : "+ sa.gaji);
        System.out.println("Bonus : " + sa.bonus);
        System.out.println("Tunjangan makan : " + sa.tunjanganMakan);
        System.out.println("Transport : " + sa.transport);
        System.out.println("Gaji Total : " + sa.gajiTotal);
    }
}
