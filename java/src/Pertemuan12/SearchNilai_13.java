// Percobaan 4 Bagian A (uji wajib tambahan)
// key 50 + (13 mod 50) = 63
package Pertemuan12;

import java.util.Scanner;

public class SearchNilai_13 {
    public static void main(String[] args) {
        Scanner Erik = new Scanner(System.in);
        int[] nilai = {78, 65, 90, 55, 88, 72};
        int key = 90;
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