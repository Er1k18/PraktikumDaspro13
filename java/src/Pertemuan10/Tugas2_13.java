// Tugas 2 (uji wajib) 
// n = 5 + (13 mod 4) = 6
package Pertemuan10;
import java.util.Scanner;
public class Tugas2_13 {
    public static void main(String[] args) {
        Scanner Erik = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = Erik.nextInt();
        int total = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int hasil = i * j;
                System.out.printf("%4d",hasil);
                total += hasil;
                
            }
            System.out.println();
        }
        System.out.println("Jumlah seluruh angka: " + total);
        Erik.close();
    }
    
}
