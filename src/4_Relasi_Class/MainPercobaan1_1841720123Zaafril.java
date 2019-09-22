/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu4_p1;

/**
 *
 * @author WINDOWS 10
 */
public class MainPercobaan1_1841720123Zaafril {
    public static void main(String[] args){
    Processor1841720123Zaafril p = new Processor1841720123Zaafril("Intel i5", 3);
    Laptop1841720123Zaafril L = new Laptop1841720123Zaafril("Thinkpad", p);
    
    L.infoZaafril();
    
    Processor1841720123Zaafril p1 = new Processor1841720123Zaafril();
    p1.setMerkZaafril("Intel i5");
    p1.setCacheZaafril(4);
    Laptop1841720123Zaafril L1 = new Laptop1841720123Zaafril();
    L1.setMerkZaafril("Thinkpad");
    L1.setProcZaafril(p1);
    L1.infoZaafril();
    }  
}
