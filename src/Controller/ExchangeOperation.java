package Controller;

import UI.ExchangeDialog;
import UI.MoneyDisplay;

public class ExchangeOperation{
 
    private final ExchangeDialog dialog;
    private final MoneyDisplay display;

    public ExchangeOperation(ExchangeDialog dialog, MoneyDisplay display) {
        this.dialog = dialog;
        this.display = display;
    }
    
    public void execute(){
        display.display(dialog.getExchange().getMoney());
    }
}
