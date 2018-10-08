/*
 * NAMA       : IRFAN FAISAL HUTAMA TANJUNG
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117060
 * DESKRIPSI PROGRES : menghitung lingkaran
 */
package pbo2.pkg10117060.latihan38.objectorientedperhitunganlingkaran;

import java.util.Scanner;

public class PBO210117060LATIHAN38ObjectOrientedPerhitunganLingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);    
        HitungLingkaran Lingkaran = new HitungLingkaran();
        Lingkaran.Hitung(Lingkaran.nDiameter,Lingkaran.nKeliling,Lingkaran.nJarijari,Lingkaran.nLuas);
    }
    
}
