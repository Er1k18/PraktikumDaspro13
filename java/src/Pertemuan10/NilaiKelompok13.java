// Percobaan 4 (uji wajib,langkah 10)
// jumlahKelompok = 2 + (13 mod 3) = 3
// jumlahPenilai = 3 + (13 mod 2) = 4
package Pertemuan10;
import java.util.Scanner;
public class NilaiKelompok13 {
    public static void main(String[] args) {
        Scanner Erik = new Scanner(System.in);
        System.out.print("Masukkan jumlah kelompok : ");
        int jumlahKelompok = Erik.nextInt();
        System.out.print("Masukkan jumlah penilai  : ");
        int jumlahPenilai = Erik.nextInt();

        if (jumlahKelompok <= 0 || jumlahPenilai <= 0) {
            System.out.println("Jumlah kelompok dan penilai harus > 0.");
        } else {
            int nomorKelompok = 1;
            double rataTertinggi = -1;
            int kelompokTerbaik = 0;

        while (nomorKelompok <= jumlahKelompok) {
            System.out.println("Kelompok" + nomorKelompok);
            double totalNilai = 0;
          
        for (int j = 1; j <= jumlahPenilai; j++) {
            int nilai;
            do {
                System.out.print("Nilai dari penilai " + j + " : ");
                nilai = Erik.nextInt();
                if (nilai < 0 || nilai > 100) {
                    System.out.println("Nillai harus 0-100. Ulangi input!");
                }
            } while (nilai < 0 || nilai > 100);
            totalNilai += nilai;
        }
        double rataNilai = totalNilai / jumlahPenilai;
        System.out.println("kelompok " + nomorKelompok + ": nilai rata rata = " +rataNilai);
        if (rataNilai > rataTertinggi) {
            rataTertinggi = rataNilai;
            kelompokTerbaik = nomorKelompok;
        } 
        nomorKelompok++;       
        }
        System.out.println("===============================");
        System.out.println("Kelompok terbaik    :" + kelompokTerbaik);
        System.out.println("Rata rata tertinggi :" + rataTertinggi);

        }
        Erik.close(); 
    }
}