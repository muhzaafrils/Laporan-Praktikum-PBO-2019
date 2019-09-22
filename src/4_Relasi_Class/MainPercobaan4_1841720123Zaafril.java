/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu4_p4;

/**
 *
 * @author WINDOWS 10
 */
public class MainPercobaan4_1841720123Zaafril {
    public static void main(String[] args){
        Penumpang1841720123Zaafril p = new Penumpang1841720123Zaafril("12345", "Mr. Krab");
        Gerbong1841720123Zaafril gerbong = new Gerbong1841720123Zaafril("A",10);
        gerbong.setPenumpangZaafril(p, 1);
        System.out.println(gerbong.infoZaafril());
        Penumpang1841720123Zaafril budi = new Penumpang1841720123Zaafril("678910", "budi");
        Gerbong1841720123Zaafril gerbong2 = new Gerbong1841720123Zaafril("B",15);
        gerbong.setPenumpangZaafril(budi, 2);
        System.out.println(gerbong.infoZaafril());
    }
}
