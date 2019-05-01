package se.kth.iv1350.saleproccess.startup;

import se.kth.iv1350.saleproccess.controller.Controller;
import se.kth.iv1350.saleproccess.integration.CashRegister;
import se.kth.iv1350.saleproccess.integration.ItemRegister;
import se.kth.iv1350.saleproccess.integration.Printer;
import se.kth.iv1350.saleproccess.view.View;

public class main {
    public static void main (String [] args){
        ItemRegister itemRegister = new ItemRegister();
        Printer printer = new Printer();
        CashRegister cashRegister = new CashRegister();
        Controller contr = new Controller(itemRegister, printer, cashRegister);
        new View(contr).sample();

    }
}
