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
public class Laptop1841720123Zaafril {
    private String merk;
    private Processor1841720123Zaafril proc;

    public Laptop1841720123Zaafril() {
    }
    
    Laptop1841720123Zaafril(String merk, Processor1841720123Zaafril proc){
        this.merk = merk;
        this.proc = proc;
    }
    
    public void setMerkZaafril(String merk){
        this.merk = merk;
    }
    
    public void setProcZaafril(Processor1841720123Zaafril proc) {
        this.proc = proc;
    }

    public String getMerkZaafril(){
        return merk;
    }
    
    public Processor1841720123Zaafril getProcZaafril() {
        return proc;
    }
    
    public void infoZaafril(){
        System.out.println("Merk Laptop = " + merk);
        proc.infoZaafril();
    }
}

