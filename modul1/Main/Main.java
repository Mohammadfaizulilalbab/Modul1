//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

// API & Library yang dibutuhkan pada program
package com.example;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;



public class Main {
        public static void main(String[] args) {


            // inisiasi variabel-variabel yang diperlukan pada program
            String nama, jenisKelamin, tglLahirStr;
            Scanner namaInput = new Scanner(System.in);


            System.out.println("-------Inputan user--------\n");
            // Meminta user untuk menginput nama
            System.out.print("Masukan nama Anda: ");
            nama = namaInput.nextLine();
            // Meminta user untuk menginput jenis kelamin
            System.out.print("Masukan jenis kelamin Anda (L/P): ");
            jenisKelamin = namaInput.nextLine();
            // Meminta user untuk memasukkan tanggal lahir
            System.out.print("Masukkan tanggal lahir Anda (YYYY-MM-DD): ");
            tglLahirStr = namaInput.nextLine();

            // Mengonversi string tanggal lahir menjadi objek LocalDate
            LocalDate tglLahir = LocalDate.parse(tglLahirStr);

            // Menghitung umur berdasarkan tanggal lahir
            Period usia = Period.between(tglLahir, LocalDate.now());


            // Mengubah input berupa karakter pada inputan jenis kelamin dari user menjadi variabel yang bernilai "Laki-laki" atau "Perempuan"
            switch (jenisKelamin) {
                case "L":
                case "l":
                    jenisKelamin = "Laki-laki";
                    break;
                case "P":
                case "p":
                    jenisKelamin = "Perempuan";
                    break;
                default:
                    jenisKelamin = "Jenis kelamin lu apa cuy";
            }

            // Menampilkan seluruh inputan user
            System.out.println("\n-------Ouput berdasarkan input user--------\n");
            // Menampilkan nama
            System.out.println("Nama anda :" + nama);
            // Menampilkan jenis kelamin
            System.out.println("Jenis kelamin anda :" + jenisKelamin);
            // Menampilkan umur
            System.out.println("Umur Anda adalah: " + usia.getYears() + " tahun, " +
                    usia.getMonths() + " bulan, dan " +
                    usia.getDays() + " hari.");


        }
}

