package Pertemuan7;

import java.util.Scanner;
public class studiKasus1_13 {
    public static void main(String[] args) {
        Scanner Erik = new Scanner(System.in);
        int hargaPerCup= 18000;
        int jumlahCup, uangBayar;
        int totalHarga, diskon, totalBayar;
        int kembalian, kurang;

        System.out.print("Masukkan Jumlah Cup Anda :");
        jumlahCup = Erik.nextInt();
        System.out.print("Masukkan Jumlah Uang Bayar Anda :");
        uangBayar = Erik.nextInt();

        totalHarga = jumlahCup * hargaPerCup;

        if(totalHarga >= 100000) {
            diskon = totalHarga * 10/100;
        } else {
            diskon = 0;
        }
        totalBayar = totalHarga - diskon;

        System.out.println("Total Harga :" + totalHarga);
        System.out.println("Diskon yang Anda Dapatkan :" + diskon);
        System.out.println("Total Bayar Anda Adalah :" + totalBayar);

        if(uangBayar >= totalBayar){
            kembalian = uangBayar - totalBayar;
            System.out.print("Kembalian Anda :" + kembalian);
        } else {
            kurang = uangBayar - totalBayar;
            System.out.println("Uang tidak cukup, kurang Rp :" + kurang);
        }
    }
    
}
