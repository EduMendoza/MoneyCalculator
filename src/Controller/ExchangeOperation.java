package Controller;

import Model.Currency;
import Model.CurrencySet;
import Model.Exchange;
import Model.ExchangeRate;
import Model.Money;
import Persistence.ExchangeRateLoader;
import Process.Exchanger;
import UI.ExchangeDialog;
import UI.MoneyDisplay;

public class ExchangeOperation {
    
    public double rate;
    Currency in,out;
    CurrencySet currencySet = new CurrencySet();
    ExchangeRateLoader exchangeRateLoader = new ExchangeRateLoader();
    ExchangeDialog exchangeDialog = new ExchangeDialog();
    Money money = new Money(100,in);
    Exchanger exchanger = new Exchanger();
    MoneyDisplay moneydisplay = new MoneyDisplay();
    public ExchangeOperation() {
    }
    
    public void execute(){
        readExchangeRate();
        readExchangeDialog();
        Money mon = conversorCurrency();
        moneydisplay.execute(mon);
    }

    private ExchangeRate readExchangeRate(){
        return exchangeRateLoader.load(in,out);
    }
        
    private Exchange readExchangeDialog(){
        return exchangeDialog.execute(out,money);
    }
    
    private Money conversorCurrency(){
        return exchanger.exchange(money, readExchangeRate());
    }
}
