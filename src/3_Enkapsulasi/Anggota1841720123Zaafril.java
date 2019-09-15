/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operasigettersetter;

/**
 *
 * @author WINDOWS 10
 */
public class Anggota1841720123Zaafril {
    private String nama;
    private String alamat;
    private float simpanan;
    
    Anggota1841720123Zaafril(String nama, String alamat){
        this.nama = nama;
        this.alamat = alamat;
        this.simpanan = 0;
    }
    
    public void setNamaZaafril(String nama){
        this.nama = nama;
    }
    
    public void setAlamatZaafril(String alamat){
        this.alamat = alamat;
    }
    
    public String getNamaZaafril(){
        return nama;
    }
    
    public String getAlamatZaafril(){
        return alamat;
    }
    
    public float getSimpananZaafril(){
        return simpanan;
    }
    
    public void setorZaafril(float uang){
        simpanan += uang;
    }
    
    public void pinjamZaafril(float uang){
        simpanan -= uang;
    }
}
