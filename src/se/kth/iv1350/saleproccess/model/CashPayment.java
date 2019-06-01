package se.kth.iv1350.saleproccess.model;

public class CashPayment {
    private Amount paidAmount;
    private Amount totalcost;

    public CashPayment(Amount paidAmt){
        this.paidAmount = paidAmt;
    }

    public Amount calculateTotalCost(Sale sale){
         return   totalcost = sale.getCurrentTotal();
    }

   public Amount getAmount(){
        return paidAmount;
    }

    Amount getChange(){
        return paidAmount.minus(totalcost);

    }
}
