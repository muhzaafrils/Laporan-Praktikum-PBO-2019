/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu6_P5;

/**
 *
 * @author WINDOWS 10
 */
public class Inheritance2_1841720123Zaafril {
    public static void main(String[] args){
        StaffTetap1841720123Zaafril ST = new StaffTetap1841720123Zaafril("Budi", "Malang", "Lakilaki", 20, 2000000, 250000, 200000, "2A", 100000);
        ST.tampilDataStaffTetapZaafril();
        
        StaffHarian1841720123Zaafril SH = new StaffHarian1841720123Zaafril("Indah", "Malang", "Perempuan", 27, 10000, 100000, 50000, 100);
        SH.tampilDataStaffHarianZaafril();
    }
}
