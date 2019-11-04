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
public class Owner1841720123Zaafril {
    public void payZaafril(Payable1841720123Zaafril p) {
        System.out.println("Total payment = "+p.getPaymentAmountZaafril());
        if(p instanceof ElectricityBill1841720123Zaafril){
            ElectricityBill1841720123Zaafril eb = (ElectricityBill1841720123Zaafril)p;
            System.out.println(""+eb.getBillInfoZaafril());
        }else if(p instanceof PermanentEmployee1841720123Zaafril){
            PermanentEmployee1841720123Zaafril pe = (PermanentEmployee1841720123Zaafril) p;
            pe.getEmployeeInfoZaafril();
            System.out.println(""+pe.getEmployeeInfoZaafril());
        }
    }
    
    public void showMyEmployeeZaafril(Employee1841720123Zaafril e){
        System.out.println(""+e.getEmployeeInfoZaafril());
        if (e instanceof PermanentEmployee1841720123Zaafril) 
            System.out.println("You Have to pay her/him monthly!!!");
        else 
            System.out.println("No need to pay him/her :)");
    }
}
