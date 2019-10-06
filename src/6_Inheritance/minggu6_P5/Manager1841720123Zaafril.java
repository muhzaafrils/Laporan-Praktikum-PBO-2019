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
public class Manager1841720123Zaafril extends Karyawan1841720123Zaafril{
    public int tunjangan;
    
    public Manager1841720123Zaafril(){  
    }
    
    public void tampilDataManagerZaafril(){
        super.tampilDataKaryawanZaafril();
        System.out.println("Tunjangan           = " + tunjangan);
        System.out.println("Total Gaji          = " + (super.gaji + tunjangan));
    }
}
