/*
 * NAMA       : IRFAN FAISAL HUTAMA TNAJUNG
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117050
 * DESKRIPSI PROGRES : menampilkan Warna kepribadian
 */
package pbo2.pkg10117060.latihan40.warna.kepribadian;

public class Warna {
    public static final String NORMAL = "\u001b[0m";
    public static final String BLACK = "\u001b[30m";
    public static final String RED = "\u001b[31m";
    public static final String GREEN = "\u001b[32m";
    public static final String YELLOW = "\u001b[33m";
    public static final String BLUE = "\u001b[34m";
    public static final String MAGENTA = "\u001b[35m";
    public static final String CYAN = "\u001b[36m";
    public static final String WHITE = "\u001b[37m";
    public static final String BLINK = "\u001b[5m";
    //background Warna
    public static final String MERAH = "\033[41m";
    public static final String KUNING = "\033[43m";
    public static final String HIJAU = "\033[42m";
    public static final String BIRU = "\033[44m";
    public static final String UNGU = "\033[45m";

    public String pilihWarna;

    public void pilihWarna(String parWarna) {

        String Besar = pilihWarna.toUpperCase();

        if (parWarna.equalsIgnoreCase("MERAH")) {
            //
            System.out.println("Warna favoritmu adalah " + RED + Besar);
            System.out.println("1. Periang, \n"
                    + "2. Pemberani, \n"
                    + "3. Beranai Mengambil Resiko Dalam Setiap Langkah, \n"
                    + "4. Menyukai Tantangan, \n"
                    + "5. Kurang Sabar, \n"
                    + "6. Dapat menahan marah namun jika sudah tahap puncak toleransi, kemarahannya akan sulit dikontrol \n"
                    + "7. Memiliki energi kehangatan dan cinta.");
        } else if (parWarna.equalsIgnoreCase("HIJAU")) {
            //System.out.println("===HASIL TEST KEPRIBADIAN " + nama.Nama + "===");
            System.out.println("Warna favoritmu adalah " + GREEN + Besar);
            System.out.println("1. Romantis, \n"
                    + "2. menyukai hal yang berbau alami dan keindahan, \n"
                    + "3. teguh pada prinsip, \n"
                    + "4. menginginkan kesempurnaan, \n"
                    + "5. mudah cemburu, \n"
                    + "6. mudah merasa iri, \n"
                    + "7. menjunjung tinggi suatu nilai toleransi dan kepercayaan.");
        } else if (parWarna.equalsIgnoreCase("KUNING")) {
            //System.out.println("===HASIL TEST KEPRIBADIAN " + nama.Nama + "===");
            System.out.println("Warna favoritmu adalah " + YELLOW + Besar);
            System.out.println("1. Optimis, \n"
                    + "2. suka bergaul, \n"
                    + "3. periang, \n"
                    + "4. senang menolong, \n"
                    + "5. lincah dan aktif, \n"
                    + "6. tidak suka meremehkan kekurangan orang lain, \n"
                    + "7. Loyal, \n"
                    + "8. Hangat, \n"
                    + "9. Meskipun karakternya optimis dan idealis, seringkali goyah dan tidak stabil, \n"
                    + "10. cenderung penakut.");
        } else if (parWarna.equalsIgnoreCase("BIRU")) {
            //System.out.println("===HASIL TEST KEPRIBADIAN " + nama.Nama + "===");
            System.out.println("Warna favoritmu adalah " + BLUE + Besar);
            System.out.println("1. Menyenangkan, \n"
                    + "2. Bijaksana, \n"
                    + "3. periang, \n"
                    + "4. Pembawaan diri tenang saat menghadapi masalah, \n"
                    + "5. Dinamis, \n"
                    + "6. Senang Berbagi, \n"
                    + "7. Bersahabat, \n"
                    + "8. Tidak terlalu suka menjadi sorotan banyak orang, \n"
                    + "9. Menyembunyikan perasaan karena karakternya karakternya yang cenderung mencari jalan damai. \n");
        } else if (parWarna.equalsIgnoreCase("UNGU")) {
            //System.out.println("===HASIL TEST KEPRIBADIAN " + nama.Nama + "===");
            System.out.println("Warna favoritmu adalah " + MAGENTA + Besar);
            System.out.println("1. Optimis, \n"
                    + "2. Tidakpernah ragu, \n"
                    + "3. Menurutnya pasangan ideal adalah yang memiliki mental yang kuat, \n"
                    + "4. Memiliki ambisi yang kuat, \n"
                    + "5. Memiliki empati yang besar, \n"
                    + "6. SMemiliki sisi misterius sebab seringkali menyembunyikan perasaannya, \n"
                    + "7. Terkadang bersikap keras kepala dan angkuh. \n");
        }
    }
}