/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu2;

/**
 *
 * @author WINDOWS 10
 */
public class Toko1841720123Zaafril {
    public String id;
    public String nm;
    public String ng;
    public int hs;
    public int ls;
    public int total;
    
    
    public int peminjamanZaafril(){
        total = hs*ls;        
        return 0;
    }
    
    public void tampilanPeminjamanZaafril(){
        System.out.println("-------------------------------");  
        System.out.println("id                  : "+id);  
        System.out.println("Nama Member         : "+nm);
        System.out.println("Nama Game           : "+ng);
        System.out.println("Harga Sewa          : "+hs);
        System.out.println("Lama Sewa perHari   : "+ls);
        System.out.println("Total Harga         : "+total);
        System.out.println("-------------------------------");  
    }
}
