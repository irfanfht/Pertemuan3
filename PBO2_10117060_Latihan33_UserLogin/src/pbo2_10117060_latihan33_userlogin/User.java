/*
 * NAMA       : IRFAN FAISAL HUTAMA TANJUNG
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117060
 * DESKRIPSI PROGRES : Program ini berisi program cals untuk menampilkan portal login
 */
package pbo2_10117060_latihan33_userlogin;

/**
 *
 * @author Kamvang
 */
public class User {
    private final String username = "RizkiAdam";
    private final String password = "terbaikselalu";
    boolean statusAkun;
    
    private boolean cekAkun(String parUserName, String parPassword) {
        statusAkun = false;
        if (parUserName.equals(username) && parPassword.equals(password)) {
            statusAkun = true;
        }
        return statusAkun;
    }
    
    private void hasilLogin(boolean status, String parUserName) {
        this.cekAkun(parUserName, password);
        if (status = statusAkun) {
            System.out.println("");
            System.out.println("*********HALLO " + parUserName + "********");
            System.out.println("Selamat datang di aplikasi ini ");
            
        } else {
            System.out.println("");
            System.out.println("Oops, Username atau password salah");
        }
    }
    public void pengecekkanLogin(String parUserName, String parPassword) {
        this.cekAkun(parUserName, parPassword);
        this.hasilLogin(statusAkun, parUserName);

    }
}
