/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittest.database;

import java.util.ArrayList;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author WINDOWS10
 */
public class KategoriTest1841720123Zaafril extends TestCase{
    
    Kategori1841720123Zaafril instance;
    
    public KategoriTest1841720123Zaafril() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new Kategori1841720123Zaafril("Comics", "Comic is combination words and pictures");
        System.out.format("Start Testing : %s \n", this.getName());
    }
    
    @After
    public void tearDown() {
        System.out.format("Finish Test %s\n", this.getName());
    }
//
//    @Test
//    public void testGetIdkategori() {
//        System.out.println("getIdkategori");
//        Kategori1841720123Zaafril instance = new Kategori1841720123Zaafril();
//        int expResult = 0;
//        int result = instance.getIdkategori();
//        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
//    }
//
//    @Test
//    public void testSetIdkategori() {
//        System.out.println("setIdkategori");
//        int idkategori = 0;
//        Kategori1841720123Zaafril instance = new Kategori1841720123Zaafril();
//        instance.setIdkategori(idkategori);
//        fail("The test case is a prototype.");
//    }
//
//    @Test
//    public void testGetNama() {
//        System.out.println("getNama");
//        Kategori1841720123Zaafril instance = new Kategori1841720123Zaafril();
//        String expResult = "";
//        String result = instance.getNama();
//        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
//    }
//
//    @Test
//    public void testSetNama() {
//        System.out.println("setNama");
//        String nama = "";
//        Kategori1841720123Zaafril instance = new Kategori1841720123Zaafril();
//        instance.setNama(nama);
//        fail("The test case is a prototype.");
//    }
//
//    @Test
//    public void testGetKeterangan() {
//        System.out.println("getKeterangan");
//        Kategori1841720123Zaafril instance = new Kategori1841720123Zaafril();
//        String expResult = "";
//        String result = instance.getKeterangan();
//        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
//    }
//
//    @Test
//    public void testSetKeterangan() {
//        System.out.println("setKeterangan");
//        String keterangan = "";
//        Kategori1841720123Zaafril instance = new Kategori1841720123Zaafril();
//        instance.setKeterangan(keterangan);
//        fail("The test case is a prototype.");
//    }
//
//    @Test
//    public void testGetById() {
//        System.out.println("getById");
//        int id = 0;
//        Kategori1841720123Zaafril instance = new Kategori1841720123Zaafril();
//        Kategori1841720123Zaafril expResult = null;
//        Kategori1841720123Zaafril result = instance.getById(id);
//        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
//    }
//
//    @Test
//    public void testGetAll() {
//        System.out.println("getAll");
//        Kategori1841720123Zaafril instance = new Kategori1841720123Zaafril();
//        ArrayList<Kategori> expResult = null;
//        ArrayList<Kategori> result = instance.getAll();
//        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
//    }

    @Test
    public void testSearch() {
        System.out.println("search test");
        String keyword = "Comics";
        ArrayList<Kategori1841720123Zaafril> result = instance.search(keyword);
        ArrayList<Kategori1841720123Zaafril> expResult = instance.getByNamaAndKeterangan(keyword, "");
        assertEquals(expResult.size(), result.size());
//        Kategori1841720123Zaafril instance = new Kategori1841720123Zaafril();
//        ArrayList<Kategori> expResult = null;
//        ArrayList<Kategori> result = instance.search(keyword);
//        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
    }

    @Test
    public void testSave() {
        System.out.println("save test");
        this.instance.save();
        ArrayList<Kategori1841720123Zaafril> expResult = instance.getByNamaAndKeterangan(instance.getNama(), instance.getKeterangan());
        assertTrue(expResult.size()>0);
//        Kategori1841720123Zaafril instance = new Kategori1841720123Zaafril();
//        instance.save();
//        fail("The test case is a prototype.");
    }

//    @Test
//    public void testDelete() {
//        System.out.println("delete");
//        Kategori1841720123Zaafril instance = new Kategori1841720123Zaafril();
//        instance.delete();
//        fail("The test case is a prototype.");
//    }
//
//    @Test
//    public void testToString() {
//        System.out.println("toString");
//        Kategori1841720123Zaafril instance = new Kategori1841720123Zaafril();
//        String expResult = "";
//        String result = instance.toString();
//        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
//    }
//    
}
