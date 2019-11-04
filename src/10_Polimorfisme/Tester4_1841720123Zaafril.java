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
public class Tester4_1841720123Zaafril {
    public static void main(String[] args) {
        Owner1841720123Zaafril ow =new Owner1841720123Zaafril();
        ElectricityBill1841720123Zaafril eBill = new ElectricityBill1841720123Zaafril(5, "R-1");
        ow.payZaafril(eBill);
        System.out.println("-----------------------------");
        
        PermanentEmployee1841720123Zaafril pEmp =new PermanentEmployee1841720123Zaafril("Dedik", 500);
        ow.payZaafril(pEmp);
        System.out.println("-----------------------------");
        
        InternshipEmployee1841720123Zaafril iEmp = new InternshipEmployee1841720123Zaafril("Sunarto", 5);
        ow.showMyEmployeeZaafril(pEmp);
        System.out.println("---------------------------------------");
        ow.showMyEmployeeZaafril(iEmp);
    }
}
