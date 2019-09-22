/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu4_p1;

/**
 *
 * @author WINDOWS 10
 */
public class Processor1841720123Zaafril {
    private String merk;
    private double cache;

    public Processor1841720123Zaafril() {
    }
    
    Processor1841720123Zaafril(String merk, double cache){
        this.merk = merk;
        this.cache = cache;
    }
    
    public void setMerkZaafril(String merk){
        this.merk = merk;
    }
    
    public void setCacheZaafril(double cache){
        this.cache = cache;
    }
    
    public String getMerkZaafril(){
        return merk;
    }
    
    public double getCacheZaafril(){
        return cache;
    }
    
    public void infoZaafril(){
        System.out.printf("Merk Processor = %s\n", merk);
        System.out.printf("Cache Memory = %.2f\n", cache);
    }
}
