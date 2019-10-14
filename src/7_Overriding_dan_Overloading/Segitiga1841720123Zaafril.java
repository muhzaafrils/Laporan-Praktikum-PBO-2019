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
public class Segitiga1841720123Zaafril {
    int sudut;
    
    public int totalSudutZaafril(int sudutA){
        return sudut = 180 - sudutA;
    }
    
    public int totalSudutZaafril(int sudutA, int sudutB){
        return sudut = 180 - (sudutA + sudutB);
    }
    
    public int kelilingZaafril(int sisiA, int sisiB, int sisiC){
        int keliling = sisiA  + sisiB + sisiC;
        return keliling;
    }
    
    public double kelilingZaafril(int sisiA, int sisiB){
        double c = Math.sqrt(Math.pow(sisiA, 2))+ (Math.pow(sisiB, 2));
        return c;
    }
    
    public static void main(String[] args) {
        Segitiga1841720123Zaafril segitiga = new Segitiga1841720123Zaafril();
        
        System.out.println(segitiga.totalSudutZaafril(45));
        System.out.println(segitiga.totalSudutZaafril(45, 15));
        System.out.println(segitiga.kelilingZaafril(10, 20, 30));
        System.out.println(segitiga.kelilingZaafril(2, 3));
    }
}
