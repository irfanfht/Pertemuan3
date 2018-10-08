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

public class Nilai {
    int i, nBanyak, nilai[];
    float rata = 0;
    String Nama;
    
    public void NilaiBesarKecil(int i, int parBanyak, int parNilai[]) {
        Scanner input = new Scanner(System.in);

        parNilai = new int[20];

        for (i = 1; i <= parBanyak; i++) {
            System.out.print("Masukan Nilai Mahasiswa Ke-" + i + " : ");
            parNilai[i] = input.nextInt();
        }

        System.out.println("");
        System.out.println("===Hasil Nilai Mahasiswa===");
        for (i = 1; i <= parBanyak; i++) {
            System.out.println("Nilai Mahasiswa ke-" + i + " = " + parNilai[i]);
        }

        System.out.println("");
        int max = parNilai[1];
        int min = parNilai[1];
        for (i = 1; i <= parBanyak; i++) {
            if (parNilai[i] > max) {
                max = parNilai[i];
                System.out.println("Nilai terbesar adalah " + max);
            } else if (parNilai[i] < min) {
                min = parNilai[i];
                System.out.println("Nilai terkecil adalah " + min);
            }
        }

    }
}
