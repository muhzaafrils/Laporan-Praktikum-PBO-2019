/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operasigettersetter;

/**
 *
 * @author WINDOWS 10
 */
public class KoperasiDemo1841720123Zaafril {
    public static void main(String[] args){
        Anggota1841720123Zaafril anggota1 = new Anggota1841720123Zaafril("Iwan", "Jalan Mawar");
        System.out.println("Simpanan " +anggota1.getNamaZaafril()+ " : Rp " +anggota1.getSimpananZaafril());
        
        anggota1.setNamaZaafril("Iwan Setiawan");
        anggota1.setAlamatZaafril("Jl Soekarno Hatta no 10");
        anggota1.setorZaafril(100000);
        System.out.println("Simpanan " +anggota1.getNamaZaafril()+ " : Rp " +anggota1.getSimpananZaafril());
        
        anggota1.pinjamZaafril(5000);
        System.out.println("Simpanan " +anggota1.getNamaZaafril()+ " : Rp " +anggota1.getSimpananZaafril());
    }
}
