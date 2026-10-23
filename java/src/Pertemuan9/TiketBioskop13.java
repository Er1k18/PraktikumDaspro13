// Tugas 1 : Penjualan Tiket Bioskop
// • Harga tiket = 40000 + (13 mod 6) × 2000 = 42000 → gantikan Rp50.000 pada soal
// • Syarat diskon pertama = lebih dari (3 + (13 mod 3))= 4 tiket, dengan diskon (8 + (13 mod 5))=11% →
// gantikan "lebih dari 4 tiket, diskon 10%"
// • Syarat diskon kedua = lebih dari (8 + (13 mod 4))= 9 tiket, dengan diskon (15 + (13 mod 4))=16% →
// gantikan "lebih dari 10 tiket, diskon 15%"
package Pertemuan9;
import java.util.Scanner;
public class TiketBioskop13 {
    public static void main(String[] args) {
        Scanner Erik = new Scanner(System.in);
        int jmlTiket, totalTiket = 0, i = 0;
        double hargaTiket = 42000, diskon = 0;
        double totalHarga, totalPenjualan = 0;
        
        while (true) {
            System.out.print("Masukkan jumlah tiket pelanggan ke-" + (i + 1) + " : ");
            jmlTiket = Erik.nextInt();

            if (jmlTiket == 0) {
                break;  
            }
            
            if (jmlTiket < 0) {
                System.out.println("Jumlah tiket tidak valid. Masukkan jumlah yang benar!");
                continue;
            }
            if (jmlTiket > 9) {
                diskon = 0.16;
            } else if (jmlTiket > 4) {
                diskon = 0.11;
            } else {
                diskon = 0;
            }
            diskon = (hargaTiket * jmlTiket) * diskon;
            totalHarga = hargaTiket * jmlTiket - diskon;
            totalPenjualan += totalHarga;
            totalTiket += jmlTiket;
            System.out.println("Diskon yang anda dapatkan       : " + diskon);
            System.out.println("Total harga yang harus dibayar  : Rp " + totalHarga);
            i++;
        }  
        System.out.println("Jumlah tiket terjual hari ini adalah  : " + totalTiket); 
        System.out.println("Total Penjualan Hari ini adalah       : " + totalPenjualan); 
    
    }      
} 
    

