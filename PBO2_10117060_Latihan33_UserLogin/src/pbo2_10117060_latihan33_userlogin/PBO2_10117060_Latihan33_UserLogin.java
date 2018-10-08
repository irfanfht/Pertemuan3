/*
 * NAMA       : IRFAN FAISAL HUTAMA TNAJUNG
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117060
 * DESKRIPSI PROGRES : Program ini berisi untuk menampilkan login
 */
package pbo2_10117060_latihan33_userlogin;

import java.util.Scanner;

public class PBO2_10117060_Latihan33_UserLogin {

    private String usName;
    private String passWord;

    public static void main(String[] args) {
        PBO2_10117060_Latihan33_UserLogin login = new PBO2_10117060_Latihan33_UserLogin();
        Scanner scanner = new Scanner(System.in);
        User user = new User();
        System.out.print("Masukan Username = ");
        login.usName = scanner.nextLine();

        System.out.print("Masukan Password = ");
        login.passWord = scanner.nextLine();

        user.pengecekkanLogin(login.usName, login.usName);
    }

}
