/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu3;

/**
 *
 * @author WINDOWS 10
 */
public class EncapDemo1841720123Zaafril {
    private String name;
    private int age;
   
    public String getNameZaafril(){
       return name;
    }
    
    public void setNameZaafril(String newName){
        name = newName;
    }
    
    public int getAgeZaafril(){
        return age;
    }
    
    public void setAgeZaafril(int newAge){
        if(newAge > 30){
            age = 30;
        }
        else if(newAge < 18){
            age = 18;
        }
        else{
            age = newAge;
        }
    }
}
