package pboif2.pkg10119049.latihan54.koordinat;
/**
 * @author
 * Nama  : Nur Sasongko
 * Kelas : PBOIF2
 * NIM   : 10119049
 * Deskripsi Program : Menampilkan Warna dan Sumbu Koordinat
**/
import Koordinat.WarnaKoordinat;
public class PBOIF210119049Latihan54Koordinat {
    public static void main(String[] args) {
       WarnaKoordinat wn1 = new WarnaKoordinat(10,4,"Jingga");
        
       System.out.printf("Warna Koordinat : %s\n",wn1.getNamaWarna());
       System.out.printf("Koordinat Sumbu x : %d, y : %d\n",wn1.getX(),wn1.getY());
    }
    
}

