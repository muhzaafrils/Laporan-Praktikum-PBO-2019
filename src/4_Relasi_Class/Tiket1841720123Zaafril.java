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
public class Tiket1841720123Zaafril {
    private int id, nomorStudio, harga;
    private Loket1841720123Zaafril loket;
    private Pelanggan1841720123Zaafril pelanggan;
    
    Tiket1841720123Zaafril(int id, int nomorStudio,int harga){
        this.id = id;
        this.nomorStudio = nomorStudio;
        this.harga = harga;
    }
    
    public void setIDZaafril(int id){
        this.id = id;
    }
    
    public int getIDZaafril(){
        return id;
    }
    
    public void setNomorStudioZaafril(int nomorStudio){
        this.nomorStudio = nomorStudio;
    }
    
    public int getNomorStudioZaafril(){
        return nomorStudio;
    }
    
    public void setHargaZaafril(int harga){
        this.harga = harga;
    }
    
    public int getHargaZaafril(){
        return harga;
    }
    
    public void setPelangganZaafril(Pelanggan1841720123Zaafril pelanggan){
        this.pelanggan = pelanggan;
    }
    
    public Pelanggan1841720123Zaafril getPelangganZaafril(){
        return pelanggan;
    }
        
    public void infoZaafril(){
        System.out.println("Ticket ID       : "+ this.id);
        System.out.println("Nomor Studio    : "+ this.nomorStudio);
        pelanggan.info();
        System.out.println("Harga           : "+ this.harga);
    }
}
