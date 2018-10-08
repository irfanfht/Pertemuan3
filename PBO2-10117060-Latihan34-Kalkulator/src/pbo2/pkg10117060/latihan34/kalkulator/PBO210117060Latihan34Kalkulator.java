/*
 * NAMA       : IRFAN FAISAL HUTAMA TANJUNG
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117050
 * DESKRIPSI PROGRES : Program ini berisi program Kalkulator
 */
package pbo2.pkg10117060.latihan34.kalkulator;

import java.util.Scanner;


public class PBO210117060Latihan34Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("====Aplikasu Kalkulator Bilangan====");
        Kalkulator nKalkulator = new Kalkulator();
        System.out.print("Masukan Angka ke-1 : ");
        nKalkulator.value1 = scanner.nextDouble();

        System.out.print("Masukan Angka ke-2 : ");
        nKalkulator.value2 = scanner.nextDouble();
        System.out.println("");
        System.out.println("Hasil Pertambahan : " + nKalkulator.tambahBilangan());
        System.out.println("Hasil Pengurangan : " + nKalkulator.kurangBilangan());
        System.out.println("Hasil Perkalian : " + nKalkulator.kaliBilangan());
        System.out.println("Hasil Pembagian : " + nKalkulator.bagiBilangan());
        System.out.println("Hasil Sisa : " + nKalkulator.sisaBilangan());
    }
    
}
