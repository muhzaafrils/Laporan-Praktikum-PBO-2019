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
public class Inheritance1_1841720123Zaafril {
    public static void main(String[] args){
        
        Manager1841720123Zaafril M = new Manager1841720123Zaafril();
        M.nama="Vivin";
        M.alamat="Jl. Vinolia";
        M.umur=25;
        M.jk="Perempuan";
        M.gaji=3000000;
        M.tunjangan=1000000;
        M.tampilDataManagerZaafril();
        
        Staff1841720123Zaafril S = new Staff1841720123Zaafril();
        S.nama="Lestari";
        S.alamat="Malang";
        S.umur=25;
        S.jk="Perempuan";
        S.gaji=2000000;
        S.lembur=500000;
        S.potongan=250000;
        S.tampilDataStaffZaafril();
    }
}
