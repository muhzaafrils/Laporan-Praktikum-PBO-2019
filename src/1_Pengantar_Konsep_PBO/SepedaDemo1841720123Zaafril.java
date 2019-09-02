public class SepedaDemo1841720123Zaafril {
    public static void main(String[] args){
        
        Sepeda1841720123Zaafril spd1 = new Sepeda1841720123Zaafril();
        Sepeda1841720123Zaafril spd2 = new Sepeda1841720123Zaafril();
        SepedaGunung1841720123Zaafril spd3 = new SepedaGunung1841720123Zaafril();
        
        spd1.setMerekZaafril("Polygone");
        spd1.tambahKecepatanZaafril(10);
        spd1.gantiGearZaafril(2);
        spd1.setWarnaZaafril("Merah");
        spd1.cetakStatusZaafril();
        
        spd2.setMerekZaafril("Wiim Cycle");
        spd2.tambahKecepatanZaafril(10);
        spd2.gantiGearZaafril(2);
        spd2.tambahKecepatanZaafril(10);
        spd2.gantiGearZaafril(3);
        spd2.setWarnaZaafril("Putih");
        spd2.cetakStatusZaafril();
        
        spd3.setMerekZaafril("Klinee");
        spd3.tambahKecepatanZaafril(5);
        spd3.gantiGearZaafril(7);
        spd3.setTipeSuspensiZaafril("Gas Suspension");
        spd3.cetakStatusZaafril();
    }
}
