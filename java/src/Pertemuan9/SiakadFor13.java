    // Percobaan 1 : Nilai SIAKAD (FOR)
// • Jumlah mahasiswa (batas perulangan FOR) = 8 + (13 mod 5) = 11 → gantikan angka 10 pada soal
// • Batas kelulusan pada Pertanyaan no. 4 (modifikasi kode) = 55 + (13 mod 11) = 57 → gantikan
// angka 60 pada soal
package Pertemuan9;
import java.util.Scanner;
public class SiakadFor13 {
    public static void main(String[] args) {
        Scanner Erik = new Scanner(System.in);
        double nilai, tertinggi = 0, terendah = 100;
        int jmlLulus = 0;
        int jmlTidakLulus = 0;

        for (int i = 1 ; i <= 11 ; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = Erik.nextDouble();
            if (nilai > tertinggi) {
            tertinggi = nilai;
            }
            if (nilai < terendah) {
            terendah = nilai;
            }
            if (nilai >= 57) {
                jmlLulus++;
            } else {
                jmlTidakLulus++;
            }
        }
        System.out.println("Nilai Tertinggi :" + tertinggi );
        System.out.println("Nilai Tertinggi :" + terendah );
        System.out.println("Jumlah mahasiswa lulus : " + jmlLulus);
        System.out.println("Jumlah mahasiswa tidak lulus : " + jmlTidakLulus);
    }
}
