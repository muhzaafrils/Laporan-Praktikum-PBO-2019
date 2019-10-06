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
public class StaffTetap1841720123Zaafril extends Staff1841720123Zaafril{
    public String golongan;
    public int asuransi;

    public StaffTetap1841720123Zaafril() {
    }

    public StaffTetap1841720123Zaafril(String nama, String alamat, String jk, int umur,
            int gaji, int lembur, int potongan, String golongan, int asuransi) {
        super(nama, alamat, jk, umur, gaji, potongan, lembur);
        this.golongan = golongan;
        this.asuransi = asuransi;
    }
    
    public void tampilDataStaffTetapZaafril(){
        System.out.println("====================Data Staff Tetap=====================");
        super.tampilDataStaffZaafril();
        System.out.println("Golongan        = " + golongan);
        System.out.println("Jumlah Asuransi = " + asuransi);
        System.out.println("Gaji Bersih     = " + (gaji + lembur-potongan-asuransi));
    }
}
