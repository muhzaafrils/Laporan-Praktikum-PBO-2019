/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittest.database;

/**
 *
 * @author WINDOWS10
 */
public class TestBackend1841720123Zaafril {

    public static void main(String[] args) {
        Kategori1841720123Zaafril kat1 = new Kategori1841720123Zaafril("Novel", "Koleksi buku novel");
        Kategori1841720123Zaafril kat2 = new Kategori1841720123Zaafril("Referensi", "Buku referensi ilmiah");
        Kategori1841720123Zaafril kat3 = new Kategori1841720123Zaafril("Novel", "Komik anak-anak");

        kat1.save();
        kat2.save();
        kat3.save();

        kat2.setKeterangan("Koleksi buku referensi ilmiah");
        kat2.save();

        kat3.delete();

        for (Kategori1841720123Zaafril k : new Kategori1841720123Zaafril().getAll()) {
            System.out.println("Nama: " + k.getNama() + ", Ket: " + k.getKeterangan());
        }

        for (Kategori1841720123Zaafril k : new Kategori1841720123Zaafril().search("ilmiah")) {
            System.out.println("Nama: " + k.getNama() + ", Ket: " + k.getKeterangan());
        }
    }

}
