public class Keyboard1841720123Zaafril {
    private String merek;
    private String warna;
    private int luas;
    private int ketebalan;
    private String bahan;
    
    public void setMerekZaafril(String mrk){
        merek = mrk;
    }
    
    public void setWarnaZaafril(String wrn){
        warna = wrn;
    }
    
    public void setLuasZaafril(int p, int l){
        luas = p*l;
    }
    
    public void setKetebalanZaafril(int ktb){
        ketebalan = ktb;
    }
    
    public void setBahanZaafril(String bhn){
        bahan = bhn;
    }
    
    public void cetakStatusZaafril(){
        System.out.println("Merek: "+merek);
        System.out.println("Warna: "+warna);
        System.out.println("Luas(cm): "+luas);
        System.out.println("Ketebalan(cm): "+ketebalan);
        System.out.println("Bahan: "+bahan);
    }
}

    

