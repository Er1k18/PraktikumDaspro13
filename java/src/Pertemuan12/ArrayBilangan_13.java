//Percobaan 1 (uji wajib tambahan)
// bil[0], bil[1], bil[2], bil[3] 
// P ; P+8 ; −(1+(P mod 7)) ; 20+(P mod 15)
//                  = 13;
// 13 ; 13+8        = 21;
// −(1+(13 mod 7))  = -7 ;
// 20+(13 mod 15)   = 33;

package Pertemuan12;

import java.util.Arrays;

public class ArrayBilangan_13 {
    public static void main(String[] args) {
        int[] bil = new int[4];
        bil[0] = 13;
        bil[1] = 21;
        bil[2] = -7;
        bil[3] = 33;

        for (int i = 0; i < bil.length; i++) {
            System.out.println("bil[" + i + "] = " + bil[i]);
        }

        for (int nilai : bil) {
            System.out.println(nilai);
        }

        System.out.println(Arrays.toString(bil));

    }
}