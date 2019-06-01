package se.kth.iv1350.saleproccess.model;


import se.kth.iv1350.saleproccess.integration.Printer;
import java.util.ArrayList;
import java.util.List;

public class Sale {
    private List<SalesItems> saleitems;
    private Amount currentTotal;
    private CashPayment payment;

    public Sale(){
        //Item valid = new Item("moz",5,new Amount(5.0),1.20);
        saleitems = new ArrayList<SalesItems>();

       // saleitems.add(new SalesItems(valid,new Amount(3)));
    }



   public void addEnteredItem(Item entered, Amount quan){
        if(saleitems.isEmpty()){
            SalesItems lineItem = new SalesItems(entered, quan);
            saleitems.add(lineItem);
            //System.out.println("the lisr of sale items: "+ saleitems.toString());

        }

        else
            {
                for (int i = 0; i < saleitems.size(); i++) {
                    SalesItems lineitem = saleitems.get(i);
                    //System.out.println("hhhhhhhhhh" + lineitem);
                    if (entered.getItemId() == lineitem.getItem().getItemId() ) {
                        lineitem.setQuantity(quan.plus(lineitem.getQuantity()));


                       // SalesItems thisItem = new SalesItems(entered, quan);
                       // saleitems.add(thisItem);
                        //i++;
                    }


                    else {

                        //quan = quan.plus(lineitem.getQuantity());
                        //lineitem.setQuantity(quan.plus(lineitem.getQuantity()));
                        SalesItems thisItem = new SalesItems(entered, quan);
                        saleitems.add(thisItem);
                        i++;


                        //addTotal(lineItem);
                    }
                }
            }



    }

    private void addTotal(SalesItems saleslineitem){
        currentTotal = currentTotal.plus(saleslineitem.getCost());
    }

    public Amount getCurrentTotal(){
        currentTotal = new Amount(0);
        for(SalesItems line :saleitems ){
            currentTotal = currentTotal.plus(line.getCost());}
        return currentTotal;
    }

    public CashPayment getPayment(){
        return payment;
    }

    public  void pay(CashPayment payment){
        this.payment = payment;
    }

    public List <SalesItems> getSaleitems(){
        return saleitems;
    }

    public void printReceipt(Printer printer){
        Receipt receipt = new Receipt(this);
        printer.printReceipt(receipt);
        System.out.println(" The PaidAmount " + payment.getAmount());
        System.out.println(" The Change " + payment.getAmount().minus(currentTotal));

    }
}
