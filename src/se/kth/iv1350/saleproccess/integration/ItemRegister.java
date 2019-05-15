package se.kth.iv1350.saleproccess.integration;

import se.kth.iv1350.saleproccess.model.Amount;
import se.kth.iv1350.saleproccess.model.DataBaseFailurException;
import se.kth.iv1350.saleproccess.model.Item;
import se.kth.iv1350.saleproccess.model.ItemNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class ItemRegister {

    private List<Item> items = new ArrayList<>();
    public ItemRegister(){
        addItems();
    }

    public void addItems(){
        items.add(new Item ("Moz",5, new Amount(5), 1.20));
        items.add(new Item("apple",2,new Amount(4),0.50));
        items.add(new Item("milk",3,new Amount(45),0.50));
        items.add(new Item("dadlar",4,new Amount(4),0.50));
    }



    public Item findItemById (int itemId) throws ItemNotFoundException, DataBaseFailurException {

        if (itemId == 0) {
            throw new DataBaseFailurException();
        }
        for (Item item : items) {
             if (item.itemId == itemId) {
                 return item;
             }

         }
        throw new ItemNotFoundException(itemId);
    }

    }















