/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nilaitotal_kuis;
import java.util.*;
/**
 *
 * @author Personal
 */
public class NilaiTotal_kuis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final double NILAI_UTS1 = 0.3;
	final double NILAI_UTS2 = 0.3;
	final double NILAI_UAS = 0.4;
	// Masing-masing ujian nilai 0 s/d 100.
	//Simpan dengan nama NilaiTotal.java\
	Scanner input = new Scanner(System.in);
	//deklarasi 
	double nilaiSisi1, nilaiSisi2,nilaiAkhir, totalFinal;
	//print
	System.out.println("");
	System.out.println("----------PERHITUNGAN  NILAI TOTAL----------");
        System.out.println("--------------------------------------------");
	System.out.println("");
	System.out.print("Nilai Sisipan 1 = ");
	nilaiSisi1 = input.nextDouble();
	System.out.print("Nilai Sisipan 2 = ");
	nilaiSisi2 = input.nextDouble();
	System.out.print("Nilai U.Akhir   = ");
	nilaiAkhir = input.nextDouble();

	//perhitungan
	totalFinal = nilaiSisi1 * NILAI_UTS1 + nilaiSisi2 * NILAI_UTS2 + nilaiAkhir * NILAI_UAS;
	

	System.out.println("");
	System.out.println("Ujian Sisipan 1 = "+ nilaiSisi1);
	System.out.println("Ujian Sisipan 2 = "+ nilaiSisi2);
	System.out.println("Ujian Akhir     = "+ nilaiAkhir);
	System.out.println("Maka Nilai Final= "+ totalFinal);
            if( (totalFinal < 60.0) && ( ( nilaiSisi1 == 0) || (nilaiSisi2 == 0) || (nilaiAkhir == 0 )) ){
                System.out.println("");
                System.out.println("Maaf Anda Harus Ikut Remedial");
            }
            else{
                System.out.println("");
                System.out.println("Anda Tidak Harus Ikut Remedial");
            }
            System.out.println("--------------------------------------------");
    }
}
