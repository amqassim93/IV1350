package se.kth.iv1350.saleproccess.model;


import se.kth.iv1350.saleproccess.integration.ItemRegister;
import se.kth.iv1350.saleproccess.integration.Printer;

import java.util.ArrayList;
import java.util.List;

public class Sale {
    private List<SalesItems> saleitems;
    private Amount currentTotal;
    private CashPayment payment;

    public Sale(){
        saleitems = new ArrayList<SalesItems>();
    }

   public void addEnteredItem(Item entered, Amount quan){
        if(saleitems == null){
            SalesItems lineItem = new SalesItems(entered, quan);
            saleitems.add(lineItem);
        }
        else
            {
                 for (SalesItems lineitem : saleitems)
                 if(lineitem.getItem()== entered ){
                quan = quan.plus(lineitem.getQuantity());
            }
              else
                 {
                     SalesItems lineItem = new SalesItems(entered, quan);
                     saleitems.add(lineItem);
                     //addTotal(lineItem);
            }
            }


    }

    private void addTotal(SalesItems saleslineitem){
        currentTotal = currentTotal.plus(saleslineitem.getCost());
    }

    public Amount getCurrentTotal(){
        return currentTotal;
    }

    public CashPayment getPayment(){
        return payment;
    }

    public  void pay(CashPayment payment){
        payment.calculateTotalCost(this);
        this.payment = payment;
    }

    public List <SalesItems> getSaleitems(){
        return saleitems;
    }

    public void printReceipt(Printer printer){
        Receipt receipt = new Receipt(this);
        printer.printReceipt(receipt);

    }
}
