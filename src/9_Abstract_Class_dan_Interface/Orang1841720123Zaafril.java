/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu9;

/**
 *
 * @author WINDOWS 10
 */
public class Orang1841720123Zaafril {
    private String nama;
    private Hewan1841720123Zaafril hewanPeliharaan;

    public Orang1841720123Zaafril(String nama) {
        this.nama = nama;
    }


    public void peliharaHewanZaafril(Hewan1841720123Zaafril hewanPeliharaan){
        this.hewanPeliharaan = hewanPeliharaan;
    }

    public void ajakPeliharaanJalanJalanZaafril(){
        System.out.println("Namaku "+this.nama);
        System.out.println("Hewan peliharaanku berjalan dengan cara: ");
        this.hewanPeliharaan.bergerakZaafril();
        System.out.println("-----------------------------------------");
    }
}
