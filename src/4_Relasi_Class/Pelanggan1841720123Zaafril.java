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
public class Pelanggan1841720123Zaafril {
    private String nama;
    private Mobil1841720123Zaafril mobil;
    private Sopir1841720123Zaafril sopir;
    private int hari;

    public Pelanggan1841720123Zaafril() {
    }

    public String getNamaZaafril() {
        return nama;
    }

    public void setNamaZaafril(String nama) {
        this.nama = nama;
    }

    public Mobil1841720123Zaafril getMobilZaafril() {
        return mobil;
    }

    public void setMobilZaafril(Mobil1841720123Zaafril mobil) {
        this.mobil = mobil;
    }

    public Sopir1841720123Zaafril getSopirZaafril() {
        return sopir;
    }

    public void setSopirZaafril(Sopir1841720123Zaafril sopir) {
        this.sopir = sopir;
    }

    public int getHariZaafril() {
        return hari;
    }

    public void setHariZaafril(int hari) {
        this.hari = hari;
    }
    
    public int hitungBiayaTotalZaafril(){
        return mobil.hitungBiayaMobilZaafril(hari) +
                sopir.hitungBiayaSopirZaafril(hari);
    }
    
}
