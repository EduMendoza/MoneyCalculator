package Persistence;

import Model.Currency;
import Model.ExchangeRate;
public class ExchangeRateLoader {

    public ExchangeRate load(Currency in, Currency out) {
        return new ExchangeRate(new Currency("Euro","EUR","€"),new Currency("Libras","GBD","£"), 0.79);
    }
}
