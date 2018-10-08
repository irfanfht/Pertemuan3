/*
 * NAMA       : IRFAN FAISAL HUTAMA TNAJUNG
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117050
 * DESKRIPSI PROGRES : menampilkan Warna kepribadian
 */
package pbo2.pkg10117060.latihan40.warna.kepribadian;

import java.util.Scanner;
import static pbo2.pkg10117060.latihan40.warna.kepribadian.Warna.BIRU;
import static pbo2.pkg10117060.latihan40.warna.kepribadian.Warna.BLUE;
import static pbo2.pkg10117060.latihan40.warna.kepribadian.Warna.CYAN;
import static pbo2.pkg10117060.latihan40.warna.kepribadian.Warna.GREEN;
import static pbo2.pkg10117060.latihan40.warna.kepribadian.Warna.HIJAU;
import static pbo2.pkg10117060.latihan40.warna.kepribadian.Warna.KUNING;
import static pbo2.pkg10117060.latihan40.warna.kepribadian.Warna.MAGENTA;
import static pbo2.pkg10117060.latihan40.warna.kepribadian.Warna.MERAH;
import static pbo2.pkg10117060.latihan40.warna.kepribadian.Warna.NORMAL;
import static pbo2.pkg10117060.latihan40.warna.kepribadian.Warna.RED;
import static pbo2.pkg10117060.latihan40.warna.kepribadian.Warna.UNGU;
import static pbo2.pkg10117060.latihan40.warna.kepribadian.Warna.WHITE;
import static pbo2.pkg10117060.latihan40.warna.kepribadian.Warna.YELLOW;

public class WARNAKEPRIBADIAN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(RED + "YUK " + GREEN + "CEK " + YELLOW + "KEPRIBADIANMU "
                + CYAN + "DARI " + MAGENTA + "WARNA " + BLUE + "FAVORITMU" + NORMAL);
        System.out.println("");
        System.out.println(WHITE + MERAH + "\t MERAH \t\t");
        System.out.println(WHITE + HIJAU + "\t HIJAU \t\t");
        System.out.println(WHITE + KUNING + "\t KUNING \t");
        System.out.println(WHITE + BIRU + "\t BIRU \t\t");
        System.out.println(WHITE + UNGU + "\t UNGU \t\t" + NORMAL);
        System.out.println("");

        Warna pWarna = new Warna();
        System.out.print("PILIH WARNA FAVORITMU : ");
        Scanner scanner = new Scanner(System.in);
        pWarna.pilihWarna = scanner.nextLine();

        Nama nama = new Nama();
        System.out.print("NAMA KAMU : ");
        nama.Nama = scanner.nextLine();

        String NAMABesar = nama.Nama.toUpperCase();
        System.out.println("===HASIL TEST KEPRIBADIAN " + NAMABesar + "===");

        nama.Nama(nama.Nama);
        pWarna.pilihWarna(pWarna.pilihWarna);

    }
    
}
