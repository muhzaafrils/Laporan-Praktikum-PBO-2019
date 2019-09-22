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
public class Gerbong1841720123Zaafril {
    private String kode;
    private Kursi1841720123Zaafril[] arrayKursi;
    private int jumlah;

    public Gerbong1841720123Zaafril() {
    }

    public Gerbong1841720123Zaafril(String kode, int jumlah) {
        this.kode = kode;
        this.arrayKursi = new Kursi1841720123Zaafril[jumlah];
        this.initKursi();   
    }

    public String getKodeZaafril() {
        return kode;
    }

    public void setKodeZaafril(String kode) {
        this.kode = kode;
    }

    public Kursi1841720123Zaafril[] getArrayKursiZaafril() {
        return arrayKursi;
    }

    public void setArrayKursiZaafril(Kursi1841720123Zaafril[] arrayKursi) {
        this.arrayKursi = arrayKursi;
    }
    
    private void initKursi(){
        for(int i = 0; i < arrayKursi.length; i++){
            this.arrayKursi[i] = new Kursi1841720123Zaafril(String.valueOf(i + 1));
        }
    }
    
    public String infoZaafril(){
        String info = "";
        info += "Kode: "+ kode + "\n";
        for (Kursi1841720123Zaafril kursi : arrayKursi){
            info += kursi.infoZaafril();
        }
        return info;
    }
    
    public void setPenumpangZaafril(Penumpang1841720123Zaafril penumpang, int nomor){
        this.arrayKursi[nomor-1].setPenumpangZaafril(penumpang);
    }
}
    

