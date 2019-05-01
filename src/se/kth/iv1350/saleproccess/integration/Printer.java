package se.kth.iv1350.saleproccess.integration;

import se.kth.iv1350.saleproccess.model.Receipt;

public class Printer {
    public void printReceipt(Receipt receipt){
        System.out.println(receipt.createReceiptString());
    }
}
