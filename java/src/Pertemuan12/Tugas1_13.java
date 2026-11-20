// Tugas 1 (uji wajib) 
// jumlah nilai mahasiswa 5 + (13 mod 11) = 7
// Tugas 1 (uji wajib) 
// salah satu nilai yang diinput 13 mod 100 = 13
package Pertemuan12;

import java.util.Scanner;

public class Tugas1_13 {
    public static void main(String[] args) {
        Scanner Erik = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMhs = Erik.nextInt();

        int[] nilaiMhs = new int[jumlahMhs];
        int total = 0;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs[i] = Erik.nextInt();
            total += nilaiMhs[i];
        }


        int tertinggi = nilaiMhs[0];
        int terendah = nilaiMhs[0];
        for (int i = 1; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > tertinggi) {
                tertinggi = nilaiMhs[i];
            }
            if (nilaiMhs[i] < terendah) {
                terendah = nilaiMhs[i];
            }
        }
        double rata2 = (double) total / nilaiMhs.length;

        System.out.println("--- Rekap Nilai Mahasiswa ---");
        System.out.println("Rata-rata nilai : " + rata2);
        System.out.println("Nilai tertinggi : " + tertinggi);
        System.out.println("Nilai terendah  : " + terendah);
        System.out.println("--- Daftar Nilai & Status Kelulusan ---");
        for (int i = 0; i < nilaiMhs.length; i++) {
            String status = (nilaiMhs[i] > 70) ? "LULUS" : "TIDAK LULUS";
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilaiMhs[i] + " (" + status + ")");
        }
    }
}