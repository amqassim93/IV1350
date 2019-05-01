package se.kth.iv1350.saleproccess.model;




public class Item {

    String name;
    Amount price;
    double vatRate;
    public int itemId;


    public Item(String name , int itemIdentifier, Amount price , double vatRate){
        this.itemId = itemIdentifier;
        this.name = name;
        this.price = price;
        this.vatRate = vatRate;

    }


    public int getItemId(){
        return itemId;
    }

    public String getname(){
        return name;
    }

    public Amount getPrice(){
        return price;
    }

    public String toString (){
        StringBuilder item = new StringBuilder();
        item.append("name: "+ name );
        item.append("price: "+ price);
        return  item.toString();
    }





}
