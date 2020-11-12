package pbo2.pkg10119073.latihan49.biayaemaskawin;

import java.text.DecimalFormat;

/**
 *
 * @author 
 * NAMA     : Aghnia Dewi Mahiranie
 * KELAS    : PBO2
 * NIM      : 10119073
 * Deskripsi Program : Program ini berisi program untuk menghitung biaya emas kawin
 *
 */

public class PBO210119073Latihan48BiayaEmasKawin {

    public static void main(String[] args) {
        Emas emas = new Emas();
        
        DecimalFormat df = new DecimalFormat("#.###");    
        
        emas.setHarga(570000);
        emas.setTotalBerat(15.7);
        System.out.println("Hendi Akan membeli emas kawin sebagai mahar nikahnya");
        System.out.println("dengan total seberat "+df.format(emas.getTotalBerat())+" gram. jika harga 1 gram emas");
        System.out.println("per bulan oktober ini adalah Rp "+df.format(emas.getHarga())+". Berapa total harus dikeluarkan oleh Hendi?");
        System.out.println("");
        System.out.println("=====PENYELESAIAN=====");
        System.out.println("Berat emas = "+emas.getTotalBerat()+" gram");
        System.out.println("Harga emas bulan Oktober = Rp. "+emas.getHarga());
        System.out.println("Total bayar yang harus dikeluarkan: "+ "Rp."+emas.hitungBiaya());
    }
    
}
