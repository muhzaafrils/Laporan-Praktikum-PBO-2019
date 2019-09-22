/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu4;

/**
 *
 * @author WINDOWS 10
 */
public class Pelanggan1841720123Zaafril {
    private String nama, namaFilm;
    private int nomorKursi;

    public Pelanggan1841720123Zaafril(String nama, String namaFilm, int nomorKursi) {
        this.nama = nama;
        this.namaFilm = namaFilm;
        this.nomorKursi = nomorKursi;
    }
    
    
    public void setNamaZaafril(String nama){
        this.nama = nama;
    }
    
    public String getNamaZaafril(){
        return nama;
    }
    
    public void setNamaFilmZaafril(String namaFilm){
        this.namaFilm = namaFilm;
    }
    
    public String getNamaFilmZaafril(){
        return namaFilm;
    }
    
    public void setNomorKursi(int nomorKursi){
        this.nomorKursi = nomorKursi;
    }
    
    public int getNomorKursiZaafril(){
        return nomorKursi;
    }
    
    public void info(){
        System.out.println("Nama            : "+ this.nama);
        System.out.println("Nama Film       : "+ this.namaFilm);
        System.out.println("Nomor Kursi     : "+ this.nomorKursi);
    }
}
