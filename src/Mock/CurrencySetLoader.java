package Mock;

import Model.Currency;
import Model.CurrencySet;

public class CurrencySetLoader implements Persistence.CurrencySetLoader {

    @Override
    public CurrencySet load() {
        CurrencySet set = new CurrencySet();
        set.add(new Currency("EUR", "Euro", "€"));
        set.add(new Currency("USD", "Dollar", "$"));
        set.add(new Currency("GBP", "Libra", "£"));
        return set;
    }
}
