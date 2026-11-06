// Tugas 1 (uji wajib) 
// n = 6 + (13 mod 5) = 9
package Pertemuan10;
import java.util.Scanner;
public class Tugas1_13 {
    public static void main(String[] args) {
    Scanner Erik = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = Erik.nextInt();
        
        int i = 1;
        int total = 0;

        while (i <= n) {
            int j = 1;

                while (j <= i) {
                    System.out.print(j + " ");
                    total ++;
                    j++;
                }
            System.out.println();
            i++;
        }
        System.out.println("total angka tercetak: "+ total);
        Erik.close();

    }
}
