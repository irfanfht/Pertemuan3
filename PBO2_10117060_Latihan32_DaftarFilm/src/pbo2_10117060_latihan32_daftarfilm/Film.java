/*
 * NAMA       : IRFAN FAISAL HUTAMA TANJUNG
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117050
 * DESKRIPSI PROGRES : program berisi class menampilkan Daftar Film yang di panggil di clas utama
 */
package pbo2_10117060_latihan32_daftarfilm;


public class Film {
    String filmName, filGenre;
    double filmRating;
    int filmDuration;
    
    public void nowPlaying(String parName, String parGenre, double parRating, int parDuration) {
        System.out.print("Judul Film : " + parName);
        System.out.print("Genre Film : " + parGenre);
        System.out.print("Rating Film : " + parRating + "\n");
        System.out.print("Duration Film : " + parDuration + " Menit \n");
        System.out.println("");
    }
    
}
