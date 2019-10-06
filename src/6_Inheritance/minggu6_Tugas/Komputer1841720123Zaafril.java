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
public class Komputer1841720123Zaafril {
    public String merk;
    public int kecProcessor;
    public int sizeMemory;
    public String jnsProcessor;

    public Komputer1841720123Zaafril() {
    }

    public Komputer1841720123Zaafril(String merk, int kecProcessor, int sizeMemory, String jnsProcessor) {
        this.merk = merk;
        this.kecProcessor = kecProcessor;
        this.sizeMemory = sizeMemory;
        this.jnsProcessor = jnsProcessor;
    }
    
    public void tampilDataKomputerZaafril(){
        System.out.println("Merk                = " + merk);
        System.out.println("Kecepatan Processor = " + kecProcessor);
        System.out.println("Size Memory         = " + sizeMemory);
        System.out.println("Jenis Processor     = " + jnsProcessor);
    }    
}
