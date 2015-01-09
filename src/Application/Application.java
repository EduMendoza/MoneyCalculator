package Application;

import Console.MoneyDisplay;
import Controller.ExchangeOperation;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Model.CurrencySet;
import Mock.CurrencySetLoader;
import Swing.ApplicationFrame;

public class Application {

    public static void main(String[] args) {
        CurrencySet currencySet = new CurrencySetLoader().load();
        final ApplicationFrame frame = new ApplicationFrame(currencySet.toArray());
        frame.register(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                new ExchangeOperation(frame.getExchangeDialog(), new MoneyDisplay()).execute();
            }
        });
    }
}