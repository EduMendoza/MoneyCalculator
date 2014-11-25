package UI;

import java.util.Date;
import Model.Currency;
import Model.Exchange;
import Model.Money;

public class ExchangeDialog {
    Date date = new Date();
    public Exchange execute(Currency out, Money money){
        return new Exchange (money, date,out);
    }
}
