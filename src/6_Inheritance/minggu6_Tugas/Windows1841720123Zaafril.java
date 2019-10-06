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
public class Windows1841720123Zaafril extends Laptop1841720123Zaafril{
    public int ukuranMonitor;

    public Windows1841720123Zaafril() {
    }

    public Windows1841720123Zaafril(int ukuranMonitor, String jnsBatrei, String merk, int kecProcessor, int sizeMemory, String jnsProcessor) {
        super(jnsBatrei, merk, kecProcessor, sizeMemory, jnsProcessor);
        this.ukuranMonitor = ukuranMonitor;
    }
    
    public void tampilDataWindowsZaafril(){
        super.tampilDataLaptopZaafril();
        System.out.println("Ukuran Monitor      = " + ukuranMonitor);
    }
}
