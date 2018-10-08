/*
 * NAMA       : IRFAN FAISAL HUTAMA TANJUNG
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117060
 * DESKRIPSI PROGRES : menghitung gaji karyawan
 */
package pbo2.pkg10117060.latihan35.tunjangan;

import java.util.Scanner;

public class PBO210117060Latihan35Tunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        Gaji gaji = new Gaji();
        System.out.println("======Program Tunjangan======");
        Scanner scn = new Scanner(System.in);

        System.out.print("Berapa gaji pokok anda perbulan : ");
        gaji.gajiPokok = scn.nextInt();
        
        System.out.print("Status Anda (menikah/belum) : ");
        gaji.status = scn.next();

        gaji.programTunjangan(gaji.gajiPokok, gaji.status, gaji.tunjangan, gaji.totalGaji);
        System.out.println("(Develop By :Irfan Faisal Hutama Tanjung)");
        
    }
    
}
