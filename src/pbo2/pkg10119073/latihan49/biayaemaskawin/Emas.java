package pbo2.pkg10119073.latihan49.biayaemaskawin;

/**
 *
 * @author 
 * NAMA     : Aghnia Dewi Mahiranie
 * KELAS    : PBO2
 * NIM      : 10119073
 * Deskripsi Program : Program ini berisi program untuk menghitung biaya emas kawin
 *
 */

public class Emas {
    private double totalBerat, harga;

    public double getTotalBerat() {
        return totalBerat;
    }

    public void setTotalBerat(double totalBerat) {
        this.totalBerat = totalBerat;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
    
    public double hitungBiaya(){
        return harga * totalBerat;
    }
    
}
