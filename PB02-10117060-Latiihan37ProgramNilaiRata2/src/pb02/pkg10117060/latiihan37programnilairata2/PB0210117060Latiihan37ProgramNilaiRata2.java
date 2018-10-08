/*
 * NAMA       : IRFAN FAISAL HUTAMA TANJUNG
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117050
 * DESKRIPSI PROGRES : menghitung rata-rata nilai
 */
package pb02.pkg10117060.latiihan37programnilairata2;

import java.util.Scanner;

public class PB0210117060Latiihan37ProgramNilaiRata2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DataNilai inputdata = new DataNilai();
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Mahasiswa : ");
        inputdata.jumlah = input.nextInt();

        inputdata.inputNilaiMHS((int) inputdata.jumlah, inputdata.nilai, inputdata.jumlah, inputdata.rata);
    }
    
}
