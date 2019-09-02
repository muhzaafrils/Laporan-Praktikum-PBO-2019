public class SepedaGunung1841720123Zaafril extends Sepeda1841720123Zaafril{
    private String tipeSuspensi;
    
    public void setTipeSuspensiZaafril(String newValue){
        tipeSuspensi = newValue;
    }
    
    public void cetakStatusZaafril(){
        super.cetakStatusZaafril();
        System.out.println("Tipe suspensi: "+tipeSuspensi);
    }
}
