// Percobaan 4 Bagian A (uji wajib tambahan)
// key 50 + (13 mod 50) = 63
package Pertemuan12;

import java.util.Scanner;

public class SearchNilai_13 {
    public static void main(String[] args) {
        Scanner Erik = new Scanner(System.in);

        System.out.print("Masukkan banyaknya nilai yang akan diinput: ");
        int jml = Erik.nextInt();
        int[] nilai = new int[jml];

        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = Erik.nextInt();
        }

        System.out.print("Masukkan nilai (key) yang ingin dicari: ");
        int key = Erik.nextInt();

        boolean ditemukan = false;

        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] == key) {
                System.out.println("Nilai " + key + " ditemukan pada indeks ke-" + i);
                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Nilai " + key + " tidak ditemukan.");
        }
    }
}