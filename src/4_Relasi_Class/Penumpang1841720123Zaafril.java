/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu4_p4;

/**
 *
 * @author WINDOWS 10
 */
public class Penumpang1841720123Zaafril {
    private String ktp;
    private String nama;

    public Penumpang1841720123Zaafril() {
    }

    public Penumpang1841720123Zaafril(String ktp, String nama) {
        this.ktp = ktp;
        this.nama = nama;
    }

    public String getKtpZaafril() {
        return ktp;
    }

    public void setKtpZaafril(String ktp) {
        this.ktp = ktp;
    }

    public String getNamaZaafril() {
        return nama;
    }

    public void setNamaZaafril(String nama) {
        this.nama = nama;
    } 
    
    public String infoZaafril(){
        String info = "";
        info += "Ktp: " + ktp + "\n";
        info += "Nama: " + nama + "\n";
        return info;
    }
}
