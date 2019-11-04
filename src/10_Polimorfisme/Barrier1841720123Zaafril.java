/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu10;

/**
 *
 * @author WINDOWS 10
 */
public class Barrier1841720123Zaafril implements Destroyable1841720123Zaafril{
    private int strength;

    public Barrier1841720123Zaafril(int strength) {
        this.strength = strength;
    }

    public void setStrengthZaafril(int strength) {
        this.strength = strength;
    }

    public int getStrengthZaafril() {
        return strength;
    }

    @Override
    public void destroyedZaafril() {
        this.strength -= (0.1 * this.strength);
    }
    
    public String getBarrierInfoZaafril() {
        return "Barrier Strength = " + this.strength;
    }
    
}
