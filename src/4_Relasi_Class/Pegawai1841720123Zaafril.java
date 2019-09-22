/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu4_p3;

/**
 *
 * @author WINDOWS 10
 */
public class Pegawai1841720123Zaafril {
    private String nip;
    private String nama;

    public Pegawai1841720123Zaafril() {
    }

    public Pegawai1841720123Zaafril(String nip, String nama) {
        this.nip = nip;
        this.nama = nama;
    }

    public String getNipZaafril() {
        return nip;
    }

    public void setNipZaafril(String nip) {
        this.nip = nip;
    }

    public String getNamaZaafril() {
        return nama;
    }

    public void setNamaZaafril(String nama) {
        this.nama = nama;
    }
    
    public String infoZaafril(){
        String info = "";
        info += "Nip: " + this.nip + "\n";
        info += "Nama: " + this.nama + "\n";
        
        return info;
    }  
}
