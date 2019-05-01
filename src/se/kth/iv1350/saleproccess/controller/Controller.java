package se.kth.iv1350.saleproccess.controller;

import se.kth.iv1350.saleproccess.integration.CashRegister;
import se.kth.iv1350.saleproccess.integration.ItemRegister;
import se.kth.iv1350.saleproccess.integration.Printer;
import se.kth.iv1350.saleproccess.integration.VAT;
import se.kth.iv1350.saleproccess.model.*;

/**
 * This is the application’s only controller class. All
 * calls to the model pass through here.
 */


public class Controller {

    private ItemRegister itemRegister;
    private  Sale sale;
    private Item enteredItem;
    private VAT vat;
    private CashRegister cashRegister;
    private Printer printer;


    /** create a new instance
 * @param itemRegister used to get class that handle items in database
 * */

    public Controller (ItemRegister itemRegister, Printer printer, CashRegister cashRegister)
    {
        this.itemRegister = itemRegister;
        this.printer=printer;
        this.cashRegister=cashRegister;
    }

    public  void startNewSale ()
    {
        sale = new Sale();
    }

    /** enter the iten with quantity more than one
     * Exception thrown when invalid item */

    public Item enterTheItem (int itemIdentifier, Amount quan)  {
        Item entered = itemRegister.findItemById(itemIdentifier);
        sale.addEnteredItem(entered, quan);
        return entered;
    }

    public Amount getTotalCost(){
        return sale.getCurrentTotal();
    }

    public Amount signalLastItem(){
        return sale.getCurrentTotal().multi(vat.getVatProcent());
    }

    public void pay(Amount paidAmt){
        CashPayment payment = new CashPayment(paidAmt);
        sale.pay(payment);
        sale.printReceipt(printer);
        //cashRegister.addpayment(payment);



    }






}
