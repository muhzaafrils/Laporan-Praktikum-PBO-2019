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
public class Laptop1841720123Zaafril extends Komputer1841720123Zaafril{
    public String jnsBatrei;

    public Laptop1841720123Zaafril() {
    }

    public Laptop1841720123Zaafril(String jnsBatrei, String merk, int kecProcessor, int sizeMemory, String jnsProcessor) {
        super(merk, kecProcessor, sizeMemory, jnsProcessor);
        this.jnsBatrei = jnsBatrei;
    }

    public void tampilDataLaptopZaafril(){
        super.tampilDataKomputerZaafril();
        System.out.println("Jenis Batrei        = " + jnsBatrei);
    }
    
}
