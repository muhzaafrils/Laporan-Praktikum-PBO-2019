/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittest.anggota;

/**
 *
 * @author WINDOWS10
 */
public class TestBackend1841720123Zaafril {

    public static void main(String[] args) {
        Anggota1841720123Zaafril agt1 = new Anggota1841720123Zaafril("iqbal", "mojokerto", "0293482384");
        Anggota1841720123Zaafril agt2 = new Anggota1841720123Zaafril("agung", "tulungagung", "19203123");
        Anggota1841720123Zaafril agt3 = new Anggota1841720123Zaafril("napis", "kalimantan", "192837213");

        agt1.save();
        agt2.save();
        agt3.save();

        agt2.setAlamat("kota malang");
        agt2.save();

        agt3.delete();

        for (Anggota1841720123Zaafril k : new Anggota1841720123Zaafril().getAll()) {
            System.out.println("Nama: " + k.getNama() + ", telp: " + k.getTelepon() + ", alamat: " + k.getAlamat());
        }

        for (Anggota1841720123Zaafril k : new Anggota1841720123Zaafril().search("ilmiah")) {
            System.out.println("Nama: " + k.getNama() + ", telp: " + k.getTelepon() + ", alamat: " + k.getAlamat());
        }
    }

}
