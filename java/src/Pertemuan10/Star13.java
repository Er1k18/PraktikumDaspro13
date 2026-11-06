// Percobaan 1 (uji tambahan,langkah 10) n (uji ke-1) 3 + (13 mod 5) =6
// Percobaan 1 (uji tambahan,langkah 10) n (uji ke-2) 9 + (13 mod 5) =12
// Percobaan 1 (Pertanyaan 1 & 2) n 4 + (13 mod 4) =5
// Percobaan 1 (Pertanyaan 3) n 10 + (13 mod 6) =11
package Pertemuan10;
import java.util.Scanner;
public class Star13 {
    public static void main(String[] args) {
        Scanner Erik = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = Erik.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }
        System.out.println();
        Erik.close();
        
    }
}
