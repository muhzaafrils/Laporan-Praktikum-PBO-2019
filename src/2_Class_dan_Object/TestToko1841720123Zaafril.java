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
public class TestToko1841720123Zaafril {
    public static void main(String[] args){
        
        Toko1841720123Zaafril tk1 = new Toko1841720123Zaafril();
        Toko1841720123Zaafril tk2 = new Toko1841720123Zaafril();
        
        tk1.id = "1841720123";
        tk1.nm = "Muhammad Zaafril Sodik";
        tk1.ng = "HarvestMoon Back to Nature";
        tk1.hs = 50000;
        tk1.ls = 3;
        tk1.peminjamanZaafril();
        tk1.tampilanPeminjamanZaafril();
        tk2.id = "1841720124";
        tk2.nm = "Muhammad Zamzami";
        tk2.ng = "Point Blank";     
        tk2.hs = 20000;
        tk2.ls = 2;
        tk2.peminjamanZaafril();
        tk2.tampilanPeminjamanZaafril();
    }
    
}
