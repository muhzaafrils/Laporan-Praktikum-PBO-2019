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
public class Barang1841720123Zaafril {
    public String namaBrg;
    public String jenisBrg;
    public int stok;
    
    public void tampilBarangZaafril(){
        System.out.println("Nama Barang     : "+namaBrg);
        System.out.println("Jenis Barang    : "+jenisBrg);
        System.out.println("Stok            : "+stok);
    }
    //method dengan argumen dan nilai balik (return)
    public int tambahStokZaafril(int brgMasuk){
        int stokBaru = brgMasuk + stok;
        return stokBaru;
    }
        
}
    

