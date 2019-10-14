/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu7;

/**
 *
 * @author WINDOWS 10
 */
public class Karyawan1841720123Zaafril {
    private String nama;
    private String nip;
    private String golongan;
    private double gaji;

    public String getNamaZaafril() {
        return nama;
    }

    public void setNamaZaafril(String nama) {
        this.nama = nama;
    }

    public String getNipZaafril() {
        return nip;
    }

    public void setNipZaafril(String nip) {
        this.nip = nip;
    }

    public String getGolonganZaafril() {
        return golongan;
    }

    public void setGolonganZaafril(String golongan) {
        this.golongan = golongan;
        
        switch(golongan.charAt(0)){
            case '1':this.gaji = 5000000;
            break;
            case '2':this.gaji = 3000000;
            break;
            case '3':this.gaji = 2000000;
            break;
            case '4':this.gaji = 1000000;
            break;
            case '5':this.gaji = 750000;
            break;
        }
    }

    public double getGajiZaafril() {
        return gaji;
    }

    public void setGajiZaafril(double gaji) {
        this.gaji = gaji;
    }
    
    
}
