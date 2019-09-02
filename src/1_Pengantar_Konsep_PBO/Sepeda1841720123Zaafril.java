public class Sepeda1841720123Zaafril {
    private String merek;
    private int kecepatan;
    private int gear;
    private String warna;
    
    public void setMerekZaafril(String newValue){
        merek = newValue;
    }
    
    public void gantiGearZaafril(int newValue){
        gear = newValue;
    }
    
    public void tambahKecepatanZaafril(int increment){
        kecepatan = kecepatan + increment;
    }
    
    public void remZaafril(int decrement){
        kecepatan = kecepatan - decrement;
    }
    
    public void setWarnaZaafril(String newValue){
        warna = newValue;
    }
    
    public void cetakStatusZaafril(){
        System.out.println("Merek: "+merek);
        System.out.println("Kecepatan: "+kecepatan);
        System.out.println("Gear: "+gear);
        System.out.println("Warna: "+warna);
    }
}
