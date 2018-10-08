/*
 * NAMA       : IRFAN FAISAL HUTAMA TANJUNG
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117060
 * DESKRIPSI PROGRES : Program ini berisi menampilkan Daftar Film dengan 2 class.
 */
package pbo2_10117060_latihan32_daftarfilm;


public class PBO2_10117060_Latihan32_DaftarFilm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("=======Daftar Film yang sedang tayang====");
        System.out.println("");
        Film film = new Film();
        film.filmName = "Venom \n";
        film.filGenre = "Action, Horor, Scifi \n";
        film.filmRating = 8.5;
        film.filmDuration = 120;
        film.nowPlaying(film.filmName, film.filGenre, film.filmRating, film.filmDuration);
        
        Film film2 = new Film();
        film2.filmName = "Small Foot \n";
        film2.filGenre = "Animation \n";
        film2.filmRating = 89.0;
        film2.filmDuration = 96;
        film2.nowPlaying(film.filmName, film.filGenre, film.filmRating, film.filmDuration);
        
        Film film3 = new Film();
        film3.filmName = "Crazy Rich Asian \n";
        film3.filGenre = "Comedy \n";
        film3.filmRating = 7.8;
        film3.filmDuration = 119;
        film3.nowPlaying(film.filmName, film.filGenre, film.filmRating, film.filmDuration);
        
        Film film4 = new Film();
        film4.filmName = "Asih";
        film4.filGenre = "Horror \n";
        film4.filmRating = 6.0;
        film4.filmDuration = 100;
        film4.nowPlaying(film.filmName, film.filGenre, film.filmRating, film.filmDuration);
    }
    
}
