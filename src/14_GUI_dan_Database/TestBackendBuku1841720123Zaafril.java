/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;

/**
 *
 * @author WINDOWS 10
 */
import backend.*;

public class TestBackendBuku1841720123Zaafril {
    public static void main(String[] args){
        Kategori1841720123Zaafril novel = new Kategori1841720123Zaafril().getById(27);
        Kategori1841720123Zaafril referensi = new Kategori1841720123Zaafril().getById(28);
        
        Buku1841720123Zaafril buku1 = new Buku1841720123Zaafril(novel, "Timun Mas", "Elex Media", "Bang Supit");
        Buku1841720123Zaafril buku2 = new Buku1841720123Zaafril(referensi, "Metode Linier", "Springer", "Alex Baldwin");
        Buku1841720123Zaafril buku3 = new Buku1841720123Zaafril(novel, "Bintang Terang", "Erlangga", "Mat Sewoot");
        
        buku1.save();
        buku2.save();
       
        buku2.setJudul("Aljabar Linier");
        buku2.save();
      
        buku3.delete();
        
        for(Buku1841720123Zaafril b : new Buku1841720123Zaafril().getAll()){
            System.out.println("Kategori: " + b.getKategori().getNama() + ", Judul: " + b.getJudul());
        }
        // test search
        for(Buku1841720123Zaafril b : new Buku1841720123Zaafril().search("timun")){
            System.out.println("Kategori: " + b.getKategori().getNama() + ", Judul: " + b.getJudul());
        }
    }
}
