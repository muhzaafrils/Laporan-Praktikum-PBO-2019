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
public class Staff1841720123Zaafril extends Karyawan1841720123Zaafril{
    private int lembur;
    private double gajiLembur;

    public int getLemburZaafril() {
        return lembur;
    }

    public void setLemburZaafril(int lembur) {
        this.lembur = lembur;
    }

    public double getGajiLemburZaafril() {
        return gajiLembur;
    }

    public void setGajiLemburZaafril(double gajiLembur) {
        this.gajiLembur = gajiLembur;
    }
    
    public double getGajiZaafril(int lembur, double gajiLembur){
        return super.getGajiZaafril()+lembur*gajiLembur;
    }
    
    public double getGajiZaafril(){
        return super.getGajiZaafril()+lembur*gajiLembur;
    }
    
    public void lihatInfoZaafril(){
        System.out.println("NIP                 : " + this.getNipZaafril());
        System.out.println("Nama                : " + this.getNamaZaafril());
        System.out.println("Golongan            : " + this.getGolonganZaafril());
        System.out.println("Jml Lembur          : " + this.getLemburZaafril());
        System.out.printf("Gaji Lembur          :%.0f\n ", this.getGajiLemburZaafril());
        System.out.printf("Gaji                 :%.0f\n ", this.getGajiZaafril());
    }    
}
