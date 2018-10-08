/*
 * NAMA       : IRFAN FAISAL HUTAMA TANJUNG
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117060
 * DESKRIPSI PROGRES : menampilkan bilangan terkecil dan terbesar
 * clas Nilai.java ini nanti di panggil di clas utama
 */
package pbo2.pkg10117060.latihan39.objectorientednilaiterbesardanterkecil;

import java.util.Scanner;

public class NilaiTerbesarTerkecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        Nilai nNilai = new Nilai();
        System.out.println("=====Program Nilai Terbesar dan Terkecil Nilai Mahasiswa=====");
        System.out.print("Masukkan Nama Petugas : ");
        nNilai.Nama = input.nextLine();
        
        System.out.print("Masukkan Banyak Mahasiswa : ");
        nNilai.nBanyak = input.nextInt();
        nNilai.NilaiBesarKecil(nNilai.i, nNilai.nBanyak, nNilai.nilai);
        System.out.println("");
        System.out.println("Petugas : " + nNilai.Nama);
    }
    
}
