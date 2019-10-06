/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu6_Tugas;

/**
 *
 * @author WINDOWS 10
 */
public class Mac1841720123Zaafril extends Laptop1841720123Zaafril{
    public String security;

    public Mac1841720123Zaafril() {
        
    }

    public Mac1841720123Zaafril(String security, String jnsBatrei, String merk, int kecProcessor, int sizeMemory, String jnsProcessor) {
        super(jnsBatrei, merk, kecProcessor, sizeMemory, jnsProcessor);
        this.security = security;
    }
    
    public void tampilDataMacZaafril(){
        super.tampilDataLaptopZaafril();
        System.out.println("Security            = " + security);
    }
}
