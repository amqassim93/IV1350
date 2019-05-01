package se.kth.iv1350.saleproccess.view;


import se.kth.iv1350.saleproccess.controller.Controller;
import se.kth.iv1350.saleproccess.model.Amount;
import se.kth.iv1350.saleproccess.model.Item;
import se.kth.iv1350.saleproccess.model.ItemNotFoundException;

import java.sql.Connection;

/**
 * This program has no view, instead, this class is a
 * placeholder for the entire view.
 */

public class View {

    private Controller contr;

    /**
     * Creates a new instance.
     *
     * @param contr The controller that is used for all operations.
     *
     */

    public View (Controller contr) {
        this.contr = contr;
    }

    public void sample() {



        Item valid = new Item("moz",5,new Amount(5.0),1.20);
        Item unvalid = new Item("apple",2,new Amount(3.0),2.0);

        contr.startNewSale();
        contr.enterTheItem(5,new Amount(3));


        Amount payment = new Amount(50);
        contr.pay(payment);






}}
