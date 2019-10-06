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
public class StaffHarian1841720123Zaafril extends Staff1841720123Zaafril{
    public int jmlJamKerja;

    public StaffHarian1841720123Zaafril() {
    }

    public StaffHarian1841720123Zaafril(String nama, String alamat, String jk, int umur, 
            int gaji, int lembur, int potongan, int jmlJamKerja) {
        super(nama, alamat, jk, umur, gaji, lembur, potongan);
        this.jmlJamKerja = jmlJamKerja;
    }
    
    public void tampilDataStaffHarianZaafril(){
        System.out.println("====================Data Staff Harian=====================");
        super.tampilDataStaffZaafril();
        System.out.println("Jumlah Jam Kerja    = " + jmlJamKerja);
        System.out.println("Gaji Bersih     = " + (gaji*jmlJamKerja+lembur-potongan));
    }
}
