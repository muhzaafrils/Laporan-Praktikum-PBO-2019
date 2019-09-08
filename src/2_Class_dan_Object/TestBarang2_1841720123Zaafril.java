/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu2;

/**
 *
 * @author WINDOWS 10
 */
public class TestBarang2_1841720123Zaafril {
    public static void main(String[] args){
        
        Barang2_1841720123Zaafril b2 = new Barang2_1841720123Zaafril();
        
        b2.kode = "03.08.02.05.01.009";
        b2.namaBarang = "Laptop ASUS VivoBook";
        b2.hargaDasar = 9000000;
        b2.diskon = 10;
        b2.hitungHargaJualZaafril();
        b2.tampilDataZaafril();
    }   
}
