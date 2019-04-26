package ex20;
/*
 * Author : Omar Sharif - Th3BlackScare
 */
public class Stock {
    public String Symbol;
    String Name;
    double previousClosingPrice;
    double currentPrice;
    Stock(String Symbol,String Name){
        this.Symbol=Symbol;
        this.Name=Name;
    }
    public double getChangePrice(){
        return(Math.abs(previousClosingPrice-currentPrice)/previousClosingPrice)*100;
    }
    public static void main(String[] args){
        Stock obj = new Stock("Stock","Oracl Corporation");
        obj.previousClosingPrice=34.5;
        obj.currentPrice=34.35;
        System.out.print("The Change in price: "+obj.getChangePrice());
    }
}
