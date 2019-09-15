/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu3;

/**
 *
 * @author WINDOWS 10
 */
public class Anggota2_1841720123Zaafril {
    private String nama;
    private String nomorKtp;
    private int limitPinjaman;
    private int jumlahPinjaman;

    public Anggota2_1841720123Zaafril(String nomorKtp, String nama, int limitPinjaman) {
        this.nama = nama;
        this.nomorKtp = nomorKtp;
        this.limitPinjaman = limitPinjaman;
    }
    
    public String getNamaZaafril(){
        return nama;
    }

    public int getLimitPinjamanZaafril(){
        return limitPinjaman;
    }

    public int getJumlahPinjamanZaafril(){
        return jumlahPinjaman;
    }
    public void pinjamZaafril(int pinjam){
        if (pinjam>limitPinjaman) {
            System.out.println("Maaf, jumlah pinjaman melebihi limit");
        }
        else{
            jumlahPinjaman += pinjam;
        }
    }

    public void angsurZaafril(int angsur){
        if(angsur < (jumlahPinjaman*0.1)){
            System.out.println("Maaf, angsuran harus 10% dari jumlah pinjaman");
        }
        else{
        jumlahPinjaman -= angsur;
        }
    }
}
