package Swing;

import java.awt.Component;
import java.awt.FlowLayout;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JTextField;
import Model.Currency;
import Model.Exchange;
import Model.Money;
import UI.ExchangeDialog;

public class ExchangeDialogPanel extends JPanel implements ExchangeDialog{
    private JTextField textField;
    private JComboBox<Currency> currencyFrom;
    private JComboBox<Currency> currencyTo;
    private final Currency[] currencies;

    public ExchangeDialogPanel(Currency[] currencies){
        this.currencies = currencies;
        setLayout(new FlowLayout());
        createToolBar();
    }

    private void createToolBar() {
        add(createTextField());
        add(createFromCurrency());
        add(createToCurrency());
    }

    private JComponent createTextField() {
        JTextField textField = new JTextField(10);
        this.textField = textField;
        return textField;
    }

    private Component createFromCurrency() {
        JComboBox<Currency> currencyFrom = new JComboBox<>(currencies);
        this.currencyFrom = currencyFrom;
        return currencyFrom;
    }

    private Component createToCurrency() {
        JComboBox<Currency> currencyTo = new JComboBox<>(currencies);
        this.currencyTo  = currencyTo;
        return currencyTo;
    }

    @Override
    public Exchange getExchange() {
        return new Exchange(getMoney(),getCurrency(currencyTo));
    }
    
    private Money getMoney(){
        return new Money(getAmount(), getCurrency(currencyFrom));
    }
    
    private Currency getCurrency(JComboBox<Currency> comboBox) {
        return comboBox.getItemAt(comboBox.getSelectedIndex());
    }
    
    private double getAmount(){
        return Double.parseDouble(textField.getText());
    }
}
