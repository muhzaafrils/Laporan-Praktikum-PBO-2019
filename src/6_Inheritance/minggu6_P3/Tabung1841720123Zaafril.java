/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu6_P3;

/**
 *
 * @author WINDOWS 10
 */
public class Tabung1841720123Zaafril extends Bangun1841720123Zaafril {
    protected int t;
    
    public void setSuperPhiZaafril(double phi){
        super.phi = phi;
    }
    
    public void setSuperRZaafril(int r){
        super.r = r;
    }
    
    public void setTZaafril(int t){
        this.t = t;
    }
    
    public void volumeZaafril(){
        System.out.println("Volume Tabung adalah : " + (super.phi*super.r*super.r*this.t));
    }
}
