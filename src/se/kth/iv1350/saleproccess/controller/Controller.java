package se.kth.iv1350.saleproccess.controller;

import se.kth.iv1350.saleproccess.integration.CashRegister;
import se.kth.iv1350.saleproccess.integration.ItemRegister;
import se.kth.iv1350.saleproccess.integration.Printer;
import se.kth.iv1350.saleproccess.integration.VAT;
import se.kth.iv1350.saleproccess.model.*;
import se.kth.iv1350.saleproccess.view.TotalRevenueView;

/**
 * This is the application’s only controller class. All
 * calls to the model pass through here.
 */


public class Controller {

    private ItemRegister itemRegister;
    private  Sale sale;
    private VAT vat;
    private CashRegister cashRegister;
    private Printer printer;
    private Display display;
    private TotalRevenueView onDisplay;


    /** create a new instance
 * @param itemRegister used to get class that handle items in database
 * */

    public Controller (ItemRegister itemRegister, Printer printer, CashRegister cashRegister, Display display, TotalRevenueView total)
    {
        this.itemRegister = itemRegister;
        this.printer=printer;
        this.cashRegister=cashRegister;
        this.display = display;
        this.onDisplay = total;
    }

    public  void startNewSale ()
    {
        sale = new Sale();
    }

    /** enter the item with quantity more than one
      */

    public Item enterTheItem (int itemIdentifier,Amount quan) throws ItemNotFoundException, DataBaseFailurException {


            Item entered = itemRegister.findItemById(itemIdentifier);
            sale.addEnteredItem(entered, quan);

            return entered;




    }


    public void signalLastItem(){
        System.out.println(" Varsågod gör betalning "+sale.getCurrentTotal());
    }

    public void pay(Amount paidAmt){
        CashPayment payment = new CashPayment(paidAmt);
        sale.pay(payment);
        sale.printReceipt(printer);
        //cashRegister.addpayment(payment);



    }






}
