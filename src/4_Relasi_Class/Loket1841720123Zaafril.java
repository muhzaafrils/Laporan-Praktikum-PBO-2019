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
public class Loket1841720123Zaafril {
    private int nomorLoket;
    private Pegawai1841720123Zaafril pegawai;
    
    Loket1841720123Zaafril(int nomorLoket){
        this.nomorLoket = nomorLoket;
    }
    
    public void setNomorLoketZaafril(int nomorLoket){
       this.nomorLoket = nomorLoket;
    }
    
    public int geNomorLoket(){
        return nomorLoket;
    }
    
    public void setPegawaiZaafril(Pegawai1841720123Zaafril p){
        pegawai = p;
    }
    
    public Pegawai1841720123Zaafril getPegawaiZaafril(){
        return pegawai;
    }
    
    public void infoZaafril(){
        System.out.println("Nomor Loket : "+ this.nomorLoket);
        System.out.println("Pegawai     : "+ pegawai.infoZaafril());
        
    }
}
