package se.kth.iv1350.saleproccess.model;

public class SalesItems {
    private Item item;
    private Amount quantity;

    SalesItems(Item item, Amount quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    public Amount getCost() {
        Amount cost = item.getPrice().multi(quantity);
        return cost;
    }

    Item getItem() {
        return item;
    }

    public Amount getQuantity() {
        return quantity;
    }

    void setQuantity(Amount qua){
        this.quantity = qua;

    }

    public String toString (){
        StringBuilder saleItems = new StringBuilder();
        saleItems.append("the Item: "+ getItem()+"    the quantity: "+ getQuantity().getAmount());
        return saleItems.toString();
    }
}

