/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu4;

/**
 *
 * @author WINDOWS 10
 */
public class MainPercobaan5_1841720123Zaafril {
     public static void main(String[] args) {
        Pegawai1841720123Zaafril p1 = new Pegawai1841720123Zaafril ("1841720124", "Browden");
        Loket1841720123Zaafril l1 = new Loket1841720123Zaafril(5);
        Pelanggan1841720123Zaafril pl = new Pelanggan1841720123Zaafril ("Zaafril", "Pretty Boys", 18);
        Tiket1841720123Zaafril t1 = new Tiket1841720123Zaafril(1841720123, 3, 30000);
        
        System.out.println("===============================");
        l1.setPegawaiZaafril(p1);
        t1.setPelangganZaafril(pl);
        l1.infoZaafril();
        System.out.println("===============================");
        t1.infoZaafril();
    }
}

