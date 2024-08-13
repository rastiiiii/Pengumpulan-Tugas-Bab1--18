/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab13soal2;

/**
 *
 * @author HP
 */

// Kelas Segitiga sebagai parent class
class Segitiga {
    protected double alas;
    protected double tinggi;

    // Constructor untuk inisialisasi alas dan tinggi
    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    // Method untuk menghitung luas
    public double hitungLuas() {
        return (alas * tinggi) / 2.0;
    }
}

// Kelas SegitigaLuas sebagai child class
class SegitigaLuas extends Segitiga {
    public SegitigaLuas(double alas, double tinggi) {
        super(alas, tinggi);
    }

    // Overriding method hitungLuas
    @Override
    public double hitungLuas() {
        return (alas * tinggi) / 2.0;
    }
}

// Main Class
public class Bab13soal2 {
    public static void main(String[] args) {
        // Membuat objek SegitigaLuas
        SegitigaLuas segitiga = new SegitigaLuas(10, 5);

        // Menghitung luas menggunakan method overriding
        double luas = segitiga.hitungLuas();

        // Menampilkan hasil
        System.out.println("Luas Segitiga: " + luas);
    }
}