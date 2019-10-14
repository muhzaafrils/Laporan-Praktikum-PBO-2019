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
class Ikan1841720123Zaafril {
    public void swimZaafril(){
        System.out.println("Ikan bisa berenang");
    }
}
        
class Piranha1841720123Zaafril extends Ikan1841720123Zaafril{
    public void swimZaafril(){
        System.out.println("Piranha bisa makan daging");
    }
}
        
public class Fish1841720123Zaafril{
    public static void main(String[] args){
        Ikan1841720123Zaafril a = new Ikan1841720123Zaafril();
        Ikan1841720123Zaafril b = new Piranha1841720123Zaafril();
        a.swimZaafril();
        b.swimZaafril();
    }
}
