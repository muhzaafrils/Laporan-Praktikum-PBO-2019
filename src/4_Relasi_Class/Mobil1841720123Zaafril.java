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
public class Mobil1841720123Zaafril {
    private String merk;
    private int biaya;

    public Mobil1841720123Zaafril() {
    }

    public String getMerkZaafril() {
        return merk;
    }

    public void setMerkZaafril(String merk) {
        this.merk = merk;
    }

    public int getBiayaZaafril() {
        return biaya;
    }

    public void setBiayaZaafril(int biaya) {
        this.biaya = biaya;
    }
    
    public int hitungBiayaMobilZaafril(int hari){
        return biaya*hari;
    }
}
