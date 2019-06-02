package se.kth.iv1350.saleproccess.view;

import se.kth.iv1350.saleproccess.model.Amount;
import se.kth.iv1350.saleproccess.model.Sale;
import se.kth.iv1350.saleproccess.model.TotalObserver;

import java.util.ArrayList;

public class TotalRevenueView implements TotalObserver {

    private ArrayList<Amount> Sales = new ArrayList<Amount>();

    public TotalRevenueView(){


        for (Amount x:Sales) {

            x.setAmount(0);
        }


    }


    @Override
    public void update(Sale sale) {

        addNewSale(sale);
        printCurrentState();
    }


    private void addNewSale(Sale sale) {
        Sales.add(sale.getCurrentTotal());
    }

    public void printCurrentState() {
        System.out.println("*******THE TOTAL REVENUE IS********");
        Amount totalRev = new Amount(0);
        for(int i=0; i < Sales.size(); i++) {
           totalRev = totalRev.plus(Sales.get(i));
            System.out.println("Revenue from Sale: " + Sales.get(i).toString());

        }
        System.out.println("Total revenue: " + totalRev.toString());
        System.out.println("***********************************");
    }
}
