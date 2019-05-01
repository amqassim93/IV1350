package se.kth.iv1350.saleproccess.model;

public class CashPayment {
    private Amount paidAmount;
    private Amount totalcost;

    public CashPayment(Amount paidAmt){
        this.paidAmount = paidAmt;
    }

    void calculateTotalCost(Sale sale){
        totalcost = sale.getCurrentTotal();
    }

   public Amount getTotalcost(){
        return totalcost;
    }

    Amount getChange(){
        return paidAmount.minus(totalcost);

    }
}
