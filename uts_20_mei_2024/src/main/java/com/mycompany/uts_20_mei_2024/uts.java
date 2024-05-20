/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.uts_20_mei_2024;

import java.util.Scanner;

/**
 *
 * @author A-17
 */
public class uts {
    public static void main(String[] args) {
        // batas atas
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        
        System.out.println("UTS 20 Mei 2024 oleh:\n"
                + "Nama : Wahyu Agung Pramono Alfani\n"
                + "NIM : 23201075");
         // batas bawah
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        
        // inputan 
        Scanner scanner = new Scanner(System.in);
        
        String nama;
        
        System.out.println("Masukkan nama: ");
        nama = scanner.nextLine();
        
        System.out.println("Nama: " + nama);

        
        int jenis_kelamin = 0;
        while (jenis_kelamin !=1 && jenis_kelamin !=2) {
        // memilih jenis kelamin
            System.out.println("Pilih Jenis Kelamin Anda: ");
            System.out.println("1. Laki - laki");
            System.out.println("2. Perempuan");
            System.out.println("Masukkan pilihan anda (1 atau 2):");
            jenis_kelamin = scanner.nextInt();
            scanner.nextLine();
            
                if (jenis_kelamin != 1 && jenis_kelamin != 2) {
                    System.out.println("ERROR \nPastikan pilhan tepat");
                }
        }
        // var panggilan
        String panggilan = "";
        
        if (jenis_kelamin == 1)
        {
            panggilan = "Mas";
        }
        else if (jenis_kelamin == 2)
        {
            panggilan = "Mbak";
        }

        System.out.println("Selamat Datang:\n" + panggilan + " " + nama);
        
        // Kalkulator
        double angka1;
        double angka2;
        char operator;
        System.out.println("----------------------------------------------");
        System.out.println("Kalkulator");
        System.out.println("Masukkan angka pertama: ");
        angka1 = scanner.nextDouble();
        System.out.println("Masukkan operator (+, -, *, /): ");
        operator = scanner.next().charAt(0); // Mengambil karakter pertama dari string
        System.out.println("Masukkan angka kedua: ");
        angka2 = scanner.nextDouble();

        // Menghitung hasil
        double hasil = 0;
        switch (operator) {
            case '+':
                hasil = angka1 + angka2;
                break;
            case '-':
                hasil = angka1 - angka2;
                break;
            case '*':
                hasil = angka1 * angka2;
                break;
            case '/':
                if (angka2 == 0) {
                    System.out.println("Pembagian dengan 0 tidak diizinkan!");
                    return;
                }
                hasil = angka1 / angka2;
                break;
            default:
                System.out.println("Operator tidak valid!");
                return;
        }

        // Menampilkan hasil
        System.out.println("Hasil: " + hasil);
    }
}
