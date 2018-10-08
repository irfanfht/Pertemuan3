/*
 * NAMA       : IRFAN FAISAL HUTAMA TANJUNG
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117060
 * DESKRIPSI PROGRES : Program ini menampilkan data Nama Mahasiswa
 * yang memanggil clas dari clas Mahasiswa.java 
 */
package pbo2_10117060_latihan31_perkenalan_mahasiswa;

/**
 *
 * @author Kamvang
 */
public class Mahasiswa {
    
    String nim, nama;

    public void perkenalanDiri(String parNim, String parNama) {
        System.out.print("Hello Everyone");
        System.out.print("My NIM is : " + parNim);
        System.out.print("My Name is : " + parNama);
        System.out.println("");

    }
    
    public static void main(String[] args){
        Mahasiswa Mhs = new Mahasiswa();
        Mhs.nim = "10110269 \n";
        Mhs.nama = "Rizki Adam Kurniawan \n";
        
        Mahasiswa Mhs2 = new Mahasiswa();
        Mhs2.nim = "10110270 \n";
        Mhs2.nama = "Indra Tiola \n";
        
        Mahasiswa Mhs3 = new Mahasiswa();
        Mhs3.nim = "10110271 \n";
        Mhs3.nama = "Robi Tanjil Ganefi \n";
        
        Mahasiswa Mhs4 = new Mahasiswa();
        Mhs4.nim = "10110272 \n";
        Mhs4.nama = "Muhammad Nur Awaludin \n";
        
        Mhs.perkenalanDiri(Mhs.nim, Mhs.nama);
        Mhs2.perkenalanDiri(Mhs2.nim, Mhs2.nama);
        Mhs3.perkenalanDiri(Mhs3.nim, Mhs3.nama);
        Mhs4.perkenalanDiri(Mhs4.nim, Mhs4.nama);
    } 
    
}
