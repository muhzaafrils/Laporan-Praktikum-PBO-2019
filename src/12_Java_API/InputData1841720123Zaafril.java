/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu12.percobaan4;

/**
 *
 * @author WINDOWS 10
 */
import java.util.ArrayList;

public class InputData1841720123Zaafril {
    ArrayList<Mahasiswa1841720123Zaafril> ListMahasiswa;
    
    public InputData1841720123Zaafril(){
        ListMahasiswa = new ArrayList();
    }
    
    public void isiDataZaafril(String Nim, String Nama, String Alamat){
        Mahasiswa1841720123Zaafril mhs = new Mahasiswa1841720123Zaafril(Nim, Nama, Alamat);
        ListMahasiswa.add(mhs);
    }
    
    public ArrayList<Mahasiswa1841720123Zaafril> getDataZaafril(){
        return ListMahasiswa;
    }
}
