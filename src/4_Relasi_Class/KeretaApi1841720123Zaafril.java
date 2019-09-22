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
public class KeretaApi1841720123Zaafril {
    private String nama;
    private String kelas;
    private Pegawai1841720123Zaafril masinis;
    private Pegawai1841720123Zaafril asisten;

    public KeretaApi1841720123Zaafril(String nama, String kelas, Pegawai1841720123Zaafril masinis) {
        this.nama = nama;
        this.kelas = kelas;
        this.masinis = masinis;
    }

    public KeretaApi1841720123Zaafril(String nama, String kelas, Pegawai1841720123Zaafril masinis, Pegawai1841720123Zaafril asisten) {
        this.nama = nama;
        this.kelas = kelas;
        this.masinis = masinis;
        this.asisten = asisten;
    }

    public String getNamaZaafril() {
        return nama;
    }

    public void setNamaZaafril(String nama) {
        this.nama = nama;
    }

    public String getKelasZaafril() {
        return kelas;
    }

    public void setKelasZaafril(String kelas) {
        this.kelas = kelas;
    }

    public Pegawai1841720123Zaafril getMasinisZaafril() {
        return masinis;
    }

    public void setMasinisZaafril(Pegawai1841720123Zaafril masinis) {
        this.masinis = masinis;
    }

    public Pegawai1841720123Zaafril getAsistenZaafril() {
        return asisten;
    }

    public void setAsistenZaafril(Pegawai1841720123Zaafril asisten) {
        this.asisten = asisten;
    }
    
    public String infoZaafril(){
        String info = "";
        info += "Nama: " + this.nama + "\n";
        info += "Kelas: " + this.kelas + "\n";
        info += "Masinis: " + this.masinis.infoZaafril() + "\n";
        info += "Asisten: " + this.asisten.infoZaafril() + "\n";
        return info;
    }    
}
