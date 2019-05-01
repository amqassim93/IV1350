package se.kth.iv1350.saleproccess.model;

public class SalesItems {
    private Item item;
    private Amount quantity;

    SalesItems(Item item, Amount quantity){
        this.item = item ;
        this.quantity = quantity;
    }

    Amount getCost(){
        Amount cost = item.getPrice().multi(quantity);
        return cost;
    }

    Item getItem(){
        return item;
    }

    Amount getQuantity(){
        return quantity;
    }
}
