/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu9.interfacelatihan;

/**
 *
 * @author WINDOWS 10
 */
public class Rektor1841720123Zaafril {
    public void beriSertifikatCumlaude(ICumlaude1841720123Zaafril Mahasiswa1841720123Zaafril){
        System.out.println("Saya REKTOR, memberikan sertifikat cumlaude.");
        System.out.println("Selamat! silahkan perkenalkan diri Anda..");
        
        Mahasiswa1841720123Zaafril.lulusZaafril();
        Mahasiswa1841720123Zaafril.meraihIPKTinggiZaafril();
        
        System.out.println("--------------------------------------------");
    }
    
    public void beriSertifikatMawapres(IBerprestasi1841720123Zaafril Mahasiswa1841720123Zaafril){
        System.out.println("Saya REKTOR,memberikan sertifikat MAWAPRES");
        System.out.println("Selamat! Bagaimana Anda bisa berprestasi?");
        
        Mahasiswa1841720123Zaafril.menjuaraiKompetisiZaafril();
        Mahasiswa1841720123Zaafril.membuatPublikasiIlmiahZaafril();
        
        System.out.println("---------------------------------------------");
    }
}
