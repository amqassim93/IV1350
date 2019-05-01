package se.kth.iv1350.saleproccess.integration;

import se.kth.iv1350.saleproccess.model.Amount;
import se.kth.iv1350.saleproccess.model.Item;

import java.util.ArrayList;
import java.util.List;

public class ItemRegister {

    private List<Item> items = new ArrayList<>();
    public ItemRegister(){
        addItems();
    }

    public void addItems(){
        items.add(new Item ("Moz",5, new Amount(5.0), 1.20));
    }



    public Item findItemById (int itemId){
        for (Item item : items) {
            if (item.itemId == itemId) {
                return item;
            }
        }
        return null;
    }


    }












