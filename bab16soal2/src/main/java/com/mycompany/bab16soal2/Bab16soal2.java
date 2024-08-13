/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab16soal2;


/**
 *
 * @author hp
 */

// Abstract class untuk operasi aritmatika
abstract class Aritmatika {
    protected double a;
    protected double b;

    public Aritmatika(double a, double b) {
        this.a = a;
        this.b = b;
    }

    // Abstract method untuk penjumlahan
    protected abstract double penjumlahan();

    // Abstract method untuk pengurangan
    protected abstract double pengurangan();

    // Abstract method untuk perkalian
    protected abstract double perkalian();

    // Abstract method untuk pembagian
    protected abstract double pembagian();
}

// Kelas untuk penjumlahan
class Penjumlahan extends Aritmatika {
    public Penjumlahan(double a, double b) {
        super(a, b);
    }

    @Override
    protected double penjumlahan() {
        return a + b;
    }

    @Override
    protected double pengurangan() {
        throw new UnsupportedOperationException("Metode ini tidak tersedia.");
    }

    @Override
    protected double perkalian() {
        throw new UnsupportedOperationException("Metode ini tidak tersedia.");
    }

    @Override
    protected double pembagian() {
        throw new UnsupportedOperationException("Metode ini tidak tersedia.");
    }
}

// Kelas untuk pengurangan
class Pengurangan extends Aritmatika {
    public Pengurangan(double a, double b) {
        super(a, b);
    }

    @Override
    protected double penjumlahan() {
        throw new UnsupportedOperationException("Metode ini tidak tersedia.");
    }

    @Override
    protected double pengurangan() {
        return a - b;
    }

    @Override
    protected double perkalian() {
        throw new UnsupportedOperationException("Metode ini tidak tersedia.");
    }

    @Override
    protected double pembagian() {
        throw new UnsupportedOperationException("Metode ini tidak tersedia.");
    }
}

// Kelas untuk perkalian
class Perkalian extends Aritmatika {
    public Perkalian(double a, double b) {
        super(a, b);
    }

    @Override
    protected double penjumlahan() {
        throw new UnsupportedOperationException("Metode ini tidak tersedia.");
    }

    @Override
    protected double pengurangan() {
        throw new UnsupportedOperationException("Metode ini tidak tersedia.");
    }

    @Override
    protected double perkalian() {
        return a * b;
    }

    @Override
    protected double pembagian() {
        throw new UnsupportedOperationException("Metode ini tidak tersedia.");
    }
}

// Kelas untuk pembagian
class Pembagian extends Aritmatika {
    public Pembagian(double a, double b) {
        super(a, b);
    }

    @Override
    protected double penjumlahan() {
        throw new UnsupportedOperationException("Metode ini tidak tersedia.");
    }

    @Override
    protected double pengurangan() {
        throw new UnsupportedOperationException("Metode ini tidak tersedia.");
    }

    @Override
    protected double perkalian() {
        throw new UnsupportedOperationException("Metode ini tidak tersedia.");
    }

    @Override
    protected double pembagian() {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error: Pembagian dengan nol tidak diperbolehkan.");
            return Double.NaN;
        }
    }
}
public class Bab16soal2{
    public static void main(String[] args) {
        double A = 9.5;
        double B = 2.5;

        // Array untuk menyimpan objek-objek aritmatika
        Aritmatika[] operasi = {
            new Penjumlahan(A, B),
            new Pengurangan(A, B),
            new Perkalian(A, B),
            new Pembagian(A, B)
        };

        // Menampilkan hasil operasi
        for (Aritmatika aritmatika : operasi) {
            if (aritmatika instanceof Penjumlahan) {
                System.out.println("Penjumlahan: " + aritmatika.penjumlahan());
            } else if (aritmatika instanceof Pengurangan) {
                System.out.println("Pengurangan: " + aritmatika.pengurangan());
            } else if (aritmatika instanceof Perkalian) {
                System.out.println("Perkalian: " + aritmatika.perkalian());
            } else if (aritmatika instanceof Pembagian) {
                System.out.println("Pembagian: " + aritmatika.pembagian());
            }
        }
    }
}