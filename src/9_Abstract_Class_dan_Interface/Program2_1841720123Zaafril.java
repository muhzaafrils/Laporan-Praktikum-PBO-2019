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
public class Program2_1841720123Zaafril {
    public static void main(String[] args){
        Rektor1841720123Zaafril pakRektor = new Rektor1841720123Zaafril();
        
        Mahasiswa1841720123Zaafril mahasiswaBiasa = new Mahasiswa1841720123Zaafril("Charlie");
        Sarjana1841720123Zaafril sarjanaCumlaude = new Sarjana1841720123Zaafril("Dini");
        PascaSarjana1841720123Zaafril masterCumlaude = new PascaSarjana1841720123Zaafril("Elok");
        
        //pakRektor.beriSertifikatCumlaude(mahasiswaBiasa);
        //pakRektor.beriSertifikatCumlaude(sarjanaCumlaude);
        //pakRektor.beriSertifikatCumlaude(masterCumlaude);
   
        //pakRektor.beriSertifikatMawapres(sarjanaCumlaude);
        pakRektor.beriSertifikatMawapres(masterCumlaude);
    }
}
