/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu9.interfacelatihan;

/**
 *
 * @author WINDOWS 10
 */
public class Sarjana1841720123Zaafril extends Mahasiswa1841720123Zaafril implements ICumlaude1841720123Zaafril {

    public Sarjana1841720123Zaafril(String nama) {
        super(nama);
    }

    @Override
    public void lulusZaafril() {
        System.out.println("Aku sudah menyelesaikan SKRIPSI"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void meraihIPKTinggiZaafril() {
        System.out.println("IPK-ku lebih dari 3,51"); //To change body of generated methods, choose Tools | Templates.
    }
}

