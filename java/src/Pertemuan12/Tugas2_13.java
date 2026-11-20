// Tugas 2 (uji wajib) 
// jumlah item dipesan 2 + (13 mod 4) = 3
// Tugas 2 (uji wajib) 
// indeks menu yang wajib dipesan 13 mod 7 = 6
package Pertemuan12;

import java.util.Scanner;

public class Tugas2_13 {
    public static void main(String[] args) {
        Scanner Erik = new Scanner(System.in);

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        int[] harga = {15000, 13000, 10000, 12000, 8000, 18000, 20000};

        System.out.println("=== Daftar Menu Kafe Kampus ===");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i] + " - Rp " + harga[i]);
        }

        System.out.print("Masukkan jumlah item yang ingin dipesan: ");
        int jumlahPesanan = Erik.nextInt();
        Erik.nextLine();

        String[] pesanan = new String[jumlahPesanan];
        int[] hargaPesanan = new int[jumlahPesanan];
        int totalBiaya = 0;

        for (int i = 0; i < jumlahPesanan; i++) {
            while (true) {
                System.out.print("Masukkan nama menu pesanan ke-" + (i + 1) + ": ");
                String cariMenu = Erik.nextLine();

                int indeksDitemukan = -1;
                for (int j = 0; j < menu.length; j++) {
                    if (menu[j].equalsIgnoreCase(cariMenu)) {
                        indeksDitemukan = j;
                        break;
                    }
                }

                if (indeksDitemukan != -1) {
                    System.out.println("-> Menu tersedia! Harga: Rp " + harga[indeksDitemukan]);
                    pesanan[i] = menu[indeksDitemukan];
                    hargaPesanan[i] = harga[indeksDitemukan];
                    totalBiaya += harga[indeksDitemukan];
                    break;
                } else {
                    System.out.println("-> Maaf, menu '" + cariMenu + "' tidak tersedia. Silakan pilih lagi.");
                }
            }
        }

        System.out.println("=== Rincian Pesanan Anda ===");
        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.println((i + 1) + ". " + pesanan[i] + " (Rp " + hargaPesanan[i] + ")");
        }
        System.out.println("-----------------------------");
        System.out.println("Total Biaya: Rp " + totalBiaya);
    }
}
