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
public class InternshipEmployee1841720123Zaafril extends Employee1841720123Zaafril {
    private int length;

    public InternshipEmployee1841720123Zaafril(String name, int length) {
        this.length = length;
        this.name = name;
    }

    public int getLengthZaafril() {
        return length;
    }

    public void setLengthZaafril(int length) {
        this.length = length;
    }
    
    @Override
    public String getEmployeeInfoZaafril(){
        String info = super.getEmployeeInfoZaafril()+"\n";
        info += "Registered as intership employee for "+length+" month/s\n";
        return info;
    }
}
