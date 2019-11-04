/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu10;

/**
 *
 * @author WINDOWS 10
 */
public class ElectricityBill1841720123Zaafril implements Payable1841720123Zaafril{
    private int kwh;
    private String category;

    public ElectricityBill1841720123Zaafril(int kwh, String category) {
        this.kwh = kwh;
        this.category = category;
    }

    public int getKwhZaafril() {
        return kwh;
    }

    public void setKwhZaafril(int kwh) {
        this.kwh = kwh;
    }

    public String getCategoryZaafril() {
        return category;
    }

    public void setCategoryZaafril(String category) {
        this.category = category;
    }
    
    @Override
    public int getPaymentAmountZaafril(){
    return kwh*getBasePriceZaafril();
    }
    public int getBasePriceZaafril(){
        int bPrice = 0;
        switch(category){
            case "R-1" : bPrice = 100;break;
            case "R-2" : bPrice = 200;break;
        }
        return bPrice;
    }
    public String getBillInfoZaafril(){
        return "kWH = "+kwh+"\n"+
                "Category = "+category+"("+getBasePriceZaafril()+" per kWH)\n";
    }
}
