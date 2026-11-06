// Tugas 3 (uji wajib) 
// jumlahToko = 2 + (13 mod 3) = 3
package Pertemuan10;
import java.util.Scanner;
public class Tugas3_13 {
    public static void main(String[] args) {
        Scanner Erik = new Scanner(System.in);

        System.out.print("Masukkan jumlah toko: ");
        int toko = Erik.nextInt();

        while (toko < 1) {
            System.out.print("Jumlah toko minimal 1, masukkan kembali: ");
            toko = Erik.nextInt();
        }
        int totalSeluruh = 0;
        int barangTerbanyak = -1;
        int tokoTerbanyak = 0;

        for (int i = 1; i <= toko; i++) {
            System.out.print("Jumlah pelanggan toko " + i + ": ");
            int pelanggan = Erik.nextInt();

            while (pelanggan < 0) {
                System.out.print("Jumlah pelanggan tidak boleh negatif: ");
                pelanggan = Erik.nextInt();
            }
            int totalToko = 0;

            for (int j = 1; j <= pelanggan; j++) {
                System.out.print("Jumlah barang pelanggan " + j + ": ");
                int barang = Erik.nextInt();

                while (barang < 0) {
                    System.out.print("Jumlah barang tidak boleh negatif: ");
                    barang = Erik.nextInt();
                }
                totalToko += barang;
            }
            System.out.println("Toko " + i +
                " - pelanggan: " + pelanggan +
                ", total barang: " + totalToko);

            totalSeluruh += totalToko;

            if (totalToko > barangTerbanyak) {
                barangTerbanyak = totalToko;
                tokoTerbanyak = i;
            }
        }
        System.out.println("Total barang seluruh toko: " + totalSeluruh);
        System.out.println("Toko dengan barang terbanyak: " + tokoTerbanyak);

        Erik.close();
    }
}
