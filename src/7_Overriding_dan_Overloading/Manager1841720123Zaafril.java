/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu7;

/**
 *
 * @author WINDOWS 10
 */
public class Manager1841720123Zaafril extends Karyawan1841720123Zaafril{
    private double tunjangan;
    private String bagian;
    private Staff1841720123Zaafril st[];

    public double getTunjanganZaafril() {
        return tunjangan;
    }

    public void setTunjanganZaafril(double tunjangan) {
        this.tunjangan = tunjangan;
    }

    public String getBagianZaafril() {
        return bagian;
    }

    public void setBagianZaafril(String bagian) {
        this.bagian = bagian;
    }

    public void setStaff(Staff1841720123Zaafril[] st) {
        this.st = st;
    }
    
    public void viewStaffZaafril() {
        int i;
        System.out.println("---------------------");
        for(i=0; i<st.length; i++){
            st[i].lihatInfoZaafril();
        }
        System.out.println("---------------------");
    }
    
    public void lihatInfoZaafril(){
        System.out.println("Manager             : " + this.getBagianZaafril());
        System.out.println("NIP                 : " + this.getNipZaafril());
        System.out.println("Nama                : " + this.getNamaZaafril());
        System.out.println("Golongan            : " + this.getGolonganZaafril());
        System.out.printf("Tunjangan            :%.0f\n ", this.getTunjanganZaafril());
        System.out.printf("Gaji                 :%.0f\n ", this.getGajiZaafril());
        System.out.println("Bagian              : " + this.getBagianZaafril());
        this.viewStaffZaafril();
    }    
    
    public double getGajiZaafril(){
        return super.getGajiZaafril()+tunjangan;
    }
}
