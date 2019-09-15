/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package motorencapsulation;

/**
 *
 * @author WINDOWS 10
 */
public class Motor1841720123Zaafril {
    private int kecepatan = 0;
    private boolean kontak0n = false;
    
    
    public void nyalakanMesinZaafril(){
        kontak0n = true;
    }
    
    public void matikanMesinZaafril(){
        kontak0n = false;
        kecepatan = 0;
    }
    
    public void tambahKecepatanZaafril(){
        if(kontak0n == true){
            if(kecepatan >= 100){
                kecepatan = 100;
            }else{
                kecepatan += 5;
            }
        }
        else{
            System.out.println("Kecepatan tidak bisa bertambah karena Mesin 0ff! \n");
        }
    }
    
    public void kurangiKecepatanZaafril(){
        if(kontak0n == true){
            kecepatan -= 5;
        }
        else{
            System.out.println("Kecepatan tidak bisa berkurang karena Mesin 0ff! \n");
        }
    }
    public void printStatusZaafril(){
        if(kontak0n == true){
            System.out.println("Kontak 0n");
        }
        else{
            System.out.println("Kontak 0ff");   
        }
        System.out.println("Kecepatan " + kecepatan + "\n");
    }
    
}
