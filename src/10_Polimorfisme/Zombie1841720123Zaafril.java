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
abstract public class Zombie1841720123Zaafril implements Destroyable1841720123Zaafril{
    protected int health, level;
    
    abstract public void healZaafril();
    
    @Override
    abstract public void destroyedZaafril();
    public String getZombieInfoZaafril() {
        return "Health = " + this.health + "\n"
        + "Level = " + this.level + "\n";
    };
}
