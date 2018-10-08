/*
 * NAMA       : IRFAN FAISAL HUTAMA TANJUNG
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117050
 * DESKRIPSI PROGRES : menghitung rata-rata nilai
 */
package pb02.pkg10117060.latiihan37programnilairata2;

import java.util.Scanner;

public class DataNilai {
    int nBanyak, jml, nilai[];
    float rata, jumlah = 0;

    public void inputNilaiMHS(int parBanyak, int parNilai[], float parJumlah, float parRata) {
        Scanner scanner = new Scanner(System.in);

        parNilai = new int[parBanyak];

        for (int i = 0; i <= parBanyak - 1; i++) {
            System.out.print("Nilai Mahasiswa Ke-" + (i + 1) + " : ");
            parNilai[i] = scanner.nextInt();
        }

        for (int j = 0; j <= parBanyak - 1; j++) {
            parJumlah = parJumlah + parNilai[j];
        }

        parRata = parJumlah / parBanyak - 1;
        System.out.println();
        System.out.println("Maka, Rata-rata Nilainya adalah " + parRata);
        System.out.println("Developed by : Irfan Faisal Hutama Tanjung");
    }
    
}
