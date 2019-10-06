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
public class Staff1841720123Zaafril extends Karyawan1841720123Zaafril{
    public int lembur, potongan;
    
    public Staff1841720123Zaafril() {
    }

    public Staff1841720123Zaafril(String nama, String alamat, String jk, int umur, int gaji, int lembur, int potongan) {
        super(nama, alamat, jk, umur, gaji);
        this.lembur = lembur;
        this.potongan = potongan;
    }
    
    public void tampilDataStaffZaafril(){
        super.tampilDataKaryawanZaafril();
        System.out.println("Lembur              = " + lembur);
        System.out.println("Potongan            = " + potongan);
        System.out.println("Total Gaji          = " + (gaji + lembur-potongan));
    }
}
