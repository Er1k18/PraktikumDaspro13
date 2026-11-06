// Percobaan 3 (uji awal,langkah 3)
// n = 2 + (13 mod 3) = 3
package Pertemuan10;
import java.util.Scanner;
public class Triangle13 {
    public static void main(String[] args) {
        Scanner Erik = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = Erik.nextInt();

        int i = n;
        while (i >= 1) {
            int j = 1;
            while (j <= i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i--;
        }
        Erik.close();
    }   
}
