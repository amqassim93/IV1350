package se.kth.iv1350.saleproccess.integration;

import se.kth.iv1350.saleproccess.model.Amount;
import se.kth.iv1350.saleproccess.model.CashPayment;

public class CashRegister {
    private Amount balance = new Amount();

    public void addpayment(CashPayment payment){
        balance = balance.plus(payment.getTotalcost());
    }
}
