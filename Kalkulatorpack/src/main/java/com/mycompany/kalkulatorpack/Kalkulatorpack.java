/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.kalkulatorpack;

/**
 *
 * @author HP
 */


public class Kalkulatorpack {

    // Method penjumlahan
    public int penjumlahan(int a, int b) {
        return a + b;
    }

    // Method pengurangan
    public int pengurangan(int a, int b) {
        return a - b;
    }

    // Method pembagian
    public float pembagian(float a, float b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error: Pembagian dengan nol tidak diperbolehkan.");
            return Float.NaN;
        }
    }

    // Method perkalian
    public float perkalian(float a, float b) {
        return a * b;
    }

    public static void main(String[] args) {
        // Create an instance of Kalkulatorpack
        Kalkulatorpack kalkulator = new Kalkulatorpack();

        // Example usage:
        int hasilPenjumlahan = kalkulator.penjumlahan(10, 30);
        System.out.println("Hasil Penjumlahan: " + hasilPenjumlahan);

        int hasilPengurangan = kalkulator.pengurangan(30, 10);
        System.out.println("Hasil Pengurangan: " + hasilPengurangan);

        float hasilPembagian = kalkulator.pembagian(30, 10);
        System.out.println("Hasil Pembagian: " + hasilPembagian);

        float hasilPerkalian = kalkulator.perkalian(30, 10);
        System.out.println("Hasil Perkalian: " + hasilPerkalian);
    }
}