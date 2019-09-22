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
public class Kursi1841720123Zaafril {
    private String nomor;
    private Penumpang1841720123Zaafril penumpang;

    public Kursi1841720123Zaafril() {
    }

    public Kursi1841720123Zaafril(String nomor) {
        this.nomor = nomor;
    }

    public String getNomerZaafril() {
        return nomor;
    }

    public void setNomerZaafril(String nomor) {
        this.nomor = nomor;
    }

    public Penumpang1841720123Zaafril getPenumpangZaafril() {
        return penumpang;
    }

    public void setPenumpangZaafril(Penumpang1841720123Zaafril penumpang) {
        this.penumpang = penumpang;
    }
    
    public String infoZaafril(){
        String info = "";
        info += "Nomor: " + nomor + "\n";
        if(this.penumpang != null){
            info += "Penumpang: " + penumpang.infoZaafril() + "\n";
        }
        return info;
    }
}
