package se.kth.iv1350.saleproccess.integration;

import se.kth.iv1350.saleproccess.model.Item;

/**
 * Contains information about one particular item.
 */
public final class ItemDescription {

    private final String name;
    private final int itemIdentifier;
    private double vatRate;
    private double price ;
    private int quantity;


    /**
     * Creates a new instance representing a particular item.
     *
     * @param name The item's name.
     * @param itemIdentifier  The item's identifier.
     * @param vatRate the item's vatrate.
     * @param price the item's price.
     */


    public ItemDescription (String name, int itemIdentifier, double vatRate, double price, int quantity ){
        this.name = name;
        this.itemIdentifier = itemIdentifier;
        this.vatRate = vatRate;
        this.price = price;
        this.quantity = quantity;
    }

    public int getItemIdentifier(){
        return this.itemIdentifier;
    }

    public int getQuantity(){
        return this.quantity;
    }

    public String getName(){
        return this.name;
    }



public String toString (){
        StringBuilder sb = new StringBuilder();
        sb.append(" name: " + name + " ,");
        sb.append(" itemIdentifier: " + itemIdentifier + " ,");
        sb.append(" vatRate: " + vatRate + " ,");
        sb.append(" price: " + price + " ,");
        return sb.toString();
}




}
