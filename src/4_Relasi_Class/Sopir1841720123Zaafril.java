/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu4_p2;

/**
 *
 * @author WINDOWS 10
 */
public class Sopir1841720123Zaafril {
    private String nama;
    private int biaya;

    public Sopir1841720123Zaafril() {
    }
    
    public int hitungBiayaSopirZaafril(int hari){
        return biaya*hari;
    }
    
    public void setNamaZaafril(String nama) {
        this.nama = nama;
    }

    public String getNamaZaafril() {
        return nama;
    }

    public void setBiayaZaafril(int biaya) {
        this.biaya = biaya;
    }

    public int getBiayaZaafril() {
        return biaya;
    }
}
