package se.kth.iv1350.saleproccess.view;


import se.kth.iv1350.saleproccess.controller.Controller;
import se.kth.iv1350.saleproccess.log.LogHandler;
import se.kth.iv1350.saleproccess.model.Amount;
import se.kth.iv1350.saleproccess.model.DataBaseFailurException;
import se.kth.iv1350.saleproccess.model.Item;
import se.kth.iv1350.saleproccess.model.ItemNotFoundException;
import java.util.Scanner;

/**
 * This program has no view, instead, this class is a
 * placeholder for the entire view.
 */

public class View {

    private Controller contr;
    private LogHandler logh;

    /**
     * Creates a new instance.
     *
     * @param contr The controller that is used for all operations.
     *
     */

    public View (Controller contr, LogHandler logh) {
        this.contr = contr;
        this.logh=logh;
    }

    public void sample()  {

        Item valid = new Item("moz",5,new Amount(3),1.20);
        Item unvalid = new Item("apple",3,new Amount(3.0),2.0);

        contr.startNewSale();

       enterItem(5);
       enterItem(4);

        contr.signalLastItem();

        Amount payment = new Amount(50);
        contr.pay(payment);
}

private void showError(Exception error){
        System.out.println("try again "+ error.getMessage());
}

private void enterItem (int itemID){
        System.out.println("enter the amount: ");
        Scanner in = new Scanner(System.in);
        Amount quan = new Amount(in.nextInt()) ;
        try{
        Item entered = contr.enterTheItem(itemID,quan);

        }
        catch (ItemNotFoundException itemException){
            this.showError(itemException);
            logh.logException(itemException);

        }catch (DataBaseFailurException dbexc){
            dbexc.getMessage();
            logh.logException(dbexc);

        }
}
}
