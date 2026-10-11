package Pertemuan7;
import java.util.Scanner;

public class studiKasus2_13 {
    public static void main(String[] args) {
        Scanner Erik = new Scanner(System.in);
        int jumlahDokumen;
        int peringkatJuara;

        System.out.print("Nama Mahasiswa : ");
        String namaMahasiswa = Erik.nextLine();
        System.out.print("Jenis Kegiatan (BELMAWA, BAKORMA, Mandiri, PKM, atau Lainnya) : ");
        String jenisKegiatan = Erik.nextLine();

        if (jenisKegiatan.equalsIgnoreCase("BELMAWA") ||
            jenisKegiatan.equalsIgnoreCase("BAKORMA") ||
            jenisKegiatan.equalsIgnoreCase("MANDIRI")) {
            System.out.print("Jumlah dokumen : ");
            jumlahDokumen = Erik.nextInt();
            System.out.print("Peringkat juara : ");
            peringkatJuara = Erik.nextInt();
            if (jumlahDokumen == 4){
                if (peringkatJuara >= 1 && peringkatJuara <= 3){
                    System.out.println("Status: Dana penghargaan diberikan.");
                } else {
                    System.out.println("Status: Dana penghargaan tidak diberikan (Hanya untuk Juara 1/2/3).");
                }
            } else {
                int kurang = 4 - jumlahDokumen;
                System.out.println("Status: Dokumen tidak lengkap ( Kurang "+ kurang +" Dokumen). Dana penghargaan tidak diberikan.");
            }
        }else if (jenisKegiatan.equalsIgnoreCase("PKM")) {
            System.out.print("Status pendanaan PKM (1 = Lolos , 0 = Tidak Lolos) : ");
            int statusPendanaan = Erik.nextInt();
            System.out.print("Jumlah dokumen yang diupload (0-4) : ");
            jumlahDokumen = Erik.nextInt();
            if (statusPendanaan == 1) {
                if (jumlahDokumen == 4) {
                    System.out.println("Status: Berhak memperoleh dana penghargaan (PKM lolos pendanaan).");
                } else {
                    int kurang = 4 - jumlahDokumen;
                    System.out.println("Status: Dokumen tidak lengkap (kurang " + kurang + " dokumen). Dana penghargaan tidak diberikan.");
                }
            } else {
                System.out.println("Status: Tidak memperoleh dana penghargaan (PKM tidak lolos pendanaan).");
            }
        } else {
            System.out.println("Status: Tidak memperoleh dana penghargaan (jenis kegiatan tidak termasuk ketentuan).");
        }  

    }
    
}
