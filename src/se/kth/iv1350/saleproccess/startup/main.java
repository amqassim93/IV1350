package se.kth.iv1350.saleproccess.startup;

import se.kth.iv1350.saleproccess.controller.Controller;
import se.kth.iv1350.saleproccess.integration.CashRegister;
import se.kth.iv1350.saleproccess.integration.ItemRegister;
import se.kth.iv1350.saleproccess.integration.Printer;
import se.kth.iv1350.saleproccess.log.LogHandler;
import se.kth.iv1350.saleproccess.model.Amount;
import se.kth.iv1350.saleproccess.model.Display;
import se.kth.iv1350.saleproccess.model.ItemNotFoundException;
import se.kth.iv1350.saleproccess.view.TotalRevenueView;
import se.kth.iv1350.saleproccess.view.View;

import java.io.IOException;

public class main {
    public static void main (String [] args) throws IOException {
        ItemRegister itemRegister = new ItemRegister();
        Printer printer = new Printer();
        CashRegister cashRegister = new CashRegister();
        Display display = new Display();
        TotalRevenueView total= new TotalRevenueView(display);
        Controller contr = new Controller(itemRegister, printer, cashRegister, display,total);
        LogHandler logh = new LogHandler();
        View view = new View(contr,logh);
        view.sample();
        TotalRevenueView totalR = new TotalRevenueView(display);
        totalR.update(contr.getTotalCost());


    }
}
