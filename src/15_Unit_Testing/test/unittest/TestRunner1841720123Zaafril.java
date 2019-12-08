/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittest;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import unittest.database.KategoriTest1841720123Zaafril;

/**
 *
 * @author WINDOWS10
 */
public class TestRunner1841720123Zaafril {
    
    public static void main(String[] args){
        Result mr = new JUnitCore().runClasses(MessageProcessorTest1841720123Zaafril.class);
        showMessageResult(mr, MessageProcessorTest1841720123Zaafril.class.getSimpleName());
        
        mr = new JUnitCore().runClasses(KategoriTest1841720123Zaafril.class);
        showMessageResult(mr, KategoriTest1841720123Zaafril.class.getSimpleName());
    }
    
    private static void showMessageResult(Result mr, String className) {
        if (mr.wasSuccessful()) {
            System.out.format("The Result Test from %s : %s\n", className, mr.wasSuccessful());
        } else {
            for (Failure failure : mr.getFailures()) {
                System.out.println(failure);
            }
        }
    }
}
