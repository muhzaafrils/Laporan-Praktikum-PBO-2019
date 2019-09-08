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
public class TestBarang1841720123Zaafril {
    public static void main(String[] args){
        Barang1841720123Zaafril brg1=new Barang1841720123Zaafril();
        brg1.namaBrg = "Pensil";
        brg1.jenisBrg = "ATK";
        
        //menampilkan dan mengisi argumen untuk menambahkan stok barang
        System.out.println("Stok Baru adalah "+brg1.tambahStokZaafril(20));
    }
    
}
