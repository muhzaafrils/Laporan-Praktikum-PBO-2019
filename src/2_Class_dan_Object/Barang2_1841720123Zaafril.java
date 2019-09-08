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
public class Barang2_1841720123Zaafril {
    public String kode;
    public String namaBarang;
    public int hargaDasar;
    public float diskon;
    public int hargaJual;
    
    public int hitungHargaJualZaafril(){;
        hargaJual = (int) (hargaDasar - (diskon/100*hargaDasar));
        return 0;
    }
    
    public void tampilDataZaafril(){
        System.out.println("Kode Barang         : "+kode);
        System.out.println("Nama Barang         : "+namaBarang);
        System.out.println("Harga Dasar Barang  : Rp "+hargaDasar);
        System.out.println("Diskon Barang       : "+diskon+" %");
        System.out.println("Harga Jual Barang   : Rp "+hargaJual);
    }
    
}
