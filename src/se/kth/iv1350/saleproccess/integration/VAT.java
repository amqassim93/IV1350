package se.kth.iv1350.saleproccess.integration;

import se.kth.iv1350.saleproccess.model.Amount;

public class VAT {
    private Amount vatprocent;

    public VAT(Amount vatProcent){
        this.vatprocent = vatProcent;
    }

    public Amount getVatProcent(){
        return vatprocent;
    }
}
