package UI;

import Model.Money;

public class MoneyDisplay {
    public  void execute(Money money){
        try{
        System.out.println(money.getAmount() + " " + money.getCurrency().getSymbol());
            
        }catch(Exception e){
            
        }
    }
}
