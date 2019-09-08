/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu2;

/**
 *
 * @author WINDOWS 10
 */
public class Lingkaran1841720123Zaafril {
    
    public double phi;
    public double r;
    public double luas;
    public double keliling;
    
    public double hitungLuasZaafril(){
        phi = 3.14;
        luas = phi*r*r;
        return 0;
    }
    
    public double hitungKelilingZaafril(){
        phi = 3.14;
        keliling = phi*2*r;
        return 0;
    }  
    
    public void cetakStatusZaafril(){
        System.out.println("Jari-jari Lingkaran : "+r);
        System.out.println("Luas Lingkaran      : "+luas);
        System.out.println("Keliling Lingkaran  : "+keliling);
    }
}
