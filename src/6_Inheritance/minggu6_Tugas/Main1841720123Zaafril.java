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
public class Main1841720123Zaafril {
    public static void main(String[] args){
        Mac1841720123Zaafril mac = new Mac1841720123Zaafril("Smadav", "Li-On", "Apple", 2000, 4000, "A10");
        System.out.println("==============================Apple MacBook=================================");
        mac.tampilDataMacZaafril();
        System.out.println("============================================================================");
        
        System.out.println("==============================Micrososoft Windows===========================");
        Windows1841720123Zaafril windows = new Windows1841720123Zaafril(14, "Li-On", "Microsoft", 2500, 8000, "i7");
        windows.tampilDataWindowsZaafril();
        System.out.println("============================================================================");
        
        System.out.println("==============================ASUS PC=======================================");
        Pc1841720123Zaafril pc = new Pc1841720123Zaafril(21, "ASUS", 3000, 16000, "i7");
        pc.tampilDataPcZaafril();
        System.out.println("============================================================================");
    }
}
