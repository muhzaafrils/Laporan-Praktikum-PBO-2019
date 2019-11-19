/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu12.percobaan2;

/**
 *
 * @author WINDOWS 10
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CobaArrayList1841720123Zaafril {
    public static void main(String[] args){
        List mListCountry = new ArrayList();
        mListCountry.add("Indonesia");
        mListCountry.add("Malaysia");
        mListCountry.add("German");
        System.out.println("Country List");
        Iterator mIterator = mListCountry.iterator();
        while(mIterator.hasNext()){
            Object element = mIterator.next();
            System.out.format("%s ",element);
        }
    }
}
