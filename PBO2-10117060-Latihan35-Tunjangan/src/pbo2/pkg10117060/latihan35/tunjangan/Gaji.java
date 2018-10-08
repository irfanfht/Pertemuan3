/*
 * NAMA       : IRFAN FAISAL HUTAMA TANJUNG
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117060
 * DESKRIPSI PROGRES : menghitung gaji karyawan
 */
package pbo2.pkg10117060.latihan35.tunjangan;

class Gaji {
   public double gajiPokok;
   public String status;
   public double tunjangan,totalGaji;
   
   public void programTunjangan(double pargajiPokok, String parStatus, double parTunjangan, double parTotalGaji){
       parTunjangan = (parStatus.equalsIgnoreCase("Menikah")) ? pargajiPokok * 0.35 : 0;
       
       parTotalGaji = parTunjangan + pargajiPokok;

        System.out.println("\n");
        System.out.println("===========Hasil Perhitungan=============");
        System.out.println("Gaji Pokok Anda \t: " + pargajiPokok);
        //System.out.println("Status Anda \t\t: " + parStatus);
        System.out.println("Tunjangan Anda \t\t: " + parTunjangan);
        System.out.println("Total Gaji \t\t: " + parTotalGaji);
   }
    
}
