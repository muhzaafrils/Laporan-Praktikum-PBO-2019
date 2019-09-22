/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu4_p3;

/**
 *
 * @author WINDOWS 10
 */
public class MainPertanyaan1841720123Zaafril {
    public static void main(String[] args){
        Pegawai1841720123Zaafril masinis = new Pegawai1841720123Zaafril("1234", "Spongebob Squarepants");
        Pegawai1841720123Zaafril asisten = new Pegawai1841720123Zaafril("4567", "Patrick Star");
        KeretaApi1841720123Zaafril keretaApi = new KeretaApi1841720123Zaafril("Saya Baru", "Bisnis", masinis, asisten);
        
        System.out.println(keretaApi.infoZaafril());
    }
}
