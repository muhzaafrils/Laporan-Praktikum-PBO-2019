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
public class Pegawai1841720123Zaafril {
     private String nip;
    private String nama;
    
    Pegawai1841720123Zaafril(String nip, String nama){
        this.nip = nip;
        this.nama = nama;
    }
    
    public void setNipZaafril(String nip){
        this.nip = nip;
    }
    
    public String geNipZaafril(){
        return nip;
    }
    
    public void setNamaZaafril(String nama){
        this.nama = nama;
    }
    
    public String getNamaZaafril(){
        return nama;
    }
    
    public String infoZaafril() { 
        String info = "";
        info += "Nip    : " + this.nip + "\n";
        info += "Nama        : " + this.nama;
        return info; 
    }
}
