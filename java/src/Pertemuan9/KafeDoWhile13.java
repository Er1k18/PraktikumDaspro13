// Percobaan 3 : Transaksi Kafe (DO-WHILE)
// • hargaKopi = 10000 + (13 mod 5) × 1000 → gantikan Rp12.000 pada soal = 13000
// • hargaTeh = 5000 + (13 mod 4) × 1000 → gantikan Rp7.000 pada soal = 6000
// • hargaRoti = 15000 + (13 mod 6) × 1000 → gantikan Rp20.000 pada soal = 16000
package Pertemuan9;
import java.util.Scanner;
public class KafeDoWhile13 {
    public static void main(String[] args) {
       Scanner Erik = new Scanner(System.in);
       int kopi, teh, roti, totalHarga;
       int hargaKopi = 13000, hargaTeh = 6000, hargaRoti = 16000;
       String namaPelanggan;

       do {
            System.out.print("Masukkan nama pelanggan (ketik batal untuk keluar): ");
            namaPelanggan = Erik.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan");
                break;
            }
            System.out.print("Jumlah kopi: ");
            kopi = Erik.nextInt();
            System.out.print("Jumlah teh: ");
            teh = Erik.nextInt();
            System.out.print("Jumlah roti: ");
            roti = Erik.nextInt();
            totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) +(roti * hargaRoti);
            System.out.println("Total yang harus dibayar : Rp " + totalHarga);
            Erik.nextLine();
       } while (true);
       
       System.out.println("Semua transaksi selesai.");
    }
    
}
