/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;

import backend.Anggota1841720123Zaafril;

/**
 *
 * @author WINDOWS 10
 */
public class TestBackendAnggota1841720123Zaafril {
    public static void main(String[] args) {
        Anggota1841720123Zaafril agt1 = new Anggota1841720123Zaafril("Hunayn", "Sidaorjo", "123");
        Anggota1841720123Zaafril agt2 = new Anggota1841720123Zaafril("Ardan", "Bojonegoro", "456");
        Anggota1841720123Zaafril agt3 = new Anggota1841720123Zaafril("Dina", "Malang", "789");
        
        //test insert
        agt1.save();
        agt2.save();
        agt3.save();
        
        //test update
        agt2.setAlamat("Jawa Timur");
        agt2.save();
        
        //test delete
        agt3.delete();
        
        //tes select all
        for(Anggota1841720123Zaafril k : new Anggota1841720123Zaafril().getAll()){
            System.out.println("Nama: " + k.getNama() + ", Alamat : " + k.getAlamat() + ", Telepon : " + k.getTelepon());
        }
        
        //test search
        for(Anggota1841720123Zaafril a : new Anggota1841720123Zaafril().search("Timur")){
            System.out.println("Nama: " + a.getNama() + ", Alamat : " + a.getAlamat() + ", Telepon : " + a.getTelepon());
        }
    }
}
