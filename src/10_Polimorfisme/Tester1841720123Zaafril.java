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
public class Tester1841720123Zaafril {
    public static void main(String[] args) {
        WalkingZombie1841720123Zaafril wz = new WalkingZombie1841720123Zaafril(100, 1);
        JumpingZombie1841720123Zaafril jz = new JumpingZombie1841720123Zaafril(100, 2);
        Barrier1841720123Zaafril b = new Barrier1841720123Zaafril(100);
        Plant1841720123Zaafril p = new Plant1841720123Zaafril();
        System.out.println(""+wz.getZombieInfoZaafril());
        System.out.println(""+jz.getZombieInfoZaafril());
        System.out.println(""+b.getBarrierInfoZaafril());
        System.out.println("---------------------");
        for (int i = 0; i < 4; i++) {
            p.doDestroyZaafril(wz);
            p.doDestroyZaafril(jz);
            p.doDestroyZaafril(b);
        }
        System.out.println(""+wz.getZombieInfoZaafril());
        System.out.println(""+jz.getZombieInfoZaafril());
        System.out.println(""+b.getBarrierInfoZaafril());
    }
}
