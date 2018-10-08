/*
 * NAMA       : IRFAN FAISAL HUTAMA TANJUNG
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117050
 * DESKRIPSI PROGRES : menghitung saldo bulanan
 */
package pbo2_10117060_latihan36_targetsaldotabungan;

public class PBO2_10117060_Latihan36_TargetSaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        targetSaldo saldo = new targetSaldo();
        saldo.nSaldo = 3500000;
        saldo.bulan = 1;

        saldo.hitungSaldo(saldo.nSaldo, saldo.bulan);
    }
    
}
