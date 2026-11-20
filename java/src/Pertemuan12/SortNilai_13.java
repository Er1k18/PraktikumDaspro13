// Percobaan 4 Bagian B (uji wajib tambahan)
// elemen dasar array 
// (B) 20 + (13 mod 60) = 33
// {B, B+15, B−8, B+30, B−20, B+5}
// {33, 48, 25, 63, 13, 38}
package Pertemuan12;

import java.util.Arrays;

public class SortNilai_13 {
    public static void main(String[] args) {
        int[] nilai = {33, 48, 25, 63, 13, 38};

        for (int i = 0; i < nilai.length - 1; i++) {
            for (int j = 0; j < nilai.length - 1 - i; j++) {
                if (nilai[j] < nilai[j + 1]) {
                    int temp = nilai[j];
                    nilai[j] = nilai[j + 1];
                    nilai[j + 1] = temp;
                }
            }
        }
            System.out.println(Arrays.toString(nilai));

    }
}
