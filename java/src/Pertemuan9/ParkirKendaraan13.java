// Tugas 2: Parkir Kendaraan
// • Tarif parkir mobil = 2500 + (13 mod 6) × 250 per jam = 2750 → gantikan Rp3.000 pada soal
// • Tarif parkir motor = 1500 + (113 mod 6) × 250 per jam = 1750 (gunakan nilai (P mod 6) yang SAMA
// dengan tarif mobil) → gantikan Rp2.000 pada soal
package Pertemuan9;
import java.util.Scanner;
public class ParkirKendaraan13 {
    public static void main(String[] args) {
        Scanner Erik = new Scanner(System.in);
        int jenis, durasi, total = 0;
        
        do {
            System.out.print("Masukkan jenis kendaraan(1). mobil, (2). motor, (0). Keluar : ");
            jenis = Erik.nextInt();
            if (jenis == 1 || jenis == 2) {
                System.out.print("Masukkan durasi parkir (jam) : ");
                durasi = Erik.nextInt();        
             
                if (jenis == 1) {
                    total += durasi * 2750;
                } else {
                    total += durasi * 1750; 
                }
                
            }
        
        } while (jenis !=0);

        System.out.println("Total biaya parkir adalah : " + total);
    }
    
}
