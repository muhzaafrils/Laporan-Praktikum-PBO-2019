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
public class Pc1841720123Zaafril extends Komputer1841720123Zaafril{
    public int ukuranMonitor;

    public Pc1841720123Zaafril(int ukuranMonitor) {
        this.ukuranMonitor = ukuranMonitor;
    }

    public Pc1841720123Zaafril(int ukuranMonitor, String merk, int kecProcessor, int sizeMemory, String jnsProcessor) {
        super(merk, kecProcessor, sizeMemory, jnsProcessor);
        this.ukuranMonitor = ukuranMonitor;
    }
    
    public void tampilDataPcZaafril(){
        super.tampilDataKomputerZaafril();
        System.out.println("Ukuran Monitor      = " + ukuranMonitor);
    }
}
