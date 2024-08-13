/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab4soal2;

/**
 *
 * @author HP
 */
public class Bab4soal2 {

    public static void main(String[] args) {
        int w, x, y, z;
        x = 6;
        w = 5;

        y = 8 - x++; // Menggunakan x (6) lalu increment
        z = 8 - ++w; // Increment w (5 menjadi 6) lalu menggunakan w

        // Menampilkan hasil
        System.out.println("Nilai x = " + x); // x = 7 setelah post-increment
        System.out.println("Nilai w = " + w); // w = 6 setelah pre-increment
        System.out.println("Nilai y = " + y); // y = 2 karena 8 - 6
        System.out.println("Nilai z = " + z); // z = 2 karena 8 - 6
    }
}