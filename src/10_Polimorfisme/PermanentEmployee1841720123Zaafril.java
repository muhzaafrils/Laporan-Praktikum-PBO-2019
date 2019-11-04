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
public class PermanentEmployee1841720123Zaafril extends Employee1841720123Zaafril implements Payable1841720123Zaafril {
    private int salary;

    public PermanentEmployee1841720123Zaafril(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public int getSalaryZaafril() {
        return salary;
    }

    public void setSalaryZaafril(int salary) {
        this.salary = salary;
    }
    
    @Override
    public int getPaymentAmountZaafril() {
        return (int) (salary+0.05*salary); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String getEmployeeInfoZaafril(){
        String info = super.getEmployeeInfoZaafril()+"\n";
        info += "Registered as permanent employee with salary "+salary+"\n";
        return info;
    }
}
