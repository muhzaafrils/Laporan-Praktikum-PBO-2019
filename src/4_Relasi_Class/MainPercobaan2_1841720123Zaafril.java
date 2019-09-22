/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu4_p2;

/**
 *
 * @author WINDOWS 10
 */
public class MainPercobaan2_1841720123Zaafril {
    public static void main(String[] args){
        
        Mobil1841720123Zaafril m = new Mobil1841720123Zaafril();
        m.setMerkZaafril("Avanza");
        m.setBiayaZaafril(350000);
        Sopir1841720123Zaafril s = new Sopir1841720123Zaafril();
        s.setNamaZaafril("John Doe");
        s.setBiayaZaafril(200000);
        Pelanggan1841720123Zaafril p = new Pelanggan1841720123Zaafril();
        p.setMobilZaafril(m);
        p.setSopirZaafril(s);
        p.setHariZaafril(2);
        System.out.println("Biaya Total = " + p.hitungBiayaTotalZaafril());
    }
}
