package Pertemuan13;

import java.util.Scanner;

public class BioskopWithScanner_13 {
    public static void main(String[] args) {
        Scanner Erik = new Scanner(System.in);
        int baris, kolom, menu;
        String nama, pilihan;
        String[][] penonton = new String[4][2];
        while (true) {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            menu = Erik.nextInt();
            Erik.nextLine();

            if (menu == 1) {
                while (true) {
                    System.out.print("Masukkan nama: ");
                    nama = Erik.nextLine();

                    while (true) {
                        System.out.print("Masukkan baris: ");
                        baris = Erik.nextInt();
                        System.out.print("Masukkan kolom: ");
                        kolom = Erik.nextInt();
                        Erik.nextLine();

                        if (baris < 1 || baris > penonton.length || kolom < 1 || kolom > penonton[0].length) {
                            System.out.println("Nomor baris atau kolom tidak tersedia! Silakan masukkan lagi.");
                        } 
                        else if (penonton[baris - 1][kolom - 1] != null) {
                            System.out.println("Kursi sudah terisi oleh " + penonton[baris - 1][kolom - 1] + "! Silakan pilih kursi lain.");
                        } 
                        else {
                            break;
                        }
                    }

                    penonton[baris - 1][kolom - 1] = nama;

                    System.out.print("Input penonton lainnya? (y/n): ");
                    pilihan = Erik.nextLine();
                    if (pilihan.equalsIgnoreCase("n")) {
                        break;
                    }
                }
                
            } else if (menu == 2) {
                System.out.println("\n--- Daftar Penonton ---");
                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[i].length; j++) {
                        String tampilan = (penonton[i][j] == null) ? "***" : penonton[i][j];
                        System.out.print(tampilan + "\t");
                    }
                    System.out.println();
                }

            } else if (menu == 3) {
                break;
            } else {
                System.out.println("Menu tidak valid!");
            }

        } 
    }
}