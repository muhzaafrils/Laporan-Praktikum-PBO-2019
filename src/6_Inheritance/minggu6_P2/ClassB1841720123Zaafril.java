/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu6_P2;

/**
 *
 * @author WINDOWS 10
 */
public class ClassB1841720123Zaafril extends ClassA1841720123Zaafril{
    private int z;
    
    public void setZZaafril(int z){
        this.z = z;
    }

    public int getZZaafril() {
        return z;
    }
    
    public void getNilaiZZaafril(){
        System.out.println("nilai Z : " + z );
    }
    
    public void getJumlahZaafril(){
        System.out.println("jumlah : " + (getXZaafril()+getYZaafril()+z));
    }
}
