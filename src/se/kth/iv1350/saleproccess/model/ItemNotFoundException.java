package se.kth.iv1350.saleproccess.model;


import org.junit.Test;

public class ItemNotFoundException extends Exception {
    public ItemNotFoundException(int itemIdentifier) {
        super("can not find the Item: " + itemIdentifier);
    }

}
