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
public class Tester3_1841720123Zaafril {
    public static void main(String[] args) {
        PermanentEmployee1841720123Zaafril pEmp =new PermanentEmployee1841720123Zaafril("Dedik", 500);
        InternshipEmployee1841720123Zaafril iEmp = new InternshipEmployee1841720123Zaafril("Sunarto", 5);
        ElectricityBill1841720123Zaafril eBill = new ElectricityBill1841720123Zaafril(5, "A-1");
        Employee1841720123Zaafril e[] = {pEmp,iEmp};
        Payable1841720123Zaafril p[] = {pEmp,eBill};
        Employee1841720123Zaafril e2[] = {pEmp, iEmp};
    }
}
