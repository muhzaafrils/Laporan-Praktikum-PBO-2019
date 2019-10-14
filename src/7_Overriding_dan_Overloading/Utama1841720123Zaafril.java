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
public class Utama1841720123Zaafril {
    public static void main(String []args){
        System.out.println("Program Testing Class Manager & Staff");
        Manager1841720123Zaafril man[] = new Manager1841720123Zaafril[2];
        Staff1841720123Zaafril staff1[] = new Staff1841720123Zaafril[2];
        Staff1841720123Zaafril staff2[] = new Staff1841720123Zaafril[3];
        
        man[0] = new Manager1841720123Zaafril();
        man[0].setNamaZaafril("Tedjo");
        man[0].setNipZaafril("101");
        man[0].setGolonganZaafril("1");
        man[0].setTunjanganZaafril(5000000);
        man[0].setBagianZaafril("Administrasi");
        
        man[1] = new Manager1841720123Zaafril();
        man[1].setNamaZaafril("Atika");
        man[1].setNipZaafril("102");
        man[1].setGolonganZaafril("1");
        man[1].setTunjanganZaafril(2500000);
        man[1].setBagianZaafril("Pemasaran");
        
        staff1[0] = new Staff1841720123Zaafril();
        staff1[0].setNamaZaafril("Usman");
        staff1[0].setNipZaafril("0003");
        staff1[0].setGolonganZaafril("2");
        staff1[0].setLemburZaafril(10);
        staff1[0].setGajiLemburZaafril(10000);
        
        staff1[1] = new Staff1841720123Zaafril();
        staff1[1].setNamaZaafril("Anugrah");
        staff1[1].setNipZaafril("0005");
        staff1[1].setGolonganZaafril("2");
        staff1[1].setLemburZaafril(10);
        staff1[1].setGajiLemburZaafril(55000);
        man[0].setStaff(staff1);
        
        staff2[0] = new Staff1841720123Zaafril();
        staff2[0].setNamaZaafril("Hendra");
        staff2[0].setNipZaafril("0004");
        staff2[0].setGolonganZaafril("3");
        staff2[0].setLemburZaafril(15);
        staff2[0].setGajiLemburZaafril(5500);
        
        staff2[1] = new Staff1841720123Zaafril();
        staff2[1].setNamaZaafril("Arie");
        staff2[1].setNipZaafril("0006");
        staff2[1].setGolonganZaafril("4");
        staff2[1].setLemburZaafril(5);
        staff2[1].setGajiLemburZaafril(100000);
        
        staff2[2] = new Staff1841720123Zaafril();
        staff2[2].setNamaZaafril("Mentari");
        staff2[2].setNipZaafril("0007");
        staff2[2].setGolonganZaafril("3");
        staff2[2].setLemburZaafril(6);
        staff2[2].setGajiLemburZaafril(20000);
        man[1].setStaff(staff2);
        
        man[0].lihatInfoZaafril();
        man[1].lihatInfoZaafril();
    }
}
