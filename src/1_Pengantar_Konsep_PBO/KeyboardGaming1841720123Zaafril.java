public class KeyboardGaming1841720123Zaafril extends Keyboard1841720123Zaafril{
    private String fitur;
    
    public void setFiturZaafril(String ftr) {
        fitur = ftr;
    }
    
    public void cetakStatusZaafril(){
       super.cetakStatusZaafril();
       System.out.println("Fitur: "+fitur);
    }
}

