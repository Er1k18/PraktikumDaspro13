package Pertemuan13;

import java.util.Scanner;

public class BioskopWithScanner_13 {
    public static void main(String[] args) {
        Scanner Erik = new Scanner(System.in);
        int baris, kolom;
        String nama, pilihan;
        String[][] penonton = new String[4][2];

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
    }
}
