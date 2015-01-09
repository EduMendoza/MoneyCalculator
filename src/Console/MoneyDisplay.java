package Console;

import Model.Money;

public class MoneyDisplay implements UI.MoneyDisplay{

    @Override
    public void display(Money money) {
        System.out.println(money.getAmount() + " " + money.getCurrency());
    }
}

