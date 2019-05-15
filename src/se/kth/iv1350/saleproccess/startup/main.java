package se.kth.iv1350.saleproccess.startup;

import se.kth.iv1350.saleproccess.controller.Controller;
import se.kth.iv1350.saleproccess.integration.CashRegister;
import se.kth.iv1350.saleproccess.integration.ItemRegister;
import se.kth.iv1350.saleproccess.integration.Printer;
import se.kth.iv1350.saleproccess.log.LogHandler;
import se.kth.iv1350.saleproccess.model.ItemNotFoundException;
import se.kth.iv1350.saleproccess.view.View;

import java.io.IOException;

public class main {
    public static void main (String [] args) throws IOException {
        ItemRegister itemRegister = new ItemRegister();
        Printer printer = new Printer();
        CashRegister cashRegister = new CashRegister();
        Controller contr = new Controller(itemRegister, printer, cashRegister);
        LogHandler logh = new LogHandler();
        View view = new View(contr,logh);
        view.sample();

    }
}
