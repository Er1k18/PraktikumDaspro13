// Percobaan 2 (uji tambahan,langkah 9)(baris, kolom) uji ke-1 
// (2 + (13 mod 3)  baris = 3, 4 + (13 mod 3) kolom = 5)
// Percobaan 2 (uji tambahan,langkah 9)(baris, kolom) uji ke-2 
// (5 + (13 mod 3) baris =6, 2 + (13 mod 3) kolom =3)
// Percobaan 2 (Pertanyaan 2) )baris, kolom) 
// (4 + (13 mod 4)  baris = 5, 6 + (13 mod 4) kolom =7
package Pertemuan10;
import java.util.Scanner;
public class Rectang13 {
    public static void main(String[] args) {
        Scanner Erik = new Scanner(System.in);
        System.out.print("Masukkan jumlah baris: ");
        int baris =Erik.nextInt();
        System.out.print("Masukkan jumlah kolom: ");
        int kolom =Erik.nextInt();

        for (int i = 1; i <= baris; i++) {       //outer loop: baris   
            for (int j = 1; j <= kolom; j++) {   //inner loop: kolom
                System.out.print("#");
                
            }
            System.out.println();               //pindah baris
        }
        Erik.close();
    }
}
