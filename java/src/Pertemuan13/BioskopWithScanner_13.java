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
                    System.out.print("Masukkan baris: ");
                    baris = Erik.nextInt();
                    System.out.print("Masukkan kolom: ");
                    kolom = Erik.nextInt();
                    Erik.nextLine();
                    
                
                    penonton[baris - 1][kolom - 1] = nama;
                    
                    System.out.print("Input penonton lainnya? (y/n): ");
                    pilihan = Erik.nextLine();
                    
                    if (pilihan.equalsIgnoreCase("n")) {
                    break;
                    }
                }
            } else if (menu == 2) {
                System.out.println("\nDaftar Penonton:");
                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[i].length; j++) {
                        System.out.print(penonton[i][j] + "\t");
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
